package unidad11.ejercicios.donantesConEdad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class DonantesConEdad {

	public static void main(String[] args) {
		Edad edadObj = null;
		File fichero = new File("ficheros//donantes.txt");
		File fichero2 = new File("ficheros//resumenDonantesConEdad.txt");
		HashMap<Integer, Edad> mapa = new HashMap<Integer, Edad>();
		String[] datos = new String[3];
		TiposSangreConEdad tipo;
		try (BufferedReader lector = new BufferedReader(new FileReader(fichero))){
			String cadena;
			cadena = lector.readLine();
			while (cadena != null) {
				datos= cadena.split(", ");
				tipo = comprobarTipo(datos[2]);
				int edad = Integer.parseInt(datos[1]);
				if (mapa.get(edad) == null) {
					edadObj = new Edad();
				}
				edadObj.añadirTipo(tipo);
				mapa.put(edad, edadObj);
				cadena = lector.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(PrintWriter escritor = new PrintWriter(fichero2)) {
			for (Integer edad : mapa.keySet()) {
				escritor.println("Edad:"+edad);
				escritor.println(mapa.get(edad).mostrarMapa());
				}
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	
		
	}

	private static TiposSangreConEdad comprobarTipo(String tipo) {
		TiposSangreConEdad tipoSangre = null;
		switch (tipo) {
		case "AB+":
			tipoSangre = TiposSangreConEdad.ABPOS;
			break;
		case "AB-":
			tipoSangre = TiposSangreConEdad.ABNEG;
			break;
		case "A+":
			tipoSangre = TiposSangreConEdad.APOS;
			break;
		case "A-":
			tipoSangre = TiposSangreConEdad.ANEG;
			break;
		case "B+":
			tipoSangre = TiposSangreConEdad.BPOS;
			break;
		case "B-":
			tipoSangre = TiposSangreConEdad.BNEG;
			break;
		case "O-":
			tipoSangre = TiposSangreConEdad.ONEG;
			break;
		case "O+":
			tipoSangre = TiposSangreConEdad.OPOS;
			break;
		}
		return tipoSangre;
	}

}
