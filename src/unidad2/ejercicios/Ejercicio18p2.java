package unidad2.ejercicios;

import java.util.Scanner;

public class Ejercicio18p2 {
	
	public static void main(String[] args) {
		
		double valorlibras;
		double valoreuros;
		
		System.out.print("Introduzca las libras que quiera convertir a euros:");

		Scanner entrada = new Scanner(System.in);
		
		valorlibras=entrada.nextDouble();
		valoreuros = valorlibras/0.86375;
	
		System.out.println("Las libras que has introducido son " + valoreuros + " euros");
		
		entrada.close();
		
	}	
}
