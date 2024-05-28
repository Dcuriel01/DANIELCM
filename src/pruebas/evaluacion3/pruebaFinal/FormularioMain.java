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

import unidad10.ejemplos.crearExcepciones.MiExecepcion;
import unidad12.ConexionBD;


public class FormularioMain extends JFrame{
	private JTextField campoDni;
	private JTextField campoFecha;
	private JTextField campoHora;
	private JTextField campoEmail;
	private JTextField campoTelefono;
	private JComboBox<String> reservaSelect;
	private JCheckBox exentoCheck;
	private JCheckBox justificanteCheck;
	private JButton botonCita;
	private JButton botonTablaCitas;
	private JButton botonTablaPagos;
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	static Cita cita;
	static boolean registrada = false;
	
	
	public FormularioMain(){
		super("Creacion cita");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JPanel panelArriba = new JPanel();
        panelArriba.setLayout(new FlowLayout());
        JPanel panelAbajo = new JPanel();
        panelAbajo.setLayout(new FlowLayout());
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        
        JPanel panelDni = new JPanel();
        panelDni.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelDni.add(new JLabel("Dni:"));
        campoDni = new JTextField(10);
        panelDni.add(campoDni);
        panelArriba.add(panelDni);
        
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelFecha.add(new JLabel("Fecha:"));
        campoFecha = new JTextField(10);
        panelFecha.add(campoFecha);
        panelArriba.add(panelFecha);
        
        JPanel panelHora = new JPanel();
        panelHora.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelHora.add(new JLabel("Hora:"));
        campoHora = new JTextField(10);
        panelHora.add(campoHora);
        panelArriba.add(panelHora);
        
        JPanel tipoReservaPanel = new JPanel();
        tipoReservaPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        tipoReservaPanel.add(new JLabel("Tipo de reserva"));
        reservaSelect = new JComboBox<>(new String[]{"DNI", "Pasaporte"});
        tipoReservaPanel.add(reservaSelect);
        panelAbajo.add(tipoReservaPanel);
        
        JPanel panelEmail = new JPanel();
        panelEmail.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEmail.add(new JLabel("Email:"));
        campoEmail = new JTextField(10);
        panelEmail.add(campoEmail);
        panelAbajo.add(panelEmail);
        
        JPanel panelTelefono = new JPanel();
        panelTelefono.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelTelefono.add(new JLabel("Telefono:"));
        campoTelefono = new JTextField(10);
        panelTelefono.add(campoTelefono);
        panelAbajo.add(panelTelefono);
        
        JPanel exentoPanel = new JPanel();
        exentoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        exentoCheck = new JCheckBox("Exento de pago");
        exentoPanel.add(exentoCheck);
        panelAbajo.add(exentoPanel);
        
        JPanel justificantePanel = new JPanel();
        justificantePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        justificanteCheck = new JCheckBox("Justificante");
        justificantePanel.add(justificanteCheck);
        panelAbajo.add(justificantePanel);
        
        botonCita = new JButton("Registrar Cita");
        botonCita.addActionListener(e -> {
			try {
				registrarCita();
			} catch (CitasExcepcion e1) {
				System.out.println(e1.getLocalizedMessage()); 
			}
		});
        botonTablaCitas = new JButton("Listado citas");
        botonTablaCitas.addActionListener(e -> TablaCitas.tablaBaseRelacional());
        botonTablaPagos = new JButton("Listado pagos");
        botonTablaPagos.addActionListener(e -> TablaPagos.tablaBaseRelacional());
        
        
        panelBotones.add(botonCita);
        panelBotones.add(botonTablaCitas);
        panelBotones.add(botonTablaPagos);
        
        add(panelArriba);
        add(panelAbajo);
        add(panelBotones);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
	}

	

	private void registrarCita() throws CitasExcepcion {
		String dni = campoDni.getText();
        String fecha = campoFecha.getText();
        String hora = campoHora.getText();
        String email = campoEmail.getText();
        String telefono = campoTelefono.getText();
        String tipoCita = (String) reservaSelect.getSelectedItem();
        boolean exento = exentoCheck.isSelected();
        boolean justificante = justificanteCheck.isSelected();
        boolean vacio = (dni.equals("")|fecha.equals("")|hora.equals(""));
        boolean emailTlf = (email.equals("")& telefono.equals(""));
        if (emailTlf|vacio) {
			throw new CitasExcepcion("Execpcion citas:Error campos vacios",new IllegalAccessError());
		}else {
			CitasDao cD = new CitasDao(url, usuario, password);
			if (exento) {
				cita = new Cita(dni, fecha, hora, "Exento", tipoCita, telefono, email);
				cD.aniadirCita(cita);
				JOptionPane.showMessageDialog(this, "Cita registrada");
				registrada=true;
			}else {
				cita = new Cita(dni, fecha, hora, "Pendiente", tipoCita, telefono, email);
				cD.aniadirCita(cita);
				JOptionPane.showMessageDialog(this, "Cita registrada");
				registrada=true;
				int pagar = JOptionPane.showConfirmDialog(this, "¿Desea pagar?");
				if (pagar==0) {
					FormularioPago.main(null);
				}
			}
			
			if (justificante) {
				EscribirJustificante.escribirFichero(cita);
				JOptionPane.showMessageDialog(this, "Justificante creado");
				
			}
			
		}
        
        
	}

	public static void main(String[] args) {
		new FormularioMain();
		
	}

	public static Cita recuperarCita() {
		return cita;
	}
	
	
}
