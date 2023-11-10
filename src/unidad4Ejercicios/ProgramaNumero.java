package unidad4Ejercicios;

public class ProgramaNumero {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 9;
		mostrarNumeros(n1, n2);
		mostrarDobleNumero(n1, n2);
		mostrar5VecesNumero (n1,n2);
		mostrarCuadradoNumero(n1,n2);

	}
	
	private static void mostrarNumeros(int n1, int n2) {
		System.out.println("El número 1 es = " + n1 + " y el 2 es = " + n2);

	}

	private static void mostrarDobleNumero(int n1, int n2) {
		n1 = n1 * 2;
		n2 = n2 * 2;
		System.out.println("El doble del primero es = " + n1 + " y el del segundo es = " + n2);
	}
	
	private static void mostrar5VecesNumero(int n1, int n2) {
		n1 = n1*5;
		n2 = n2*5;
		System.out.println("El primero 5 veces es = " + n1 + " y el del segundo es = " + n2);
	}
	
	private static void mostrarCuadradoNumero(int n1, int n2) {
		n1 = n1*n1;
		n2 = n2*n2;
		System.out.println("El cuadrado del  primero veces es = " + n1 + " y el del segundo es = " + n2);
		
	}

}
