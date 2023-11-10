package unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numeroA;
		int moduloA;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca un número entre el 1 y el 99 : ");
		numeroA = entrada.nextInt();
		
		moduloA=numeroA%2;
		
		if (moduloA == 0 ) {
			System.out.println("El número tiene 2 cifras");
		} else {
			System.out.println("El número tiene solo una cifra");
		}
	entrada.close();
	}
}