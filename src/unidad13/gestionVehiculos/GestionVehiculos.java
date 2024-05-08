package unidad13.gestionVehiculos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestionVehiculos {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		RegistroVehiculos rv = new RegistroVehiculos();
		int opcion = 0;
		VehiculoAlquiler vehiculo = null;
		String matricula;
		int dias ;
		do {
		opcion = menu();
		
		switch (opcion) {
		case 1:
			vehiculo=pedirTipo();
			boolean registro = rv.registrarVehiculo(vehiculo);
			if (registro) {
				System.out.println("Vehiculo registrado correctamente");
			}else {
				System.out.println("El vehiculo no a podido ser añadido");
			}
			break;
		case 2:
			matricula = pedirMatricula();
			dias = pedirDias();
			rv.ObtenerPrecio(matricula, dias);
			break;
		case 3:
			dias = pedirDias();
			rv.mostrarTodosPrecios(dias);
			break;
		case 4:
			System.out.println("Ok. Saliendo");
			break;
		default:
			System.out.println("instrucción no reconocida");
			break;
		}
		} while (opcion!=7);
	}

	private static int menu() {
		int opcion = 0;
		System.out.println("MENU PARQUE MOVIL");
		System.out.println("1. Registrar vehiculo");
		System.out.println("2. Mostrar precio vehiculo");
		System.out.println("3. Mostrar todos los precios");
		System.out.println("4. Salir");
		opcion = sc.nextInt();
		return opcion;
	}
	private static String pedirMatricula() {
		boolean salir = false;
		String matricula;
		do {
		System.out.println("Introduzca la matrícula");
		matricula = sc.next();
		if (validadarMatricula(matricula)) {
			salir = true;
		}else {
			System.out.println("Error en la matrícula");
		}
		} while (!salir);
		return matricula;
	}
	
	private static VehiculoAlquiler pedirTipo() {
		int opcion = 0;
		boolean salir = false;
		VehiculoAlquiler vehiculo = null;
		do {
		System.out.println("1. Vehiculo pasajero");
		System.out.println("2. Vehiculo carga");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			salir = true;
			vehiculo = pedirVehiculoPasajero();
			break;
		case 2:
			salir = true;
			vehiculo = pedirVehiculoCarga();
			break;

		default:
			System.out.println("No reconocido");
			break;
		}
		} while (!salir);
		return vehiculo;
	}
	
	private static VehiculoAlquiler pedirVehiculoPasajero() {
		int opcion = 0;
		boolean salir = false;
		VehiculoAlquiler vehiculo = null;
		do {
		System.out.println("1. Coche");
		System.out.println("2. Microbus");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			salir = true;
			vehiculo = crearCoche();
			break;
		case 2:
			salir = true;
			vehiculo = crearMicrobus();
			break;

		default:
			System.out.println("No reconocido");
			break;
		}
		} while (!salir);
		return vehiculo;
	}

	private static VehiculoAlquiler crearMicrobus() {
		String matricula = pedirMatricula();
		int plazas;
		System.out.println("Indique las plazas");
		plazas=sc.nextInt();
		Microbus bus = new Microbus(matricula, plazas);
		return bus;
	}

	private static VehiculoAlquiler crearCoche() {
		String matricula = pedirMatricula();
		int plazas;
		System.out.println("Indique las plazas");
		plazas=sc.nextInt();
		Coche coche = new Coche(matricula, plazas);
		return coche;
	}
	
	private static VehiculoAlquiler pedirVehiculoCarga() {
		int opcion = 0;
		boolean salir = false;
		VehiculoAlquiler vehiculo = null;
		do {
		System.out.println("1. Furgoneta");
		System.out.println("2. Camion");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			salir = true;
			vehiculo = crearFurgoneta();
			break;
		case 2:
			salir = true;
			vehiculo = crearCamion();
			break;

		default:
			System.out.println("No reconocido");
			break;
		}
		} while (!salir);
		return vehiculo;
	}

	private static VehiculoAlquiler crearFurgoneta() {
		String matricula = pedirMatricula();
		double pma;
		System.out.println("Indique el PMA");
		pma=sc.nextInt();
		Furgoneta furgoneta = new Furgoneta(matricula, pma);
		return furgoneta;
	}

	private static VehiculoAlquiler crearCamion() {
		String matricula = pedirMatricula();
		double pma;
		System.out.println("Indique el PMA");
		pma=sc.nextInt();
		Camion camion = new Camion(matricula, pma);
		return camion;
	}

	private static boolean validadarMatricula(String matricula) {
		boolean valido = false;
		Pattern patternMatricula = Pattern.compile("\\d{4}[A-Z]{3}");
		Matcher matcherMatricula = patternMatricula.matcher(matricula);
		valido = matcherMatricula.matches();
		return valido;
	}
	
	private static int pedirDias() {
		int dias;
		System.out.println("Indique los dias que se va a alquilar");
		dias = sc.nextInt();
		return dias;
	}
	
}
