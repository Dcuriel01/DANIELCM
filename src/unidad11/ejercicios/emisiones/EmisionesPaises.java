package unidad11.ejercicios.emisiones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import unidad11.ejercicios.donantesConEdad.TiposSangre;

public class EmisionesPaises {
	public static HashMap<Integer, Integer> mapaAnio = new HashMap<Integer, Integer>();
	public static HashMap<String, Integer> mapaPais = new HashMap<String, Integer>();
	public static void main(String[] args) {
		File ficheroLectura = new File("ficheros//emisiones.txt");
		File ficheroEscritura = new File("ficheros//emisionesEjercicios.txt");
		leerFichero(ficheroLectura);
		escribirFichero(ficheroEscritura);		
}
	private static void escribirFichero(File ficheroEscritura) {
		try(PrintWriter escritor = new PrintWriter(ficheroEscritura)) {
			escritor.println("Emisiones por años");
			escritor.println(mostrarMapasAnio());
			escritor.println("Emisiones por paises");
			escritor.println(mostrarMapasPais());
			
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
	
		}		
	}

	private static void leerFichero(File ficheroLectura) {
		String[] datos = new String[3];
		int anio;
		String pais;
		int emisiones;
		try (BufferedReader lector = new BufferedReader(new FileReader(ficheroLectura))){
			String cadena;
			cadena = lector.readLine();
			while (cadena != null) {
				datos=cadena.split(", ");
				anio = Integer.parseInt(datos[0]);
				pais = datos[1];
				emisiones=Integer.parseInt(datos[2]);
				calcularEmisionesPorAnio(anio,emisiones);
				calcularEmisionesPorPais(pais,emisiones);
				cadena = lector.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static String mostrarMapasAnio() {
		String cadena="";
		for (int anios : mapaAnio.keySet()) {
			cadena=cadena + "Año:"+anios+ " Emisiones:" + mapaAnio.get(anios)+ "\n";
			}
		return cadena;
	}
	
	private static String mostrarMapasPais() {
		String cadena="";
		for (String paises : mapaPais.keySet()) {
			cadena=cadena + "País:"+paises+ " Emisiones:" + mapaPais.get(paises)+ "\n";
			}
		return cadena;
	}

	private static void calcularEmisionesPorPais(String pais, int emisiones) {
		mapaPais.put(pais, mapaPais.getOrDefault(pais, 0)+emisiones);
		
	}

	private static void calcularEmisionesPorAnio(int anio,int emisiones) {
		mapaAnio.put(anio, mapaAnio.getOrDefault(anio, 0)+emisiones);
		
	}
	
	
}
