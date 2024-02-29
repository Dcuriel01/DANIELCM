package unidad4.ejercicios;

import java.util.Scanner;

public class CreditoBiblioteca {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre;
		String apellido1;
		String apellido2;
		double media;
		double saldo;
		nombre = preguntarNombre();
		apellido1 = preguntarApellido1();
		apellido2 = preguntarApellido2();
		media = preguntarMedia();
		saldo = calcularSaldo(media);
		imprimirMensaje(nombre,apellido1,apellido2,media,saldo);

	}

	private static String preguntarNombre() {
		String nombre;
		System.out.println("¿Cuál es tu nombre?");
		nombre = entrada.next();
		return nombre;
	}
	
	private static String preguntarApellido1() {
		String apellido;
		System.out.println("¿Cuál es tu 1º apellido?");
		apellido = entrada.next();
		return apellido;
	}
	
	private static String preguntarApellido2() {
		String apellido;
		System.out.println("¿Cuál es tu 2º apellido?");
		apellido = entrada.next();
		return apellido;
	}

	private static double preguntarMedia() {
		double media;
		System.out.println("¿Cuál es tu media?");
		media = entrada.nextDouble();
		return media;
	}

	private static double calcularSaldo(double media) {
		double saldo;
		saldo = media*10;
		return saldo;
	}

	private static void imprimirMensaje(String nombre, String apellido1, String apellido2, double media, double saldo) {
		System.out.println("Hola " + nombre + " " + apellido1 + " " + apellido2 + ", tu nota media es " + media + " por lo tanto tu saldo para la bilioteca es " + saldo   );
		
	}


}
