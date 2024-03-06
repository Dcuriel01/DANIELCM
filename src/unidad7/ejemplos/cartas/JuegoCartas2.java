package unidad7.ejemplos.cartas;

public class JuegoCartas2 {
	
	private Palo palo;
	private int puntos;
	
	public JuegoCartas2(Palo palo, int puntos) {
		this.palo = palo;
		this.puntos = puntos;
	}

	public Palo getPalo() {
		return palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public String getNombrePalo() {
		String nombre = "";
		switch (palo) {
		case PALO_PICAS:
			nombre = "picas";
			break;
		case PALO_CORAZONES:
			nombre = "corazones";
			break;
		case PALO_TREBOLES:
			nombre = "tréboles";
			break;
		case PALO_DIAMANTES:
			nombre = "diamantes";
			break;

		default:
			System.err.println("Palo invalido");
			break;
		}
		return nombre;
	}
}
