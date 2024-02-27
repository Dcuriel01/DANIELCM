package unidad8Ejercicios.controlCiclos;

public abstract class Actividad {

	protected String nombre;
	protected String dificultad;
	
	
	
	
	
	public Actividad(String nombre, String dificultad) {
		super();
		this.nombre = nombre;
		this.dificultad = dificultad;
	}





	public abstract void calcularNota();
	
	
	
}
