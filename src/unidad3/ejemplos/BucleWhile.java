package unidad3.ejemplos;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {

		int nElegido = 7;
		int nIntro;
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Intenta adivinar el número del 1 al 10 ");
		nIntro = entrada.nextInt();
		
		while (nIntro != nElegido) {
			System.out.print("Error prueba de nuevo ");
			nIntro = entrada.nextInt();
			
		}
		System.out.println("Has acertado el número era " + nElegido);
		
		entrada.close();
	}
	
}