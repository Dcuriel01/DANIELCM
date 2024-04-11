package unidad11.ejercicios.reparaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class ProgramaReparaciones {

	private static List<Reparacion> reparaciones = new ArrayList<Reparacion>();
	
	public static void main(String[] args) {
		try {
			Properties propiedades = new Properties();
			FileInputStream fis = new FileInputStream("ficheros/configuracion.properties");
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero = propiedades.getProperty("ficheroHistorial");
			File ficheroLectura = new File("ficheros/historialReparacionesVehiculos.txt");
			BufferedReader lector = new BufferedReader(new FileReader(directorio+File.separator+nombreFichero));
			System.out.println("hola");
			String cadena;
			cadena = lector.readLine();
			while (cadena != null) {
				tratarCadenaDatosReparacion(cadena);
				cadena = lector.readLine();
			} 
				
			lector.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mostrarDatos();
		
		
	}

	private static void mostrarDatos() {
		Iterator it = reparaciones.iterator();
		while (it.hasNext()) {
			Reparacion reparacion = (Reparacion)it.next();
			System.out.println(reparacion);
		}
		
	}

	private static void tratarCadenaDatosReparacion(String cadena) {
		
		String[] datos = cadena.split(" ");
		TipoVehiculo tipo = null;
		tipo = obtenerTipoVehiculo(datos[0]);
		if (datos.length==3) {//Sin reparacion
			crearNuevaReparacion(tipo,datos[1],datos[2],null);
		}else {
			List<String> aniosReparacion= obtenerAniosReparacion(cadena);
			crearNuevaReparacion(tipo,datos[1],datos[2],aniosReparacion);
		}
		
	}

	private static List<String> obtenerAniosReparacion(String cadena) {
		String[] datos = cadena.split(" ");
		List<String> aniosReparacion = new ArrayList<String>();
		for (int i = 3; i < datos.length; i++) {
			aniosReparacion.add(datos[i]);
		}
		return aniosReparacion;
	}

	private static void crearNuevaReparacion(TipoVehiculo tipo, String matricula, String anio, List<String> reparaciones) {
		Reparacion reparacion = new Reparacion(tipo, matricula, anio,reparaciones);
		reparaciones.add(reparacion);
	}

	private static TipoVehiculo obtenerTipoVehiculo(String valor) {
		TipoVehiculo tipo = null;
		switch (valor) {
		case "coche":
			tipo = TipoVehiculo.COCHE;
			break;
		case "moto":
			tipo = TipoVehiculo.MOTO;
			break;
		case "camion":
			tipo = TipoVehiculo.CAMION;
			break;

		default:
			break;
		}
		
		return null;
	}

}
