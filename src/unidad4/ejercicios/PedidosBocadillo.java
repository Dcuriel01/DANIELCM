package unidad4.ejercicios;

import java.util.Scanner;

public class PedidosBocadillo {

	public static void main(String[] args) {
		int numeroBocadillosA = 0;
		int numeroBocadillosB = 0;
		int numeroBocadillosC = 0;
		int numeroBocadillosD = 0;
		char opcion;
		Scanner entrada = new Scanner(System.in);

		do {
			Menu();
			opcion = entrada.next().charAt(0);

			switch (opcion) {
			case 'A':
				numeroBocadillosA++;
				break;

			case 'B':
				numeroBocadillosB++;
				break;

			case 'C':
				numeroBocadillosC++;
				break;

			case 'D':
				numeroBocadillosD++;
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

}
