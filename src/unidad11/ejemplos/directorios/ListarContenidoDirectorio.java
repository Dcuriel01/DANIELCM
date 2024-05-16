package unidad11.ejemplos.directorios;

import java.io.File;

public class ListarContenidoDirectorio {

	public static void main(String[] args) {

		File directorio = new File("ficheros/");
		if (directorio.exists()) {
			if (directorio.isDirectory()) {
				/*Listar contenido usando list();
				String[] elementos = directorio.list();
				for (String string : elementos) {
					System.out.println(string);
				}*/
				
				//Listar contenido usando listFiles();
				File[] elementosFile = directorio.listFiles();
				System.out.println("___________");
				for (File file : elementosFile) {
					System.out.println(file.getName());
				}
			}else {
			System.out.println("Es un fichero no un directorio");
			}
		}else {
			System.out.println("No existe el directorio");
		}
		
	}

}
