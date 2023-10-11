package Unidad2Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
	
	public static void main(String[] args) {
		
		long poblacionMundial;
		float crecAnual;
		float calculo;
		long en1Año;
		long en2Año;
		long en3Año;
		long en4Año;
		long en5Año;
		
		System.out.print("Introduzca la población mundial ");
		Scanner entrada = new Scanner(System.in);
		poblacionMundial= entrada.nextLong();
		System.out.print("Ahora intoduzca la tasa de crecimiento en decimal ");
		crecAnual= entrada.nextFloat();
		
		calculo = poblacionMundial*crecAnual;
		en1Año = (long) calculo;
		calculo = en1Año*crecAnual;
		en2Año = (long) calculo;
		calculo = en2Año*crecAnual;
		en3Año = (long) calculo;
		calculo = en3Año*crecAnual;
		en4Año = (long) calculo;
		calculo = en4Año*crecAnual;
		en5Año = (long) calculo;
		System.out.println("En un año crecera " + en1Año);
		System.out.println("En 2 años crecera " + en2Año);
		System.out.println("En 3 años crecera " + en3Año);
		System.out.println("En 4 años crecera " + en4Año);
		System.out.println("En 5 años crecera " + en5Año);
		
		
	}

}
