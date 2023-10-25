package Unidad3Ejercicios;

import java.util.Scanner;

public class HorasExtras {

	public static void main(String[] args) {

		int horas;
		int horasExtras;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Indica el número de horas realizadas ");
		horas = entrada.nextInt();
		if (horas <= 40) {
			System.out.println("Has ganado un total de " + horas * 12.5f + " euros con tus " + horas + " horas trabajadas");
		} else if (horas > 40 & horas <= 48) {
			System.out.println("Has ganado un total de " + horas * 12.5f + " euros con tus " + horas + " horas trabajadas");
		} else if (horas > 48) {
			horasExtras = horas - 48;
			System.out.println("Has ganado un total de " + ((40 * 12.5f)+(8*25)+(horasExtras*37.5f)) + " euros con tus " + horas + " horas trabajadas");
		}
		entrada.close();

	}

}
