package unidad11.ejemplos.escribirFichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirEnFichero2 {

	public static void main(String[] args) {

		String nombreFichero = "Ejemplo2.txt";
		
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFichero));) {
			escritor.write("Primera línea de texto");
			escritor.newLine();
			escritor.write("Segunda línea");
			escritor.newLine();
			escritor.write("Tercera línea");
			System.out.println("Datos escritos con exito");
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
