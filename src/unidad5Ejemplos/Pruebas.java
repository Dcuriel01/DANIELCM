package unidad5Ejemplos;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		int [] matriz = {2,5,7};
		int [] matriz2 = new int [3];
		int [][] matriz3 = new int [2][4];
		boolean salir = false;
		int opcion;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Indique un número mayor que 10");
			opcion = entrada.nextInt();
			if (opcion > 10) {
				System.out.println("Bien");
				salir = true;
			} else {
				System.out.println("Mal pruebe de nuevo");
			}
		} while (!salir);
		
	}

}
