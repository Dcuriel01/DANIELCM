package ejerciciosPropios.mundialF1;

public class Piloto {

	private String nombre;
	private String apellidos;
	private String abreviatura;
	private String equipo;
	private String pais_nacimiento;
	private int pts;
	private int nGeneradores; 
	private int ptsEnCarrera;

	
	public Piloto(String nombre, String apellidos, String abreviatura, String equipo, String pais_nacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.abreviatura = abreviatura;
		this.equipo = equipo;
		this.pais_nacimiento = pais_nacimiento;
		pts = 0;
		ptsEnCarrera =0;
		nGeneradores =0;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getPais_nacimiento() {
		return pais_nacimiento;
	}
	public void setPais_nacimiento(String pais_nacimiento) {
		this.pais_nacimiento = pais_nacimiento;
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts = this.pts + pts;
	}
	public int getnGeneradores() {
		return nGeneradores;
	}
	
	public int getPtsEnCarrera() {
		return ptsEnCarrera;
	}
	public void setPtsEnCarrera(int ptsEnCarrera) {
		this.ptsEnCarrera = ptsEnCarrera;
	}
	public void setnGeneradores() {
		if (equipo.equals("Red Bull Racing")|nombre.equals("Fernando")) {
			nGeneradores=3;
		}else if (equipo.equals("Mercedes")|equipo.equals("Ferrari")|equipo.equals("McLaren")) {
			nGeneradores=2;
		}else {
			nGeneradores = 1;
		}
	}
	

	
	
	
}
