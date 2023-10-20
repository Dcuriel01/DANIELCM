package Unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int numeroA;
		int cifra1;
		int cifra2;
		int cifra4;
		int cifra5;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca un número entre el 1 y el 99999 : ");
		numeroA = entrada.nextInt();

		cifra1 = numeroA % 10;
		cifra2 = (numeroA / 10) % 10;
		cifra4 = (numeroA / 1000) % 10;
		cifra5 = (numeroA / 10000) % 10;

		if (cifra1==cifra5&cifra2==cifra4) {
			System.out.println("Tu número es capicúa");
		} else {
			System.out.println("Tu número no es capicúa");
		}
		
		entrada.close();
		
	}

}
