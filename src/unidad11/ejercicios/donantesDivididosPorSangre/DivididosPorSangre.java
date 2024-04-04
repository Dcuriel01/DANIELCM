package unidad11.ejercicios.donantesDivididosPorSangre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

public class DivididosPorSangre {

	public static PrintWriter escritor = null;
	public static void main(String[] args) {

		File ficheroLectura = new File("ficheros/donantes.txt");
		String[] datos = new String[3];
		TiposSangreDatos tipo;
		Persona persona = null;
		HashSet<Persona> personas = new HashSet<Persona>();
		try (BufferedReader lector = new BufferedReader(new FileReader(ficheroLectura))){
			String cadena;
			cadena = lector.readLine();
			while (cadena != null) {
				datos= cadena.split(", ");
				tipo = comprobarTipo(datos[2]);
				int edad = Integer.parseInt(datos[1]);
				String nombre = datos[0];
				persona = new Persona(nombre, edad, tipo);
				cadena = lector.readLine();
				personas.add(persona);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File directorio = new File("ficheros/donantes");
		if (directorio.exists()) {
		} else {
			if (directorio.mkdir()) {
				}}
				Iterator iterador = personas.iterator();
				while (iterador.hasNext()) {
					Persona personaI = (Persona) iterador.next();
					File ficheroAsignado = new File("ficheros/donantes"+"/"+personaI.getFicheroAsignado());
					if (!ficheroAsignado.exists()) {
						try {
							ficheroAsignado.createNewFile();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					try {
						escribirFichero(personaI,ficheroAsignado);
					} catch (IOException e) {
						e.printStackTrace();
					}finally {
						escritor.close();
					}
				}
				System.out.println("Datos escritos con exito");
	
	}
	
	private static void escribirFichero(Persona p ,File fichero) throws IOException {
		escritor = new PrintWriter(new FileWriter(fichero,true));
		escritor.println(p);
	}
	
	private static TiposSangreDatos comprobarTipo(String tipo) {
		TiposSangreDatos tipoSangre = null;
		switch (tipo) {
		case "AB+":
			tipoSangre = TiposSangreDatos.ABPOS;
			break;
		case "AB-":
			tipoSangre = TiposSangreDatos.ABNEG;
			break;
		case "A+":
			tipoSangre = TiposSangreDatos.APOS;
			break;
		case "A-":
			tipoSangre = TiposSangreDatos.ANEG;
			break;
		case "B+":
			tipoSangre = TiposSangreDatos.BPOS;
			break;
		case "B-":
			tipoSangre = TiposSangreDatos.BNEG;
			break;
		case "O-":
			tipoSangre = TiposSangreDatos.ONEG;
			break;
		case "O+":
			tipoSangre = TiposSangreDatos.OPOS;
			break;
		}
		return tipoSangre;
	}

}
