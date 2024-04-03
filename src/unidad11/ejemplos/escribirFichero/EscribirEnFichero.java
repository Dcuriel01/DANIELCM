package unidad11.ejemplos.escribirFichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirEnFichero {

	public static void main(String[] args) {

		File fichero = new File("ejemplosFicheros//ejemplo.txt");

		int caracter = 97;
		char caracter2 = 'B';
		String cadena = "Este mensaje es un ejemplo de uso de FileWriter";
		
		try(FileWriter escritor = new FileWriter(fichero);) {
			escritor.write(caracter);
			escritor.write("\n");
			escritor.write(caracter2);
			escritor.write("\n");
			escritor.write(cadena);
			System.out.println("Datos escritos con exito");
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
