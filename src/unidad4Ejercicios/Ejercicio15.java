package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		double precio1;
		double precio2;
		double precio3;
		double precio4;
		double precio5;
		Scanner entrada = new Scanner(System.in);

		System.out.println("introduzca el 1º precio");
		precio1 = entrada.nextDouble();
		System.out.println("introduzca el 2º precio");
		precio2 = entrada.nextDouble();
		System.out.println("introduzca el 3º precio");
		precio3 = entrada.nextDouble();
		System.out.println("introduzca el 4º precio");
		precio4 = entrada.nextDouble();
		System.out.println("introduzca el 5º precio");
		precio5 = entrada.nextDouble();
		
		precio1=precioConIVA(precio1);
		precio2=precioConIVA(precio2);
		precio3=precioConIVA(precio3);
		precio4=precioConIVA(precio4);
		precio5=precioConIVA(precio5);
		
		imprimirPantalla(precio1,precio2,precio3,precio4,precio5);
		
	}

	
	private static double precioConIVA(double precio) {
		double precioIVA;
		precioIVA = precio + (precio*0.21f);
		
		return precioIVA;
		
	}
	
	private static void imprimirPantalla(double precio1, double precio2, double precio3, double precio4, double precio5) {
		System.out.println("El precio 1 con el IVA es "+ precio1);
		System.out.println("El precio 2 con el IVA es "+ precio2);
		System.out.println("El precio 3 con el IVA es "+ precio3);
		System.out.println("El precio 4 con el IVA es "+ precio4);
		System.out.println("El precio 5 con el IVA es "+ precio5);
		
		
	}


}
