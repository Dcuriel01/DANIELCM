package unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int matriz [] = {9,5,8,23,45,32,14,56,78,90,87,49,10,1};
		int nBuscado;
		int i = 0;
		boolean noEncontrado = true;
		
		nBuscado = pedirNumero();
		
		while(noEncontrado & i<matriz.length) {
			
			if (matriz[i]==nBuscado) {
				noEncontrado = false;
				System.out.println("El número si esta en el array");
			}
			i++;	
		}
		if (noEncontrado) {
			System.out.println("Ese número no esta en el array");
		}
	}

	private static int pedirNumero() {
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique un número");
		numero = entrada.nextInt();
		return numero;
	}

}