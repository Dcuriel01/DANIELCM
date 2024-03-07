package unidad9.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Compañeros {

	public static void main(String[] args) {

		LinkedList<String> compañeros = new LinkedList<String>();
		for (String compañero : Arrays.asList("Mohi","Walid","Sergio","Jesus","Pablo")) {
			compañeros.add(compañero);
		}
		compañeros.add(2, "Alberto");
		Iterator iteradorCompañeros = compañeros.iterator();
		while (iteradorCompañeros.hasNext()) {
			String compañero = (String)iteradorCompañeros.next();
			System.out.println(compañero);
		}
		
		
		
	}

}
