package ejerciciosPropios.MMA;

public class Luchador {

	private String nombre;
	private String apellido;
	private String nacionalidad;
	private int posicion_ranking;
	public Luchador(String nombre, String apellido, String nacionalidad, int posicion_ranking) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.posicion_ranking = posicion_ranking;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getPosicion_ranking() {
		return posicion_ranking;
	}
	public void setPosicion_ranking(int posicion_ranking) {
		this.posicion_ranking = posicion_ranking;
	}
	@Override
	public String toString() {
		return "Luchador:" + nombre + " " + apellido + " \n"
				+ "Nacionalidad: " + nacionalidad + "\n" 
				+ "Posición en el ranking: " + posicion_ranking;
	}
	
	
	
	
	
	
	
}
