package unidad3.ejercicios;

import java.util.Scanner;

public class AreaSuperficie {

	public static void main(String[] args) {
		int opcion = 0;
		float lado;
		float radio;
		float base1;
		float altura;
		float base2;
		float resultado;
		final float PI = 3.1416f;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("CALCULO DE SUPERFICIES");
			System.out.println("1. Cuadrado (lado*lado)");
			System.out.println("2. Círculo (pi*radio*radio)");
			System.out.println("3. Rectángulo (base*altura)");
			System.out.println("4. Trapecio ((base1+base2)*altura/2)");
			System.out.println("5. Triángulo ((base*altura)/2)");
			System.out.println("6. Salir");
			System.out.println("-------------------------------------");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Introduzca el lado ");
				lado = entrada.nextFloat();
				resultado = lado * lado;
				System.out.println("El area de tu cuadrado es: " + resultado);
				break;
			case 2:
				System.out.print("Introduzca el radio ");
				radio = entrada.nextFloat();
				resultado = PI * radio * radio;
				System.out.println("El area de tu círculo es: " + resultado);
				break;
			case 3:
				System.out.print("Introduzca la base ");
				base1 = entrada.nextFloat();
				System.out.print("Ahora introduzca la altura ");
				altura = entrada.nextFloat();
				resultado = base1 * altura;
				System.out.println("El area de tu rectangulo es: " + resultado);
				break;
				case 4:
					System.out.print("Introduzca la base 1 ");
					base1 = entrada.nextFloat();
					System.out.print("Ahora introduzca la base 2 ");
					base2 = entrada.nextFloat();
					System.out.print("Y ahora introduzca la altura ");
					altura = entrada.nextFloat();
					resultado = (base1 + base2)*altura/2;
					System.out.println("El area de tu trapecio es: " + resultado);
					break;
				case 5:
					System.out.print("Introduzca la base ");
					base1 = entrada.nextFloat();
					System.out.print("Y ahora introduzca la altura ");
					altura = entrada.nextFloat();
					resultado = (base1*altura)/2;
					System.out.println("El area de tu triangulo es: " + resultado);
					break;
				case 6:
					System.out.println("Cerrando el programa...... ");
					break;
					
			default:
				System.out.println("NO RECONOCIDO");
				break;
			}

		} while (opcion != 6);
		System.out.println("Gracias por usar este programa");

	}

}
