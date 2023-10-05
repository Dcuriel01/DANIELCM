package Unidad2Ejemplos;

import java.util.Scanner;

public class LectorEscritor {

	public static void main(String[] args) {
		int dato;
		int dato2;
		int suma;
		System.out.print("Dame un número entero: ");
		Scanner entrada = new Scanner(System.in);
		
		dato = entrada.nextInt();
		System.out.println("Ha intruducido el número "+dato);
		
		System.out.print("Otro número: ");
		dato2 = entrada.nextInt();
		System.out.println("Ahora he introducido el número: " +dato);
		
		suma = dato+dato2;
		System.out.println("La suma de tus números es: "+(dato+dato2));
		System.out.println("La suma de tus números es: "+suma);
		
		entrada.close();
	}

}
