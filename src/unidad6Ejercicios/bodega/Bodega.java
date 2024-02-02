package unidad6Ejercicios.bodega;

import java.util.Scanner;

public class Bodega {
	public static Scanner sc = new Scanner(System.in);
	public static String tipoVino;
	public static String nombreVino;
	public static String fechaInicio;
	public static double precioPorLitro;
	public static double cantidadVino;
	
	public static void main(String[] args) {
		int opcion;
		int contador=0;
		int barricaAConsultar;
		Barrica [] barricas = new Barrica [8];
		do {
			opcion=menu();
			switch (opcion) {
			case 1:
				preguntarDatos();
				barricas[0+contador]=new Barrica(tipoVino,nombreVino,fechaInicio,precioPorLitro,cantidadVino);
				System.out.println(barricas[0+contador].imprimirDatos());
				contador++;
				break;
			case 2:
				System.out.println("¿De que barrica desea consultar los datos?");
				barricaAConsultar=sc.nextInt();
				barricaAConsultar= barricaAConsultar-1;
				if (barricas[barricaAConsultar].getTipoVino()==null) {
					System.out.println("Esa barrica esta vacia aún");
				}else {
					System.out.println(barricas[barricaAConsultar].imprimirDatos());
				}
				break;
			case 3:
				System.out.println("Ok saliendo");
				break;

			default:
				System.out.println("No reconocido");
				break;
			}
		} while (opcion!=3);
		
		
		

	}

	private static void preguntarDatos() {
		System.out.println("¿Qué tipo es el vino almacenado?");
		tipoVino = sc.next();
		System.out.println("¿Cuál es el nombre del vino almacenado?");
		nombreVino = sc.next();
		System.out.println("¿Cuándo se empezó a fermentar?");
		fechaInicio=sc.next();
		System.out.println("¿Cuánto cuesta cada litro del vino?");
		precioPorLitro=sc.nextDouble();
		System.out.println("¿Cuántos litros de ese vino hay almacenado?");
		cantidadVino = sc.nextDouble();
		
		
	}

	private static int menu() {
		int opcion;
		System.out.println("-----MENU-----");
		System.out.println("1.Registrar barrica");
		System.out.println("2.Consultar datos de barrica");
		System.out.println("3.Salir");
		opcion = sc.nextInt();
		return opcion;
	}

}
