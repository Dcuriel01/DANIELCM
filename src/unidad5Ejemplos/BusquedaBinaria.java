package unidad5Ejemplos;

public class BusquedaBinaria {

	public static void main(String[] args) {

		int arr[] = { 3, 11, 22, 34, 49, 51, 64, 78, 86, 90 };
		int elementoBuscado = 22;
		int resultado = -1;

		System.out.print("Array: ");
		imprimirArray(arr);
		System.out.println();
		System.out.println("Elemento a buscar = " + elementoBuscado);
		resultado = buscarBinario(arr, elementoBuscado);
		if (resultado==-1) {
			System.out.println("El elemento no esta en el array");
		}else {
			System.out.println("El elemento esta en la posición " + (resultado+1));
		}

	}

	private static int buscarBinario(int[] arr, int elementoBuscado) {
		int posicion = -1;
		int izquierda = 0;
		int derecha = arr.length - 1;
		int medio = -1;
		boolean noEncontrado = true;
		while (izquierda <= derecha & noEncontrado) {
			medio = izquierda + (derecha - izquierda) / 2;

			if (arr[medio] == elementoBuscado) {
				noEncontrado=false;
				posicion=medio;
			}
			if (arr[medio] < elementoBuscado) {
				izquierda = medio+1;
			}else {
				derecha=medio-1;
			}
			
		}

		return posicion;
	}

	private static void imprimirArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	/*
	 * private static void mostarArray(int[] arr) {
	 * 
	 * 
	 * for (int elemento : arr) { // Bucle FOREACH para mostar array de otra forma
	 * System.out.print(elemento + " "); }
	 * 
	 * }
	 */

}
