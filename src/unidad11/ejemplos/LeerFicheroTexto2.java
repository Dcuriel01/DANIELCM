package unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto2 {

	public static void main(String[] args) {
	
	System.out.println("Leer fichero");
	String rutaFichero="mancomunidades_extremadura.txt";
	BufferedReader lector = null;
	File fichero = new File(rutaFichero);
	try {
		lector= new BufferedReader(new FileReader(fichero));
		String cadena;
		cadena = lector.readLine();
		while (cadena != null) {
			System.out.println(cadena);
			cadena = lector.readLine();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			lector.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	
		
		
	}

}
