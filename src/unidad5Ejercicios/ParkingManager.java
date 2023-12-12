package unidad5Ejercicios;

import java.util.Scanner;

public class ParkingManager {

	public static final int FILAS = 10;
	public static final int COLUMNAS = 10;
	public static Scanner entrada = new Scanner(System.in);
	public static final int NORMAL=0;
	public static final int NORMAL_OCUP=1;
	public static final int MINUSVALIDOS = 3; 
	public static final int MINUSVALIDOS_OCUP = 4; 
	public static final int ELECTRICOS = 5;
	public static final int ELECTRICOS_OCUP = 6;
	public static final int FAMILIAS = 7;
	public static final int FAMILIAS_OCUP = 8;
	public static final int RESERVADA = 9;
	
	public static void main(String[] args) {
		int opcion;
		int [][] parking;
		parking = inicializarMatriz();
		parking = plazasEspeciales(parking);
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				ocuparPlaza(parking);
				break;
			case 2:
				vaciarPlaza(parking);
				break;
			case 3:
				resevarPlaza(parking);
				break;
			case 4:
				mostrarParking(parking);
				break;
			case 5:
				salir();
				break;

			default:
				System.out.println("Número no reconocido");
				break;
			}
		} while (opcion!=5);
		System.out.println("Ha salido del programa");
		
	}

	private static int[][] inicializarMatriz() {
		int [][] parking = new int [FILAS][COLUMNAS];
		return parking;
	}
	
	private static int[][] plazasEspeciales(int[][] parking) {
		parking [7][0]=MINUSVALIDOS;
		parking [7][1]=MINUSVALIDOS;
		parking [7][2]=MINUSVALIDOS;
		parking [7][3]=MINUSVALIDOS;
		parking [7][4]=MINUSVALIDOS;
		parking [7][5]=MINUSVALIDOS;
		parking [7][6]=MINUSVALIDOS;
		parking [7][7]=MINUSVALIDOS;
		parking [7][8]=MINUSVALIDOS;
		parking [7][9]=MINUSVALIDOS;
		
		parking [0][0]=ELECTRICOS;
		parking [0][1]=ELECTRICOS;
		parking [0][2]=ELECTRICOS;
		parking [0][3]=ELECTRICOS;
		parking [0][4]=ELECTRICOS;
		parking [0][5]=ELECTRICOS;
		parking [0][6]=ELECTRICOS;
		parking [0][7]=ELECTRICOS;
		parking [0][8]=ELECTRICOS;
		parking [0][9]=ELECTRICOS;
		
		parking [2][0]=FAMILIAS;
		parking [2][1]=FAMILIAS;
		parking [2][2]=FAMILIAS;
		parking [2][3]=FAMILIAS;
		parking [2][4]=FAMILIAS;
		parking [2][5]=FAMILIAS;
		parking [2][6]=FAMILIAS;
		parking [2][7]=FAMILIAS;
		parking [2][8]=FAMILIAS;
		parking [2][9]=FAMILIAS;
		
		return parking;
	}

	private static int menu() {
		int opcion;
		boolean salir = false;
		do {
		System.out.println("-----MENU PARKING-----");
		System.out.println("1. Ocupar plaza");
		System.out.println("2. Vaciar plaza");
		System.out.println("3. Reservar plaza");
		System.out.println("4. Mostrar estado de parking");
		System.out.println("5. Salir");
		opcion = entrada.nextInt();
		if (opcion>0&opcion<=5) {
			salir = true;
		}
		} while (!salir);
		return opcion;
	}

	private static void ocuparPlaza(int[][] parking) {
		int fila;
		int columna;
		boolean salir = false;
		do {
		System.out.println("La hilera del 8 está reservada para minusválidos, la del 1 para electricos y la del 3 para familias. "
				+ "Si desea reservar alguna asegurese de cumplir las condiciones de uso");
		System.out.println("¿Qué plaza desea ocupar? ");
		System.out.println("Fila(1/7): ");
		fila = entrada.nextInt();
		fila = fila-1;
		System.out.println("Columna(1/5): ");
		columna = entrada.nextInt();
		columna=columna-1;
		if (fila>=0&fila<FILAS&columna>=0&columna<COLUMNAS) {
			salir = true;
		}else {
			System.out.println("No reconocida");
		}
		} while (!salir);
		if (parking[fila][columna]==NORMAL_OCUP|parking[fila][columna]==MINUSVALIDOS_OCUP|parking[fila][columna]==ELECTRICOS_OCUP|parking[fila][columna]==FAMILIAS_OCUP) {
			System.out.println("Esa plaza ya esta ocupada");
		}else {
			if (parking[fila][columna]==MINUSVALIDOS) {
				parking[fila][columna]=MINUSVALIDOS_OCUP;
			}else if (parking[fila][columna]==ELECTRICOS) {
				parking[fila][columna]=ELECTRICOS_OCUP;
			}else if (parking[fila][columna]==FAMILIAS) {
				parking[fila][columna]=FAMILIAS_OCUP;
			}else if (parking[fila][columna]==NORMAL) {
				parking[fila][columna]=NORMAL_OCUP;
			}
			System.out.println("Información actualizada");
		}
	}

	private static void vaciarPlaza(int[][] parking) {
		int fila;
		int columna;
		boolean salir = false;
		do {
		System.out.println("¿Qué plaza desea vaciar? ");
		System.out.println("Fila(1/7): ");
		fila = entrada.nextInt();
		fila = fila-1;
		System.out.println("Columna(1/5): ");
		columna = entrada.nextInt();
		columna=columna-1;
		if (fila>=0&fila<FILAS&columna>=0&columna<COLUMNAS) {
			salir = true;
		}else {
			System.out.println("No reconocida");
		}
		} while (!salir);
		if (parking[fila][columna]==0) {
			System.out.println("Esa plaza ya esta vacia");
		}else {
			if (parking[fila][columna]==MINUSVALIDOS_OCUP) {
				parking[fila][columna]=MINUSVALIDOS;
			}else if (parking[fila][columna]==ELECTRICOS_OCUP) {
				parking[fila][columna]=ELECTRICOS;
			}else if (parking[fila][columna]==FAMILIAS_OCUP) {
				parking[fila][columna]=FAMILIAS;
			}else if (parking[fila][columna]==NORMAL_OCUP) {
				parking[fila][columna]=NORMAL;
			}
			System.out.println("Información actualizada");
		}
		
	}

	private static void resevarPlaza(int[][] parking) {
		int fila;
		int columna;
		boolean salir = false;
		do {
		System.out.println("La hilera del 8 está reservada para minusválidos, la del 1 para electricos y la del 3 para familias. "
				+ "Si desea reservar alguna asegurese de cumplir las condiciones de uso");
		System.out.println("¿Qué plaza desea reservar? ");
		System.out.println("Fila(1/7): ");
		fila = entrada.nextInt();
		fila = fila-1;
		System.out.println("Columna(1/5): ");
		columna = entrada.nextInt();
		columna=columna-1;
		if (fila>=0&fila<FILAS&columna>=0&columna<COLUMNAS) {
			salir = true;
		}else {
			System.out.println("No reconocida");
		}
		} while (!salir);
		if (parking[fila][columna]==NORMAL_OCUP|parking[fila][columna]==MINUSVALIDOS_OCUP|parking[fila][columna]==ELECTRICOS_OCUP|parking[fila][columna]==FAMILIAS_OCUP) {
			System.out.println("Esa plaza ya esta ocupada");
		}else {
			parking[fila][columna]=RESERVADA;
			System.out.println("Información actualizada");
		}
	}
	
	private static void mostrarParking(int[][] parking) {
		System.out.println("Mostrando parking");
		System.out.println("E=Electricos,M=Minusvalidos,R=Reservada,N=Normal,O=Ocupada");
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				int valor = parking[i][j];
				if(valor==NORMAL) {
					System.out.print("N ");
				}else if (valor==NORMAL_OCUP|valor==MINUSVALIDOS_OCUP|valor==ELECTRICOS_OCUP|valor==FAMILIAS_OCUP) {
					System.out.print("O ");
				}else if (valor==MINUSVALIDOS) {
					System.out.print("M ");
				}else if (valor==ELECTRICOS) {
					System.out.print("E ");
				}else if (valor==FAMILIAS) {
					System.out.print("F ");
				}else if (valor==RESERVADA) {
					System.out.print("R ");
				}
					
				
				
			}
			System.out.println("");
		}
		
	}
	
	private static void salir() {
		System.out.println("Saliendo del programa");
		
	}

}
