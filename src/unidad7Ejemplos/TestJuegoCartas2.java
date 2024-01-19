package unidad7Ejemplos;

public class TestJuegoCartas2 {

	public static void main(String[] args) {
		JuegoCartas2 carta1 = new JuegoCartas2(Palo.PALO_CORAZONES,4);
		System.out.println("La carta 1 es " + carta1.getPuntos()+" de "
				+""
				+carta1.getNombrePalo());

	}

}
