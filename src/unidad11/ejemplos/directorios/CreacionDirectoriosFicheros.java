package unidad11.ejemplos.directorios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreacionDirectoriosFicheros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la ruta del directorio a crear");

		String nombreDir = sc.nextLine();

		// No crea directorio
		File directorio = new File(nombreDir);
		if (directorio.exists()) {
			System.out.println("El directorio ya existe");
		} else {
			System.out.println("El directorio no existe, vamos a crearlo");
			// Mkdirs Crea toda la estructura necesaria y Mkdir crea solo la carpet
			if (directorio.mkdir()) {
				System.out.println("Directorio creado");
			} else {
				System.out.println("Directorio no creado");
			}
		}
		System.out.println("Ingrese el nombre del fichero a crear");
		String nombreFichero = sc.nextLine();

		File fichero = new File(nombreDir + "/" + nombreFichero);
		if (fichero.exists()) {
			System.out.println("El fichero ya existe");
		} else {
			System.out.println("El fichero no existe, vamos a crearlo");
			// Crea toda la estructura necesaria
			try {
				if (fichero.createNewFile()) {
					System.out.println("fichero creado");
				} else {
					System.out.println("fichero no se ha creado");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
