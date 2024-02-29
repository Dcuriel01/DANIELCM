package unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
			int matriz [] = {9,5,8,23,45,32,14,56,78,90,87,49,10,1};
			int posicionBorrar;
			int i = 0;
			
			mostrarAray(matriz);
			posicionBorrar = pedirNumero();
			
			if (posicionBorrar>matriz.length) {
				System.out.println("El array tiene menos números que el indice introducido");
			}else {
				matriz[posicionBorrar] = 0;
				System.out.println("El número en la posición " + posicionBorrar + " ha sido borrado correctamente");
			}
			mostrarAray(matriz);
			

		}

		private static void mostrarAray(int[] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Posicion " + i + ". " + matriz[i]);
		}
		
	}

		private static int pedirNumero() {
			int numero;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Indique la posición del array que desea borrar");
			numero = entrada.nextInt();
			return numero;
		}

	}
