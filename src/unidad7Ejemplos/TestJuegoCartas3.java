package unidad7Ejemplos;

public class TestJuegoCartas3 {

	public static void main(String[] args) {
		JuegoCartas3 carta1 = new JuegoCartas3(PaloNaipes.PALO_PICAS,6);
		System.out.println("La carta 1 es " + carta1.getPuntos()+" de "
				+""
				+carta1.getPalo().getNombre());

	}

}
