package ejerciciosPropios.futbolistas;

public class Futbolista {

	private String nombre;
	private String apellido;
	private String liga;
	private String equipo;
	private int dorsal;
	private String posicion;
	public Futbolista(String nombre, String apellido, String liga, String equipo, int dorsal, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.liga = liga;
		this.equipo = equipo;
		this.dorsal = dorsal;
		this.posicion = posicion;
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
	public String getLiga() {
		return liga;
	}
	public void setLiga(String liga) {
		this.liga = liga;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	
	
}
