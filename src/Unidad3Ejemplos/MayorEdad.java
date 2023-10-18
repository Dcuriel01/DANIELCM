package Unidad3Ejemplos;

import java.util.Scanner;

public class MayorEdad {

	public static void main(String[] args) {
		int edad;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca su edad, gracias ");
		edad = entrada.nextInt();

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
			System.out.println("Enhorabuena!!!!");
			if (edad > 30) {
				System.out.println("Es un/a pureta");

			} else {
				System.out.println("No eres un treintañero");
			}
		} else if (edad == 17) {
			System.out.println("Esta apunto de ser mayor de edad");
		} else {
			System.out.println("tendras que esperar");
		}

		System.out.println("Muchas gracias por usar este programa");

		entrada.close();

	}

}
