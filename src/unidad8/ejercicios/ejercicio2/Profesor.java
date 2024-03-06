package unidad8.ejercicios.ejercicio2;

public class Profesor extends Persona{

	private String codProf;

	public Profesor() {
		super();
	}

	public Profesor(String dni, String codProf) {
		super(dni);
		this.codProf = codProf;
	}
	
}
