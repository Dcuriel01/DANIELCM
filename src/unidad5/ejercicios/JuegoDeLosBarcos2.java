package unidad5.ejercicios;

import java.util.Scanner;

public class JuegoDeLosBarcos2 {

	public static final int NUM_FILAS = 8;
	public static final int NUM_COLUMNAS = 8;
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] tablero = new int[NUM_FILAS][NUM_COLUMNAS];
		int filaHundir;
		int colHundir;
		int filaCordBarcoDe1;
		int colCordBarcoDe1;
		int filaCord1BarcoDe2;
		int filaCord2BarcoDe2;
		int colCord1BarcoDe2;
		int colCord2BarcoDe2;
		int filaCord1BarcoDe3;
		int colCord1BarcoDe3;
		int filaCord2BarcoDe3;
		int colCord2BarcoDe3;
		int filaCord3BarcoDe3;
		int colCord3BarcoDe3;
		boolean acabado = false;
		int barcoDe1 = 0;
		int barcoDe2 = 0;
		int barcoDe3 = 0;

		filaCordBarcoDe1 = pedirCordBarcoFila("1","del barco de 1");
		colCordBarcoDe1 = pedirCordBarcocol("1","del barco de 1");
		filaCord1BarcoDe2 = pedirCordBarcoFila("1","del barco de 2");
		colCord1BarcoDe2 = pedirCordBarcocol("1","del barco de 2");
		filaCord2BarcoDe2 = pedirCordBarcoFila("2","del barco de 2");
		colCord2BarcoDe2 = pedirCordBarcocol("2","del barco de 2");
		filaCord1BarcoDe3 = pedirCordBarcoFila("1","del barco de 3");
		colCord1BarcoDe3 = pedirCordBarcocol("1","del barco de 3");
		filaCord2BarcoDe3 = pedirCordBarcoFila("2","del barco de 3");
		colCord2BarcoDe3 = pedirCordBarcocol("2","del barco de 3");
		filaCord3BarcoDe3 = pedirCordBarcoFila("3","del barco de 3");
		colCord3BarcoDe3 = pedirCordBarcocol("3","del barco de 3");

		tablero[filaCord1BarcoDe2][colCord1BarcoDe2] = 1;
		tablero[filaCord2BarcoDe2][colCord2BarcoDe2] = 1;

		tablero[filaCord1BarcoDe3][filaCord1BarcoDe3] = 1;
		tablero[filaCord2BarcoDe3][filaCord2BarcoDe3] = 1;
		tablero[filaCord3BarcoDe3][filaCord3BarcoDe3] = 1;

		tablero[filaCordBarcoDe1][colCordBarcoDe1] = 1;
		do {
			filaHundir = pedirFila();
			colHundir = pedirCol();
			if (tablero[filaHundir][colHundir] == 1) {
				System.out.println("Tocado");
				System.out.println("Muy bien");
				tablero[filaHundir][colHundir] = 0;
			} else if (tablero[filaHundir][colHundir] == 0) {
				System.out.println("Agua");
				System.out.println("pruebe de nuevo");
			}
			if (tablero[2][1] == 0 & tablero[3][1] == 0 & barcoDe2 == 0) {
				System.out.println("Barco de 2 hundido");
				barcoDe2 = 1;
			}
			if (tablero[1][5] == 0 & tablero[1][6] == 0 & tablero[1][7] == 0 & barcoDe3 == 0) {
				System.out.println("Barco de 3 hundido");
				barcoDe3 = 1;
			}
			if (tablero[5][5] == 0 & barcoDe1 == 0) {
				System.out.println("Barco de 1 hundido");
				barcoDe1 = 1;

			}
			if (tablero[2][1] == 0 & tablero[3][1] == 0 & tablero[1][5] == 0 & tablero[1][6] == 0 & tablero[1][7] == 0
					& tablero[5][5] == 0) {
				acabado = true;
			}

		} while (!acabado);
		System.out.println("Enhorabuena ha ganado el juego");

	}

	private static int pedirCordBarcoFila(String numero,String mensaje) {
		int filaCordBarco;
		System.out.println("Indique la fila de la cordenada "+ numero + " " + mensaje);
		filaCordBarco = entrada.nextInt();
		return filaCordBarco;
	}

	private static int pedirCordBarcocol(String numero,String mensaje) {
		int colCordBarco;
		System.out.println("Indique la fila de la cordenada "+ numero + " " + mensaje);
		colCordBarco = entrada.nextInt();
		return colCordBarco;
	}

	private static int pedirFila() {
		int filaHundir;
		System.out.println("¿Que cordenadas desea hundir (fila)");
		filaHundir = entrada.nextInt();
		return filaHundir;
	}

	private static int pedirCol() {
		int colHundir;
		System.out.println("¿Que cordenadas desea hundir (columna)");
		colHundir = entrada.nextInt();
		return colHundir;
	}

}
