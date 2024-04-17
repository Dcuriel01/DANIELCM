package unidad11.ejemplos.json.Gson.leer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class LeerFicheroJsonUsuario {

	public static void main(String[] args) {
		try {
			File fichero = new File("ficheros/json/usuario.json");
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			StringBuilder contenido = new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			
			lector.close();
			Gson gson = new Gson();
			Usuario2 user = gson.fromJson(contenido.toString(), Usuario2.class);
			System.out.println(user);
			
		} catch (IOException e) {
			
		}
		
		
		
		
	}

}
