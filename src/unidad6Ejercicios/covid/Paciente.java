package unidad6Ejercicios.covid;

public class Paciente {
	private String nombre;
	private int edad;
	private String tlf;
	private String direccion;
	
	public Paciente(String nombre, int edad, String tlf, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.tlf = tlf;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void mostrarDatos() {
		System.out.println("Nombre: " +nombre + ", edad: " + edad + ", teléfono: " + tlf + ", dirección: " + direccion);
	}
}
