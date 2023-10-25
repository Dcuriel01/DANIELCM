package Unidad3Ejercicios;

import java.util.Scanner;

public class NotasLetras {

	public static void main(String[] args) {
		float nota;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("¿que nota has sacado? ");
		nota = entrada.nextFloat();
		
		if (nota>=9&nota<=10) {
			System.out.println("Has sacado una A");
		}else if (nota>=8&nota<9) {
			System.out.println("Has sacado una B");
		}else if (nota>=7&nota<8) {
			System.out.println("Has sacado una C");
		}else if (nota>=6&nota<7) {
			System.out.println("Has sacado una D");
		}else if (nota<6&nota>=0) {
			System.out.println("Has sacado una F");
		}else {
			System.out.println("Nota no reconocida");
		}
		
		

	}

}
