package unidad6.ejercicios.tarea4;

import java.security.SecureRandom;

public class Generador {

	public static SecureRandom random = new SecureRandom();
	
	
	public static String gernerarNumeros() {
		String tlf;
		int parte1 = 600 + random.nextInt(100);
		int parte2 = random.nextInt(100);
		int parte3 = random.nextInt(100);
		int parte4 = random.nextInt(100);
		if (parte2<10) {
			tlf = parte1 + "-0" + parte2 + "-" + parte3 + "-" + parte4;
		}else if (parte3<10) {
			tlf = parte1 + "-" + parte2 + "-0" + parte3 + "-" + parte4;
		}else if (parte4<10) {
			tlf = parte1 + "-" + parte2 + "-" + parte3 + "-0" + parte4;
		}else {
			tlf = parte1 + "-" + parte2 + "-" + parte3 + "-" + parte4;
		}
		return tlf;
	}
	public static int generarTiempo() {
		int seg = random.nextInt(1000);
		return seg;
	}
	public static boolean generarBoolean(){
		boolean resultado = random.nextBoolean();
		
		return resultado;
	}
	public static int generarFranja() {
		int franja = random.nextInt(3)+1;
		return franja;
	}
}
