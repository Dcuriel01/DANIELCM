package unidad9.ejercicios.Tarea_1;

public class Pedido {

	private Articulo articulo;
	private String talla;
	private int cantidad;
	
	public Pedido(Articulo articulo, String talla, int cantidad) {
		super();
		this.articulo = articulo;
		this.talla = talla;
		this.cantidad = cantidad;
		hacerPedido();
	}
	
	public void hacerPedido() {
		int tallaInt = pasasarTallaNum();
		articulo.restarPedido(tallaInt, cantidad);
	}

	private int pasasarTallaNum() {
		int tallaInt=0;
		switch (talla) {
		case "xs":
			tallaInt=0;
			break;
		case "s":
			tallaInt=1;
			break;
		case "m":
			tallaInt=2;
			break;
		case "l":
			tallaInt=3;
			break;
		case "xl":
			tallaInt=4;

		}
		return tallaInt;
	}
	
	
	
}
