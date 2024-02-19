package unidad8Ejemplos.herenciaObjects.jugadoresYEquipos;

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

		boolean equiposSonIguales = false;
		boolean jugadoresDesiguales = true;
		boolean totalmenteIguales = false;

		if (this == obj) {
			totalmenteIguales = true;
		}
		if (obj instanceof Equipo) {
			Equipo otroEquipo = (Equipo) obj;
			equiposSonIguales = this.nombre.equals(otroEquipo.getNombre())
					& this.localidad.equals(otroEquipo.getLocalidad());

			for (int i = 0; i < jugadores.length; i++) {
				for (int j = 0; j < otroEquipo.jugadores.length; j++) {
					if (jugadores[i].equals(otroEquipo.getJugadores()[j])) {
						j = otroEquipo.jugadores.length;
					}
					else if (j == otroEquipo.jugadores.length-1) {
						jugadoresDesiguales = false;
						i=jugadores.length;
					}
				}
			}

		}
		if (equiposSonIguales & jugadoresDesiguales) {
			totalmenteIguales=true;
		}
		return totalmenteIguales;
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
