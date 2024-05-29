package tareasFinales.taller;

import java.util.ArrayList;

public class Garaje {

	private ArrayList<Coche> cochesReparados;

	public Garaje() {
		super();
		cochesReparados = new ArrayList<Coche>();
	}
	
	public boolean validadMatricula(String matricula) {
		String patronAntiguo = "[A-Z]-\\d{4}-[A-Z]{2}";
		String patronModerno = "[A-Z]{3}-\\d{4}";
		boolean cumple = false;
		if (matricula.matches(patronAntiguo)|matricula.matches(patronModerno)) {
			cumple = true;
		}
		return cumple;
	}
	
	public void aniadirCoche(Coche coche) {
		boolean igual=false;
		if (!cochesReparados.isEmpty()) {
			for (Coche c : cochesReparados) {
				if(c.getMatricula().equals(coche.getMatricula())){
					igual = true;
					break;
				}
			}
			if (igual) {
				System.out.println("El coche ya existe");
			}else {
				cochesReparados.add(coche);
			}
		}else {
			cochesReparados.add(coche);
		}
	}
	
	
	
}
