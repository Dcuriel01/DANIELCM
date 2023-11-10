package unidad2Ejemplos;

import java.util.Scanner;

public class NombreApellidos {

	public static void main(String[] args) {

		String apellidos;
		String nombre;
		int numeroTlf;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime tu número de teléfono por favor:");
		numeroTlf = entrada.nextInt();
		
		System.out.print("Dime tus apellidos por favor:");
		
		entrada.nextLine();// Es para "limpiar" entrada despues de usar un número y vas a usar un String (Hay que ponerlo después de la siguiente pregunta)
		
		apellidos = entrada.nextLine(); // Si puede contener espacio
	
		System.out.print("Dime tu nombre por favor:");
		nombre = entrada.next(); // No puede contener espacio
		
		System.out.println("Tu nombre completo es: " + nombre + " " + apellidos + " y tu télefono:"+ numeroTlf);
		
		entrada.close();

	}

}
