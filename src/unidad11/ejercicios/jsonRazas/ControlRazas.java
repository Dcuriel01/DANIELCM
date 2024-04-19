package unidad11.ejercicios.jsonRazas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;

public class ControlRazas {

	public static void main(String[] args) {
		HashMap<String, HashMap <String,Integer>> zona = new HashMap<String, HashMap <String,Integer>>();
		Raza[] razas = leerFichero();
		zona= tratarInformacion(razas);
		mostrarInformacion(zona);
	}

	private static void mostrarInformacion(HashMap<String, HashMap<String, Integer>> zona) {
		for (String tipo : zona.keySet()) {
			System.out.println("-----------------");
			System.out.println(tipo);
			System.out.println("-----------------");
			for (String tipo2 : zona.get(tipo).keySet()) {
				System.out.println(tipo2);
				System.out.println(zona.get(tipo).get(tipo2));
			}
		}
	}

	private static HashMap<String, HashMap<String, Integer>> tratarInformacion(Raza[] razas) {
		HashMap<String, HashMap <String,Integer>> zona = new HashMap<String, HashMap <String,Integer>>();
		for (int i = 0; i < razas.length; i++) {
			if (zona.containsKey(razas[i].getZonas())) {
				HashMap <String,Integer> temp = zona.get(razas[i].getZonas());
				if (temp.containsKey(razas[i].getRaza_ganado())) {
					int contador = temp.get(razas[i].getRaza_ganado());
					temp.put(razas[i].getRaza_ganado(),(contador+razas[i].getNumero()));
					zona.put(razas[i].getZonas(), temp);
				}else {
					temp.put(razas[i].getRaza_ganado(),razas[i].getNumero());
					zona.put(razas[i].getZonas(), temp);
				}
				
						
			}else {
				HashMap <String,Integer> raza = new HashMap<String,Integer>();
				raza.put(razas[i].getRaza_ganado(),razas[i].getNumero());
				zona.put(razas[i].getZonas(), raza);
			}
			
			
		}
		return zona;
	}

	private static Raza[] leerFichero() {
		Raza[] razas = null;
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
			razas = gson.fromJson(contenido.toString(), Raza[].class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return razas;
	}

}
