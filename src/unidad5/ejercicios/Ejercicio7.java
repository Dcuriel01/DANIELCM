package unidad5.ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[] matriz = { 12, 34, 56, 78, 90, 45, 67, 89, 67 };
		mostrarMatriz(matriz);
		darLaVuelta(matriz);
		System.out.println();
		mostrarMatriz(matriz);

	}

	private static void mostrarMatriz(int[] matriz) {
		for (int i : matriz) {
			System.out.print(i + " ");
		}

	}

	private static void darLaVuelta(int[] matriz) {
		int i = 0;
		for (int j = matriz.length - i - 1; j > i; j--) {
			int temp = matriz[j];
			matriz[j] = matriz[i];
			matriz[i] = temp;
			i++;
		}

	}

}
