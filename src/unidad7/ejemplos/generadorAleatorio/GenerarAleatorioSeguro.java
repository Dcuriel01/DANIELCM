package unidad7.ejemplos.generadorAleatorio;

import java.security.SecureRandom;

public class GenerarAleatorioSeguro {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		int numAleatorio = random.nextInt(1);
		System.out.println(numAleatorio);

	}

}
