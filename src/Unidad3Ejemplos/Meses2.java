package Unidad3Ejemplos;

import java.util.Scanner;

public class Meses2 {

	public static void main(String[] args) {
		int mes;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca el mes del año ");
		mes = entrada.nextInt();
		
		if (mes == 1|mes==2|mes==12 ) {
			System.out.println("Es invierno");
		}else if (mes == 3|mes == 4|mes==5) {
			System.out.println("Es primavera");
		}else if (mes==6|mes==7|mes == 8) {
			System.out.println("Es verano");
		}else if (mes==9|mes==10|mes == 11) {
			System.out.println("Es otoño");
		}else {
			System.out.println("Numero no valido");
		}
		entrada.close();
	}

}
