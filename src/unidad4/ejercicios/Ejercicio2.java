package unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		float n1, n2, n3;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Indicame un número ");
		n1 = entrada.nextFloat();
		System.out.print("Indique otro ");
		n2 = entrada.nextFloat();
		System.out.print("y otro ");
		n3 = entrada.nextFloat();
		Media(n1,n2,n3);

	}

	public static void Media(float n1, float n2, float n3) {
		float media= (n1+n2+n3)/3;
		System.out.println("La media de los números es: " + media);
	}
}
