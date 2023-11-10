package unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		int cantIntro;
		int bill500 = 0;
		int bill200 = 0;
		int bill100 = 0;
		int bill50 = 0;
		int bill20 = 0;
		int bill10 = 0;
		int bill5 = 0;
		int opcion;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Calcular cambio de tu dinero en billetes");
			System.out.println("2. Salir");
			opcion = entrada.nextInt();
			if (opcion == 1) {
				System.out.println("Dame una cantidad de dinero que se múltiplo de 5 por favor");
				cantIntro = entrada.nextInt();

				if (cantIntro >= 500) {
					bill500 = cantIntro / 500;
					cantIntro = cantIntro % 500;
					System.out.println("Nº billetes de 500: " + bill500);
				}
				if (cantIntro >= 200) {
					bill200 = cantIntro / 200;
					cantIntro = cantIntro % 200;
					System.out.println("Nº billetes de 200: " + bill200);
				}
				if (cantIntro >= 100) {
					bill100 = cantIntro / 100;
					cantIntro = cantIntro % 100;
					System.out.println("Nº billetes de 100: " + bill100);
				}
				if (cantIntro >= 50) {
					bill50 = cantIntro / 50;
					cantIntro = cantIntro % 50;
					System.out.println("Nº billetes de 50: " + bill50);
				}
				if (cantIntro >= 20) {
					bill20 = cantIntro / 20;
					cantIntro = cantIntro % 20;
					System.out.println("Nº billetes de 20: " + bill20);
				}
				if (cantIntro >= 10) {
					bill10 = cantIntro / 10;
					cantIntro = cantIntro % 10;
					System.out.println("Nº billetes de 10: " + bill10);
				}
				if (cantIntro >= 5) {
					bill5 = cantIntro / 5;
					cantIntro = cantIntro % 5;
					System.out.println("Nº billetes de 5: " + bill5);
				}
			} else if (opcion == 2) {
				System.out.println("Gracias. hasta la próxima");
			} else {
				System.out.println("La opción no es válida. Inténtelo de nuevo");
			}

		} while (opcion != 2);
		entrada.close();

	}
}
