package unidad11.ejemplos.leerFichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto3 {

	public static void main(String[] args) {
	
	System.out.println("Leer fichero");
	String rutaFichero="mancomunidades_extremadura.txt";
	File fichero = new File(rutaFichero);
	
	try (BufferedReader lector = new BufferedReader(new FileReader(fichero))){
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
	}
	
		
		
	}

}
