package unidad1.ejemplos;

import java.util.Scanner;

public class PruebaIf {

	public static void main(String[] args) {
	int num;
	Scanner entrada = new Scanner(System.in);
	System.out.print("Introduce tu edad");
	num = entrada.nextInt();
	while (num<18) {
		System.out.print("Eres menor ponga otro:");
		num = entrada.nextInt();
	}
	System.out.println("Eres mayor de edad");
	
	
	}
}
