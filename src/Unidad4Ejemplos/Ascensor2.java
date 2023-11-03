package Unidad4Ejemplos;

import java.util.Scanner;

public class Ascensor2 {
	
	public static boolean puertaAbierta= false;
	public static int plantaActual=0;
	public static final int ULTIMA_PLANTA=5;
	public static final int PRIMERA_PLANTA=0;
	
	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		int plantaMarcada = 0;
		
		int opcion=0;
		do {
			System.out.println("----- ASCENSOR -----");
			System.out.println("1. Marcar planta");
			System.out.println("2. Abrir puerta");
			System.out.println("3. Cerrar planta");
			System.out.println("4. Apagar");
			
			opcion= entrada.nextInt();
			
			
			switch(opcion) {
			case 1:
				System.out.println("Introduzca el número de planta");
				plantaMarcada = entrada.nextInt();
				marcarPlanta(plantaMarcada);
			break;	
			case 2:
				abrirPuertas();
			break;	
			case 3:
				cerrarPuertas();
			break;	
			case 4:
				apagarAscensor();
			break;	
			default:
				
			break;
			}
			
		}while(opcion!=4);
		
		System.out.println("Ascensor apagado");
	}

	private static void apagarAscensor() {
		System.out.println("Apagando...");
		
	}

	private static void cerrarPuertas() {
		System.out.println("Cerrando puerta");
		puertaAbierta=false;
		System.out.println("Puerta cerrada");
		
	}

	private static void abrirPuertas() {
		System.out.println("Abriendo puerta");
		puertaAbierta=true;
		System.out.println("Puerta abierta");
		
	}

	private static void marcarPlanta(int plantaMarcada) {
		
		while(plantaMarcada!=plantaActual) {
			if(plantaActual<plantaMarcada) {
				subir();
			}else {
				bajar();	
			}
	}
}

	private static void bajar() {
		plantaActual--;
		System.out.println("Planta:"+plantaActual);
		
	}
	private static void subir() {
		
		plantaActual++;
		System.out.println("Planta:"+plantaActual);
				
	}
}
