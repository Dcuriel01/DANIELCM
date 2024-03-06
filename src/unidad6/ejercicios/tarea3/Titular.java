package unidad6.ejercicios.tarea3;

public class Titular {

	private String nombre;
	private String apellidos;
	private int edad;

	public Titular(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void imprimirTitular() {
		System.out.println("Nombre: " + nombre + " " + apellidos + ", edad: " + edad);
	}

}
