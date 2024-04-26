package unidad12.ejercicios.alumnosBD;

public class Alumno {

	private int id;
	private String apellidos;
	private String nombre;
	private int codigoCiclo;
	
	
	
	public Alumno(int id, String apellidos, String nombre, int codigoCiclo) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.codigoCiclo = codigoCiclo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigoCiclo() {
		return codigoCiclo;
	}
	public void setCodigoCiclo(int codigoCiclo) {
		this.codigoCiclo = codigoCiclo;
	}
	
	
	
	
}
