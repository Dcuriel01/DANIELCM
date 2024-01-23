package unidad1.ejemplos;

import java.security.SecureRandom;

public class Pruebas2 {

	public static void main(String[] args) {
		int n1,n2,n3;
		n1=generarNumeroRandom();
		n2=generarNumeroRandom();
		n3=generarNumeroRandom();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
	private static int generarNumeroRandom() {
		SecureRandom random = new SecureRandom();
		int numAleatorio = random.nextInt(5)+1;
		return numAleatorio;
	}

}
