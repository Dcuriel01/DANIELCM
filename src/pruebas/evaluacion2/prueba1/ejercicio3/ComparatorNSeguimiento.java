package pruebas.evaluacion2.prueba1.ejercicio3;

import java.util.Comparator;

public class ComparatorNSeguimiento implements Comparator<Externo> {
		@Override
		public int compare(Externo paquete1, Externo paquete2) {
			
			return Long.compare(paquete1.getNumSeguimiento(), paquete2.getNumSeguimiento());
		}

}
