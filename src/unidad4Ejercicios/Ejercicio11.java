package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		double millas;
		double km;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca las millas que desea convertir");
		millas = entrada.nextDouble();
		
		km = millas_a_kilometros(millas);
		
		System.out.println(millas + " millas son " + km + " kilometros");
		
		entrada.close();

	}
	public static double millas_a_kilometros(double millas) {// Devuelve la conversión de millas a kilómetros.
		double km;
		km = millas*1.60934;
		return km;
		
		
	}
}
