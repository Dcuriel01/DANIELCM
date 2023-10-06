package Unidad2Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		double r;
		double circunferencia;
		double area;
		double pi = 3.14 ;
		
		System.out.print("Dame el radio de tu círculo:");
		Scanner entrada = new Scanner(System.in);
		r = entrada.nextFloat();
		
		area = pi * (r*r);
		circunferencia = pi * (r*2);
		
		System.out.println("El área de tu círculo es:" + area + " y la circunferencia:" + circunferencia);
		
		entrada.close();
		
	}

}
