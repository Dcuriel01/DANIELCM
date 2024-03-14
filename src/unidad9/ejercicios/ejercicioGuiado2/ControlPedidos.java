package unidad9.ejercicios.ejercicioGuiado2;

import java.util.ArrayList;

public class ControlPedidos {

	public static void main(String[] args) {
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();		
		Producto platanos = new Producto("001",TiposProductos.PLATANOS);
		Producto manzanas = new Producto("002",TiposProductos.MANZANAS);
		Producto quesos = new Producto("003",TiposProductos.QUESO);
		Producto jamones = new Producto("004",TiposProductos.JAMON);
		Producto pescados = new Producto("005",TiposProductos.PESCADO);
		
		Cliente c1 = new Cliente("Sergio", "Naval");
		Cliente c2 = new Cliente("Curi","Peraleda");
		
		Pedido pedido1 = new Pedido(c1);		
		Pedido pedido2 = new Pedido(c2);
		
		pedidos.add(pedido1);
		pedidos.add(pedido2);
		
		pedido1.añadirProducto(jamones, 1);
		pedido1.añadirProducto(platanos, 5);
		pedido1.añadirProducto(pescados, 2);
		
		pedido2.añadirProducto(manzanas, 5);
		pedido2.añadirProducto(quesos, 3);
		pedido2.añadirProducto(platanos, 5);
		
		System.out.println(pedido1);
		System.out.println(pedido2);

	}

}
