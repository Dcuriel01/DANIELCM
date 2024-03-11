package unidad9.ejercicios.satelites;

public abstract class Astros {
	
	protected double radioEcuatorial;
	protected double rotacionSobreEje;
	protected double temperaturaMedia;
	protected double gravedad;
	protected String nombre;

	
	public Astros(double radioEcuatorial, double rotacionSobreEje,
			double temperaturaMedia, double gravedad,String nombre) {
		this.radioEcuatorial = radioEcuatorial;
		this.rotacionSobreEje = rotacionSobreEje;
		this.temperaturaMedia = temperaturaMedia;
		this.gravedad = gravedad;
		this.nombre = nombre;
	}
	public double getRadioEcuatorial() {
		return radioEcuatorial;
	}
	public void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}
	public double getRotacionSobreEje() {
		return rotacionSobreEje;
	}
	public void setRotacionSobreEje(double rotacionSobreEje) {
		this.rotacionSobreEje = rotacionSobreEje;
	}
	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}
	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}
	public double getGravedad() {
		return gravedad;
	}
	public void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}
	@Override
	public String toString() {
		return "Astros [radioEcuatorial=" + radioEcuatorial + ", rotacionSobreEje=" + rotacionSobreEje
				+ ", temperaturaMedia=" + temperaturaMedia + ", gravedad=" + gravedad + " nombre " + nombre;
	}
	
	
	

}
