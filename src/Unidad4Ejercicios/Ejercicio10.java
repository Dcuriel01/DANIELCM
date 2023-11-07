package Unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int hora1;
		int minuto1;
		int segundo1;
		int hora2;
		int minuto2;
		int segundo2;
		Scanner entrada = new Scanner(System.in);

		hora1 = pedirHora(entrada);
		hora2 = pedirHora(entrada);
		minuto1 = pedirMinuto(entrada);
		minuto2 = pedirMinuto(entrada);
		segundo1 = pedirSegundo(entrada);
		segundo2 = pedirSegundo(entrada);
		compararHoras(hora1,minuto1,segundo1,hora2,minuto2,segundo2);
		
	}

	private static int pedirHora(Scanner entrada) {

		boolean horaCorrecta = false;
		int hora = 0;
		while (!horaCorrecta) {
			System.out.println("Introduzca una hora (entre 0 y 23)");
			hora = entrada.nextInt();
			if (hora >= 0 && hora <= 23) {
				horaCorrecta = true;
			}

		}

		return hora;
	}
	
	private static int pedirMinuto(Scanner entrada) {

		boolean minutoCorrecto = false;
		int minuto = 0;
		while (!minutoCorrecto) {
			System.out.println("Introduzca un minuto (entre 0 y 59)");
			minuto = entrada.nextInt();
			if (minuto >= 0 && minuto <= 59) {
				minutoCorrecto = true;
			}

		}

		return minuto;
	}
	
	private static int pedirSegundo(Scanner entrada) {

		boolean segundoCorrecto = false;
		int segundo = 0;
		while (!segundoCorrecto) {
			System.out.println("Introduzca un segundo (entre 0 y 59)");
			segundo = entrada.nextInt();
			if (segundo >= 0 && segundo <= 59) {
				segundoCorrecto = true;
			}

		}

		return segundo;
	}
	
	private static void compararHoras(int hora1,int minuto1, int segundo1, int hora2, int minuto2, int segundo2) {
		
		if (hora1>hora2) {
			System.out.println("1");
		}else if (hora1==hora2) {
			if (minuto1>minuto2) {
				System.out.println("1");
			}else if (minuto1==minuto2) {
				if (segundo1>segundo2) {
					System.out.println("1");
				}else if (segundo1==segundo2) {
					System.out.println("Son la misma hora");
				}else {
					System.out.println("2");
				}
			}else {
				System.out.println("2");
			}
		}else {
			System.out.println("2");
		}
		
		
	}
}
