package unidad5.ejercicios;

import java.util.Scanner;

public class ParkingManager {

	public static final int FILAS = 7;
	public static final int COLUMNAS = 5;
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		int [][] parking;
		parking = inicializarMatriz();
		do {
			contador(parking);
			opcion = menu();
			switch (opcion) {
			case 1:
				ocuparPlaza(parking);
				break;
			case 2:
				vaciarPlaza(parking);
				break;
			case 3:
				mostrarParking(parking);
				break;
			case 4:
				salir();
				break;

			default:
				System.out.println("Número no reconocido");
				break;
			}
		} while (opcion!=4);
		System.out.println("Ha salido del programa");
		
	}

	private static void contador(int[][] parking) {
		boolean plazaVacia=false;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (parking[i][j]==0) {
					plazaVacia=true;
				}
			}
		}
		if (!plazaVacia) {
			System.out.println("El parking esta Lleno");
		}
	}

	private static int[][] inicializarMatriz() {
		int [][] parking = new int [FILAS][COLUMNAS];
		return parking;
	}

	private static int menu() {
		int opcion;
		boolean salir = false;
		do {
		System.out.println("-----MENU PARKING-----");
		System.out.println("1. Ocupar plaza");
		System.out.println("2. Vaciar plaza");
		System.out.println("3. Mostar estado de parking");
		System.out.println("4. Salir");
		opcion = entrada.nextInt();
		if (opcion>0&opcion<=4) {
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
		if (parking[fila][columna]==1) {
			System.out.println("Esa plaza ya esta ocupada");
		}else {
			parking[fila][columna]=1;
			System.out.println("Información actualizada correctamente");
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
			parking[fila][columna]=0;
			System.out.println("Información actualizada correctamente");
		}
		
	}

	private static void mostrarParking(int[][] parking) {
		System.out.println("Mostrando parking");
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				int valor = parking[i][j];
				if(valor==0) {
					System.out.print("L ");
				}else {
					System.out.print("O ");
				}
				
			}
			System.out.println("");
		}
		
	}
	
	private static void salir() {
		System.out.println("Saliendo del programa");
		
	}

}
