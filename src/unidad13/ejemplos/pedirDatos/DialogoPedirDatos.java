package unidad13.ejemplos.pedirDatos;

import javax.swing.JOptionPane;

public class DialogoPedirDatos {

	public static void main(String[] args) {

		String nombre = JOptionPane.showInputDialog(null,"Indique el nombre:");
		String apellido = JOptionPane.showInputDialog(null,"Indique el apellido:");
		String ciudad = JOptionPane.showInputDialog(null,"Indique la ciudad:");
		String mensaje = String.format("Bienvenido, %s %s estas en la ciudad %s", nombre,apellido,ciudad);
		JOptionPane.showMessageDialog(null, mensaje);
		
		
		
	}

}
