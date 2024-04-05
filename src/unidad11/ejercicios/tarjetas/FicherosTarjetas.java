package unidad11.ejercicios.tarjetas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import unidad11.ejercicios.donantesDivididosPorSangre.Persona;
import unidad9.ejemplos.coches.MarcasCoches;

public class FicherosTarjetas {

	public static ArrayList<Tarjeta> lista = new ArrayList<Tarjeta>();
	public static PrintWriter escritor = null;
	
	public static void main(String[] args) {
		Tarjeta tarjeta = null;
		File ficheroLectura = new File("ficheros/cuentasTarjetasBancos.csv");
		File ficheroEscritura = null;
		leerFichero(ficheroLectura);
		Iterator iterador = lista.iterator();
		while (iterador.hasNext()) {
			tarjeta = (Tarjeta) iterador.next();
			comprobarDirectorioOCrear(tarjeta);
			ficheroEscritura = comprobarFicheroOCrear(tarjeta);
			try {
				escribirFichero(tarjeta,ficheroEscritura);
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				escritor.close();
			}
		}
		System.out.println("Datos escritos con exito");
		
	}

	private static void escribirFichero(Tarjeta tarjeta, File fichero) throws IOException {
		escritor = new PrintWriter(new FileWriter(fichero,true));
		escritor.println(tarjeta.imprimirNumeroTarjeta());
		
	}

	private static File comprobarFicheroOCrear(Tarjeta tarjeta) {
		File fichero = new File("ficheros/tarjetas/"+tarjeta.getMarcaTarjetas()+"/"+tarjeta.getMarcaTarjetas()+".txt");
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return fichero;
		}

	private static void comprobarDirectorioOCrear(Tarjeta tarjeta) {
		File directorio = new File("ficheros/tarjetas/"+tarjeta.getMarcaTarjetas());
		if (!directorio.exists())
			directorio.mkdirs();
	}

	private static void leerFichero(File ficheroLectura) {
		String numTarjeta;
		String marcaTarjeta;
		String numCuenta;
		LocalDate fechaCaducidad;
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String[] datos = new String[4];
		Tarjeta tarjeta = null;
		try (BufferedReader lector = new BufferedReader(new FileReader(ficheroLectura))){
			String cadena;
			int linea = 0;
			cadena = lector.readLine();
			while (cadena != null) {
				if (linea>0) {
				datos= cadena.split(",");
				numTarjeta = datos[0];
				marcaTarjeta = datos[1];
				numCuenta = datos[2];
				fechaCaducidad = LocalDate.parse(datos[3],formatoFecha);
				tarjeta = new Tarjeta(numTarjeta, marcaTarjeta, numCuenta, fechaCaducidad);
				lista.add(tarjeta);
				}
				cadena = lector.readLine();
				linea++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
