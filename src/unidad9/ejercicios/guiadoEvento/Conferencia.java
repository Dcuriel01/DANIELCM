package unidad9.ejercicios.guiadoEvento;

public class Conferencia extends Evento {

	private String tema;
	
	public Conferencia(String nombre, String fecha, int duracion,String tema) {
		super(nombre, fecha, duracion);
		this.tema=tema;
	}
	
	
	

}
