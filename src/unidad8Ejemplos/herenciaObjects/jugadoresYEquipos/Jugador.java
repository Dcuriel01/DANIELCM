package unidad8Ejemplos.herenciaObjects.jugadoresYEquipos;

public class Jugador {

	private String nombre;
	private String apellidos;
	private String posicion;
	
	
	public Jugador(String nombre, String apellidos, String posicion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.posicion = posicion;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales=false;
		if (this==obj) {
			sonIguales=true;
		}
		if (obj instanceof Jugador) {
			Jugador OtroJugador = (Jugador) obj;
			sonIguales = this.nombre.equals(OtroJugador.getNombre())&this.apellidos.equals(OtroJugador.getApellidos())
					&this.posicion.equals(OtroJugador.getPosicion());
		}
		return sonIguales;
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

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	
	
}
