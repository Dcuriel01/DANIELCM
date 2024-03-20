package unidad10.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PedirEnteroControlado {

	public static int pedirEntero() {
		int num =0;
		Scanner sc = new Scanner(System.in);
		boolean salir;
		do {
			salir = true;
		try {
			System.out.println("Introduzca un numero");
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Error tipo de variable incorrecto");
			salir = false;
			sc.nextLine();
		}
		} while (!salir);
		
		return num;
	}

}
