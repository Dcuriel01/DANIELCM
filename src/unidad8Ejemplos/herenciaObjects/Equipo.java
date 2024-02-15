package unidad8Ejemplos.herenciaObjects;

public class Equipo {

	private Jugador[] jugadores;
	private String nombre;
	private String localidad;
	
	
	public Equipo(Jugador[] jugadores, String nombre, String localidad) {
		super();
		this.jugadores = jugadores;
		this.nombre = nombre;
		this.localidad = localidad;
	}


	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales=false;
		if (this==obj) {
			sonIguales=true;
		}
		if (obj instanceof Equipo) {
			Equipo otroEquipo = (Equipo) obj;
			sonIguales = this.nombre.equals(otroEquipo.getNombre())&this.localidad.equals(otroEquipo.getLocalidad());
		}
		return sonIguales;
	}


	public Jugador[] getJugadores() {
		return jugadores;
	}


	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
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
	
	
}
