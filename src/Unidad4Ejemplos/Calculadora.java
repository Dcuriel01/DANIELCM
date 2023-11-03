package Unidad4Ejemplos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int num1 = entrada.nextInt();
		System.out.println("introduzca otro número");
		int num2 = entrada.nextInt();
		sumar(num1, num2);
		restar(num1, num2);
		System.out.println("Introduzca un número");
		double num3 = entrada.nextDouble();
		System.out.println("introduzca otro número");
		double num4 = entrada.nextDouble();
		sumar(num3, num4);
		restar(num3, num4);
		entrada.close();
	}

	public static void sumar(int a, int b) { // Void solo si no devuelve nada y sino el valor q nos da
		int suma = a + b;
		imprimirResultado(suma, "suma");
	}

	public static void sumar(double a, double b) {
		double suma = a + b;
		imprimirResultado(suma, "suma");
	}

	public static void restar(double a, double b) {
		double resta = a - b;
		imprimirResultado(resta, "resta");
	}

	public static void restar(int a, int b) {
		int resta = a - b;
		imprimirResultado(resta, "resta");
	}

	public static void imprimirResultado(int resultado, String operacion) {
		System.out.println("La " + operacion + " es " + resultado);
	}

	public static void imprimirResultado(double resultado, String operacion) {
		System.out.println("La " + operacion + " es " + resultado);
	}

}
