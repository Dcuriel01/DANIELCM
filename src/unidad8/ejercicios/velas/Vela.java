package unidad8.ejercicios.velas;

public class Vela {

	private String color;
	protected int altura;
	protected double precio;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
		this.precio = altura*2;
	}

	public double getPrecio() {
		return precio;
	}
	
	
	
	
}
