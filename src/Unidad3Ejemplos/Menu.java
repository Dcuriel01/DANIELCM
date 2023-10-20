package Unidad3Ejemplos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcion;
		int anyo;
		boolean bisiesto;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Calcular si el año es bisiesto");
			System.out.println("2. Salir");

			opcion = entrada.nextInt();

			if (opcion == 1) {
				System.out.println("Introduzca el año");
				anyo = entrada.nextInt();
			bisiesto = (((anyo%4==0) && (anyo%100!=0))||(anyo%400==0));
			
			if (bisiesto) {
				System.out.println("El año " + anyo + " es bisiesto");
			} else {
				System.out.println("El año " + anyo + " no es bisiesto");
			}
																					/*if ((anyo % 4 == 0 & anyo % 100 != 0) | anyo % 400 == 0) {
																										System.out.println("Tu año es bisiesto");
																									} else {
																										System.out.println("Tu año no es bisiesto");
																									} */

			} else if (opcion == 2) {
				System.out.println("Gracias. hasta la próxima");
			} else {
				System.out.println("La opción no es válida. Inténtelo de nuevo");
			}

		} while (opcion != 2);
		entrada.close();
	}

}
