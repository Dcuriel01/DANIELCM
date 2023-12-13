package unidad5Ejercicios;

import java.util.Scanner;

public class ServicioBicisElectricas {

	public static Scanner sc = new Scanner(System.in);
	public static int[] estacionA = { 10, 20, 30, 0, 0, 0 };
	public static int[] estacionB = { 40, 50, 60, 0, 0, 0 };
	public static int[] estacionC = { 70, 80, 90, 100, 110, 120 };
	public static int biciEnMovimiento = 0;
	public static final int VACIO = 0; 

	public static void main(String[] args) {
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				reservarBici();
				break;
			case 2:
				System.out.println("Saliendo del programa");
				break;

			default:
				System.out.println("No reconocido");
				break;
			}
		} while (opcion != 2);
		System.out.println("Ha salido del programa muchas gracias");
	}

	private static int menu() {
		int opcion;
		System.out.println("1. Reservar bicicleta");
		System.out.println("2. Salir");
		opcion = sc.nextInt();
		return opcion;

	}

	private static void reservarBici() {
		int horas;
		char consultaBono; // Esta variable comprueba que el caracter añadido sea correcto y la siguiente si tiene bono o no
		boolean bono;
		boolean salir = false;
		do {
			System.out.println("Ha seleccionado reservar una bici ");
			System.out.println("¿Cuántas horas desea reservarla? ");
			horas = sc.nextInt();
			salir = comprobarHoras(horas);
			System.out.println("¿Tiene el bono de las reservas? (S/N)");
			consultaBono = sc.next().charAt(0);
			salir = comprobarRespuestaBono(consultaBono);
			bono = comprobarBono(consultaBono);
			comprobarSalida(salir);
		} while (!salir);
		mostrarEstaciones(estacionA, "A");
		System.out.println(" ");
		mostrarEstaciones(estacionB, "B");
		System.out.println(" ");
		mostrarEstaciones(estacionC, "C");
		System.out.println(" ");
		pedirEstacion();
		calcularPrecio(horas, bono);

	}

	private static boolean comprobarHoras(int horas) {
		boolean salir = false;
		if (horas > 0) {
			salir = true;
		} else {
			salir = false;
		}
		return salir;

	}

	private static boolean comprobarRespuestaBono(char consultaBono) {
		boolean salir = false;
		if (consultaBono != 'N' & consultaBono != 'S') {
			salir = false;
		} else {
			salir = true;
		}
		return salir;
	}

	private static boolean comprobarBono(char consultaBono) {
		boolean bono = false;
		if (consultaBono == 'S') {
			bono = true;
		} else {
			bono = false;
		}
		return bono;
	}

	private static void comprobarSalida(boolean salir) {
		if (!salir) {
			System.out.println("Algún dato es erroneo pruebe de nuevo");
		}

	}

	private static void mostrarEstaciones(int[] estacionX, String letra) {
		System.out.println("Estacion " + letra);
		for (int i = 0; i < estacionX.length; i++) {
			if (estacionX[i] != VACIO) {
				System.out.print(estacionX[i] + " ");
			} else {
				System.out.print("Vacio ");
			}

		}

	}

	private static void pedirEstacion() {
		char estacionRecog;
		char estacionDej;
		boolean salir = false;
		boolean espacio = false;
		do {
			System.out.println("¿De que estación desea recoger la bicicleta? (A/B/C)");
			estacionRecog = sc.next().charAt(0);
			salir = comprobarRespuestaEstacion(estacionRecog);
			espacio = comprobarEspacioEstacionRecog(estacionRecog);
			comprobarSalida2(salir, espacio);
		} while (!salir | !espacio);
		do {
			System.out.println("¿Y en cuál desea dejarla? (A/B/C)");
			estacionDej = sc.next().charAt(0);
			salir = comprobarRespuestaEstacion(estacionDej);
			espacio = comprobarEspacioEstacionDej(estacionDej);
			comprobarSalida2(salir, espacio);
		} while (!salir | !espacio);
		System.out.println("Todo correcto pasemos con el precio de la reserva");
	}

	private static boolean comprobarRespuestaEstacion(char estacion) {
		boolean salir = false;
		if (estacion != 'A' & estacion != 'B' & estacion != 'C') {
			salir = false;
		} else {
			salir = true;
		}
		return salir;
	}

	private static boolean comprobarEspacioEstacionRecog(char estacionRecog) {
		boolean espacio = false;
		switch (estacionRecog) {
		case 'A':
			if (estacionA[0] == VACIO) {
				System.out.println("La estación está vacia, no puede recoger niguna bici de ahí");
			} else {
				espacio = true;
				extraerBiciEstacion(estacionRecog);
			}
			break;
		case 'B':
			if (estacionB[0] == VACIO) {
				System.out.println("La estación está vacia, no puede recoger niguna bici de ahí");
			} else {
				espacio = true;
				extraerBiciEstacion(estacionRecog);
			}
			break;
		case 'C':
			if (estacionC[0] == VACIO) {
				System.out.println("La estación está vacia, no puede recoger niguna bici de ahí");
			} else {
				espacio = true;
				extraerBiciEstacion(estacionRecog);
			}
			break;

		default:

			break;
		}
		return espacio;
	}

	private static void extraerBiciEstacion(char estacion) {
		switch (estacion) {
		case 'A':
			for (int i = estacionA.length - 1; i > -1; i--) {
				if (estacionA[i] != VACIO) {
					biciEnMovimiento=estacionA[i];
					estacionA[i]=VACIO;
					i = -1;
				}
			}
			break;
		case 'B':
			for (int i = estacionA.length - 1; i > -1; i--) {
				if (estacionB[i] != VACIO) {
					biciEnMovimiento=estacionB[i];
					estacionB[i]=VACIO;
					i = -1;
				}
			}
			break;
		case 'C':
			for (int i = estacionC.length - 1; i > -1; i--) {
				if (estacionC[i] != VACIO) {
					biciEnMovimiento=estacionC[i];
					estacionC[i]=VACIO;
					i = -1;
				}
			}
			break;

		default:
			break;
		}
		
	}

	private static boolean comprobarEspacioEstacionDej(char estacion) {
		boolean espacio = false;
		switch (estacion) {
		case 'A':
			if (estacionA[estacionA.length-1] != VACIO) {
				System.out.println("La estación está llena, no puede dejar niguna bici de ahí");
			} else {
				espacio = true;
				añadirBiciEstacion(estacion);
			}
			break;
		case 'B':
			if (estacionB[estacionB.length-1] != VACIO) {
				System.out.println("La estación está llena, no puede dejar niguna bici de ahí");
			} else {
				espacio = true;
				añadirBiciEstacion(estacion);
			}
			break;
		case 'C':
			if (estacionC[estacionC.length-1] != VACIO) {
				System.out.println("La estación está llena, no puede dejar niguna bici de ahí");
			} else {
				espacio = true;
				añadirBiciEstacion(estacion);
			}
			break;

		default:

			break;
		}
		return espacio;
	}
	
	private static void añadirBiciEstacion(int estacion) {
		switch (estacion) {
		case 'A':
			for (int i = estacionA.length-1; i > -1; i--) {
				if (estacionA[0]==0) {
					estacionA[0]=biciEnMovimiento;
					biciEnMovimiento=0;
					i=-1;
				}else if (estacionA[i]!=VACIO) {
					estacionA[i+1]=biciEnMovimiento;
					biciEnMovimiento=0;
					i=-1;
				}
			}
			break;
		case 'B':
			for (int i = estacionB.length-1; i > -1; i--) {
				if (estacionB[0]==0) {
					estacionB[0]=biciEnMovimiento;
					biciEnMovimiento=0;
					i=-1;
				}else if (estacionB[i]!=VACIO) {
					estacionB[i+1]=biciEnMovimiento;
					biciEnMovimiento=0;
					i=-1;
				}
			}
			break;
		case 'C':
			for (int i = estacionC.length-1; i > -1; i--) {
				if (estacionA[0]==0) {
					estacionA[0]=biciEnMovimiento;
					biciEnMovimiento=0;
					i=-1;
				}else if (estacionC[i]!=VACIO) {
					estacionC[i+1]=biciEnMovimiento;
					biciEnMovimiento=0;
					i=-1;
				}
			}
			break;

		default:
			break;
		}
		
	}

	private static void comprobarSalida2(boolean salir, boolean espacio) {
		if (!espacio & salir) {
			System.out.println("Pruebe con otra estación esa no es valida");
		} else if (!salir) {
			System.out.println("Error estación no reconocida");
		}

	}

	private static void calcularPrecio(int horas, boolean bono) {
		int precio;
		if (bono) {
			precio = horas * 2;
		} else {
			precio = horas * 4;
		}
		imprimirPrecio(precio);
	}

	private static void imprimirPrecio(int precio) {
		System.out.println("El precio de su reserva es: " + precio);
		System.out.println("Reserva confirmada");

	}

}
