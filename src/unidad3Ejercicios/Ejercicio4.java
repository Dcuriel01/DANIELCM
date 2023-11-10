package unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int numeroA;
		int numeroB;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		numeroA = entrada.nextInt();
		System.out.print("Ahora otro: ");
		numeroB = entrada.nextInt();
		if (numeroA > numeroB) {
			System.out.println(numeroA + ">" + numeroB);  
		} else if(numeroA == numeroB) {
			 System.out.println(numeroA + "=" + numeroB);
		}else {
			System.out.println(numeroB + ">" + numeroA); 
		}
		
		
		
		
		
	}
}

