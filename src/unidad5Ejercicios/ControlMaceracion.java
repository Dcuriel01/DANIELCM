package unidad5Ejercicios;

import java.util.Scanner;

public class ControlMaceracion {

	public static Scanner entrada = new Scanner(System.in);
	public static final int N_UVAS = 3;
	public static final int N_DEPOSITOS = 2;
	public static double[][] uvas = new double[N_UVAS][N_DEPOSITOS];

	public static void main(String[] args) {
		int opcion;
		int uvaSeleccionada;
		int depositoSeleccionado;

		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				uvaSeleccionada = menuUva();
				depositoSeleccionado = seleccionarDeposito();
				añadirADeposito(uvaSeleccionada, depositoSeleccionado);
				break;
			case 2:
				uvaSeleccionada = menuUva();
				depositoSeleccionado = seleccionarDeposito();
				consultarDeposito(uvaSeleccionada, depositoSeleccionado);
				break;
			case 3:
				depositoMayorCantidad();
				break;
			case 4:
				obtenerMedia();
				break;
			case 5:
				uvaSeleccionada = menuUva();
				depositoSeleccionado = seleccionarDeposito();
				obtenerArrobas(uvaSeleccionada, depositoSeleccionado);
				break;
			case 6:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Número no reconocido");
				break;
			}

		} while (opcion != 6);
		System.out.println("Ha salido");

	}

	private static int menu() {
		int opcion;
		boolean salir = false;
		do {
			System.out.println("-----MENU  MACERACION-----");
			System.out.println("1. Guardar litros de uva");
			System.out.println("2. Consultar litros de uva");
			System.out.println("3. Consultar que deposito tiene más");
			System.out.println("4. Consultar media de los 3 depositos");
			System.out.println("5. Cuantas arrobas hay en un deposito");
			System.out.println("6. Salir");
			opcion = entrada.nextInt();
			if (opcion > 0 & opcion <= 6) {
				salir = true;
			} else {
				System.out.println("Error pruebe de nuevo");
			}
		} while (!salir);

		return opcion;
	}

	private static int menuUva() {
		int opcion;
		boolean salir = false;
		do {
			System.out.println("¿qué tipo de uva desea seleccionar?");
			System.out.println("1. Tempranillo");
			System.out.println("2. Garnacha");
			System.out.println("3. Verdejo");
			opcion = entrada.nextInt();
			if (opcion > 0 & opcion <= N_UVAS) {
				salir = true;
			} else {
				System.out.println("Error pruebe de nuevo");
			}
		} while (!salir);
		return opcion;
	}

	private static int seleccionarDeposito() {
		int opcion;
		boolean salir = false;
		do {
			System.out.println("Eliga en que deposito (1/2)");
			opcion = entrada.nextInt();
			if (opcion > 0 & opcion <= N_DEPOSITOS) {
				salir = true;
			} else {
				System.out.println("Error pruebe de nuevo");
			}
		} while (!salir);
		return opcion;
	}

	private static void añadirADeposito(int uvaSeleccionada, int depositoSeleccionado) {
		double litros;
		boolean salir = false;
		do {
			System.out.println("¿Cuantos litros desea añadir?");
			litros = entrada.nextDouble();
			if (litros > 0) {
				salir = true;
			} else {
				System.out.println("Error pruebe de nuevo");
			}
		} while (!salir);
		switch (uvaSeleccionada) {
		case 1:
			if (depositoSeleccionado == 1) {
				if (uvas[0][0] == 0) {
					uvas[0][0] = litros;
					if (uvas[0][0]>=1000) {
						double sobrante = uvas[0][0]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[0][0]=1000;
					}
				} else {
					System.out.println("En este deposito ya hay " + uvas[0][0] + " litros lo que añada sera sumado a esto");
					uvas[0][0] = uvas[0][0] + litros;
					if (uvas[0][0]>=1000) {
						double sobrante = uvas[0][0]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[0][0]=1000;
					}
				}
			} else {
				if (uvas[0][1] == 0) {
					uvas[0][1] = litros;
					if (uvas[0][1]>=1000) {
						double sobrante = uvas[0][1]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[0][1]=1000;
					}
				} else {
					System.out.println("En este deposito ya hay " + uvas[0][1] + " litros lo que añada sera sumado a esto");
					uvas[0][1] = uvas[0][1] + litros;
					if (uvas[0][1]>=1000) {
						double sobrante = uvas[0][1]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[0][1]=1000;
					}
				}
			}
			break;
		case 2:
			if (depositoSeleccionado == 1) {
				if (uvas [1][0]==0) {
					uvas [1][0]=litros;
					if (uvas[1][0]>=1000) {
						double sobrante = uvas[1][0]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[1][0]=1000;
					}
				}else {
					System.out.println("En este deposito ya hay " + uvas[1][0] + " litros lo que añada sera sumado a esto");
					uvas[1][0] = uvas[1][0]+litros;
					if (uvas[1][0]>=1000) {
						double sobrante = uvas[1][0]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[1][0]=1000;
					}
				}
			} else {
				if (uvas [1][1]==0) {
					uvas [1][1]=litros;
					if (uvas[1][1]>=1000) {
						double sobrante = uvas[1][1]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[1][1]=1000;
					}
				}else {
					System.out.println("En este deposito ya hay " + uvas[1][1] + " litros lo que añada sera sumado a esto");
					uvas[1][1] = uvas[1][1]+litros;
					if (uvas[1][1]>=1000) {
						double sobrante = uvas[1][1]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[1][1]=1000;
					}
				}
			}
			break;
		case 3:
			if (depositoSeleccionado == 1) {
				if (uvas [2][0]==0) {
					uvas [2][0]=litros;
					if (uvas[2][0]>=1000) {
						double sobrante = uvas[2][0]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[2][0]=1000;
					}
				}else {
					System.out.println("En este deposito ya hay " + uvas[2][0] + " litros lo que añada sera sumado a esto");
					uvas[2][0] = uvas[2][0]+litros;
					if (uvas[2][0]>=1000) {
						double sobrante = uvas[2][0]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[2][0]=1000;
					}
				}
			} else {
				if (uvas [2][1]==0) {
					uvas [2][1]=litros;
					if (uvas[2][1]>=1000) {
						double sobrante = uvas[2][1]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[2][1]=1000;
					}
				}else {
					System.out.println("En este deposito ya hay " + uvas[2][1] + " litros lo que añada sera sumado a esto");
					uvas[2][1] = uvas[2][1]+litros;
					if (uvas[2][1]>=1000) {
						double sobrante = uvas[2][1]-1000;
						System.out.println("El deposito se ha llenado y han sobrado " + sobrante + " litros");
						uvas[2][1]=1000;
					}
				}
			}
			break;
		}

	}

	private static void consultarDeposito(int uvaSeleccionada, int depositoSeleccionado) {
		switch (uvaSeleccionada) {
		case 1:
			if (depositoSeleccionado == 1) {
				System.out.print("En el 1º deposito de la uva tempranillo hay " + uvas[0][0] + " litros");
			} else {
				System.out.print("En el 2º deposito de la uva tempranillo hay " + uvas[0][1] + " litros");
			}
			System.out.println(" Y la suma de ambos es " + (uvas[0][0] + uvas[0][1]));
			break;
		case 2:
			if (depositoSeleccionado == 1) {
				System.out.print("En el 1º deposito de la uva garnacha hay " + uvas[1][0] + " litros");
			} else {
				System.out.print("En el 2º deposito de la uva garnacha hay " + uvas[1][1] + " litros");
			}
			System.out.println(" Y la suma de ambos es " + (uvas[1][0] + uvas[1][1]));
			break;
		case 3:
			if (depositoSeleccionado == 1) {
				System.out.print("En el 1º deposito de la uva verdeja hay " + uvas[2][0] + " litros");
			} else {
				System.out.print("En el 2º deposito de la uva verdeja hay " + uvas[2][1] + " litros");
			}
			System.out.println(" Y la suma de ambos es " + (uvas[2][0] + uvas[2][1]));
			break;
		}

	}

	private static void depositoMayorCantidad() {
		if (uvas[0][0] > uvas[0][1]) {
			System.out.println("En el primer deposito de tempranillo hay más");
		} else if (uvas[0][0] == uvas[0][1]) {
			System.out.println("En ambos depositos de tempranillo es igual");
		} else {
			System.out.println("En el segundo deposito de tempranillo hay más");
		}
		if (uvas[1][0] > uvas[1][1]) {
			System.out.println("En el primer deposito de garnacha hay más");
		} else if (uvas[1][0] == uvas[1][1]) {
			System.out.println("En ambos depositos de garnacha es igual");
		} else {
			System.out.println("En el segundo deposito de garnacha hay más");
		}
		if (uvas[2][0] > uvas[2][1]) {
			System.out.println("En el primer deposito de verdeja hay más");
		} else if (uvas[2][0] == uvas[2][1]) {
			System.out.println("En ambos depositos de verdeja es igual");
		} else {
			System.out.println("En el segundo deposito de verdeja hay más");
		}

	}

	private static void obtenerMedia() {
		double media;
		media = (uvas[0][0] + uvas[0][1] + uvas[1][0] + uvas[1][1] + uvas[2][0] + uvas[2][1]) / 6;
		System.out.println("La media de litros es " + media);

	}

	private static void obtenerArrobas(int uvaSeleccionada, int depositoSeleccionado) {
		double arrobas;
		switch (uvaSeleccionada) {
		case 1:
			if (depositoSeleccionado == 1) {
				arrobas = uvas[0][0] / 16.133;
				System.out.println("En el 1º deposito de uvas tempranillo hay " + arrobas + " arrobas");
			} else {
				arrobas = uvas[0][1] / 16.133;
				System.out.println("En el 1º deposito de uvas tempranillo hay " + arrobas + " arrobas");
			}
			break;
		case 2:
			if (depositoSeleccionado == 1) {
				arrobas = uvas[1][0] / 16.133;
				System.out.println("En el 1º deposito de uvas garnacha hay " + arrobas + " arrobas");
			} else {
				arrobas = uvas[1][1] / 16.133;
				System.out.println("En el 1º deposito de uvas garnacha hay " + arrobas + " arrobas");
			}
			break;
		case 3:
			if (depositoSeleccionado == 1) {
				arrobas = uvas[0][0] / 16.133;
				System.out.println("En el 1º deposito de uvas verdeja hay " + arrobas + " arrobas");
			} else {
				arrobas = uvas[0][1] / 16.133;
				System.out.println("En el 1º deposito de uvas verdeja hay " + arrobas + " arrobas");
			}
			break;
		}

	}

}
