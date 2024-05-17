package ejerciciosPropios.futbolistas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class LeerFutbolistas {
	public static HashMap<String, ArrayList<Futbolista>> mapaLigas = new HashMap<String, ArrayList<Futbolista>>();
	public static void main(String[] args) {
		leerFichero();
		organizarEquipos();
	}
	
	
	public static void leerFichero() {
		try {
			Properties propiedades = new Properties();
			FileInputStream fis;
			fis = new FileInputStream("ficheros/properties/propiedadesFutbolistas.properties");
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero = propiedades.getProperty("ficheroLectura");
			File ficheroLectura = new File(directorio+File.separator+nombreFichero);
			
			BufferedReader lector = new BufferedReader(new FileReader(ficheroLectura));
				String cadena;
				cadena = lector.readLine();
				while (cadena != null) {
					String[]datos = cadena.split(",");
					Futbolista futbolista = creacionJugadores(datos);
					guardarJugadorLiga(futbolista);
					cadena = lector.readLine();
					
					
				}	
				
				lector.close();
		}catch (IOException e) {
			e.printStackTrace();
	}
}
	
	private static void organizarEquipos() {
		crearDirectorios();
		crearFicheros();
		for (String liga : mapaLigas.keySet()) {
			ArrayList<Futbolista> equipo1 = new ArrayList<Futbolista>();
			ArrayList<Futbolista> equipo2 = new ArrayList<Futbolista>();
			for (Futbolista futbolista : mapaLigas.get(liga)) {
				String equipo = futbolista.getEquipo();
				if (equipo1.isEmpty()) {
					equipo1.add(futbolista);
				}else {
					if (equipo1.get(0).getEquipo().equals(futbolista.getEquipo())) {
						equipo1.add(futbolista);
					}else {
						equipo2.add(futbolista);
					}	
				}
			}
			
			escribirJson(equipo1);
			escribirJson(equipo2);
			
			
		}
			
	}

	private static void escribirJson(ArrayList<Futbolista> equipo) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(equipo);
		
		File fichero = new File("ficheros/futbol/"+equipo.get(0).getLiga()+"/"+equipo.get(0).getEquipo()+".json");
		
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero))) {
			escritor.write(json);
		} catch (Exception e) {
		}
		
	}

	private static void crearFicheros() {
		for (String liga : mapaLigas.keySet()) {
			for (Futbolista futbolista : mapaLigas.get(liga)) {
				String equipo = futbolista.getEquipo();
				File fichero = new File("ficheros/futbol/"+liga+"/"+equipo+".json");
				if (fichero.exists()) {
					
				}else {
					try {
						fichero.createNewFile();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}
		}
		
	}

	private static void crearDirectorios() {
		for (String liga : mapaLigas.keySet()) {
			File directorio = new File("ficheros/futbol/"+liga);
			if (directorio.exists()) {
			}else {
				directorio.mkdir();
			}
		}
		
	}

	private static void guardarJugadorLiga(Futbolista futbolista) {

		String liga=futbolista.getLiga();
		ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();
		if (mapaLigas.containsKey(liga)) {
			mapaLigas.get(liga).add(futbolista);
		}else {
			futbolistas.add(futbolista);
			mapaLigas.put(liga, futbolistas);
		}
		
	}

	private static Futbolista creacionJugadores(String[] datos) {
		Futbolista futbolista = null;
		String nombre = datos[0];
		String apellido = datos[1];
		String liga = datos[2];
		String equipo = datos[3];
		int dorsal = Integer.parseInt(datos[4]);
		String posicion = datos[5];
		futbolista = new Futbolista(nombre, apellido, liga, equipo, dorsal, posicion);
		return futbolista;
	}
}
