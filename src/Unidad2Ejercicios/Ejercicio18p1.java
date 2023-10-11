package Unidad2Ejercicios;

import java.util.Scanner;

public class Ejercicio18p1 {

	public static void main(String[] args) {
		
		double valoreuros;
		double valorlibras;
		
		System.out.print("Introduzca los euros que quiera convertir a libras:");

		Scanner entrada = new Scanner(System.in);
		
		valoreuros=entrada.nextDouble();
		valorlibras = valoreuros*0.86375;
	
		System.out.println("Los euros que has introducido son " + valorlibras + " libras");
		
		entrada.close();
		
	}	

}
