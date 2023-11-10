package unidad3Ejercicios;

import java.util.Scanner;

public class ComprobarFecha {
	
	public static void main(String[] args) {
		int dia;
		int mes;
		int año;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce el día ");
		dia = entrada.nextInt();
		System.out.print("introduce el mes ");
		mes = entrada.nextInt();
		System.out.print("Introduce el año ");
		año = entrada.nextInt();

		if (dia > 31 & (mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10 | mes == 12)) {
			System.out.println("Fecha no válida");
		} else if (dia > 30 & (mes == 4 | mes == 6 | mes == 9 | mes == 11)) {
			System.out.println("Fecha no válida");
		}else if (dia>28&mes==2&año%4!=0) {
			System.out.println("Fecha no válida");
		}else if (dia>29&mes==2&año%4==0) {
			System.out.println("Fecha no válida");
		}else {
			System.out.println("Fecha válida");
		}
		entrada.close();
	}

}

