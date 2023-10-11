package Unidad2Ejemplos;

public class Conversiones {

	public static void main(String[] args) {
		
		int numeroEntero = 0;
		float numeroFloat = 34.5678f;
		
		System.out.println("Número entero:" + numeroEntero);
		
		numeroEntero = (int)numeroFloat ;
		
		System.out.println("Número float:" + numeroFloat);
		System.out.println("Número entero:" + numeroEntero);
		
	}

}
