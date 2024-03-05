package unidad9.ejemplos.coches;

import java.util.ArrayList;

public class DemoCoches {
	public static void main(String[] args) {
	
		imprimirMarcas(MarcasCoches.marcas);

	}

	private static void imprimirMarcas(String[] marcas) {
		System.out.println("MARCAS DE COCHES");
		for (String marca : marcas) {
			System.out.println(marca);
		}
		
	}
}
