package unidad5Ejemplos;

public class Arrays {

	public static void main(String[] args) {

		final int TAM_EDADES = 10; // Se puede usar sustituyendo al length
		int[] edades; // Declaramos el tipo de array
		edades = new int[TAM_EDADES]; // Le damos un espacio al array. Ambos se pueden hacer en la misma linea
		edades[0] = 12;
		edades[1] = 6;
		edades[2] = 34;
		edades[3] = 56;
		edades[5] = 19;
		edades[6] = 25;
		edades[9] = 42;

		int contadorMayorEdad = 0;

		System.out.println("-----ORDEN ASCENDENTE-----");

		for (int i = 0; i < edades.length; i++) {
			if (edades[i] != 0) {
				System.out.println("Posicion "+ (i+1) + "= " +edades[i]);
				if (edades[i] >= 18) {
					contadorMayorEdad++;
				}
				
			}
		}
		System.out.println("Hay " + contadorMayorEdad + " personas mayores de edad");
		/*
		 * System.out.println("-----ORDEN DESCENDENTE-----");
		 * 
		 * for (int j = (edades.length-1) ; j >= 0 ; j--) { if (edades[j]!=0) {
		 * System.out.println("Posicion "+ (j+1) + "= " +edades[j]);// Más uno para
		 * evitar la posición cero } }
		 */
	}

}
