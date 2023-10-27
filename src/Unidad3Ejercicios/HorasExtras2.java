package Unidad3Ejercicios;

import java.util.Scanner;

public class HorasExtras2 {

	public static void main(String[] args) {

		int horas;
		double sueldo = 0;
		final double VALOR_HORA_A = 12.5;
		final double VALOR_HORA_B = 25;
		final double VALOR_HORA_C = 37.5;
		final int LIMITE_A = 40;
		final int LIMITE_B = 48;
		int numeroHorasA = 0;
		int numeroHorasB = 0;
		int numeroHorasC = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Indica el número de horas realizadas ");
		horas = entrada.nextInt();
		if (horas <= LIMITE_A) {
			numeroHorasA = horas;
			sueldo = horas * VALOR_HORA_A;
		} else if (horas <= LIMITE_B) {
			numeroHorasA = LIMITE_A;
			numeroHorasB = horas - LIMITE_A;
			sueldo = (LIMITE_A * VALOR_HORA_A) + (numeroHorasB * VALOR_HORA_B);
		} else if (horas > LIMITE_B) {
			numeroHorasA = LIMITE_A;
			numeroHorasB = LIMITE_B - LIMITE_A;
			numeroHorasC = horas - LIMITE_B;
			sueldo = (LIMITE_A * VALOR_HORA_A) + ((LIMITE_B - LIMITE_A) * VALOR_HORA_B) + (numeroHorasC * VALOR_HORA_C);
		}
		System.out.println("Has ganado un total de " + sueldo + " euros con tus " + horas + " horas trabajadas");
		System.out.println("Hora tipo A = " + numeroHorasA);
		System.out.println("Hora tipo B = " + numeroHorasB);
		System.out.println("Hora tipo C = " + numeroHorasC);
		entrada.close();
	}

}
