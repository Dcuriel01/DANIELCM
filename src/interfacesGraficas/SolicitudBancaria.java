package interfacesGraficas;

public class SolicitudBancaria {

	private String dni;
	private String fechaNac;
	private String codSeguridad;
	
	
	
	
	public SolicitudBancaria(String dni, String fechaNac, String codSeguridad) {
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.codSeguridad = codSeguridad;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getCodSeguridad() {
		return codSeguridad;
	}
	public void setCodSeguridad(String codSeguridad) {
		this.codSeguridad = codSeguridad;
	}
	
	
}
