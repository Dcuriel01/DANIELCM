package unidad5Ejercicios;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		int longMatriz=1;
		double sueldo = 0;
		double [] matriz = new double [longMatriz];
		int x=0;
		while (sueldo!=-1) {
			sueldo = pedirSueldo();
			if (sueldo!=-1) {
				longMatriz++;
				matriz[x]=sueldo;
				x++;
				
			}
			else {
				System.out.println("Saliendo");
			}
			
		}
		for (double d : matriz) {
			System.out.print(d + " ");
		}

	}

	private static double pedirSueldo() {
		double sueldo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuál es su sueldo?");
		sueldo = entrada.nextDouble();
		return sueldo;
	}

}
