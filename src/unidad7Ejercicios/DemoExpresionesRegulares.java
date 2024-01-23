package unidad7Ejercicios;

import java.util.Scanner;

public class DemoExpresionesRegulares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame el dato");
		String dato = entrada.nextLine();
		// . Representa cualquier caracter
		// * Se puede repetir tantas veces como se quiera incluido el 0 el caracter que tenga a la izquierda
		// + Igual que el * pero no permite 0 caracteres
		// \\d pide un numero
		// {n} Exactamente n
		// {n,m} minimo y maximo 
		// {n,} minimo n 
		// [a-zA-z] Todas las letras sin importar mayus o minus
		// \\s exige un espacio
		// {n}([A-Z]+[a-z] N marca el limite de caracteres de esa cadena
		// ^ empieze por el caracter que le sigue
		// $ termine por e digito de su derecha
		String expresionRegular = "[A-Z]";
		boolean resultado = dato.matches(expresionRegular);
		if (resultado) {
			System.out.println("Dato válido");
		}else {
			System.out.println("Dato NO válido");
		}
		entrada.close();
	}

}
