package unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		double precioSinDescuento;
		double precioConDescuento;
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el precio normal?");
		precioSinDescuento = entrada.nextDouble();
		System.out.println("¿Y con el descuento?");
		precioConDescuento = entrada.nextDouble();

		calculardescuento(precioSinDescuento, precioConDescuento);
		entrada.close();

	}

	private static void calculardescuento(double precioSinDescuento, double precioConDescuento) {
		double descuento;
		descuento = (precioSinDescuento - precioConDescuento) / precioSinDescuento * 100;
		imprimir(descuento);

	}

	private static void imprimir(double descuento) {
		System.out.println("Su descuento es del " + descuento + "%");

	}

}

