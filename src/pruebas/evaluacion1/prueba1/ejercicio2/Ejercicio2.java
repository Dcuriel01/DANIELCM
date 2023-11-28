package pruebas.evaluacion1.prueba1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static final int FILAS = 5;
	public static final int COLUMNAS = 5;
	public static boolean[][] tablero = new boolean[FILAS][COLUMNAS];
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// Estos son los lugares conectados
		tablero[4][2] = true;
		tablero[2][4] = true;
		tablero[2][3] = true;
		tablero[3][2] = true;
		int x;
		int y;
		System.out.println("El tablero es entre el 0 y el 4");
		System.out.println("Indique la posición x: ");
		x = entrada.nextInt();
		System.out.println("Indique la posición y: ");
		y = entrada.nextInt();
		if (tablero[x][y] == true) {
			System.out.println("Se accede directamete");
		} else {
			comprobar(x, y);

		}
	}

	private static void comprobar(int x, int y) {
		boolean imposible = true;
		int n;
		for (int j = 0; j < tablero.length; j++) {
			if (tablero[x][j] == true) {
				n = j;
				j = tablero.length;
				imposible = false;
				System.out.print("Pasa del " + x + " al " + n);
				comprobar2(x, y, n);

			}
		}
		if (imposible) {
			System.out.println("Es imposible llegar");
		}

	}

	private static void comprobar2(int x, int y, int n) {
		boolean imposible = true;
		for (int j = tablero.length - 1; j > 0; j--) {
			if (tablero[n][j] == true) {
				if (j == x) {
				} else if (j == y) {
					System.out.println(" y del " + n + " al " + j);
					System.out.println("Se puede llegar indirectamente");
					imposible = false;
				}

			}
		}
		if (imposible) {
			System.out.println("Es imposible llegar");
		}

	}
}
