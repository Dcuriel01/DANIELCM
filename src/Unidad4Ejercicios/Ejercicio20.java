package Unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static Scanner entrada = new Scanner(System.in);
	public static final double PI = 3.1416;
	
	public static void main(String[] args) {
		int opcion;
		double radio;
		do {
			opcion = menu();
			if (opcion==1) {
				radio = pideRadio();
				System.out.println("Ok calculando longitud de la circunferencía");
				calcularCircunferencia(radio);
				}else if (opcion==2) {
					radio = pideRadio();
					System.out.println("Ok calculando area de la circunferencía");
					calcularArea(radio);
				}else if (opcion==3){
					System.out.println("Saliendo");
				}else {
					System.out.println("Error");
					
				}
		} while (opcion!=3);	
			
		
		
	}

	private static int menu() {
		int opcion;
		System.out.println("-----MENU-----");
		System.out.println("1. Calcular longitud circunferencía");
		System.out.println("2. Calcular area de la circunferencía");
		System.out.println("3. Salir");
		System.out.println("---------------");
		opcion = entrada.nextInt();
		return opcion;
		
		
		
	}
	
	private static double pideRadio() {
		double radio;
		System.out.println("Indique su radio por favor");
		radio = entrada.nextDouble();
		return radio;
	}
	

	private static void calcularCircunferencia(double radio) {
		double longitud = PI*radio*2;
		System.out.println("La longitud es " + longitud);
		
	}
	
	private static void calcularArea(double radio) {
		double area;
		area = PI*(radio*radio);
		System.out.println("El area es " + area);
		
	}
}
