package Unidad4Ejemplos;

import java.util.Scanner;

public class PedidosBocadillo3 {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroBocadillosA = 0;
		int numeroBocadillosB = 0;
		int numeroBocadillosC = 0;
		int numeroBocadillosD = 0;
		char opcion;

		do {
			Menu();
			opcion = entrada.next().charAt(0);

			switch (opcion) {
			case 'A':
				numeroBocadillosA=CalculoA(numeroBocadillosA);
				break;

			case 'B':
				numeroBocadillosB=CalculoB(numeroBocadillosB);
				break;

			case 'C':
				numeroBocadillosC=CalculoC(numeroBocadillosC);
				break;

			case 'D':
				numeroBocadillosD=CalculoD(numeroBocadillosD);
				break;

			case 'E':
				System.out.println("Calculando tu cuenta");
				entrada.close();
				break;

			default:
				System.out.println("No reconocido");
				break;
			}

		} while (opcion != 'E');

		calcularPago(numeroBocadillosA, numeroBocadillosB, numeroBocadillosC, numeroBocadillosD);

	}

	public static void calcularPago(int a, int b, int c, int d) {
		final float PRECIO_JAMON = 3.5f;
		final float PRECIO_QUESO = 3;
		final float PRECIO_MIXTO = 4;
		final float PRECIO_VEGETAL = 3.5f;
		float pagoA = a * PRECIO_JAMON;
		float pagoB = b * PRECIO_QUESO;
		float pagoC = c * PRECIO_MIXTO;
		float pagoD = d * PRECIO_VEGETAL;
		imprimirPago( a,b,c,d,pagoA,pagoB,pagoC,pagoD);
		
	}
	
	public static void imprimirPago(int a, int b, int c, int d, float pagoA, float pagoB, float pagoC, float pagoD) {
		if (a>0) {
			System.out.println("Número de bocadillos A = " + a + " -- " + pagoA + " euros.");
		}
		if (b>0) {
			System.out.println("Número de bocadillos B = " + b + " -- " + pagoB + " euros.");
		}
		if (c>0) {
			System.out.println("Número de bocadillos C = " + c + " -- " + pagoC + " euros.");
		}
		if (d>0) {
			System.out.println("Número de bocadillos D = " + d + " -- " + pagoD + " euros.");
		}
		System.out.println("Total a pagar = " + (pagoA + pagoB + pagoC + pagoD) + " euros.");
		
	}

	public static void Menu() {
		System.out.println("-----MENU BOCADILLOS-----");
		System.out.println("A. Bocadillo de jamón-3,5");
		System.out.println("B. Bocadillo de queso-3,0");
		System.out.println("C. Bocadillo de mixto-4,0");
		System.out.println("D. Bocadillo de vegetal-3,5");
		System.out.println("E. Salir y pagar");
	}

	public static int CalculoA(int numeroBocadillosA) {
		int numBocadillo=0;
		int opcion;
		int masBocadillo;
		if (numeroBocadillosA==0) {
			System.out.println("¿Cuantos de jamón va querer?");
			numBocadillo= entrada.nextInt();
			numeroBocadillosA=numBocadillo;
		}else {
			System.out.println("Se sustituira lo seleccionados antes");
			System.out.println("Si desea añadir pulse: 1");
			System.out.println("Si desea sustituir pulse: 2");
			opcion=entrada.next().charAt(0);
			if (opcion=='1') {
				System.out.println("¿Cuantos desea añadir?");
				masBocadillo=entrada.nextInt();
				numeroBocadillosA = numeroBocadillosA + masBocadillo;
			}else if (opcion=='2') {
				System.out.println("¿Cuantos de jamón va querer?");
				numBocadillo= entrada.nextInt();
				numeroBocadillosA=numBocadillo;
			}
		}
	return (numeroBocadillosA);
	}
	public static int CalculoB(int numeroBocadillosB) {
		int numBocadillo=0;
		int opcion;
		int masBocadillo;
		if (numeroBocadillosB==0) {
			System.out.println("¿Cuantos de queso va querer?");
			numBocadillo= entrada.nextInt();
			numeroBocadillosB=numBocadillo;
		}else {
			System.out.println("Se sustituira lo seleccionados antes");
			System.out.println("Si desea añadir pulse: 1");
			System.out.println("Si desea sustituir pulse: 2");
			opcion=entrada.next().charAt(0);
			if (opcion=='1') {
				System.out.println("¿Cuantos desea añadir?");
				masBocadillo=entrada.nextInt();
				numeroBocadillosB = numeroBocadillosB + masBocadillo;
			}else if (opcion=='2') {
				System.out.println("¿Cuantos de queso va querer?");
				numBocadillo= entrada.nextInt();
				numeroBocadillosB=numBocadillo;
			}
		}
	return (numeroBocadillosB);
	}

	public static int CalculoC(int numeroBocadillosC) {
		int numBocadillo=0;
		int opcion;
		int masBocadillo;
		if (numeroBocadillosC==0) {
			System.out.println("¿Cuantos mixtos va querer?");
			numBocadillo= entrada.nextInt();
			numeroBocadillosC=numBocadillo;
		}else {
			System.out.println("Se sustituira lo seleccionados antes");
			System.out.println("Si desea añadir pulse: 1");
			System.out.println("Si desea sustituir pulse: 2");
			opcion=entrada.next().charAt(0);
			if (opcion=='1') {
				System.out.println("¿Cuantos desea añadir?");
				masBocadillo=entrada.nextInt();
				numeroBocadillosC = numeroBocadillosC + masBocadillo;
			}else if (opcion=='2') {
				System.out.println("¿Cuantos mixtos va querer?");
				numBocadillo= entrada.nextInt();
				numeroBocadillosC=numBocadillo;
			}
		}
	return (numeroBocadillosC);
	}
	public static int CalculoD(int numeroBocadillosD) {
		int numBocadillo=0;
		int opcion;
		int masBocadillo;
		if (numeroBocadillosD==0) {
			System.out.println("¿Cuantos de vegetal va querer?");
			numBocadillo= entrada.nextInt();
			numeroBocadillosD=numBocadillo;
		}else {
			System.out.println("Se sustituira lo seleccionados antes");
			System.out.println("Si desea añadir pulse: 1");
			System.out.println("Si desea sustituir pulse: 2");
			opcion=entrada.next().charAt(0);
			if (opcion=='1') {
				System.out.println("¿Cuantos desea añadir?");
				masBocadillo=entrada.nextInt();
				numeroBocadillosD = numeroBocadillosD + masBocadillo;
			}else if (opcion=='2') {
				System.out.println("¿Cuantos de vegetal va querer?");
				numBocadillo= entrada.nextInt();
				numeroBocadillosD=numBocadillo;
			}
		}
	return (numeroBocadillosD);
	}
}
