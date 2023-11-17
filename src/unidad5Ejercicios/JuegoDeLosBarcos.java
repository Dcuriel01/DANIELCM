package unidad5Ejercicios;

import java.util.Scanner;

public class JuegoDeLosBarcos {

	public static final int NUM_FILAS = 8;
	public static final int NUM_COLUMNAS = 8;
	public static final int BARCO_SIN_TOCAR = 1;
	public static final int AGUA = 0;
	public static final int BARCO_TOCADO = 2;
	public static final int FALLO = 3;
	public static Scanner entrada = new Scanner(System.in);
	public static int[][] tablero = new int[NUM_FILAS][NUM_COLUMNAS];

	public static void main(String[] args) {

		
		int filaHundir;
		int colHundir;
		boolean acabado = false;
		int barcoDe1 = 0;
		int barcoDe2 = 0;
		int barcoDe3 = 0;
		
		tablero[2][1] = BARCO_SIN_TOCAR;
		tablero[3][1] = BARCO_SIN_TOCAR;

		tablero[1][5] = BARCO_SIN_TOCAR;
		tablero[1][6] = BARCO_SIN_TOCAR;
		tablero[1][7] = BARCO_SIN_TOCAR;

		tablero[5][5] = BARCO_SIN_TOCAR;
		do {
			filaHundir = pedirFila();
			colHundir = pedirCol();
			if (tablero[filaHundir][colHundir] == BARCO_SIN_TOCAR) {
				System.out.println("Tocado");
				System.out.println("Muy bien");
				tablero[filaHundir][colHundir] = BARCO_TOCADO;
			} else if (tablero[filaHundir][colHundir] == AGUA) {
				System.out.println("Agua");
				System.out.println("pruebe de nuevo");
				tablero[filaHundir][colHundir] = FALLO;
			}
			if (tablero[2][1] == 0 & tablero[3][1] == 0 & barcoDe2 == 0) {
				System.out.println("Barco de 2 hundido");
				barcoDe2=1;
			}
			if (tablero[1][5] == 0 & tablero[1][6] == 0 & tablero[1][7] == 0 & barcoDe3 == 0) {
				System.out.println("Barco de 3 hundido");
				barcoDe3=1;
			}
			if (tablero[5][5] == 0 & barcoDe1 == 0) {
				System.out.println("Barco de 1 hundido");
				barcoDe1=1;

			}
			if (tablero[2][1] == 0 & tablero[3][1] == 0 & tablero[1][5] == 0 & tablero[1][6] == 0 & tablero[1][7] == 0
					& tablero[5][5] == 0) {
				acabado = true;
			}
			mostrarMar();

		} while (!acabado);
		System.out.println("Enhorabuena ha ganado el juego");

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
	
	private static void mostrarMar() {
		
		for(int i=0;i<NUM_FILAS;i++) {
			for(int j=0;j<NUM_COLUMNAS;j++) {
				int valor = tablero[i][j];
				if(valor==AGUA || valor==BARCO_SIN_TOCAR ) {
					System.out.print("~");
				}else if(valor==BARCO_TOCADO) {
					System.out.print("O");
				}else {
					System.out.print("X");
				}
				
			}
			System.out.println("");
		}
	}

}
