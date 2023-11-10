package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		int monedas20Cts;
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuantás monedas de 20 céntimos tienes?");
		monedas20Cts=entrada.nextInt();
		calcularQuintos(monedas20Cts);
	}

	private static void calcularQuintos(int monedas20Cts) {
		double euros;
		euros = monedas20Cts*0.2;
		imprimir(euros);
		
	}

	private static void imprimir(double euros) {
		System.out.println("Tienes " + euros + " euros en total");
		
	}

}
