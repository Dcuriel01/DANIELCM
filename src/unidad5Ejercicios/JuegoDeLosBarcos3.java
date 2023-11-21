package unidad5Ejercicios;

import java.util.Scanner;

public class JuegoDeLosBarcos3 {

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
		boolean bienIntroducido = false;
		int nBarcos;
		do {
			bienIntroducido=true;
			System.out.println("¿Con cuántos barcos quiere jugar? (máx 10)");
			nBarcos = entrada.nextInt();
			if (nBarcos<0|nBarcos>10) {
			System.out.println("Error pruebe de nuevo");
			bienIntroducido=false;
			}
		} while (bienIntroducido);
		
		int[][] barcos = new int[4][nBarcos];
		for (int i = 0; i < nBarcos; i++) {
			System.out.println("¿Cuántas posiciones ocupa el barco " + (i+1) +" ? (Máx 4)");
			barcos[1][i]=entrada.nextInt();
		}
		
		for (int i = 0; i < nBarcos; i++) {
			int x=0;
			int y=0;
			int x2=0;
			int y2=0;
			int x3=0;
			int y3=0;
			int x4=0;
			int y4=0;
			if (barcos[1][i]==1) {
				do {
					bienIntroducido=false;
					System.out.println("¿Qué coordenada ocupa el barco?");
					System.out.print("Fila:");
					x = entrada.nextInt();
					System.out.print("Columna:");
					y = entrada.nextInt();
					if (tablero[x][y]==BARCO_SIN_TOCAR) {
						System.out.println("Alguna de las cordenadas de las introducidas ya tiene barcos ocupandolas");
						System.out.println("Introduzcala de nuevo");
					}
					else if (x<NUM_FILAS&y<NUM_COLUMNAS) {
						tablero[x][y]=BARCO_SIN_TOCAR;
						bienIntroducido=true;
					}else {
						System.out.println("No ha introducido correctamente las cordenadas pruebe de nuevo");
						System.out.println("Introduzcala de nuevo");
					}
				} while (!bienIntroducido);
				
			}else if (barcos[1][i]==2) {
				bienIntroducido=false;
				do {
					System.out.println("¿Qué coordenada ocupa el barco?");
					System.out.print("Fila (Cord1):");
					x = entrada.nextInt();
					System.out.print("Columna (Cord1):");
					y = entrada.nextInt();
					System.out.print("Fila (Cord2):");
					x2 = entrada.nextInt();
					System.out.print("Columna (Cord2):");
					y2 = entrada.nextInt();
					if (tablero[x][y]==BARCO_SIN_TOCAR|tablero[x2][y2]==BARCO_SIN_TOCAR) {
						System.out.println("Alguna de las cordenadas de las introducidas ya tiene barcos ocupandolas");
						System.out.println("Introduzcala de nuevo");
					}
					else if (x==x2&x<NUM_FILAS&y<NUM_COLUMNAS|y==y2&x<NUM_FILAS&y<NUM_COLUMNAS) {
						tablero[x][y]=BARCO_SIN_TOCAR;
						tablero[x2][y2]=BARCO_SIN_TOCAR;
						bienIntroducido=true;
					}else {
						System.out.println("No ha introducido correctamente las cordenadas pruebe de nuevo");
						System.out.println("Introduzcala de nuevo");
					}
				} while (!bienIntroducido);
				
			}else if (barcos[1][i]==3) {
				bienIntroducido=false;
				do {
					System.out.println("¿Qué coordenada ocupa el barco?");
					System.out.print("Fila (Cord1):");
					x = entrada.nextInt();
					System.out.print("Columna (Cord1):");
					y = entrada.nextInt();
					System.out.print("Fila (Cord2):");
					x2 = entrada.nextInt();
					System.out.print("Columna (Cord2):");
					y2 = entrada.nextInt();
					System.out.print("Fila (Cord3):");
					x3 = entrada.nextInt();
					System.out.print("Columna (Cord3):");
					y3 = entrada.nextInt();
					if (tablero[x][y]==BARCO_SIN_TOCAR|tablero[x2][y2]==BARCO_SIN_TOCAR|tablero[x3][y3]==BARCO_SIN_TOCAR) {
						System.out.println("Alguna de las cordenadas de las introducidas ya tiene barcos ocupandolas");
						System.out.println("Introduzcala de nuevo");
					}
					else if (x==x2&x==x3&x<NUM_FILAS&y<NUM_COLUMNAS|y==y2&y==y3&x<NUM_FILAS&y<NUM_COLUMNAS) {
						tablero[x][y]=BARCO_SIN_TOCAR;
						tablero[x2][y2]=BARCO_SIN_TOCAR;
						tablero[x3][y3]=BARCO_SIN_TOCAR;
						bienIntroducido=true;
					}else {
						System.out.println("No ha introducido correctamente las cordenadas pruebe de nuevo");
						System.out.println("Introduzcala de nuevo");
					}
				} while (!bienIntroducido);
				
			}else {
				do {
					bienIntroducido=false;
					System.out.println("¿Qué coordenada ocupa el barco?");
					System.out.print("Fila (Cord1):");
					x = entrada.nextInt();
					System.out.print("Columna (Cord1):");
					y = entrada.nextInt();
					System.out.print("Fila (Cord2):");
					x2 = entrada.nextInt();
					System.out.print("Columna (Cord2):");
					y2 = entrada.nextInt();
					System.out.print("Fila (Cord3):");
					x3 = entrada.nextInt();
					System.out.print("Columna (Cord3):");
					y3 = entrada.nextInt();
					System.out.print("Fila (Cord4):");
					x4 = entrada.nextInt();
					System.out.print("Columna (Cord4):");
					y4 = entrada.nextInt();
					if (tablero[x][y]==BARCO_SIN_TOCAR|tablero[x2][y2]==BARCO_SIN_TOCAR|tablero[x3][y3]==BARCO_SIN_TOCAR|tablero[x4][y4]==BARCO_SIN_TOCAR) {
						System.out.println("Alguna de las cordenadas de las introducidas ya tiene barcos ocupandolas");
						System.out.println("Introduzcala de nuevo");
					}
					else if (x==x2&x==x3&x==x4&x<NUM_FILAS&y<NUM_COLUMNAS|y==y2&y==y3&y==y4&x<NUM_FILAS&y<NUM_COLUMNAS) {
						tablero[x][y]=BARCO_SIN_TOCAR;
						tablero[x2][y2]=BARCO_SIN_TOCAR;
						tablero[x3][y3]=BARCO_SIN_TOCAR;
						tablero[x4][y4]=BARCO_SIN_TOCAR;
						bienIntroducido=true;
					}else {
						System.out.println("No ha introducido correctamente las cordenadas pruebe de nuevo");
						System.out.println("Introduzcala de nuevo");
					}
			} while (!bienIntroducido);
			}
		}
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
			
			mostrarMar();

		} while (!acabado);
		System.out.println("Enhorabuena ha ganado el juego");

	}
		
	private static int pedirFila() {
		int filaHundir;
		System.out.print("¿Que cordenadas desea hundir (fila) ");
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
