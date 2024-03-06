package unidad8.ejercicios.poemas;

public class Poema {

	private String nombre;
	private int nLineas;
	
	public Poema(String nombre, int nLineas) {
		super();
		this.nombre = nombre;
		this.nLineas = nLineas;
	}
	public String getNombre() {
		return nombre;
	}
	public int getnLineas() {
		return nLineas;
	}
	
	@Override
	public String toString() {
		return "El poema se llama: " + nombre + " y tiene " + nLineas + " lineas";
	}
	
}
