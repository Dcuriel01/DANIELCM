package unidad5Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EmpresaLogistica {

	static final int N_CAJAS = 50;
	static final int NORMAL = 1;
	static final int URGENTE = 2;
	static final int FRAGIL = 3;
	static Scanner sc = new Scanner(System.in);
	static int[][] estanterias = new int[6][10]; // Las estanterias 0 y 1 pertenecen a envio normal, las 2 y 3 a envio
													// urgente y la 4 y 5 a envio frágil
	static int[][] camion1 = new int[1][16];

	public static void main(String[] args) {
		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				introducirCajas();
				break;
			case 2:
				preguntarEstanteria();
				break;
			case 4:
				System.out.println("Ok saliendo");
				break;

			default:
				System.out.println("No reconocido");
				break;
			}
		} while (opcion != 4);
		

	}

	private static void comprobarEstanteria(int a, int tipo) {
		int contador=0;
		int temp=0;
		int huecoCaja=0;
		if (estanterias[a][9] != 0) {
			if (camion1[0][0]==0) {
				for (int i = 0; i < 10; i++) {
					camion1[1][i]=estanterias[a][i];
					estanterias[a][i]=0;
				}
			}else if (camion1[0][0]!=0) {
				for (int i = 0; i < 10; i++) {
					if (camion1[1][i]==0) {
						contador++;
					}
				}
				for (int i = 15; i > 0; i--) {
					if (camion1[0][i]==0) {
						temp=i;
						i=-1;
					}
				}
				for (int i = temp; i < 15; i++) {
					camion1[0][i]=estanterias[a][huecoCaja];
				}
			}
		}
	}

	private static void preguntarEstanteria() {
		int estanteria;
		boolean salir = false;
		do {
			System.out.println("¿Qué estatería desea consultar? (1-6)");
			estanteria = sc.nextInt();
			if (estanteria < 1 & estanteria > 6) {
				System.out.println("Error");
				salir = false;
			} else {
				salir = true;
			}
		} while (!salir);
		estanteria = estanteria - 1;
		switch (estanteria) {
		case 0:
			mostrarEstanteria(0, 1,"N");
			break;
		case 1:
			mostrarEstanteria(1, 2,"N");
			break;
		case 3:
			mostrarEstanteria(2, 3,"U");
			break;
		case 4:
			mostrarEstanteria(3, 4,"U");
			break;
		case 5:
			mostrarEstanteria(4, 5,"F");
			break;
		case 6:
			mostrarEstanteria(5, 6,"F");
			break;

		default:
			break;
		}
	}

	private static void mostrarEstanteria(int a, int nEstanteria , String tipo) {
		System.out.println("Estanteria " + nEstanteria);
		for (int i = 0; i < 10; i++) {
			System.out.println(tipo + estanterias[a][i]);
		}

	}

	private static void introducirCajas() {
		char tipo;
		boolean salir = false;
		do {
			System.out.println("Indique el tipo de la caja (n/u/f)");
			tipo = sc.next().charAt(0);
			if (tipo != 'n' & tipo != 'u' & tipo != 'f') {
				System.out.println("Tipo de caja no reconocido");
				salir = false;
			} else {
				salir = true;
			}
		} while (!salir);
		System.out.print("El código ha sido añadido correctamente ");
		switch (tipo) {
		case 'n':
			asignarEstanteria(0, 1, NORMAL);
			break;
		case 'u':
			asignarEstanteria(0, 1 , URGENTE);
			break;
		case 'f':
			asignarEstanteria(0, 1, FRAGIL);
			break;

		default:
			break;
		}

	}

	private static void asignarEstanteria(int a, int b , int tipo) {
		int estanteria;
		boolean salir = false;
		int numeroR = calcularNR();
		if (tipo==NORMAL) {
			System.out.println("y es :N"+numeroR);
		}else if (tipo==URGENTE) {
			System.out.println("y es :U"+numeroR);
		}else {
			System.out.println("y es :F"+numeroR);
		}
		do {
			System.out.println("¿En qué estanteria de ese tipo desea guardarla? (1/2)");
			estanteria = sc.nextInt();
			if (estanteria != 1 & estanteria != 2) {
				System.out.println("Error");
				salir = false;
			} else {
				salir = true;
			}
		} while (!salir);
		if (estanteria == 1) {
			for (int i = 0; i < 10; i++) {
				if (estanterias[a][i] == 0) {
					estanterias[a][i] = numeroR;
					i=11;
				}
			}
			comprobarEstanteria(a,tipo);
		} else {
			for (int i = 0; i < 10; i++) {
				if (estanterias[b][i] == 0) {
					estanterias[b][i] = numeroR;
					i=11;
				}
			}
			comprobarEstanteria(b,tipo);
		}

	}

	private static int calcularNR() {
		Random aleatorio = new Random(System.currentTimeMillis());
		int numero = aleatorio.nextInt(10000);
		return numero;
	}

	private static int menu() {
		int opcion = 0;
		System.out.println("-----MENÚ-----");
		System.out.println("1. Introducir caja");
		System.out.println("2. Mostrar estantería");
		System.out.println("3. Mostrar camiones");
		System.out.println("4. Salir");
		opcion = sc.nextInt();
		return opcion;

	}

}
