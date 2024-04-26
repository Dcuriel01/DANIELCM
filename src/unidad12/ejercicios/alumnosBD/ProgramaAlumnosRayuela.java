package unidad12.ejercicios.alumnosBD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ProgramaAlumnosRayuela {

	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private static Set<Ciclo> ciclos = new HashSet<Ciclo>();
	static Properties propiedades = new Properties();
	private static String url;
	private static String usuario;
	private static String password;
	private static int contCiclos = 1;
	public static void main(String[] args) {
		cargarConfiguracion();
		url = propiedades.getProperty("url_clase");
		usuario = propiedades.getProperty("usuario");
		password = propiedades.getProperty("password");
		leerFichero();
		//escribirFichero();
		createTable();
		introducirInformacionAlumnos();
		
	}

	private static void introducirInformacionAlumnos() {
		

		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			String sql = "INSERT INTO alumnos (id,nombre,apellidos,ciclo)"
					+ "VALUES (?,?,?,?)";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			Iterator it = alumnos.iterator();
			int filasInsertadas = 0;
			while (it.hasNext()) {
				Alumno alumno = (Alumno)it.next();

				sentenciaPreparada.setInt(1, alumno.getId());
				sentenciaPreparada.setString(2, alumno.getNombre());
				sentenciaPreparada.setString(3, alumno.getApellidos());
				sentenciaPreparada.setInt(4, alumno.getCodigoCiclo());
				filasInsertadas =+ sentenciaPreparada.executeUpdate();
			}

			sql = "INSERT INTO ciclos (id,nombre,codigo)"
					+ "VALUES (?,?,?)";
			sentenciaPreparada = con.prepareStatement(sql);
			
			for (Ciclo ciclo : ciclos) {
				sentenciaPreparada.setInt(1, ciclo.getId());
				sentenciaPreparada.setString(2, ciclo.getNombre());
				sentenciaPreparada.setString(3, ciclo.getCodigo());
				sentenciaPreparada.executeUpdate();
			}
			
			System.out.println("Filas insertadas:" + filasInsertadas);
			
			
		} catch (SQLException e) {
			
		
		}
		
		
		
	}

	private static void createTable() {
		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			String sql = "CREATE TABLE alumnos ("
					+ "ID int PRIMARY KEY,"
					+ "nombre varchar(255),"
					+ "apellidos varchar(255),"
					+ "ciclo int(2)"
					+ ");";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.executeUpdate();
			
			sql = "CREATE TABLE ciclos ("
					+ "ID int PRIMARY KEY,"
					+ "nombre varchar(255),"
					+ "codigo varchar(255)"
					+ ");";
			sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.executeUpdate();
			
		} catch (SQLException e) {
			
		
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
		Ciclo c1 = new Ciclo(contCiclos, datos[1], datos[2]);
		int iguales =0; 
		for (Ciclo ciclo : ciclos) {
			if (ciclo.getCodigo().equals(c1.getCodigo())) {
				iguales++;
			}
		}
		if (iguales!=3) {
			ciclos.add(c1);
			contCiclos++;
		}
		iguales=0;
		crearAlumno(id,apeNom[0],nombre,c1);
		
		
	}

	private static void crearAlumno(int id, String apellidos, String nombre,Ciclo c1) {
		int idCiclo = 0;
		for (Ciclo ciclo : ciclos) {
			if (ciclo.getCodigo().equals(c1.getCodigo())) {
				idCiclo=c1.getId();
			}
		}
		Alumno a1 = new Alumno(id, apellidos, nombre,idCiclo);
		alumnos.add(a1);
	}
	
	public static void cargarConfiguracion(){
		FileInputStream fis;
		try {
			fis = new FileInputStream("ficheros/properties/bd/conexion.properties");
			propiedades.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
