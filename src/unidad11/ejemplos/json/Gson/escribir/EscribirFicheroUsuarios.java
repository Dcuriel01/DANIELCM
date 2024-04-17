package unidad11.ejemplos.json.Gson.escribir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import unidad11.ejemplos.json.Gson.leer.Usuario2;

public class EscribirFicheroUsuarios {

	public static void main(String[] args) {

		Usuario2 us1 = new Usuario2("Pedro", "Pedro@educarex.es", 23, 7473749, "Caceres", false);
		Usuario2 us2 = new Usuario2("Jude", "Belli@educarex.es", 20, 5555555, "Madrid", true);
		Usuario2 us3 = new Usuario2("Vini", "Vini@educarex.es", 23, 77777777, "Madrid", false);
		
		ArrayList<Usuario2>lista = new ArrayList<Usuario2>();
		lista.add(us1);
		lista.add(us2);
		lista.add(us3);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(lista);
		
		File fichero = new File("ficheros/json/newUsuarios.json");
		
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero))) {
			
			escritor.write(json);
			System.out.println("Datos escritos correctamente");
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
