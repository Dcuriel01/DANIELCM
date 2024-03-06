package unidad8.ejercicios.ejercicioCaballos;

public class Caballo {

	private String nombre;
	private String color;
	private int anioNac;
	
	public Caballo(String nombre, String color, int anioNac) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.anioNac = anioNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnioNac() {
		return anioNac;
	}

	public void setAnioNac(int anioNac) {
		this.anioNac = anioNac;
	}
	
	@Override
	public String toString() {
		
		return "El caballo se llama: " + nombre + " es de color " + color + " y nacio en el año " + anioNac;
	}
	
}
