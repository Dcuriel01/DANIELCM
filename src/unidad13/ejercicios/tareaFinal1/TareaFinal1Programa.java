package unidad13.ejercicios.tareaFinal1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TareaFinal1Programa {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		GestionParqueMovil parqueM = new GestionParqueMovil();
		BaseDatos.crearTabla();
		ArrayList<Vehiculo>listaVehiculos = BaseDatos.recuperarLista();
		if (!listaVehiculos.isEmpty()) {
			parqueM.setListaVehiculos(listaVehiculos); 
		}
		
		Vehiculo vehiculo = null;
		int opcion = 0;
		do {
			String matricula;
		opcion = menu();
		
		switch (opcion) {
		case 1:
			vehiculo = pedirDatos();
			parqueM.darAltaVehiculo(vehiculo);
			break;
		case 2:
			do {
				System.out.println("Indique la matricula");
				matricula = sc.next();
				if (validadarMatricula(matricula)) {
					
				}else {
					System.out.println("Error en la matricula");
				}
			} while (!validadarMatricula(matricula));
			parqueM.darBajaVehiculo(matricula);
			break;
		case 3:
			int kilometraje;
			do {
				System.out.println("Indique la matricula");
				matricula = sc.next();
				if (validadarMatricula(matricula)) {
					
				}else {
					System.out.println("Error en la matricula");
				}
			} while (!validadarMatricula(matricula));
			System.out.println("Indique el nuevo kilometraje");
			kilometraje = sc.nextInt();
			parqueM.actualizarKilometraje(matricula, kilometraje);
			break;
		case 4:
			do {
				System.out.println("Indique la matricula");
				matricula = sc.next();
				if (validadarMatricula(matricula)) {
					
				}else {
					System.out.println("Error en la matricula");
				}
			} while (!validadarMatricula(matricula));
			parqueM.mostrarDatos(matricula);
			break;
		case 5:
			parqueM.mostrarListadoVehiculos();
			break;
		case 6:
			BaseDatos.renovarLista(parqueM.getListaVehiculos());
			System.out.println("Base de datos actualizada");
			break;
		case 7:
			System.out.println("Saliendo");
			break;
		default:
			System.out.println("instrucción no reconocida");
			break;
		}
		} while (opcion!=7);
		
	}

	private static Vehiculo pedirDatos() {
		String matricula;
		String fechaProv;
		LocalDate fecha = null;
		String marca;
		String modelo;
		int kilometraje;
		do {
			System.out.println("Indique la matricula");
			matricula = sc.next();
			if (validadarMatricula(matricula)) {
				
			}else {
				System.out.println("Error en la matricula");
			}
		} while (!validadarMatricula(matricula));
		do {
			System.out.println("Indique la fecha de matriculacion(dd/MM/yyyy)");
			fechaProv = sc.next();
			fecha = parsearFecha(fechaProv);
		} while (fecha==null);
		System.out.println("Indique la marca");
		marca = sc.next();
		System.out.println("Indique el modelo");
		modelo = sc.next();
		System.out.println("Indique el kilometraje");
		kilometraje = sc.nextInt();
		Vehiculo v = new Vehiculo(matricula, fecha, marca, modelo, kilometraje);
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

}
