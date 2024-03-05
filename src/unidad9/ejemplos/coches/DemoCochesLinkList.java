package unidad9.ejemplos.coches;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class DemoCochesLinkList {

	public static void main(String[] args) {
		
		List<String> listaMarcas = new LinkedList<String>();
		
		for (String marca : MarcasCoches.marcas) {
			listaMarcas.add(marca);
		}
		
		
		System.out.println("LISTA MARCAS");
		Iterator iteradorMarcas = listaMarcas.iterator();
		while (iteradorMarcas.hasNext()) {
			String marca = (String)iteradorMarcas.next();
			System.out.println(marca);
		}
		
		
	}
}
