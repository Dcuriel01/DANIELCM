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
		HashMap<String, ArrayList<Raza>> zona = new HashMap<String, ArrayList<Raza>>();
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
					zona.get(razas[i].getZonas()).add(razas[i]);
				}else {
					ArrayList<Raza> lista = new ArrayList<Raza>();
					lista.add(razas[i]);
					zona.put(razas[i].getZonas(),zona.getOrDefault(0, lista));
				}
			}
			for (String tipo : zona.keySet()) {
				System.out.println(tipo);
				
				
			}
			
			
		} catch (IOException e) {
			
		}
			
		
	}

}
