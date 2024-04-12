package unidad11.ejercicios.alumnosRayuela;

public class Alumno {

	private int id;
	private String apellidos;
	private String nombre;
	private String ciclo;
	private int codigoCiclo;
	
	
	
	public Alumno(int id, String apellidos, String nombre, String ciclo) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.ciclo = ciclo;
		generarCodigoCiclo();
	}
	private void generarCodigoCiclo() {
		if (ciclo.equals("DAM")) {
			codigoCiclo=1;
		}
		if (ciclo.equals("DAW")) {
			codigoCiclo=2;
		}
		if (ciclo.equals("ASIR")) {
			codigoCiclo=3;
		}
		
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
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public int getCodigoCiclo() {
		return codigoCiclo;
	}
	public void setCodigoCiclo(int codigoCiclo) {
		this.codigoCiclo = codigoCiclo;
	}
	
	
	
	
}
