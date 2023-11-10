package unidad3Ejercicios;

import java.util.Scanner;

public class MedidasTornillos {

	public static void main(String[] args) {

		float medida;
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Cuál es la medida del tornillo? ");
		medida = entrada.nextFloat();

		if (medida >= 1 & medida < 3) {
			System.out.println("Su tornillo es pequeño");
		} else if (medida >= 3 & medida < 5) {
			System.out.println("Su tornillo es mediano");
		} else if (medida >= 5 & medida < 6.5) {
			System.out.println("Su tornillo es grande");
		} else if (medida >= 6.5 & medida < 8.5) {
			System.out.println("Su tornillo es muy grande");
		} else {
			System.out.println("No se contempla esa medida en el programa");
		}

		entrada.close();
	}
}
