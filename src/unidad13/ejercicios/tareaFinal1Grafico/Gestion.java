package unidad13.ejercicios.tareaFinal1Grafico;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Gestion {
	static Scanner sc = new Scanner(System.in);
	static GestionParqueMovil parqueM = new GestionParqueMovil();
	public static Vehiculo crearVehiculo(String matricula,String fechaProv,String marca,String modelo,int kilometraje) {
		LocalDate fecha = null;
		Vehiculo v = null;
		if (validadarMatricula(matricula)) {
			fecha = parsearFecha(fechaProv);
			if (fecha!=null) {
				v = new Vehiculo(matricula, fecha, marca, modelo, kilometraje);
			}
		}else {
			JOptionPane.showMessageDialog(null,"Error en la matricula");
		}
		
		return v;
	}

	private static LocalDate parsearFecha(String fechaProv) {
		DateTimeFormatter formatoFecha2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha =null;
		try {
			fecha = LocalDate.parse(fechaProv, formatoFecha2);
		} catch (DateTimeParseException e) {
			JOptionPane.showMessageDialog(null,"Error en la fecha");
			fecha=null;
		}
		
		return fecha;
	}

	public static boolean validadarMatricula(String matricula) {
		boolean valido = false;
		Pattern patternMatricula = Pattern.compile("\\d{4}[A-Z]{3}");
		Matcher matcherMatricula = patternMatricula.matcher(matricula);
		valido = matcherMatricula.matches();
		return valido;
	}

	public static void darAlta(Vehiculo v) {
		parqueM.darAltaVehiculo(v);
	}
	
	public static void actualizarBD() {
		BaseDatos.renovarLista(parqueM.getListaVehiculos());
	}
	
	public static void darBaja(String matricula) {
		parqueM.darBajaVehiculo(matricula);
	}
	
	public static void cambiarKm(String matricula,int kilometraje) {
		parqueM.actualizarKilometraje(matricula, kilometraje);
	}
	
	public static void buscarCoche(String matricula) {
		parqueM.mostrarDatos(matricula);
	}
	public static void recuperarLista() {
		ArrayList<Vehiculo>listaVehiculos = BaseDatos.recuperarLista();
		if (!listaVehiculos.isEmpty()) {
			parqueM.setListaVehiculos(listaVehiculos); 
		}
	}
}
