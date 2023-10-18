package Unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int intro;
		int moduloIntro;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu número: ");
		intro = entrada.nextInt();
		moduloIntro = intro % 2;
		if (moduloIntro == 0) {
			System.out.println("Tu número es par");
		} else {
			System.out.println("tu número es impar");
		}

	}

}
