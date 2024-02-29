package unidad4.ejemplos;

import java.util.Scanner;

public class Recursividad {

	public static void main(String[] args) {
		int numVeces;
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Introduzca las veces que quieres ser saludado");
		numVeces = entrada.nextInt();
		saludarRecursivamente(numVeces);
		
		entrada.close();
		

	}

	private static void saludarRecursivamente(int veces) {
		
		if (veces>0) {
			System.out.println("Hola");
			saludarRecursivamente(veces-1);
		}
	}
}
