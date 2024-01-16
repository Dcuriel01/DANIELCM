package Unidad6Ejercicios;

public class DatosCovid {
	private String nombre;
	private int edad;
	private String localidad;
	private boolean resultado;
	private int nPersonasViven;
	
	
	
	public DatosCovid(String nombre, int edad, String localidad, boolean resultado, int nPersonasViven) {
		this.nombre = nombre;
		this.edad = edad;
		this.localidad = localidad;
		this.resultado = resultado;
		this.nPersonasViven = nPersonasViven;
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
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	public int getnPersonasViven() {
		return nPersonasViven;
	}
	public void setnPersonasViven(int nPersonasViven) {
		this.nPersonasViven = nPersonasViven;
	}
	
	
	
}
