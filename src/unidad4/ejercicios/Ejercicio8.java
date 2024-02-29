package unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		double n1;
		double resultado;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		n1 = entrada.nextDouble();
		
		resultado = diezVeces(n1);
		
		System.out.println(resultado + " este es su número 10 veces");
		
		entrada.close();
		
	}

	public static double diezVeces(double a) {
		double resultado;
		resultado = a*10;
		return resultado;
	}
}
