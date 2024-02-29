package unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio26 {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int invitados;
		double precio;
		
		invitados=pedirInvitados();
		precio = mostrarMenus(invitados);
		mostrarPrecio(precio);

	}

	private static int pedirInvitados() {
		int invitados;
		
		
		System.out.println("¿Cuantos invitados hay?");
		invitados = entrada.nextInt();
		
		return invitados;
	}
	
	private static double mostrarMenus(int invitados) {
		int opcion = 0;
		double precio = 0;
		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Menú 1 = 15 euros");
			System.out.println("2. Menú 2 = 20 euros");
			System.out.println("3. Menú 3 = 30 euros");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				precio = 15*invitados;
				break;
			case 2:
				precio = 20*invitados;
				break;
			case 3:
				precio = 30*invitados;
				break;

			default:
				System.out.println("NO RECONOCIDO");
				break;
			}
		} while (opcion!=1&opcion!=2&opcion!=3);
		return precio;
	}
	
	private static void mostrarPrecio(double precio) {
		System.out.println("Debera abonar " + precio + " euros");
		
	}

}

