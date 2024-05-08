package unidad13.ejercicios.gestionParqueMovilGrafico;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CambiarKm extends JFrame {
	
	 private JTextField matricula;
	 private JTextField kilometraje;
	 
    public CambiarKm() {
        super("Parque Movil");
        setLayout(new FlowLayout());
        add(new JLabel("Matricula:"));
        matricula =new JTextField(10); 
        add(matricula);
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
        new CambiarKm();
    }
    
    
    private void leerDatosFormulario() {
    	
    	String matriculaS = matricula.getText();
    	int kilometrajeS = Integer.parseInt(kilometraje.getText());
        	if (Gestion.validadarMatricula(matriculaS)) {
        		Gestion.cambiarKm(matriculaS, kilometrajeS);
    			Gestion.actualizarBD();
    			JOptionPane.showMessageDialog(this, "Kilometraje cambiado correctamente");
    			dispose();
			}else {
				JOptionPane.showMessageDialog(this, "Matricula mal escrita");
			}
			
        
        
        
    }
}
