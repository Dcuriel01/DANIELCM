package unidad9.ejercicios.Tarea_1;

import java.util.HashMap;
import java.util.Map;

	

public class Articulo {
	
	public static final int CANTIDAD_ARTICULOS=4;
	private String nombre;
	private Map<Integer, Integer> cantidadesTallas;
	private int pedidosPendientes=0;
	private int pedidosRealizados=0;
	private int pedidosDevueltos=0;
	
	public Articulo(String nombre) {
		super();
		this.nombre = nombre;
		setCantidadesTallas();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Map<Integer, Integer> getCantidadesTallas() {
		return cantidadesTallas;
	}

	private void setCantidadesTallas() {
		
		cantidadesTallas = new HashMap<Integer, Integer>();
		
		cantidadesTallas.put(0,CANTIDAD_ARTICULOS);
		cantidadesTallas.put(1,CANTIDAD_ARTICULOS);
		cantidadesTallas.put(2,CANTIDAD_ARTICULOS);
		cantidadesTallas.put(3,CANTIDAD_ARTICULOS);
		cantidadesTallas.put(4,CANTIDAD_ARTICULOS);
		
	}
	
	public void restarPedido(int talla,int cantidad) {
		if (cantidadesTallas.get(talla)>=cantidad) {
			cantidadesTallas.replace(talla,cantidadesTallas.get(talla)-cantidad);
			System.out.println("Pedido confirmado");
			pedidosRealizados=pedidosRealizados+cantidad;
		}else {
			System.out.println("No hay suficientes");
			System.out.println("Solo se ha podido pedir " + (cantidadesTallas.get(talla)) + " Productos ");
			pedidosPendientes=pedidosPendientes+(cantidad-cantidadesTallas.get(talla));
			pedidosRealizados=pedidosRealizados+cantidadesTallas.get(talla);
			cantidadesTallas.replace(talla,0);
		}
	}
		public void sumarDevolucion(int talla,int cantidad) {
			cantidadesTallas.replace(talla,cantidadesTallas.get(talla)+cantidad);
			System.out.println("Pedido devuelto");
			pedidosDevueltos=pedidosDevueltos+cantidad;
	}
		
	public String mostrarPedidos() {
		return "Nombre producto: " + nombre + "\n" 
				+ " pedidos realizados " + pedidosRealizados + "\n" 
				+ " pedidos pendientes " + pedidosPendientes + "\n" 
				+ " pedidos devueltos " + pedidosDevueltos;
	}
	public String mostrarStock() {
		return " Arículo " + nombre +"\n"
				+ "Talla xs:" + cantidadesTallas.get(0)+"\n"
				+ "Talla s:" + cantidadesTallas.get(1)+"\n"
				+ "Talla m:" + cantidadesTallas.get(2)+"\n"
				+ "Talla l:" + cantidadesTallas.get(3)+"\n"
				+ "Talla xl:" + cantidadesTallas.get(4)
				;
	}
	
	
	
	
	
}
