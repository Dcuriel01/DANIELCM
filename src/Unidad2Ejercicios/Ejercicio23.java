package Unidad2Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

			
			float gInicial;
			float kg;
			float libras;
			float onzas;
			
			System.out.print("Cuantos gramos desea convertir:");
			Scanner entrada = new Scanner(System.in);
			gInicial = entrada.nextFloat();
			onzas = gInicial/28.35f;
			libras = onzas/16f;
			kg = libras/2.2f;
			
			System.out.println("Has introducido:" + gInicial + "gramos");
			System.out.println("Eso equivale a " + kg + " Kg, " + libras + " libras, " + onzas + " onzas.");
			entrada.close();
	}

}
