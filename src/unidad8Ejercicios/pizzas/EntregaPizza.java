package unidad8Ejercicios.pizzas;

public class EntregaPizza extends Pizza{

	private double precioEntrega;
	private String direccion;
	
	public EntregaPizza(String descripcion, double precio, String direccion) {
		super(descripcion, precio);
		this.direccion = direccion;
		if (precio>15) {
			precioEntrega=3;
		}else {
			precioEntrega=5;
		}
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" La dirección a la cuál se va a entregar es " + direccion + " y la tarifa de entrega es de " +  precioEntrega;
	}
	
	
	
	
	
	
}
