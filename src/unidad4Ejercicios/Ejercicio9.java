package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
			double n1;
			double resultado;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduzca un número");
			n1 = entrada.nextDouble();
			
			resultado = diezVeces(n1);
			
			System.out.println(resultado + " este es su número al cuadrado");
			
			entrada.close();
			
		}

		public static double diezVeces(double a) {
			double resultado;
			resultado = a*a;
			return resultado;
		}
	}
