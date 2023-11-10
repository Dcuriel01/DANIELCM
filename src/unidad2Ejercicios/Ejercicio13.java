package unidad2Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		double r;
		double circunferencia;
		double area;
		final double PI = 3.1416 ;
		
		System.out.print("Dame el radio de tu círculo:");
		Scanner entrada = new Scanner(System.in);
		r = entrada.nextDouble();
		
		area = PI * (r*r);
		circunferencia = PI * (r*2);
		
		System.out.println("El área de tu círculo es:" + area + " y la circunferencia:" + circunferencia);
		
		entrada.close();
		
	}

}
