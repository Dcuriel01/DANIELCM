package unidad9.ejemplos.coches;

import java.util.HashMap;
import java.util.Map;

public class DemoCochesMapa {

	public static void main(String[] args) {
		Map<String, Integer> cantidadesMarca = new HashMap<String, Integer>();
		
		for (String marca : MarcasCoches.marcas) {
			cantidadesMarca.put(marca, 0);
		}
		imprimirMapa(cantidadesMarca);
		System.out.println("--------");
		cantidadesMarca.put("Toyota", 3);
		cantidadesMarca.put("Mazda", 6);
		cantidadesMarca.put("Volkswagen", 4);
		imprimirMapa(cantidadesMarca);
		System.out.println("--------");
		cantidadesMarca.replace("Toyota", 12);
		// Iguales pero este más lio cantidadesMarca.replace("Toyota", cantidadesMarca.get("Opel"),12);
		imprimirMapa(cantidadesMarca);

		
		
		
	}

	private static void imprimirMapa(Map<String, Integer> cantidadesMarca) {
		System.out.println("Marcas coches --- Cantidad++");
		for (String marca : cantidadesMarca.keySet()) {
			System.out.println("Marca: " + marca + " cantidad: " + cantidadesMarca.get(marca));
		}
		
	}
	
	

}
