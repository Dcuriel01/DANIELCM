package unidad5.ejercicios;

import java.util.Scanner;

public class PlacasSolares {

	public static Scanner entrada = new Scanner(System.in);
	public static int[][] Placas = new int[10][7];

	public static void main(String[] args) {
		int opcion;
		do {

			opcion = menu();
			switch (opcion) {
			case 1:
				registrarPlaca();
				break;
			case 2:
				informacionPlaca();
				break;
			case 3:
				cambiarEstado();
				break;
			case 4:
				calcularGeneracion();
				break;
			case 5:
				listadoPlacas();
				break;
			case 6:
				cambiarOrientacion();
				break;
			case 7:
				System.out.println("Ok saliendo...");
				break;
			default:

				break;
			}
		} while (opcion != 7);

	}

	private static int menu() {
		int opcion;
		System.out.println("Menú Placas Solares");
		System.out.println("1. Registrar panel solar");
		System.out.println("2. Consultar información panel solar");
		System.out.println("3. Cambiar el estado");
		System.out.println("4. Generación total diaria");
		System.out.println("5. Listado de placas");
		System.out.println("6. Cambiar orientación");
		System.out.println("7. Salir");
		opcion = entrada.nextInt();
		return opcion;
	}

	private static void registrarPlaca() {
		int numPlaca;
		boolean salir = true;
		System.out.println("¿Qué placa desea almacenar? (1-10)");
		numPlaca = entrada.nextInt();
		numPlaca = numPlaca - 1;
		do {
		salir = true;
		System.out.println("¿Cuál es su identificador?");
		Placas[numPlaca][0] = entrada.nextInt();
		if (Placas[numPlaca][0]<0) {
			salir = false;
		}
		System.out.println("¿Cuál es su cantidad de energía diaria?");
		Placas[numPlaca][1] = entrada.nextInt();
		if (Placas[numPlaca][1]<0) {
			salir = false;
		}
		System.out.println("¿Cuál es su latitud?");
		Placas[numPlaca][2] = entrada.nextInt();
		if (Placas[numPlaca][2]<0) {
			salir = false;
		}
		System.out.println("¿Cuál es su longitud?");
		Placas[numPlaca][3] = entrada.nextInt();
		if (Placas[numPlaca][3]<0) {
			salir = false;
		}
		System.out.println("¿Esta activa (1) o inactiva (0)?");
		Placas[numPlaca][4] = entrada.nextInt();
		if (Placas[numPlaca][4]!=0 & Placas[numPlaca][4]!=1) {
			salir = false;
		}
		System.out.println("¿Cuál es su orientación? (1 este) (2 oeste) (3 sur)");
		Placas[numPlaca][5] = entrada.nextInt();
		if (Placas[numPlaca][5]!=1 & Placas[numPlaca][5]!=2  & Placas[numPlaca][5]!=3) {
			salir = false;
		}
		if (!salir) {
			System.out.println("Alguno de los valores introducidos es incorrecto repita introduciendo lo que se pide");
		}else {
			System.out.println("Placa registrada");
		}
		} while (!salir);

	}

	private static void informacionPlaca() {
		int numPlaca;
		System.out.println("¿De que placa desea ver la información?");
		numPlaca = entrada.nextInt();
		numPlaca = numPlaca - 1;
		if (Placas[numPlaca][0] == 0) {
			System.out.println("Ese slot de placa no esta registrado");
		} else {
			System.out.println("Su id es: " + Placas[numPlaca][0]);
			System.out.println("Su energía es: " + Placas[numPlaca][1]);
			System.out.println("Su latitud es: " + Placas[numPlaca][2]);
			System.out.println("Su longitud es: " + Placas[numPlaca][3]);
			if (Placas[numPlaca][4] == 1) {
				System.out.println("La placa esta activa");
			}
			System.out.println("La placa esta inactiva");
			switch (Placas[numPlaca][5]) {
			case 1:
				System.out.println("Su orientación es hacía el este");
				break;
			case 2:
				System.out.println("Su orientación es hacía el oeste");
				break;
			case 3:
				System.out.println("Su orientación es hacía el sur");
				break;
			}
		}
	}

	private static void cambiarEstado() {
		int numPlaca;
		System.out.println("¿De que placa desea cambiar el estado?");
		numPlaca = entrada.nextInt();
		numPlaca = numPlaca - 1;
		if (Placas[numPlaca][0] == 0) {
			System.out.println("Ese slot de placa no esta registrado");
		} else {
			if (Placas[numPlaca][4] == 1) {
				System.out.println("La placa pasa de activa a inactiva");
				Placas[numPlaca][4] = 0;
			} else {
				System.out.println("La placa pasa de inactiva a activa");
				Placas[numPlaca][4] = 1;
			}
		}
	}

	private static void calcularGeneracion() {
		int numPlaca;
		int dias;
		System.out.println("¿De que placa desea calcular la energia diaria");
		numPlaca = entrada.nextInt();
		numPlaca = numPlaca - 1;
		if (Placas[numPlaca][0] == 0) {
			System.out.println("Ese slot de placa no esta registrado");
		} else {
			System.out.println("¿En cuantos diás?");
			dias = entrada.nextInt();
			int generacion = Placas[numPlaca][1] * dias;
			System.out.println("La generación en " + dias + " dias es " + generacion);
		}

	}

	private static void listadoPlacas() {
		for (int i = 0; i < 10; i++) {
			if (Placas[i][1] == 0) {
				System.out.println("Placa " + (i + 1) + " no esta registrada");
			} else {
				System.out.println("Los datos de la placa " + (i + 1) + " son:");
				System.out.println("Su id es: " + Placas[i][0]);
				System.out.println("Su energía es: " + Placas[i][1]);
				System.out.println("Su latitud es: " + Placas[i][2]);
				System.out.println("Su longitud es: " + Placas[i][3]);
				if (Placas[i][4] == 1) {
					System.out.println("La placa esta activa");
				}
				System.out.println("La placa esta inactiva");
				switch (Placas[i][5]) {
				case 1:
					System.out.println("Su orientación es hacía el este");
					break;
				case 2:
					System.out.println("Su orientación es hacía el oeste");
					break;
				case 3:
					System.out.println("Su orientación es hacía el sur");
					break;
				}
			}

		}

	}

	private static void cambiarOrientacion() {
		int numPlaca;
		int cambio;
		System.out.println("¿De que placa desea cambiar la orientacion?");
		numPlaca = entrada.nextInt();
		numPlaca = numPlaca - 1;
		if (Placas[numPlaca][0] == 0) {
			System.out.println("Ese slot de placa no esta registrado");
		} else {
			switch (Placas[numPlaca][5]) {
			case 1:
				System.out.println("Su orientación es hacía el este");
				System.out.println("¿A cual le desea cambiar? (1 este) (2 oeste) (3 sur)");
				cambio = entrada.nextInt();
				Placas[numPlaca][5] = cambio;
				break;
			case 2:
				System.out.println("Su orientación es hacía el oeste");
				System.out.println("¿A cual le desea cambiar? (1 este) (2 oeste) (3 sur)");
				cambio = entrada.nextInt();
				Placas[numPlaca][5] = cambio;
				break;
			case 3:
				System.out.println("Su orientación es hacía el sur");
				System.out.println("¿A cual le desea cambiar? (1 este) (2 oeste) (3 sur)");
				cambio = entrada.nextInt();
				Placas[numPlaca][5] = cambio;
				break;
			}

		}
	}

}
