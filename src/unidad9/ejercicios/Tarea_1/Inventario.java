package unidad9.ejercicios.Tarea_1;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

	private Map<Integer, Articulo> articulos = new HashMap<Integer, Articulo>();;

	public Inventario() {
		super();
		setArticulos();
	}

	public Map<Integer, Articulo> getArticulos() {
		return articulos;
	}

	private void setArticulos() {
		Articulo a1 = new Articulo("Pantalon deportivo");
		Articulo a2 = new Articulo("Pantalon vaquero");
		Articulo a3 = new Articulo("Chaqueta deportiva");
		Articulo a4 = new Articulo("Chaqueta deportiva sin capucha");
		Articulo a5 = new Articulo("Jersey");
		Articulo a6 = new Articulo("Chaqueta vaquera");
		Articulo a7 = new Articulo("Zapatillas runing");
		Articulo a8 = new Articulo("Zapatos de vestir");
		Articulo a9 = new Articulo("Calcetines");
		Articulo a10 = new Articulo("Gorra");
		
		articulos.put(0, a1);
		articulos.put(1, a2);
		articulos.put(2, a3);
		articulos.put(3, a4);
		articulos.put(4, a5);
		articulos.put(5, a6);
		articulos.put(6, a7);
		articulos.put(7, a8);
		articulos.put(8, a9);
		articulos.put(9, a10);
		
	}
	
	public Articulo sacarArticulo(int id) {
		return articulos.get(id);
		
	}
	
	public void mostrarStock() {
		System.out.println("Stock");
		for (int id : articulos.keySet()) {
			System.out.println("id: " + id + " cantidad: " + articulos.get(id));
		}
	}
	public void mostrarPedidos() {
		System.out.println("Pedidos");
		for (int id : articulos.keySet()) {
			System.out.println(articulos.get(id).mostrarPedidos());
		}
	}
	
	
	
}
