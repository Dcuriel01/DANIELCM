package ejerciciosPropios.MMA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class LeerLuchadores {
	
	public static Luchador[] devolverArray(){
		Luchador[] luchadores = null;
		try {
			File fichero = new File("ficheros/practicas/luchadoresMMA.json");
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			StringBuilder contenido = new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			
			lector.close();
			Gson gson = new Gson();
			luchadores = gson.fromJson(contenido.toString(), Luchador[].class);
		} catch (IOException e) {
			
		}
		return luchadores;
		
	}

	public static ArrayList<Luchador> devolverLista() {
		Luchador[] luchadores = devolverArray();
		ArrayList<Luchador> listaLuchadores = new ArrayList<Luchador>();
		for (Luchador luchador: luchadores) {
			listaLuchadores.add(luchador);
		}
		return listaLuchadores;
	}
	
}
