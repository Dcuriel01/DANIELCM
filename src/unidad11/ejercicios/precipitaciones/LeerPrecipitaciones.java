package unidad11.ejercicios.precipitaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class LeerPrecipitaciones {
	public static HashMap<Integer, ArrayList<Mes>> mapaAnios = new HashMap<Integer, ArrayList<Mes>>();
	public static void main(String[] args) {

	
		
		try {
		Properties propiedades = new Properties();
		FileInputStream fis;
		fis = new FileInputStream("ficheros/properties/precipitaciones.properties");
		propiedades.load(fis);
		String directorio=propiedades.getProperty("directorio");
		String nombreFichero = propiedades.getProperty("ficheroLectura");
		BufferedReader lector = new BufferedReader(new FileReader(directorio+File.separator+nombreFichero));
		String cadena;
		int nLinea=0;
		cadena = lector.readLine();
		while (cadena!=null) {
			if (nLinea > 0) {
				String [] datos = cadena.split(" ");
				tratarCadena(datos);
			}
			cadena = lector.readLine();
			nLinea++;
		}
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void tratarCadena(String[] datos) {
		String territorio = datos[0].trim();
		String anio = datos[1].trim();
		String mes = datos[2].trim();
		double valor = Integer.parseInt(datos[3]);
		
		crearMes(territorio,anio,mes,valor);
		
		
		
		
	}

	private static void crearMes(String territorio, String anio, String mes, double valor) {
		Mes m = new Mes(territorio, anio, mes, valor);
		if (mapaAnios.get(anio)!=null) {
			ArrayList<Mes> lista = new ArrayList<Mes>();
			lista.add(m);
		}else {
			mapaAnios.get(anio).add(m);
		}
	}

}
