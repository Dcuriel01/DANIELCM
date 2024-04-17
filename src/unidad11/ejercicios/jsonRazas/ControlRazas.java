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
		HashMap<String, HashMap <String,Integer>> zona = new HashMap<String, HashMap <String,Integer>>();
	
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
				if (zona.containsKey(razas[i].getZonas())) {
					zona.get(razas[i].getZonas()).
					put(razas[i].getRaza_ganado(), 
							zona.get(razas[i].getZonas()).getOrDefault(razas[i].getNumero(), 0)+razas[i].getNumero());
				}else {
					HashMap <String,Integer> raza = new HashMap<String,Integer>();
					raza.put(razas[i].getRaza_ganado(), raza.getOrDefault(razas[i].getNumero(), 0)+razas[i].getNumero());
					zona.put(razas[i].getZonas(), raza);
				}
				
				
			}
			for (String tipo : zona.keySet()) {
				System.out.println(tipo);
				for (String tipo2 : zona.get(tipo).keySet()) {
					System.out.println(tipo2);
					System.out.println(zona.get(tipo).get(tipo2));
					System.out.println("************************");
				}
				System.out.println("_______________");
			}
			
			
		} catch (IOException e) {
			
		}
			
		
	}

}
