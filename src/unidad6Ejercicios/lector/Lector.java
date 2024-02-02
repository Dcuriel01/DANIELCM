package unidad6Ejercicios.lector;

import java.util.Scanner;

public class Lector {
	public static Scanner sc = new Scanner(System.in);
	
	public static String leerCadena() {
		String cadena=null;
		cadena = sc.next();		
		return cadena;
	}
	
	public static int leerInt() {
		String lectura=null;
		int numero=0;
		lectura = sc.nextLine();
		if (lectura.matches("[1-9]\\d{0,100}")) {
			numero = Integer.parseInt(lectura);
		}else {
			System.out.println("Error en el numero");
			numero=-1;
		}
		
		return numero;
	}
	
	public static double leerDouble() {
		String lectura=null;
		double numero=0;
		lectura = sc.nextLine();
		numero = Double.parseDouble(lectura);
		return numero;
	}
	
	public static String leerLinea() {
		String cadena=null;
		cadena = sc.nextLine();		
		return cadena;
	}
	
	
}
