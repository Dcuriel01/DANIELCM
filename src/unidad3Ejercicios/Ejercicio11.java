package unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		float peso;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca el peso de la ropa quue va a lavar en kg: ");
		peso = entrada.nextFloat();

		if (peso < 8) {
			System.out.println("El nivel de agua será mínimo");
		} else if (peso >= 8 & peso < 15) {
			System.out.println("El nivel del agua será medio");
		} else if (peso >= 15 & peso < 22) {
			System.out.println("El nivel del agua será alto");
		} else if (peso >= 22 & peso <= 30) {
			System.out.println("El nivel será máximo");
		} else {
			System.out.println("Demasiado peso la lavadora no funcionará");
		}

		entrada.close();

	}

}
