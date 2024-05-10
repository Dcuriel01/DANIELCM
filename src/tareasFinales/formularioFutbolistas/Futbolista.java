package tareasFinales.formularioFutbolistas;

public class Futbolista {
	
	private int id;
	private String nombre;
	private String apellido;
	private String equipo;
	private boolean anios18;
	private String jugadorFav;
	private String genero;
	private String pierna;
	private String posicion;
	
	public Futbolista(String nombre, String apellido, String equipo, boolean anios18, String jugadorFav, String genero,
			String pierna, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.equipo = equipo;
		this.anios18 = anios18;
		this.jugadorFav = jugadorFav;
		this.genero = genero;
		this.pierna = pierna;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEquipo() {
		return equipo;
	}

	public boolean isAnios18() {
		return anios18;
	}

	public String getJugadorFav() {
		return jugadorFav;
	}

	public String getGenero() {
		return genero;
	}

	public String getPierna() {
		return pierna;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
