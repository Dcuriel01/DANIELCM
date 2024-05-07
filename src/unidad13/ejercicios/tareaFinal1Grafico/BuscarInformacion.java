package unidad13.ejercicios.tareaFinal1Grafico;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BuscarInformacion extends JFrame {
	
	 private JTextField matricula;

    public BuscarInformacion() {
        super("Información de un coche");
        setLayout(new FlowLayout());
        add(new JLabel("Matricula:"));
        matricula =new JTextField(10); 
        add(matricula);
        
        Button bAceptar =  new Button("Aceptar"); 
        add(bAceptar);
        
        bAceptar.addActionListener(e -> leerDatosFormulario()); // Una forma mucho más rápida de gestionar los eventos
        
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
       
    }

    public static void main(String[] args) {
        new BuscarInformacion();
    }
    
    
    private void leerDatosFormulario() {
    	
    	String matriculaS = matricula.getText();
        	if (Gestion.validadarMatricula(matriculaS)) {
        		Gestion.buscarCoche(matriculaS);
    			Gestion.actualizarBD();
    			dispose();
			}else {
				JOptionPane.showMessageDialog(this, "Matricula mal escrita");
			}
			
        
        
        
    }
}
