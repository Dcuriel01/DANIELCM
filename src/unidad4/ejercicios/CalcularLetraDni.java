package unidad4.ejercicios;

import java.util.Scanner;

public class CalcularLetraDni {

	public static void main(String[] args) {
		long dni;
		String dniEntero;
		boolean salir = false;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Indique su dni sin la letra");
			dni=entrada.nextLong();
			salir = validarNumeros(dni);
			if (!salir) {
				System.out.println("Error numeros mal introducidos");
			}
		} while (!salir);
		
		
		dniEntero=encontrarLetra(dni);
		System.out.println("Su dni es " + dniEntero);
		entrada.close();
		
	}

	private static boolean validarNumeros(long dni) {
		String dniCadena=""+dni;
		return dniCadena.matches("[0-9]{8}") ;
	}

	private static String encontrarLetra(long dni) {
		int resultado=0;
		String dniEntero="";
		char letra;
		char[] letras = new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		resultado = (int)dni%23;
		letra=letras[resultado];
		dniEntero=dni+""+letra;
		return dniEntero;
	}
	

}	