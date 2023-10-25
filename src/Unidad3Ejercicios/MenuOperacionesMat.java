package Unidad3Ejercicios;

import java.util.Scanner;

public class MenuOperacionesMat {
	public static void main(String[] args) {
		
		int n1;
		int n2;
		String operacion;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		n1 = entrada.nextInt();
		System.out.print("Introduzca el segundo número: ");
		n2 = entrada.nextInt();
		
		System.out.println("------MENU------");
		System.out.println("S = suma");
		System.out.println("R = resta");
		System.out.println("M = multiplicación");
		System.out.println("D = División");
			
		System.out.print("Eliga la opción (S,R,M,D) y presione enter: ");
		entrada.nextLine();
		operacion = entrada.nextLine();
		
		switch (operacion) {
		case "S":
			System.out.println("La suma es " + (n1+n2));
			break;
		case "R":
			System.out.println("La resta es " + (n1-n2));
			break;
		case "M":
			System.out.println("La multiplicación es " + (n1*n2));
			break;
		case "D":
			System.out.println("La división es " + (n1/n2));
			break;
		default:
			System.out.println("No se reconoció");
			break;
		}
		entrada.close();
		
		
		
	}
}
