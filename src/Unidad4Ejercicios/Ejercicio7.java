package Unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int a;
		boolean aceptado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indique un número");
		a = entrada.nextInt();
		comprendido(a);
	}

	public static boolean comprendido(int a) {
		boolean aceptado = false;
		final int OPMIN = 10;
		final int OPMAX = 30;
		if (a > OPMIN & a < OPMAX) {
			aceptado = true;
		} else {
			aceptado = false;
		}
		return aceptado;
	}
}
