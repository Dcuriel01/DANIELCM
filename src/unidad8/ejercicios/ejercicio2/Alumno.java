package unidad8.ejercicios.ejercicio2;

public class Alumno extends Persona{

	private String codAlum;

	
	
	public Alumno() {
		super();
	}



	public Alumno(String dni, String codAlum) {
		super(dni);
		this.codAlum = codAlum;
	}
	
}
