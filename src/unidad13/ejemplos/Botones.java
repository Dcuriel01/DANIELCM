package unidad13.ejemplos;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Botones extends JFrame {

	private Button boton1,boton2,boton3,boton4;
	
	public Botones() {
		setTitle("Ventana con botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		boton1 = new Button("BOTON_1");
		boton2 = new Button("BOTON_2");
		boton3 = new Button("BOTON_3");
		boton4 = new Button("BOTON_4");
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		
		getContentPane().add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Botones();
			}
		});
		
		
	}
	
}
