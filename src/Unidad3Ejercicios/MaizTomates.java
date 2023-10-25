package Unidad3Ejercicios;

import java.util.Scanner;

public class MaizTomates {

	public static void main(String[] args) {
		int hectTomates;
		int hectMaiz;
		int gastadoTomates;
		int gastadoMaiz;
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Cuántas hectareas de tomate va a plantar? ");
		hectTomates = entrada.nextInt();
		System.out.print("¿Y cuántas de maíz? ");
		hectMaiz = entrada.nextInt();

		if (hectTomates + hectMaiz > 150) {
			System.out.println("Error no hay tantas hectareas");
		} else {
			gastadoTomates = hectTomates * 3;
			gastadoMaiz = hectMaiz * 5;
			System.out.println("Vas a gastar " + gastadoTomates+ " euros en semillas de tomates y " + gastadoMaiz
					+ " euros en maiz "+ (gastadoTomates+gastadoMaiz) + " euros en total");
			if (gastadoTomates>gastadoMaiz) {
				System.out.println("Has gastado "+(gastadoTomates-gastadoMaiz)+ " más en tomates que en maíz");
			} else {
				System.out.println("Has gastado "+(gastadoMaiz-gastadoTomates)+ " más en maíz que en tomates");
			}

		}

	}

}
