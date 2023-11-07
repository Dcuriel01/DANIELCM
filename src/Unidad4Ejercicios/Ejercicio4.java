package Unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int edad;
		boolean mayorEdad;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu edad?");
		edad = entrada.nextInt();
		
		mayorEdad = esMayorEdad(edad);
		
		if (mayorEdad) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}
		entrada.close();
		

	}

	public static boolean esMayorEdad(int a) { // Devuelve verdadero si a>=18, falso en caso contrario
		boolean mayorEdad = false;
		if (a<18) {
			mayorEdad = false;
		}else if (a>=18) {
			mayorEdad = true;
		}
		return mayorEdad;
		
	}
}
