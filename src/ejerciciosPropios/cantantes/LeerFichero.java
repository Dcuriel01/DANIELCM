package ejerciciosPropios.cantantes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class LeerFichero {

	static ArrayList<Cantante> cantantes = new ArrayList<Cantante>();
	
	public static ArrayList<Cantante> recuperarLista() {
		
		try {
			File fichero = new File("ficheros/Cantantes/Cantantes.json");
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			StringBuilder contenido = new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			
			lector.close();
			Gson gson = new Gson();
			Cantante[] cantantesArray = gson.fromJson(contenido.toString(), Cantante[].class);
			
			for (Cantante cantante : cantantesArray) {
				cantantes.add(cantante);
			}
			
		} catch (IOException e) {
			
		}
		return cantantes;

	}
	
	

}
