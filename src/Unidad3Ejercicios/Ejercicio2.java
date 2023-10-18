package Unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numeroA;
		int numeroB;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		numeroA = entrada.nextInt();
		System.out.print("Ahora otro: ");
		numeroB = entrada.nextInt();
		if (numeroA > numeroB) {
			System.out.println("El orden decreciente es " + numeroA + " y después " + numeroB);  
		} else {
			System.out.println("El orden decreciente es " + numeroB + " y después " + numeroA);  
		}
		
		
	}

}
