package unidad3.ejercicios;

import java.util.Scanner;

public class AlquilerCoches {

	public static void main(String[] args) {
		int dias;
		String auto;
		int km;
		float precio;
		int x=0;
		int opcion;
		String algoMas;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Calcular gastos del alquiler de coche");
			System.out.println("2. Salir");

			opcion = entrada.nextInt();
			
			
			if (opcion==1) {
				
				System.out.print("¿Cuantos días lo ha tenido? ");
				dias = entrada.nextInt();
				System.out.print("¿Cuantos Km ha hecho? ");
				km = entrada.nextInt();
				System.out.print("¿Que tipo de coche es el que ha alquilado? ");
				entrada.nextLine();
				auto = entrada.nextLine();
				switch (auto) {
				case "pequeño":
					precio = (dias * 15) + ((km / dias) * 0.20f);
					if (km / dias > 10) {
						precio = precio + (precio * 0.25f);
						System.out.println("Se le suma la tasa de 2,5% por superar la barrera de los 10km por día");
						System.out.println("Debes abonar " + precio + " euros");
						System.out.println("¿Desea calcular algo más?");
						algoMas = entrada.nextLine();
						switch (algoMas) {
						case "si":
							System.out.println("Ok");
							break;
						case "no":
							System.out.println("Vale, gracias hasta pronto");
							x=1;
							break;
						}
						
					} else {
						System.out.println("Debes abonar " + precio + " euros");
						System.out.println("¿Desea calcular algo más?");
						algoMas = entrada.nextLine();
						switch (algoMas) {
						case "si":
							System.out.println("Ok");
							break;
						case "no":
							System.out.println("Vale, gracias hasta pronto");
							x=1;
							break;
						}
					}
					break;
				case "mediano":
					precio = (dias * 20) + ((km / dias) * 0.30f);
					if (km / dias > 10) {
						precio = precio + (precio * 0.25f);
						System.out.println("Se le suma la tasa de 2,5% por superar la barrera de los 10km por día");
						System.out.println("Debes abonar " + precio + " euros");
						System.out.println("¿Desea calcular algo más?");
						algoMas = entrada.nextLine();
						switch (algoMas) {
						case "si":
							System.out.println("Ok");
							break;
						case "no":
							System.out.println("Vale, gracias hasta pronto");
							x=1;
							break;
						}
					} else {
						System.out.println("Debes abonar " + precio + " euros");
						System.out.println("¿Desea calcular algo más?");
						algoMas = entrada.nextLine();
						switch (algoMas) {
						case "si":
							System.out.println("Ok");
							break;
						case "no":
							System.out.println("Vale, gracias hasta pronto");
							x=1;
							break;
						}
					}
					break;
				case "grande":
					precio = (dias * 30) + ((km / dias) * 0.40f);
					if (km / dias > 10) {
						precio = precio + (precio * 0.25f);
						System.out.println("Se le suma la tasa de 2,5% por superar la barrera de los 10km por día");
						System.out.println("Debes abonar " + precio + " euros");
						System.out.println("¿Desea calcular algo más?");
						algoMas = entrada.nextLine();
						switch (algoMas) {
						case "si":
							System.out.println("Ok");
							break;
						case "no":
							System.out.println("Vale, gracias hasta pronto");
							x=1;
							break;
						}
					} else {
						System.out.println("Debes abonar " + precio + " euros");
						System.out.println("¿Desea calcular algo más?");
						algoMas = entrada.nextLine();
						switch (algoMas) {
						case "si":
							System.out.println("Ok");
							break;
						case "no":
							System.out.println("Vale, gracias hasta pronto");
							x=1;
							break;
						}
					}
					break;
				default:
					System.out.println("Ese tamaño de coche no esta contemplado");
					break;
				}
			}else if (opcion==2) {
				System.out.println("Vale, hasta pronto");
				x=1;
			}else {
				System.out.println("Opción no valida");
			}
			
		} while (x==0);

	}

}
