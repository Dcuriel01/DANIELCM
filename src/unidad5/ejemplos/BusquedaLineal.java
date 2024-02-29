package unidad5.ejemplos;

public class BusquedaLineal {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 14, 10, 56, 40 };
		int posicion;
		int x = 14; // Elemento que buscamos
		posicion = buscar(arr, x);
		if (posicion == -1) {
			System.out.println("Elemento no encontrado");
		}else {
			System.out.println("El elemento se encuentra en la posicion " + (posicion+1));
		}
	}

	private static int buscar(int[] arr, int x) {
		int resultado = -1;
		boolean noEncontrado = true;
		for (int i = 0; i < arr.length & noEncontrado ; i++) {
			if (arr[i]==x) {
				resultado=i;
				noEncontrado = false;
			}
		}
		return resultado;
	}

}
