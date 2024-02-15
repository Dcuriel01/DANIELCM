package unidad8Ejemplos.herenciaObjects;

public class Persona {

	private int id;
	private String nombre;
	private String localidad;
	private static int contador=0;
	
	public Persona(String nombre) {
		contador++;
		this.id = contador;
		this.nombre = nombre;
	}
	
	
	// Con este metodo sobrescrbimos el metodo equals para poder comparar los obj de la manera que nos interesa
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales=false;
		if (this==obj) {
			sonIguales=true;
		}
		if (obj instanceof Persona) {
			Persona laOtraPersona = (Persona) obj;
			sonIguales = this.nombre.equals(laOtraPersona.getNombre())&this.localidad.equals(laOtraPersona.localidad);
		}
		return sonIguales;
	}
	
	
	@Override
	public String toString() {

		return this.id+"-"+this.nombre+"-"+this.localidad;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Persona.contador = contador;
	}
}
