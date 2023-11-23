package unidad5Ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] matriz = { 1, 6, 10, 47, 38, 96, 103, 2, 7 };
		int nMin = 0;
		int nMax = 0;
		mostrarMatriz(matriz);
		nMin = encontrarMinimo(matriz);
		nMax = encontraMaximo(matriz);
		System.out.println("\nEl número más pequeño de la matriz es: " + nMin);
		System.out.println("El número más grande de la matriz es: " + nMax);
	}

	private static void mostrarMatriz(int[] matriz) {
		for (int i : matriz) {
			System.out.print(i + " ");
		}
		
	}

	private static int encontrarMinimo(int[] matriz) {
		int nMin = matriz[1];
		for (int i = 0; i < matriz.length - 1; i++) {
			if (nMin > matriz[i]) {
				nMin = matriz[i];
			}
		}
		return nMin;
	}

	private static int encontraMaximo(int[] matriz) {
		int nMax = matriz[1];
		for (int i = 0; i < matriz.length - 1; i++) {
			if (nMax < matriz[i]) {
				nMax = matriz[i];
			}
		}
		return nMax;
	
	}
}
