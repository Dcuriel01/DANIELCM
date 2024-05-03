package unidad13.ejemplos.pedirDatos;

import java.io.File;

import javax.swing.JFileChooser;

public class PedirFichero {

	public static void main(String[] args) {
		JFileChooser elegirFichero = new JFileChooser();
		elegirFichero.setCurrentDirectory(new File(System.getProperty("user.dir")));
		int resultado = elegirFichero.showOpenDialog(null);
		
		if (resultado == JFileChooser.APPROVE_OPTION) {
			File fichero = elegirFichero.getSelectedFile();
			System.out.println("Fichero seleccionado: " + fichero.getAbsolutePath());
		}else {
			System.out.println("No se ha seleccionado ningun fichero");
		}
	}
	
}
