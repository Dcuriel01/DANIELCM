package unidad9.ejercicios.Tarea_1;

public class Devolucion {

	private Articulo articulo;
	private String talla;
	private int cantidad;
	
	public Devolucion(Articulo articulo, String talla, int cantidad) {
		super();
		this.articulo = articulo;
		this.talla = talla;
		this.cantidad = cantidad;
		hacerDevolucion();
	}
	
	public void hacerDevolucion() {
		int tallaInt = pasasarTallaNum();
		articulo.sumarDevolucion(tallaInt, cantidad);
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
