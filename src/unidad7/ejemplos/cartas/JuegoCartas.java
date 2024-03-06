package unidad7.ejemplos.cartas;

public class JuegoCartas {
	
	public static final int PALO_PICAS=1,PALO_CORAZONES=2,PALO_TREBOLES=3,PALO_DIAMANTES=4;
	private int palo;
	private int puntos;
	
	
	public JuegoCartas(int palo, int puntos) {
		this.palo = palo;
		this.puntos = puntos;
	}
	


	public int getPalo() {
		return palo;
	}



	public void setPalo(int palo) {
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
