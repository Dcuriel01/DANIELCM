package unidad9.ejercicios.ejercicioGuiado2;

import java.util.HashMap;
import java.util.Map;

public class Pedido {

	private Cliente cliente;
	Map<TiposProductos,Integer> productos;
	public Pedido(Cliente cliente) {
		super();
		this.cliente=cliente;
		productos = new HashMap<TiposProductos,Integer>();
	}
	
	public void añadirProducto(Producto producto, int cantidad) {
		productos.put(producto.getTipo(),cantidad);
	}
	
	public void borrarProducto(Producto producto) {
		productos.remove(producto.getTipo());
	}
	
	public void mostrarProductos() {
		for (TiposProductos producto : productos.keySet()) {
			System.out.println("Tipo producto: " + producto + " cantidad: " + productos.get(producto));
		}
	}
	
	@Override
	public String toString() {
		System.out.println(cliente);
		mostrarProductos();
		return "";
	}
	
	
}
