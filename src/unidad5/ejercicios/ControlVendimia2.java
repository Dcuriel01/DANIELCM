package unidad5.ejercicios;

import java.util.Scanner;

public class ControlVendimia2 {
	
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		double []zonas;
		int opcion = 0;
		int zona = 0;
		int nZonas;
		System.out.println("¿Cuantas zonas tiene tu terreno?");
		nZonas = entrada.nextInt();
		zonas = new double [nZonas];
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1:
				System.out.println("¿De que zona desea agregar la cantidad?");
				zona = entrada.nextInt();
				if (zona>nZonas) {
					System.out.println("Error número de zonas excede las indicadas");
				}else {
					zonas[zona-1]=agregarCantidad();
				}
				break;
			case 2:
				pesoTotal(zonas);
				break;
			case 3:
				pesoZona(zonas);
				break;
			case 4:
				mediaPeso(zonas, nZonas);
				break;
			case 5:
				System.out.println("Cerrando y saliendo del programa");
				break;

			default:
				System.out.println("Error no reconocido");
				break;
			}
			
		} while (opcion!=5);
		

	}

	private static int mostrarMenu() {
		int opcion;
		System.out.println("-----MENU VENDIMIA-----");
		System.out.println("1. Agregar Kg a una zona");
		System.out.println("2. Obtener peso en todas las zonas");
		System.out.println("3. Obtener peso en una sola zona");
		System.out.println("4. Media de peso de todas las zonas");
		System.out.println("5. Salir");
		opcion = entrada.nextInt();
		return opcion;
	}
		
	private static double agregarCantidad() {
		double cantidad;
		System.out.println("¿Que cantidad se ha recogido en Kg en esa zona?");
		cantidad = entrada.nextDouble();
		return cantidad;
	}
	
	private static void pesoTotal(double[] zonas) {
		double pesoTotal = 0;
		for (int i = 0; i < zonas.length; i++) {
			pesoTotal = zonas[i]+ pesoTotal;
		}
		System.out.println("El peso total es: " + pesoTotal + " Kg");
		
	}
	
	private static void pesoZona(double[] zonas) {
		int zona;
		System.out.println("¿De que zona desea saber el peso?");
		zona = entrada.nextInt();
		System.out.println("Los Kg en esa zona son: " + zonas[zona-1]);
		
	}

	private static void mediaPeso(double[] zonas, int nZonas) {
		double pesoTotal = 0;
		double media;
		for (int i = 0; i < zonas.length; i++) {
			pesoTotal = zonas[i]+ pesoTotal;
		}
		media = pesoTotal/nZonas;
		System.out.println("La media de las zonas es " + media + " Kg");
		
	}


}
