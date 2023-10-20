package Unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float media;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Indica tu primera nota");
		nota1 = entrada.nextFloat();
		System.out.println("Indica tu segunda nota");
		nota2 = entrada.nextFloat();
		System.out.println("Indica tu tercera nota");
		nota3 = entrada.nextFloat();
		media=(nota1+nota2+nota3)/3;
		if (media>=7) {
			System.out.println("Promocionas");
		} else {
			System.out.println("No promociona");
		}
		
	}

}
