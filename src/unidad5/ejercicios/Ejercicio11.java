package unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int n;
		int m;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique el número n");
		n = entrada.nextInt();
		System.out.println("Indique el número m");
		m = entrada.nextInt();
		
		int [] matriz = new int [n];;
		for (int i = 0; i < matriz.length; i++) {
			matriz[i]=m;
		}
		for (int i : matriz) {
			System.out.print(i+" ");
		}
	}

}
