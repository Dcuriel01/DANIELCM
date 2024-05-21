package ejerciciosPropios.cantantes;

public class Cantante {

	private String nombre;
	private String apellido;
	private int oyentes_spotify;
	private String cancion_mas_famosa;
	private String nacionalidad;

	public Cantante(String nombre, String apellido, int oyentes_mensuales, String cancion_mas_famosa,
			String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.oyentes_spotify = oyentes_mensuales;
		this.cancion_mas_famosa = cancion_mas_famosa;
		this.nacionalidad = nacionalidad;
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
	public int getOyentes_mensuales() {
		return oyentes_spotify;
	}
	public void setOyentes_mensuales(int oyentes_mensuales) {
		this.oyentes_spotify = oyentes_mensuales;
	}
	public String getCancion_mas_famosa() {
		return cancion_mas_famosa;
	}
	public void setCancion_mas_famosa(String cancion_mas_famosas) {
		this.cancion_mas_famosa = cancion_mas_famosas;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return "Cantante nombre=" + nombre + " apellido=" + apellido + " oyentes mensuales=" + oyentes_spotify
				+ " cancion mas famosas=" + cancion_mas_famosa + " nacionalidad=" + nacionalidad;
	}
	
	
	
	
}
