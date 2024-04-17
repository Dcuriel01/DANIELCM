package unidad11.ejemplos.json.Gson.leer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class LeerFicheroJsonUsuarios {

	public static void main(String[] args) {
		try {
			File fichero = new File("ficheros/json/usuarios.json");
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			StringBuilder contenido = new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			
			lector.close();
			Gson gson = new Gson();
			Usuario2[] users = gson.fromJson(contenido.toString(), Usuario2[].class);
			
			for (Usuario2 usuario2 : users) {
				System.out.println(usuario2);
			}
			
		} catch (IOException e) {
			
		}
		
		
		
		
	}

}
