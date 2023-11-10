package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double n1;
		double n2;
		double resultado;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Indicame el primer número que desea multiplicar");
		n1 = entrada.nextDouble();
		System.out.println("Y ahora el segundo");
		n2 = entrada.nextDouble();
		
		resultado = multiplica(n1, n2);
		
		System.out.println("El resultado es: " + resultado );
		
		entrada.close();

	}

	public static double multiplica(double a, double b) { // Devuelve la multiplicación de dos números
		double resultado;
		resultado = a * b;
		return resultado;
	}
}
