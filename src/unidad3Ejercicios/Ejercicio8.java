package unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int numeroA;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		int cifra5;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca un número entre el 1 y el 99999 : ");
		numeroA = entrada.nextInt();

		cifra1 = numeroA % 10;
		cifra2 = (numeroA / 10) % 10;
		cifra3 = (numeroA / 100) % 10;
		cifra4 = (numeroA / 1000) % 10;
		cifra5 = (numeroA / 10000) % 10;

		if (cifra3 == 0 & cifra4 == 0 & cifra5 == 0) {
			if (cifra1 == cifra2) {
				System.out.println("Tu número es capicúa");
			} else {
				System.out.println("Tu número no es capicúa");
			}
		} else if (cifra4 == 0 & cifra5 == 0) {
			if (cifra1 == cifra3) {
				System.out.println("Tu número es capicúa");
			} else {
				System.out.println("Tu número no es capicúa");
			}
		} else if (cifra5 == 0) {
			if (cifra1 == cifra4 & cifra2 == cifra3) {
				System.out.println("Tu número es capicúa");
			} else {
				System.out.println("Tu número no es capicúa");
			}
		} else {
			if (cifra1 == cifra5 & cifra2 == cifra4) {
				System.out.println("Tu número es capicúa");
			} else {
				System.out.println("Tu número no es capicúa");
			}
		}

		entrada.close();

	}

}
