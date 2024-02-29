package unidad5.ejercicios;
import java.util.Scanner;

public class Corredores {
	
	
	static final int NUM_PARTICIPANTES = 10;
	static int [] dorsales = new int [NUM_PARTICIPANTES];
	static int [] menores = new int [NUM_PARTICIPANTES];
	static int [] positivos = new int [NUM_PARTICIPANTES];
	static int [] morosos = new int [NUM_PARTICIPANTES];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		leerDorsales();
		leerMenores();
		leerPositivos();
		leerMorosos();
		gestionarMenores();
		mostrarClasificación();

	}

	private static void gestionarMenores() {
		int dorsalMenor=0;
		int temp = 0;
		for (int i = 0; i < menores.length; i++) {
			dorsalMenor=menores[i];
			if (dorsalMenor!=0) {
				for (int j = 0; j < dorsales.length; j++) {
					if (dorsalMenor==dorsales[j] & j>0) {
						temp=dorsales[j];
						dorsales[j]=dorsales[j-1];
						dorsales[j-1]=temp;
					}
				}
			}
		}
		
	}

	private static void mostrarClasificación() {
		int posicion=1;
		for (int i = 0; i < dorsales.length; i++) {
			System.out.println("Posición: " + posicion + "--Dorsal:" + dorsales[i]);
			posicion++;
		}
		
	}

	private static void leerDorsales() {
		int dorsal=0;
		int contadorEntrada=0;
		do {
			System.out.println("Introduzca un dorsal (-1 para fin)");
			dorsal = sc.nextInt();
			if (dorsal!=-1) {
				dorsales[contadorEntrada]=dorsal;
				contadorEntrada++;
			}
		} while (dorsal!=-1);
		
	}

	private static void leerMenores() {
		int dorsal=0;
		int contadorMenores=0;
		do {
			System.out.println("Introduzca un dorsal de un menor (-1 para fin)");
			dorsal = sc.nextInt();
			if (dorsal!=-1) {
				menores[contadorMenores]=dorsal;
				contadorMenores++;
			}
		} while (dorsal!=-1);
		
	}
	
	private static void leerPositivos() {
		int dorsal=0;
		int contadorPositivos=0;
		do {
			System.out.println("Introduzca un dorsal de un positivo (-1 para fin)");
			dorsal = sc.nextInt();
			if (dorsal!=-1) {
				positivos[contadorPositivos]=dorsal;
				contadorPositivos++;
			}
		} while (dorsal!=-1);
		
	}

	private static void leerMorosos() {
		int dorsal=0;
		int contadorMorosos=0;
		do {
			System.out.println("Introduzca un dorsal de un moroso (-1 para fin)");
			dorsal = sc.nextInt();
			if (dorsal!=-1) {
				morosos[contadorMorosos]=dorsal;
				contadorMorosos++;
			}
		} while (dorsal!=-1);
		
	}
}
