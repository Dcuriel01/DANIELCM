package unidad5.ejemplos;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
	
		
		int[] array;
		
	    Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dimension:");
		int dimension = entrada.nextInt();
		
		array = new int[dimension];
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}
