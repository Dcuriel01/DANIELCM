package unidad9.ejercicios.productos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgramaProductos {

	public static void main(String[] args) {

		Producto p1 = new Producto("fouad", 2);
		Producto p2 = new Producto("Raul", 4);
		Producto p3 = new Producto("Carlos", 45);
		Producto p4 = new Producto("PowerShell", 5);
		Producto p5 = new Producto("Monitor", 8);
		Producto p6 = new Producto("Hamza", 6);
		
		List<Producto> productos = new ArrayList<Producto>();
		
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		
		mostrarLista(productos);
		productos.remove(p2);
		productos.remove(p3);
		productos.add(productos.size()/2,p6);
		mostrarLista(productos);
		productos.clear();
		
	}

	private static void mostrarLista(List<Producto> productos) {
		Iterator iteradorProductos = productos.iterator();
		while (iteradorProductos.hasNext()) {
			Producto producto = (Producto)iteradorProductos.next();
			System.out.println(producto);
		}
		System.out.println("-------------------");
		
	}

}
