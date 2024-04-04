package unidad11.ejemplos.directorios;

import java.io.File;

public class FicheroODirectorio {

	public static void main(String[] args) {

		File fichero = new File("/home/diurno/Documentos/Ficheros/jueves/Coches.txt");
		
		if (fichero.isDirectory()) {
			System.out.println("Es un directorio");
		}else {
			System.out.println("Es fichero");
		}
	}

}
