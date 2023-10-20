package Unidad3Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int nota;
		Scanner entrada= new Scanner(System.in);

		System.out.print("Dame tu nota: ");
		nota = entrada.nextInt();
		if (nota>=9&nota<=10) {
			System.out.println("Has sacdo un sobresaliente");
		}else if (nota>=7&nota<=8) {
			System.out.println("Has sacado un notable");
		}else if (nota==6) {
			System.out.println("Has sacado un bien");
		}else if (nota==5) {
			System.out.println("Has sacado un suficiente");
		}else if (nota>=0&nota<5) {
			System.out.println("Has suspendido");
		}else {
			System.out.println("Esa nota no esta contemplada en el programa");
		}
		entrada.close();
	}

}
