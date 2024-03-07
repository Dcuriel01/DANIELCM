package unidad9.ejemplos.comparaciones.comparator;

public class Jugador {

	private int ranking;
	private String nombre;
	private int edad;
	public Jugador(int ranking, String nombre, int edad) {
		super();
		this.ranking = ranking;
		this.nombre = nombre;
		this.edad = edad;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
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
	
	@Override
	public String toString() {
		return "Ranking=" + ranking + ", nombre=" + nombre + ", edad=" + edad;
	}
	
	
	
	
}
