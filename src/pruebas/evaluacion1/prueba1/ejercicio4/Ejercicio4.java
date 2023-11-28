package pruebas.evaluacion1.prueba1.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		char opcion;
		double temperatura;
		double humedad;
		int hora;
		do {
			opcion=menu();
			switch (opcion) {
			case 'C':
				temperatura = pedirTemperatura();
				ElegirAccionTemperatura(temperatura);
				humedad = pedirHumedad();
				ElegirAccionHumedad(humedad);
				hora = pedirHoras();
				ElegirAccionHora(hora);
				break;
			case 'S':
				System.out.println("Ok saliendo...");
				break;

			default:
				System.out.println("No reconocido pruebe de nuevo");
				break;
			}
		} while (opcion!='S');
		System.out.println("Ha salido del programa");
		

	}

	private static char menu() {
		char opcion;
		System.out.println("-----Menú-----");
		System.out.println("C. Acceder al menú de la incubadora");
		System.out.println("S. Salir");
		opcion = entrada.next().charAt(0);
		return opcion;
	}
	
	private static double pedirTemperatura() {
		double temperatura;
		System.out.println("¿Cual es la temperatura?");
		temperatura = entrada.nextDouble();
		return temperatura;
	}

	private static void ElegirAccionTemperatura(double temperatura) {
		if (temperatura==37) {
			
		}else {
			if (temperatura<37) {
				System.out.println("Encendiendo bombilla");
			}else {
				System.out.println("Encendiendo ventilador");
			}
		}
	}
	
	private static double pedirHumedad() {
		double humedad;
		System.out.println("¿Cual es la humedad?");
		humedad = entrada.nextDouble();
		return humedad;
	}

	private static void ElegirAccionHumedad(double humedad) {
		if (humedad<75) {
			System.out.println("Rellene el agua");
		}
		
	}

	private static int pedirHoras() {
		int hora;
		System.out.println("¿Cuantas horas lleva dentro?");
		hora = entrada.nextInt();
		return hora;
	}

	private static void ElegirAccionHora(int hora) {
		if (hora==8) {
			System.out.println("Encendiendo motor para girar huevo");
		}
		
	}


}
