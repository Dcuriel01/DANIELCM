package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio20V2 {

	public static Scanner entrada = new Scanner(System.in);
	public static final double PI = 3.1416;
	
	public static void main(String[] args) {
		int opcion;
		double radio;
		double altura;
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
				}else if (opcion==3) {
					radio = pideRadio();
					altura = pideAltura();
					System.out.println("Ok calculando el volumen de la circunferencía");
					calcularVolumen(radio,altura);
				}else if (opcion==4) {
					radio = pideRadio();
					altura = pideAltura();
					System.out.println("Ok calculando todo");
					calcularArea(radio);
					calcularCircunferencia(radio);
					calcularVolumen(radio,altura);
				}else if (opcion==5){
					System.out.println("Saliendo");
				}else {
					System.out.println("Error");
					
				}
		} while (opcion!=5);	
			
		
		
	}
	
	private static int menu() {
		int opcion;
		System.out.println("-----MENU-----");
		System.out.println("1. Calcular longitud circunferencía");
		System.out.println("2. Calcular area de la circunferencía");
		System.out.println("3. Calcular volumen de la circunferencía");
		System.out.println("4. Calcular todo");
		System.out.println("5. Salir");
		System.out.println("---------------");
		opcion = entrada.nextInt();
		return opcion;
		
		
		
	}
	
	private static double pideRadio() {
		double radio;
		System.out.println("Indique el radio de su circunferencía por favor");
		radio = entrada.nextDouble();
		return radio;
	}

	private static double pideAltura() {
		double altura;
		System.out.println("Indique la altura de su circunferencía por favor");
		altura = entrada.nextDouble();
		return altura;
	}
	
	private static void calcularCircunferencia(double radio) {
		double longitud = PI*radio*2;
		longitud = PI*radio*2;
		System.out.println("La longitud es " + longitud);
		
	}
	
	private static void calcularArea(double radio) {
		double area;
		area = PI*(radio*radio);
		System.out.println("El area es " + area);
		
	}
	
	private static void calcularVolumen(double radio, double altura) {
		double volumen;
		volumen = altura*PI*2*radio;
		System.out.println("El volumen es " + volumen);
		
	}
}
