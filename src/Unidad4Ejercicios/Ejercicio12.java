package Unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		float lado1;
		float lado2;
		float lado3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduca el 1 lado del triangulo");
		lado1 = entrada.nextFloat();
		System.out.println("introduca el 2 lado del triangulo");
		lado2 = entrada.nextFloat();
		System.out.println("introduca el 3 lado del triangulo");
		lado3 = entrada.nextFloat();
	}

	public static void calcularArea(float a, float b, float c){
		float p = (a+b+c)/2;
		float interiorRaiz = p*(p-a)*(p-b)*(p-c);
		double area = Math.sqrt(interiorRaiz);
	}
}
