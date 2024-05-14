package tareasFinales.aparcamientosPago;

import java.util.Scanner;

public class ParkingAplicacion {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		GestionParking gp = new GestionParking();
		int opcion = 0;
		String matricula;
		int tipo;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				matricula = pedirMatricula();
				tipo = pedirTipo();
				gp.darDeAlta(matricula, tipo);
				break;
			case 2:
				matricula = pedirMatricula();
				gp.salida(matricula);
				break;
			case 3:
				gp.comenzarMes();
				break;
			case 4:
				String nombre = pedirNombreFichero();
				gp.pagoResidentes(nombre);
				break;
			case 5:
				System.out.println("Ok saliendo");
				break;

			default:
				System.out.println("No reconocido");
				break;
			}
		} while (opcion!=5);
		
		
	}

	private static String pedirNombreFichero() {
		System.out.println("Indique el nombre de su fichero con su .extensión");
		String nombre = sc.next();
		return nombre;
	}

	private static int pedirTipo() {
		System.out.println("1.Oficial");
		System.out.println("2.No residente");
		System.out.println("3.Residente");
		int tipo = sc.nextInt();
		return tipo;
	}

	private static String pedirMatricula() {
		System.out.println("Indique la matrícula");
		String matricula = sc.next();
		return matricula;
	}

	private static int menu() {
		int opcion = 0;
		System.out.println("1.Registrar entrada");
		System.out.println("2.Registrar salida");
		System.out.println("3.Inicializar mes");
		System.out.println("4.Pago residentes");
		System.out.println("5.Salir");
		opcion = sc.nextInt();
		return opcion;
	}

}
