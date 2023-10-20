package Unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numeroA;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		int cifra5;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca un número entre el 1 y el 99999 : ");
		numeroA = entrada.nextInt();

		cifra1 = numeroA % 10;
		cifra2 = (numeroA / 10) % 10;
		cifra3 = (numeroA / 100) % 10;
		cifra4 = (numeroA / 1000) % 10;
		cifra5 = (numeroA / 10000) % 10;
		
		if (cifra1==0&cifra2==0&cifra3==0&cifra4==0&cifra5==0) {
			System.out.println("Tu número es 0");
		} else if (cifra1!=0&cifra2==0&cifra3==0&cifra4==0&cifra5==0) {
			System.out.println("Tu número es de 1 cifra");
		}else if (cifra1!=0&cifra2!=0&cifra3==0&cifra4==0&cifra5==0) {
			System.out.println("Tu número es de 2 cifras");
		}else if (cifra1!=0&cifra2!=0&cifra3!=0&cifra4==0&cifra5==0) {
			System.out.println("Tu número es de 3 cifras");
		}else if (cifra1!=0&cifra2!=0&cifra3!=0&cifra4!=0&cifra5==0) {
			System.out.println("Tu número es de 4 cifras");
		}else if (cifra1!=0&cifra2!=0&cifra3!=0&cifra4!=0&cifra5!=0) {
			System.out.println("Tu número es de 5 cifras");
		}
		entrada.close();

	}

}
