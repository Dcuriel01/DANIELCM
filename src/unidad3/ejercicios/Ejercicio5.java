package unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numeroA;
		int numeroB;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		numeroA = entrada.nextInt();
		System.out.print("Ahora otro: ");
		numeroB = entrada.nextInt();
		if (numeroA > numeroB) {
			System.out.println("Su suma es: " + (numeroA + numeroB));
		} else {
			System.out.println("Su multiplicación es: " + (numeroA * numeroB));
		}

	}

}
