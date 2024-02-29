package unidad5.ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		int []matriz = {1,3,5,6,7,90,87,23,2};
		
		System.out.println("Primer número "+matriz[0]);
		System.out.println("Último número "+matriz[matriz.length-1]);
		
		for (int i = matriz.length - 1; i > 0; i--) {
			System.out.print(matriz[i] + " ");
		}
	}

}
