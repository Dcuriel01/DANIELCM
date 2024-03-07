package unidad9.ejemplos.comparaciones.comparable;

public class Estudiantes implements Comparable<Estudiantes>{

	private String nombre;
	private int matricula;
	private int edad;
	public Estudiantes(String nombre, int matricula, int edad) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.edad = edad;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int compareTo(Estudiantes otro) {
		int comparacion=0;
		if (matricula>otro.matricula) {
			comparacion=1;
		}
		if (matricula<otro.matricula) {
			comparacion=-1;
		}
		return comparacion;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " matricula: " + matricula + " edad: " + edad ;
	}
	
	
	
}
