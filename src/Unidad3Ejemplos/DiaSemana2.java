package Unidad3Ejemplos;

import java.util.Scanner;

public class DiaSemana2 {

	public static void main(String[] args) {
		
		int dia;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca el dia de la semana ");
		dia = entrada.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Es lunes");
			break;
		case 2:
			System.out.println("Es martes");
			break;
		case 3:
			System.out.println("Es miércoles");
			break;
		case 4:
			System.out.println("Es jueves");
			break;
		case 5:
			System.out.println("Es viernes");
			break;
		case 6:
			System.out.println("Es sábado");
			break;
		case 7:
			System.out.println("Es domingo");
			break;

		default:
			System.out.println("No valido");
		}
	
		
		
		entrada.close();
	}
}
