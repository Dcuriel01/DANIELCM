package unidad7.ejercicios;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numeroA;
		int numeroB;
		int numeroRandom;
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Por favor introduzca un número entre el 0 y el 100");
			numeroA = sc.nextInt();
			salir = comprobarNumero(numeroA);
		} while (!salir);
		salir = false;
		do {
			System.out.println("Ahora otro");
			numeroB = sc.nextInt();
			salir = comprobarNumero(numeroB);
		} while (!salir);
		numeroRandom = generarNumero(numeroA, numeroB);
		System.out.println("El número: " + numeroRandom + " es un número que ha sido aleatoriamente entre los 2 números anteriormente dados");
		
		
		

	}

	private static int generarNumero(int numeroA, int numeroB) {
		int numeroRandom;
		SecureRandom random = new SecureRandom();
		if (numeroA<=numeroB) {
			numeroRandom=random.nextInt((numeroB-1)-numeroA+2)+numeroA;
		}else {
			numeroRandom=random.nextInt((numeroA-1)-numeroB+2)+numeroB;
		}
		return numeroRandom;
	}

	private static boolean comprobarNumero(int numero) {
		boolean salir = false;
		if (numero<0 | numero >100) {
			System.out.println("Número no válido, pruebe de nuevo");
		}else {
			salir = true;
		}
		return salir;
	}

}

