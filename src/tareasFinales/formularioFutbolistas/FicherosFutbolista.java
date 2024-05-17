package tareasFinales.formularioFutbolistas;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FicherosFutbolista {
	
	static File ficheroEscritura = new File("ficheros//futbolistas.txt");
	public static void escribirFutbolistas(ArrayList<Futbolista> futbolistas) {
		try(PrintWriter escritor = new PrintWriter(ficheroEscritura)) {
			for (Futbolista futbolista : futbolistas) {
				escritor.println("Futbolista: " + futbolista.getId());
				escritor.println("Nombre completo: " + futbolista.getNombre() + " " + futbolista.getApellido());
				escritor.println("Equipo favorito : " + futbolista.getEquipo());
				escritor.println("Mayor de edad: " + futbolista.isAnios18());
				escritor.println("Jugador favorito: " + futbolista.getJugadorFav());
				escritor.println("Genero: " + futbolista.getGenero());
				escritor.println("Pierna buena: " + futbolista.getPierna());
				escritor.println("Posición: " + futbolista.getPosicion());
				escritor.println();
			}
			
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
	
			}
		}
	public static void abrirFichero() {
		try {
            Desktop.getDesktop().open(ficheroEscritura);
           } catch (IOException ex) {
               ex.printStackTrace();
	}
}
}

