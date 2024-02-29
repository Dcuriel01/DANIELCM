package unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		int anioActual;
		int anioNacimiento;
		int edad;
		double poliza;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿En que año estamos?");
		anioActual = entrada.nextInt();
		System.out.println("¿Y en que año nacio?");
		anioNacimiento = entrada.nextInt();
		
		edad = calcularEdad(anioActual,anioNacimiento);
		poliza = calcularPoliza(edad);
		imprimir(poliza);
		entrada.close();
		
	}
	
	private static int calcularEdad(int anioActual, int anioNacimiento) {
		int edad;
		edad = anioActual-anioNacimiento;
		return edad;
	}

	
	private static double calcularPoliza(int edad) {
		int decada = (edad/10)%10;
		double poliza=(decada + 15)*20;
		return poliza;
	}
	
	private static void imprimir(double poliza) {
			System.out.println("Debera abonar " + poliza);
		}
}
