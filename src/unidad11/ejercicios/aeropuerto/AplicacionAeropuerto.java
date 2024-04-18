package unidad11.ejercicios.aeropuerto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;


public class AplicacionAeropuerto {
	static HashMap<String, ArrayList<Aeropuertos>> paises = new HashMap<String, ArrayList<Aeropuertos>> ();
	static File ficheroLectura = new File("ficheros/json/aeropuertos.json");	
	static File ficheroEscritura = new File("ficheros/aeropuertos/aeropuertos.txt");	
	
	public static void main(String[] args) {
		Aeropuertos[] aereo =leerFichero();
		organizarInformacion(aereo);
		escribirFichero();
	}

	private static void escribirFichero() {
		if (!ficheroEscritura.exists()) {
			try {
				ficheroEscritura.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try(PrintWriter escritor = new PrintWriter(new FileWriter(ficheroEscritura))) {
			for (String pais : paises.keySet()) {
				escritor.println("Pais: " + pais);
				for (Aeropuertos aeropuerto : paises.get(pais)) {
					escritor.println(aeropuerto);
				}
			}
			System.out.println("Datos escritos con exito");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void organizarInformacion(Aeropuertos[] aereo) {
		for (Aeropuertos a : aereo) {
			if (paises.containsKey(a.getPais())) {
				paises.get(a.getPais()).add(a);
			}else {
				ArrayList<Aeropuertos> aeropuertos = new ArrayList<Aeropuertos>();
				aeropuertos.add(a);
				paises.put(a.getPais(),aeropuertos);
			}
		}
		
	}

	private static Aeropuertos[] leerFichero() {
		Aeropuertos[] aereo = null;
		try {
		BufferedReader lector = new BufferedReader(new FileReader(ficheroLectura));
		StringBuilder contenido = new StringBuilder();
		String linea;
		while((linea=lector.readLine())!=null) {
			contenido.append(linea);
		}
		lector.close();
		Gson gson = new Gson();
		aereo = gson.fromJson(contenido.toString(), Aeropuertos[].class);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aereo;
		
		
	}
	
	
	
}
