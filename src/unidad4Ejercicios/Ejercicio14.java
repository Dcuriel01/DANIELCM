package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		double costePorMayor;
		double porcentajeMargen;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique el coste al por mayor");
		costePorMayor=entrada.nextDouble();
		System.out.println("Indique el porcentaje de margen");
		porcentajeMargen=entrada.nextDouble();
		calcularPrecioPorMenor(costePorMayor,porcentajeMargen);
	}

	private static void calcularPrecioPorMenor(double costePorMayor, double porcentajeMargen) {
		double porMenor;
		porMenor=costePorMayor+(costePorMayor*porcentajeMargen)/100;
		imprimirPantalla(porMenor);
		
	}

	private static void imprimirPantalla(double porMenor) {
		System.out.println("Su precio al por menor es " + porMenor);
		
	}

}
