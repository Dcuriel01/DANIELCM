package unidad11.ejercicios.jsonRazas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

public class ControlRazas {

	public static void main(String[] args) {
		HashMap<String, Integer> tipos = new HashMap<String, Integer>();
		try {
			File fichero = new File("ficheros/json/razasComarcasExtremadura.json");
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			StringBuilder contenido = new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			
			lector.close();
			Gson gson = new Gson();
			Raza[] razas = gson.fromJson(contenido.toString(), Raza[].class);
			
			
			
			for (int i = 0; i < razas.length; i++) {
				tipos.put(razas[i].getRaza_ganado(),tipos.getOrDefault(0,razas[i].getNumero()));
				}	
			for (String tipo : tipos.keySet()) {
				System.out.println("Tipo: " + tipo + " cantidad: " + tipos.get(tipo));
			}
			
		} catch (IOException e) {
			
		}
			
		
	}

}
