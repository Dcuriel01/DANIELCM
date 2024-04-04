package unidad11.ejercicios.donantesDivididosPorSangre;

public class Persona {

	private String nombre;
	private int edad;
	private TiposSangreDatos tipo;
	private String ficheroAsignado;
	
	public Persona(String nombre, int edad, TiposSangreDatos tipo) {
		this.nombre = nombre;
		this.edad = edad;
		this.tipo = tipo;
		ficheroAsignado = tipo.getSangre();
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " edad: " + edad + 
				" tipo de sangre: " + tipo.getSangre();
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

	public TiposSangreDatos getTipo() {
		return tipo;
	}

	public void setTipo(TiposSangreDatos tipo) {
		this.tipo = tipo;
	}

	public String getFicheroAsignado() {
		return ficheroAsignado;
	}

	public void setFicheroAsignado(String ficheroAsignado) {
		this.ficheroAsignado = ficheroAsignado;
	}
	
	
	
}
