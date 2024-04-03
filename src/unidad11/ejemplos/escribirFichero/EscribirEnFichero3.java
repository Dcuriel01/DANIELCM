package unidad11.ejemplos.escribirFichero;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirEnFichero3 {

	public static void main(String[] args) {

		try(PrintWriter escritor = new PrintWriter("Ejemplo3.txt")) {
			escritor.write("Otro ejemplo de escribir en ficheros con PrintWriter");
			escritor.println();
			escritor.printf("Podemos escrbir %s con formato","Textos");
			escritor.println();
			escritor.printf("Podemos escrbir %d con formato",6);
			
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

}
