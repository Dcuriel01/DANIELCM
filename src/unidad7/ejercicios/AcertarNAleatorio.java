package unidad7.ejercicios;

import java.security.SecureRandom;
import java.util.Scanner;

public class AcertarNAleatorio {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		Scanner sc = new Scanner(System.in);
		final int NUMERO_MAX=200;
		int nBuscado = random.nextInt(NUMERO_MAX)+1;
		int nIntroducido;
		int contador = 5;
		boolean salir = false;
		do {
			System.out.println("Introduzca un número del 1 al "+ NUMERO_MAX +". Tiene " + contador + " intentos para encontrarlo");
			nIntroducido = sc.nextInt();
			if (nIntroducido==nBuscado) {
				System.out.println("Enhorabuena ha acertado el número buscado: " + nBuscado);
				salir = true;
			}else {
				if (nIntroducido>nBuscado) {
					System.out.println("Error ese no es el número buscado. El número buscado es más pequeño");
					contador--;
				}else {
					System.out.println("Error ese no es el número buscado. El número buscado es más grande");
					contador--;
				}
			}
			if (contador==0) {
				System.out.println("Se han acabado las oportunidades, lo siento");
				System.out.println("El número que estabamos buscando era el " + nBuscado);
				salir = true;
			}
		} while (!salir);

	}

}
