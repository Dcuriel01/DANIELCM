package unidad9.ejercicios.satelites;

import java.util.HashMap;
import java.util.Map;

public class Planetas extends Astros {
	
	protected double distanciaAlSol;
	protected double orbitaSol;
	private boolean satelites;
	private int contadorSatelites=0;
	private Map<Integer, Satelites> mapaSatelites;
	
	public Planetas(double radioEcuatorial, double rotacionSobreEje, double temperaturaMedia, double gravedad,
			double distanciaAlSol, double orbitaSol, boolean satelites,String nombre) {
		super(radioEcuatorial, rotacionSobreEje, temperaturaMedia, gravedad, nombre);
		this.distanciaAlSol = distanciaAlSol;
		this.orbitaSol = orbitaSol;
		this.satelites = satelites;
		if (this.satelites) {
			mapaSatelites = new HashMap<Integer, Satelites>();
		}
	}

	public double getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(double distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public double getOrbitaSol() {
		return orbitaSol;
	}

	public void setOrbitaSol(double orbitaSol) {
		this.orbitaSol = orbitaSol;
	}

	public boolean isSatelites() {
		return satelites;
	}

	public void setSatelites(boolean satelites) {
		this.satelites = satelites;
	}
	
	public void agregarSatelite(Satelites satelite) {
		mapaSatelites.put(contadorSatelites, satelite);
		contadorSatelites++;
	}

	public void mostrarInformacionPlanetas () {
		System.out.println("Astros [radioEcuatorial=" + radioEcuatorial + ", rotacionSobreEje=" + rotacionSobreEje
				+ ", temperaturaMedia=" + temperaturaMedia + ", gravedad=" + gravedad + " nombre " + nombre +
				" Planetas [distanciaAlSol=" + distanciaAlSol + ", orbitaSol=" + orbitaSol + ", satelites=" + satelites );
		for (Integer satelite : mapaSatelites.keySet()) {
			System.out.println("id:"+ satelite + " " + mapaSatelites.get(satelite));
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " Planetas [distanciaAlSol=" + distanciaAlSol + ", orbitaSol=" + orbitaSol + ", satelites=" + satelites
				+ "]";
	}
	
	
	
	
	
	

}
