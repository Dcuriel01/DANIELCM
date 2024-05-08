package unidad13.ejercicios.gestionParqueMovilGrafico;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DarAlta extends JFrame {
	
	 private JTextField matricula;
	 private JTextField marca;
	 private JTextField modelo;
	 private JTextField fecha;
	 private JTextField kilometraje;
	
    public DarAlta() {
        super("Dar de alta");
        setLayout(new FlowLayout());
        add(new JLabel("Matricula:"));
        matricula =new JTextField(10); 
        add(matricula);
        add(new JLabel("Marca:"));
        marca =new JTextField(20); 
        add(marca);
        add(new JLabel("Modelo:"));
        modelo =new JTextField(10); 
        add(modelo);
        add(new JLabel("Fecha(dd/MM/yy):"));
        fecha =new JTextField(10); 
        add(fecha);
        add(new JLabel("Kilometraje:"));
        kilometraje =new JTextField(10); 
        add(kilometraje);
        
        Button bAceptar =  new Button("Aceptar"); 
        add(bAceptar);
        
        bAceptar.addActionListener(e -> leerDatosFormulario()); // Una forma mucho más rápida de gestionar los eventos
        
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
       
    }

    public static void main(String[] args) {
        new DarAlta();
    }
    
    
    private void leerDatosFormulario() {
    	
    	String matriculaS = matricula.getText();
        String marcaS = marca.getText();
        String modeloS = modelo.getText();
        String fechaTemp = fecha.getText();
        int kilometrajeS =Integer.parseInt(kilometraje.getText());
        Vehiculo v = Gestion.crearVehiculo(matriculaS, fechaTemp, marcaS, modeloS, kilometrajeS);
        
        if (v!=null) {
			Gestion.darAlta(v);
			JOptionPane.showMessageDialog(this, "Coche dado de alta");
			dispose();
		}
        
        
        
    }
}
