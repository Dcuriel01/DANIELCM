package unidad1.ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import interfacesGraficas.RadarTramo2;

public class Puebas extends JFrame {
	
public static void main(String[] args) {
	new Puebas();
	
	
	}
	public Puebas() {
		JOptionPane mensajeError = new JOptionPane();
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel error = new JLabel();
		error.setText("Error");
	    add(error);
	    setSize(300, 200);
	    setTitle("Error");
	    JButton salir = new JButton("Salir");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Puebas puebas = new Puebas();
				puebas.dispose();
            }
        });
        add(salir);
	    setSize(300, 200);
	    
       
        	

	    // Mostrar la ventana
	    setLocationRelativeTo(null);
	    setVisible(true);
	}
}
