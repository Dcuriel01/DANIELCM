package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio22V2 {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		double n1;
		double n2;
		double n3;
		double porcentaje;
		
		n1 = recogerNumeros();
		n2 = recogerNumeros();
		porcentaje = calcularPorcentaje(n1, n2);
		imprimir(porcentaje, n1, n2);
		n3 = n1;
		n1 = n2;
		n2 = n3;
		porcentaje = calcularPorcentaje(n1, n2);
		imprimir(porcentaje, n1, n2);
	}

	private static double calcularPorcentaje(double n1, double n2) {
		double porcentaje;
		porcentaje = n1 / n2 * 100;
		return porcentaje;

	}

	private static void imprimir(double porcentaje, double n1, double n2) {
		System.out.println(n1 + " es el " + porcentaje + " % de " + n2);

	}

	private static double recogerNumeros() {
		double n;
		System.out.println("Indique un numero");
		n = entrada.nextDouble();
		return n;
	}

}
