package Unidad3Ejercicios;

import java.util.Scanner;

public class PiensoVeterinaria {

	public static void main(String[] args) {

		int opcion = 0;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Pienso A");
			System.out.println("2. Pienso B");
			System.out.println("3. Pienso C");
			System.out.println("4. Salir");
			System.out.println("------------");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("El pienso A es 30 cts / kg");
				break;
			case 2:
				System.out.println("El pienso B es 20 cts / kg");
				break;
			case 3:
				System.out.println("El pienso A es 15 cts / kg");
				break;

			default:
				System.out.println("Errro número seleccionado no existente");
				break;
			}

		} while (opcion != 4);
		System.out.println("Gracias por usar el programa");
		entrada.close();
	}

}
