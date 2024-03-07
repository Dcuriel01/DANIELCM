package unidad9.ejemplos.comparaciones.comparator;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Jugador> {

	
	
	@Override
	public int compare(Jugador jugador1, Jugador jugador2) {
		
		return Integer.compare(jugador1.getEdad(), jugador2.getEdad());
	}

}
