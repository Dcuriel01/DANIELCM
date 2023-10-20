package Unidad3Ejercicios;

import java.util.Scanner;

public class VeterinariaA {

	public static void main(String[] args) {
		int tipoAnalisis;
		int afiliado;
		float precio = 0;
		float precioA;
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Qué tipo de análisis quiere? 1/2/3 ");
		tipoAnalisis = entrada.nextInt();
		System.out.print("¿Esta usted afiliado a la clínica? 1=si 0=no ");
		afiliado = entrada.nextInt();

		if (tipoAnalisis == 1) {
			System.out.println("Tu análisis costara 25 euros");
			precio = 25.00f;
		} else if (tipoAnalisis == 2) {
			System.out.println("Tu análisis costara 36 euros");
			precio = 36.00f;
		} else if (tipoAnalisis == 3) {
			System.out.println("Tu análisis costara 50 euros");
			precio = 50.00f;
		} else {
			System.out.println("Análisis no reconocido");
		}
		precioA = precio - ((precio * 8)/ 100);

		if (afiliado == 1) {
			System.out.println("Pero por ser afiliado seran " + precioA + " euros");
		}

		entrada.close();

	}

}
