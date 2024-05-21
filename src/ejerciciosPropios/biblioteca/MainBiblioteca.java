package ejerciciosPropios.biblioteca;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import unidad12.ConexionBD;

public class MainBiblioteca {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	static List<String> listaLibros = new ArrayList<String>();
	public static void main(String[] args) {
		try {
			listaLibros = Files.readAllLines(
								Paths.get("ficheros/biblioteca/bibloteca.txt")
									,StandardCharsets.UTF_8);
			for (String lineaLibro : listaLibros) {
				String[] datos = lineaLibro.split(", ");
				Libro libro = new Libro(datos[0], datos[1], Integer.parseInt(datos[2]), Double.parseDouble(datos[3]));
				insertarLibro(libro);
			}
				Libro libro = new Libro("Juego de Tronos", "George R. R. Martin", 1996, 26.50);
				insertarLibro(libro);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	private static void insertarLibro(Libro libro) {
		LibroDAO LD = new LibroDAO(url, usuario, password);
		boolean filaInsertada = LD.insertarProducto(libro);
		if (filaInsertada) {
			System.out.println("Fila insertada con exito");
		}
	}

}
