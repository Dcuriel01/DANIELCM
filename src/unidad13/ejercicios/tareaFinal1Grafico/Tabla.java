package unidad13.ejercicios.tareaFinal1Grafico;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabla extends JFrame{
	
	private JTable tabla;
	private JScrollPane panel;
	
	public Tabla(String[][] datos, String[]cabecera,String titulo) {
		initComponents(datos, cabecera);
		setTitle(titulo);
		setSize(500, 300);
	}
	
	private void initComponents(String[][] datos, String[] cabecera) {
		
		
		tabla = new JTable(datos, cabecera);
		panel = new JScrollPane(tabla);

		getContentPane().add(panel,BorderLayout.CENTER);
	}	
		
		
		
	}


