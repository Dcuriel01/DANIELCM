package unidad2.ejercicios;

import java.util.Scanner;

public class Ejercicio18p1 {

	public static void main(String[] args) {
		
		double valoreuros;
		double valorlibras;
		
		System.out.print("Introduzca los euros que quiera convertir a libras:");

		Scanner entrada = new Scanner(System.in);
		
		valoreuros=entrada.nextDouble();
		valorlibras = valoreuros*0.86375;
	
		System.out.printf("Los euros que has introducido son %.2f",valorlibras," libras");
		
		entrada.close();
		
	}	

}
