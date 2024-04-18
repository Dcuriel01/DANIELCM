package unidad11.ejercicios.aeropuerto;

public class Aeropuertos {

	private int id;
	private String codigo;
	private String nombre;
	private String codigoGPS;
	private String pais;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoGPS() {
		return codigoGPS;
	}
	public void setCodigoGPS(String codigoGPS) {
		this.codigoGPS = codigoGPS;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "id=" + id + ", codigo=" + codigo + ", nombre: " + nombre + ", codigoGPS: " + codigoGPS
				+ ", pais: " + pais;
	}
	
	
	
}
