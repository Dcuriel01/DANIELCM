package unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		float lado1;
		float lado2;
		float lado3;
		Scanner entrada = new Scanner(System.in);

		System.out.println("introduca el 1 lado del triangulo");
		lado1 = entrada.nextFloat();
		System.out.println("introduca el 2 lado del triangulo");
		lado2 = entrada.nextFloat();
		System.out.println("introduca el 3 lado del triangulo");
		lado3 = entrada.nextFloat();
		calcularArea(lado1, lado2, lado3);
	}

	public static void calcularArea(float a, float b, float c) {
		float p = (a + b + c) / 2;
		float interiorRaiz = p * (p - a) * (p - b) * (p - c);
		double area = Math.sqrt(interiorRaiz);
		imprimirPantalla(a,b,c,area);
	}

	private static void imprimirPantalla(float a, float b, float c, double area) {
		System.out.println("Lado 1 - " + a);
		System.out.println("Lado 2 - " + b);
		System.out.println("Lado 3 - " + c);
		System.out.println("Area - " + area);
	}
	
}
