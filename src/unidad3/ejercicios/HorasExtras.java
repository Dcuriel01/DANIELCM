package unidad3.ejercicios;

import java.util.Scanner;

public class HorasExtras {

	public static void main(String[] args) {

		int horas;
		int horasExtras;
		double sueldo = 0;
		final double VALOR_HORA_A = 12.5;
		final double VALOR_HORA_B = 25;
		final double VALOR_HORA_C = 37.5;
		final int LIMITE_A = 40;
		final int LIMITE_B = 48;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Indica el número de horas realizadas ");
		horas = entrada.nextInt();
		if (horas <= LIMITE_A) {
			sueldo = horas * VALOR_HORA_A;
		} else if (horas <= LIMITE_B) {
			horasExtras = horas - LIMITE_A;
			sueldo = (40 * VALOR_HORA_A) + (horasExtras * VALOR_HORA_B);
		} else if (horas > LIMITE_B) {
			horasExtras = horas - LIMITE_B;
			sueldo = (40 * VALOR_HORA_A) + ((LIMITE_B - LIMITE_A) * VALOR_HORA_B) + (horasExtras * VALOR_HORA_C);
		}
		System.out.println("Has ganado un total de " + sueldo + " euros con tus " + horas + " horas trabajadas");
		entrada.close();
	}

}
