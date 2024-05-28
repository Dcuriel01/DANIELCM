package pruebas.evaluacion3.pruebaFinal;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import unidad12.ConexionBD;

public class FormularioPago extends JFrame {
	private JComboBox<String> pagoSelect;
	private JTextField pagoText;
	private JButton botonPago;
	private JCheckBox justificanteCheck;
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	public FormularioPago() {
		super("Formulario Pago");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
		JPanel tipoPagoPanel = new JPanel();
		tipoPagoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		tipoPagoPanel.add(new JLabel("Tipo de reserva"));
        pagoSelect = new JComboBox<>(new String[]{"Tarjeta", "Iban"});
        tipoPagoPanel.add(pagoSelect);
        add(tipoPagoPanel);
  
        
        JPanel panelPago = new JPanel();
        panelPago.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelPago.add(new JLabel("Datos Pago:"));
        pagoText = new JTextField(10);
        panelPago.add(pagoText);
        add(panelPago);
        
        JPanel justificantePanel = new JPanel();
        justificantePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        justificanteCheck = new JCheckBox("Justificante");
        justificantePanel.add(justificanteCheck);
        add(justificantePanel);
        
        
        botonPago = new JButton("Registrar pago: ");
        botonPago.addActionListener(e -> {
			try {
				registrarPago();
			} catch (CitasExcepcion e1) {
				System.out.println( e1.getMessage());
			}
		});
        add(botonPago);
        
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
	}

	private void registrarPago() throws CitasExcepcion {
		Cita cita = FormularioMain.recuperarCita();
		String datosPago = pagoText.getText();
        String tipoPago = (String) pagoSelect.getSelectedItem();
        boolean justificante = justificanteCheck.isSelected();
        if (datosPago.equals("")) {
        	throw new CitasExcepcion("Execpcion citas: Error campos vacios",new IllegalAccessError());
		}
        Pago pagoRegistrado = new Pago(cita.getCita(), tipoPago, datosPago);
        CitasDao cD = new CitasDao(url, usuario, password);
        cD.actualizarPago(cita);
        BDOPagos.registrarPago(pagoRegistrado);
        JOptionPane.showMessageDialog(this, "Pago registrado");
        if (justificante) {
        	EscribirJustificante.escribirPago(pagoRegistrado);
        	JOptionPane.showMessageDialog(this, "Justificante pago realizado");
		}
     
       
		
	}

	public static void main(String[] args) {
		new FormularioPago();
	}

}
