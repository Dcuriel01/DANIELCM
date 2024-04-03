package unidad11.ejercicios.donantes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Donantes {

	public static void main(String[] args) {
		File fichero = new File("ficheros//donantes.txt");
		File fichero2 = new File("ficheros//resumenDonantes.txt");
		HashMap<TiposSangre, Integer> mapa = new HashMap<TiposSangre, Integer>();
		String[] datos = new String[3];
		TiposSangre tipo;
		try (BufferedReader lector = new BufferedReader(new FileReader(fichero))){
			String cadena;
			cadena = lector.readLine();
			while (cadena != null) {
				datos= cadena.split(", ");
				tipo = comprobarTipo(datos[2]);
				mapa.put(tipo,mapa.getOrDefault(tipo, 0)+1);
				cadena = lector.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(PrintWriter escritor = new PrintWriter(fichero2)) {
			for (TiposSangre sangre : mapa.keySet()) {
				escritor.println("TiposSangre: " + sangre.getSangre() + " cantidad: " + mapa.get(sangre));
			}
			
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	
		
	}

	private static TiposSangre comprobarTipo(String tipo) {
		TiposSangre tipoSangre = null;
		switch (tipo) {
		case "AB+":
			tipoSangre = TiposSangre.ABPOS;
			break;
		case "AB-":
			tipoSangre = TiposSangre.ABNEG;
			break;
		case "A+":
			tipoSangre = TiposSangre.APOS;
			break;
		case "A-":
			tipoSangre = TiposSangre.ANEG;
			break;
		case "B+":
			tipoSangre = TiposSangre.BPOS;
			break;
		case "B-":
			tipoSangre = TiposSangre.BNEG;
			break;
		case "O-":
			tipoSangre = TiposSangre.ONEG;
			break;
		case "O+":
			tipoSangre = TiposSangre.OPOS;
			break;
		}
		return tipoSangre;
	}

}
