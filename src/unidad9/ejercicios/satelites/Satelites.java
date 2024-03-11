package unidad9.ejercicios.satelites;

public class Satelites extends Astros {

	private double distanciaAlPlaneta;
	private double orbitaPlaneta;
	private Planetas planeta;
	
	public Satelites(double radioEcuatorial, double rotacionSobreEje, double temperaturaMedia, double gravedad,
			double distanciaAlPlaneta, double orbitaPlaneta, Planetas planeta,String nombre) {
		super(radioEcuatorial, rotacionSobreEje, temperaturaMedia, gravedad,nombre);
		this.distanciaAlPlaneta = distanciaAlPlaneta;
		this.orbitaPlaneta = orbitaPlaneta;
		this.planeta = planeta;
	}

	public double getDistanciaAlPlaneta() {
		return distanciaAlPlaneta;
	}

	public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
		this.distanciaAlPlaneta = distanciaAlPlaneta;
	}

	public double getOrbitaPlaneta() {
		return orbitaPlaneta;
	}

	public void setOrbitaPlaneta(double orbitaPlaneta) {
		this.orbitaPlaneta = orbitaPlaneta;
	}

	public Planetas getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planetas planeta) {
		this.planeta = planeta;
	}

	@Override
	public String toString() {
		return super.toString() + " Satelites [distanciaAlPlaneta=" + distanciaAlPlaneta + ", orbitaPlaneta=" + orbitaPlaneta + ", planeta="
				+ planeta + "]";
	}
	
	
	
}
