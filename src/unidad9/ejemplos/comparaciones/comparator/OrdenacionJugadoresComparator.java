package unidad9.ejemplos.comparaciones.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacionJugadoresComparator {

	public static void main(String[] args) {

		List<Jugador> equipo = new ArrayList<Jugador>();
		
		Jugador j1 = new Jugador(100, "Rafa", 42);
		Jugador j2 = new Jugador(60, "Pedro", 22);
		Jugador j3 = new Jugador(30, "Federer", 32);
		
		equipo.add(j1);
		equipo.add(j2);
		equipo.add(j3);
		
		System.out.println(equipo);
		System.out.println("Ordenado por ranking");
		ComparatorRankig comparadorRanking = new ComparatorRankig();
		Collections.sort(equipo,comparadorRanking);
		System.out.println(equipo);
		System.out.println("Ordenado por edad");
		ComparatorEdad comparadorEdad = new ComparatorEdad();
		Collections.sort(equipo,comparadorEdad);
		System.out.println(equipo);
		for (Jugador jugador : equipo) {
			System.out.println(jugador.getEdad());
			
		}
		
		
	}


}
