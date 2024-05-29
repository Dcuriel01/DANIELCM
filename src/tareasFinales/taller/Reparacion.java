package tareasFinales.taller;

public class Reparacion {

	private String informacion;
	private Double km;
	public Reparacion(String informacion, Double km) {
		super();
		this.informacion = informacion;
		this.km = km;
	}
	public String getInformacion() {
		return informacion;
	}
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	public Double getKm() {
		return km;
	}
	public void setKm(Double km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "Reparacion \n informacion: " + informacion + " km:" + km;
	}
	
	
	
}
