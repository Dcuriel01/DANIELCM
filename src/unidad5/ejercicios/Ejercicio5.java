package unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int[] matriz;
		int tamaño;
		int posicion;
		int numero;
		int salir;
		tamaño = pedirTamaño();
		matriz = new int[tamaño];
		do {
			posicion = pedirPosicion(tamaño);
			numero = pedirNumero();
			matriz[posicion] = numero;
			mostrarMatriz(matriz);
			salir = deseaSalir();
		} while (salir != 1);

	}

	private static int pedirTamaño() {
		int tamaño;
		System.out.println("¿Cuantos numeros quieres que tenga el array?");
		tamaño = entrada.nextInt();
		return tamaño;
	}

	private static int pedirPosicion(int tamaño) {
		int posicion;
		do {
			System.out.println("¿En que posición desea insertar el número?");
			posicion = entrada.nextInt();
			if (posicion > tamaño | posicion <= 0) {
				System.out.println("Error la matriz no tiene ese numero de posiciones");
			}
		} while (posicion > tamaño | posicion <= 0);

		posicion = posicion - 1;
		return posicion;
	}

	private static int pedirNumero() {
		int numero;
		System.out.println("¿Que número desea añadir en esa posición?");
		numero = entrada.nextInt();
		return numero;
	}

	private static void mostrarMatriz(int[] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("posicion " + (i + 1) + " es : " + matriz[i]);
		}

	}

	private static int deseaSalir() {
		int opcion;
		do {
			System.out.println("Si desea salir pulse 1");
			System.out.println("Si desea seguir pulse 2");
			opcion = entrada.nextInt();
			if (opcion == 1) {
				System.out.println("Ok saliendo del programa");
			} else if (opcion == 2) {
				System.out.println("Ok volviendo al principio");
			} else {
				System.out.println("Numero no reconocido pruebe de nuevo");
			}
		} while (opcion != 1 & opcion != 2);
		return opcion;
	}
}
