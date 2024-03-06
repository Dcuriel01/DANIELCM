package unidad8.ejercicios.pizzas;

public class Pizza {

	private String descripcion;
	private double precio;
	
	public Pizza(String descripcion, double precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return "La pizza es de " + descripcion + " y cuesta " + precio ;
	}
	
	
	
}
