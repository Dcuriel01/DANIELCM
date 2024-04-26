package unidad11.ejercicios.alumnosRayuela;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

public class ProgramaAlumnosRayuela {

	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public static void main(String[] args) {
		
		leerFichero();
		escribirFichero();
		
	}

	private static void escribirFichero() {
		try {
			Properties propiedades = new Properties();
			FileInputStream fis = new FileInputStream("ficheros/properties/configuracionAlumnos.properties");
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero = propiedades.getProperty("ficheroEscritura");
			PrintWriter escritor = new PrintWriter(directorio+File.separator+nombreFichero);
			Iterator it = alumnos.iterator();
			while (it.hasNext()) {
				Alumno alumno = (Alumno)it.next();
				escritor.println("INSERT INTO(id,nombre,apellidos,ciclo formativo"
						+ " values("+alumno.getId()+","+alumno.getApellidos()+","+alumno.getNombre()+","+alumno.getCodigoCiclo()+")");
			}
			
			escritor.close();
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void leerFichero() {
		try {
			Properties propiedades = new Properties();
			FileInputStream fis = new FileInputStream("ficheros/properties/configuracionAlumnos.properties");
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero = propiedades.getProperty("ficheroLectura");
			BufferedReader lector = new BufferedReader(new FileReader(directorio+File.separator+nombreFichero));
			String cadena;
			int contadorAlum=0;
			cadena = lector.readLine();
			while (cadena != null) {
				if (contadorAlum>1) {
					tratarCadena(cadena,contadorAlum);
				}
				cadena = lector.readLine();
				contadorAlum++;
			} 
				
			lector.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void tratarCadena(String cadena,int id) {
		String[] datos = cadena.split("\\|");
		String apellidosynom = datos[0];
		String[] apeNom = apellidosynom.split(",");
		String nombre = apeNom[1].trim();
		crearAlumno(id,apeNom[0],nombre,datos[2]);
		
		
	}

	private static void crearAlumno(int id, String apellidos, String nombre, String ciclo) {
		Alumno a1 = new Alumno(id, apellidos, nombre, ciclo);
		alumnos.add(a1);
	}

}
