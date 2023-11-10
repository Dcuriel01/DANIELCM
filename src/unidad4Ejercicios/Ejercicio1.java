package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Indicame un número ");
		n1 = entrada.nextInt();
		System.out.print("Indique otro ");
		n2 = entrada.nextInt();
		System.out.print("y otro ");
		n3 = entrada.nextInt();
		buscarMenor(n1, n2, n3);
	}

	public static void buscarMenor(int n1, int n2, int n3) {
		if (n1 < n2 & n1 < n3) {
			System.out.println("El número más pequeño es el primero = " + n1);
		} else if (n2 < n1 & n2 < n3) {
			System.out.println("El número más pequeño es el segundo = " + n2);
		} else if (n3 < n1 & n3 < n2) {
			System.out.println("El número más pequeño es el tercero =  " + n3);
		} else if (n1 < n2 & n1 == n3) {
			System.out.println("Los números más pequeños son el primero y el tercero = " + n1);
		} else if (n2 < n1 & n2 == n3) {
			System.out.println("Los números más pequeños son el segundo y el tercero = " + n2);
		} else if (n1 < n3 & n1 == n2) {
			System.out.println("Los números más pequeños son el primero y el segundo = " + n1);
		} else if (n1 == n3 & n3 == n2) {
			System.out.println("Todos los número son iguales, es decir, ninguno es más pequeño");
		}
	}
}
