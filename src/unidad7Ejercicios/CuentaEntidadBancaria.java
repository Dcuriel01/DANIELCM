package unidad7Ejercicios;

public class CuentaEntidadBancaria {

	private  String dni;
	private String fechaNac;
	private String claveSeg;
	
	
	
	
	public CuentaEntidadBancaria(String dni, String fechaNac, String claveSeg) {
		
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.claveSeg = claveSeg;
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
	public String getClaveSeg() {
		return claveSeg;
	}
	public void setClaveSeg(String claveSeg) {
		this.claveSeg = claveSeg;
	}
	
	
	
	
}
