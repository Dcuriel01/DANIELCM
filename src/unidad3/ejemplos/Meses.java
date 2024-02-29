package unidad3.ejemplos;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		int mes;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca el mes del año ");
		mes = entrada.nextInt();
		switch (mes) {
		case 1:
		case 2:
		case 12:
			System.out.println("Es invierno");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Es primavera");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Es verano");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Es otoño");
			break;
		default:
			System.out.println("No valido");
		}
	
		
		
		entrada.close();

	}

}
