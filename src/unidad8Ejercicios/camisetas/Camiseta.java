package unidad8Ejercicios.camisetas;

public class Camiseta {
	
	private int nPedido;
	private Tallaje talla;
	private String color;
	private double precio;
	
	public int getnPedido() {
		return nPedido;
	}
	public void setnPedido(int nPedido) {
		this.nPedido = nPedido;
	}
	public Tallaje getTalla() {
		return talla;
	}
	public void setTalla(Tallaje talla) {
		if (talla == Tallaje.XXL| talla == Tallaje.XXXL) {
			precio = 22.99;
		}else {
			precio = 9.99;
		}
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		
		return "La camiseta es talla " + talla + " de color " + color + " y cuesta " + precio + " euros";
	}

}
