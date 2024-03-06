package unidad9.ejemplos.conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparacionSet {

	public static void main(String[] args) {

		Set<String> frutasAlmacen = new HashSet<String>();//orden aleatorio
		Set<String> frutasTienda = new LinkedHashSet<String>();//orden en el que se introduce
		Set<String> frutasCampo = new TreeSet<String>();//orden alfabético
		
		for (String fruta : Arrays.asList("mango","manzana","platano","naranja","mandarina","kiwi")) {
			frutasAlmacen.add(fruta);
			frutasTienda.add(fruta);
			frutasCampo.add(fruta);
		}
		System.out.println("Orden hashset:"+frutasAlmacen);
		System.out.println("Orden linkedhashset:"+frutasTienda);
		System.out.println("Orden treeset:"+frutasCampo);
		
		Set<Integer> numero = new HashSet<Integer>();
		long tiempoInicio=System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numero.add(i);
		}
		long tiempoFinal=System.nanoTime();
		System.out.println("Tiempo total de la prueba en segudos: " +(tiempoFinal-tiempoInicio));
		
		
		numero = new LinkedHashSet<Integer>();
		tiempoInicio=System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numero.add(i);
		}
		tiempoFinal=System.nanoTime();
		System.out.println("Tiempo total de la prueba en segudos: " +(tiempoFinal-tiempoInicio));
		
		
		numero = new TreeSet<Integer>();
		tiempoInicio=System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numero.add(i);
		}
		tiempoFinal=System.nanoTime();
		System.out.println("Tiempo total de la prueba en segudos: " +(tiempoFinal-tiempoInicio));
		
		
		
	}

}
