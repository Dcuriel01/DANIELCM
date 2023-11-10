package unidad3Ejercicios;

import java.util.Scanner;

public class PlacasSolares {

	public static void main(String[] args) {
		int accion = 0;
		float energiaDiaria = 0;
		double latitud = 0;
		double altitud = 0;
		int id = 0;
		boolean estado = true;
		int accion3 = 0; // Esta variable es para el paso 3 registrar la accion que quiere hacer
		int diasCalcular = 0;
		float energiaDiariaTotal;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Registrar una placa solar");
			System.out.println("2. Consultar información de una placa solar");
			System.out.println("3. Cambiar el estado de la placa solar");
			System.out.println("4. Calcular generación diaria");
			System.out.println("5. Salir");
			System.out.print("¿Que desea hacer? ");
			accion = entrada.nextInt();

			if (accion == 1) {
				System.out.print("¿Cuál es la energia que produce diariamente? ");
				energiaDiaria = entrada.nextFloat();
				System.out.print("¿Cuál es su latitud? ");
				latitud = entrada.nextDouble();
				System.out.print("¿Y su altitud? ");
				altitud = entrada.nextDouble();
				System.out.print("¿Cuál es su ID? ");
				id = entrada.nextInt();
				System.out.println("Ok los datos han sido recogidos correctamente");
			} else if (accion == 2) {
				if (energiaDiaria == 0 & latitud == 0 & altitud == 0 & id == 0) {
					System.out.println("No hay datos guardados");
				} else {
					System.out.println("Su id es: " + id);
					System.out.println("Su generació diaria es: " + energiaDiaria);
					System.out.println("Su latitud es: " + latitud + " y su altitud: " + altitud);
					if (estado) {
						System.out.println("La placa solar esta activa");
					} else {
						System.out.println("La placa solar esta inactiva");
					}
				}
			} else if (accion == 3) {
				if (energiaDiaria == 0 & latitud == 0 & altitud == 0 & id == 0) {
					System.out.println("No hay placas guardadas ");
				} else {
					System.out.println("Si desea activar la placa pulse 1");
					System.out.println("Si desea desactivar la placa pulse 2");
					accion3 = entrada.nextInt();
					if (accion3 == 1) {
						estado = true;
					} else if (accion3 == 2) {
						estado = false;
					}
					System.out.println("Ok el estado ha sido modificado");
				}

			} else if (accion == 4) {
				System.out.println("Introduzca los dias que desea calcular");
				diasCalcular = entrada.nextInt();
				if (energiaDiaria == 0) {
					System.out.println("No hay datos de energía de la placa");
				} else {
					energiaDiariaTotal = energiaDiaria * diasCalcular;
					System.out.println("la energía total es: " + energiaDiariaTotal);
				}
			}

		} while (accion != 5);
		System.out.println("Gracias por usar el programa");
	}

}
