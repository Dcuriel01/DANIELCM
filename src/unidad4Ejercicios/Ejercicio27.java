package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int valor ;
		int opcion = 0;
		int nMedida;
		String medida;
		
		System.out.println("¿Qué valor desea introducir?");
		valor = entrada.nextInt();
		System.out.println("¿En que medida? (todo en minusculas)");
		medida = entrada.next();
		System.out.println("Ha introducido " + valor + " " + medida);
		System.out.println("A que desea convertirlo");
		opcion = mostrarMenu();
		nMedida = determinarMedida(medida);
		operando(opcion,nMedida,valor);
		
	}

	private static int determinarMedida(String medida) {
		int nMedida = 0;
		switch (medida) {
		case "bits":
			nMedida=1;
			break;
		case "bytes":
			nMedida=2;
			break;
		case "kylobytes":
			nMedida=3;
			break;
		case "megabytes":
			nMedida=4;
			break;
		case "gigabytes":
			nMedida=5;
			break;
		}
		return nMedida;
	}

	private static void operando(int opcion, int nMedida, int valor) {
		switch (opcion) {
		case 1:
			convertirBits(valor,nMedida);
			break;

		default:
			break;
		}
		
	}

	private static void convertirBits(int valor, int nMedida) {
		String medida = "bits";
		switch (nMedida) {
		case 1:
			valor = valor*1;
			imprimir(valor,medida);
			break;
		case 2:
			valor = valor*8;
			imprimir(valor,medida);
			break;
		case 3:
			valor = valor*8000;
			imprimir(valor,medida);
			break;
		case 4:
			valor = valor*8000000;
			imprimir(valor,medida);
			break;
		case 5:
			valor = valor*80000000;
			imprimir(valor,medida);
			break;
			
		}
		
	}

	private static void imprimir(int valor, String medida) {
		System.out.println("El valor tranforado es " + valor + " " + medida);
		
	}

	private static int mostrarMenu() {
		int opcion;
		System.out.println("1.bits");
		System.out.println("2.bytes");
		System.out.println("3.kylobytes");
		System.out.println("4.megabytes");
		System.out.println("5.gigabytes");	
		opcion = entrada.nextInt();
		return opcion;
		
	}

}
