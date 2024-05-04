package ejerciciosPropios.mundialF1;

import java.util.Comparator;

public class OrdenarMundial implements Comparator<Piloto> {

	@Override
	public int compare(Piloto piloto1, Piloto piloto2) {
		
		return Integer.compare(piloto2.getPts(), piloto1.getPts());
	}

}
