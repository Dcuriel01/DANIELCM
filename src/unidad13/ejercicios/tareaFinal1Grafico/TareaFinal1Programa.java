package unidad13.ejercicios.tareaFinal1Grafico;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TareaFinal1Programa {
	static Scanner sc = new Scanner(System.in);
	static GestionParqueMovil parqueM = new GestionParqueMovil();
	public static void main(String[] args) {
		
		BaseDatos.crearTabla();
		ArrayList<Vehiculo>listaVehiculos = BaseDatos.recuperarLista();
		if (!listaVehiculos.isEmpty()) {
			parqueM.setListaVehiculos(listaVehiculos); 
		}
		
		Vehiculo vehiculo = null;
		int opcion = 0;
	
	}

	public static Vehiculo crearVehiculo(String matricula,String fechaProv,String marca,String modelo,int kilometraje) {
		LocalDate fecha = null;
		Vehiculo v = null;
		if (validadarMatricula(matricula)) {
			fecha = parsearFecha(fechaProv);
			if (fecha==null) {
				v = new Vehiculo(matricula, fecha, marca, modelo, kilometraje);
			}
		}else {
			System.out.println("Error en la matricula");
		}
		
		return v;
	}

	private static LocalDate parsearFecha(String fechaProv) {
		DateTimeFormatter formatoFecha2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha =null;
		try {
			fecha = LocalDate.parse(fechaProv, formatoFecha2);
		} catch (DateTimeParseException e) {
			System.out.println("Error en la fecha");
			fecha=null;
		}
		
		return fecha;
	}

	private static int menu() {
		int opcion = 0;
		System.out.println("MENU PARQUE MOVIL");
		System.out.println("1. Dar de alta vehiculo");
		System.out.println("2. Dar de baja vehiculo");
		System.out.println("3. Actualizar kilometraje vehiculo");
		System.out.println("4. Mostrar datos de un vehiculo");
		System.out.println("5. Mostrar listado de vehiculos");
		System.out.println("6. Actualizar base de datos");
		System.out.println("7. salir");
		opcion = sc.nextInt();
		return opcion;
	}
	
	private static boolean validadarMatricula(String matricula) {
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
	
}
