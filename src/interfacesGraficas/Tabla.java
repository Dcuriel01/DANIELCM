package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabla extends JFrame{
	
	private JTable tabla;
	private JScrollPane panel;
	
	public Tabla(Empleado empleado1, Empleado empleado2, Empleado empleado3) {
		initComponents(empleado1,empleado2,empleado3);
		setTitle("Teléfonos");
		setSize(500, 300);
	}
	
	private void initComponents(Empleado empleado1, Empleado empleado2, Empleado empleado3) {
		
		//Datos para la tabla
		Object[][] datos =  new Object[][] {
			{empleado1.getNombre(),empleado1.getIdNum(),empleado1.getDepartamento(),empleado1.getPuesto()},
			{empleado2.getNombre(),empleado2.getIdNum(),empleado2.getDepartamento(),empleado2.getPuesto()},
			{empleado3.getNombre(),empleado3.getIdNum(),empleado3.getDepartamento(),empleado3.getPuesto()},
		};
		
		String[] cabeceras = new String[] {
				"Nombre","Numero Id","Departamento","Posicion"
		};
		
		tabla = new JTable(datos, cabeceras);
		panel = new JScrollPane(tabla);

		getContentPane().add(panel,BorderLayout.CENTER);
	}	
		
		
		
		
	}


