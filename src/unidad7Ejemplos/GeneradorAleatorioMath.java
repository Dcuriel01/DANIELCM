package unidad7Ejemplos;

import java.util.Random;

public class GeneradorAleatorioMath {

	public static void main(String[] args) {
		
		// Se generan números entre el 0.0 y 1.0
		double numero = Math.random();
		System.out.println(numero);
		
		// Se generan números entre el 0.0 y 9.9
		double numero2 = (Math.random()*10);
		System.out.println(numero2);
		
		// Se generan números entre el 0 y 9
		int numero3 = (int)(Math.random()*10);
		System.out.println(numero3);
		
		// Genera número aleatorio cualquiera
		Random random = new Random();
		int numAleatorio=random.nextInt();
		System.out.println(numAleatorio);
		
		// Genera número aleatorio entre 0 y 99
		int numAleatorio2=random.nextInt(100);
		System.out.println(numAleatorio2);
		
		// Genera número aleatorio entre 0 y 99
		double numAleatorio3=random.nextDouble(100);
		System.out.println(numAleatorio3);
		
	}

}
