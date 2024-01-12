package Unidad6Ejercicios;

import java.util.Scanner;

public class RellenarDatosPersonales {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String direccion;
		int edad;
		String telefono;
		System.out.println("Introduzca su nombre completo");
		nombre = sc.nextLine();
		System.out.println("Introduzca su dirección");
		direccion = sc.nextLine();
		System.out.println("Introduzca su edad");
		edad = sc.nextInt();
		System.out.println("Introduzca su número de teléfono");
		telefono = sc.next();
		DatosPersonales datos1 = generarDatos(nombre,direccion,edad,telefono);
		System.out.println(datos1.toString());

		
		
		
		
		
		
	}

	private static DatosPersonales generarDatos(String nombre, String direccion, int edad, String telefono) {
		DatosPersonales datos1 = new DatosPersonales(nombre , direccion , edad , telefono);
		return datos1;
	}

}
