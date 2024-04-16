package unidad11.ejercicios.precipitaciones;

public class Mes {
	
	private String territoio;
	private String anio;
	private String mes;
	private double valor;
	
	public Mes(String territoio, String anio, String mes, double valor) {
		super();
		this.territoio = territoio;
		this.anio = anio;
		this.mes = mes;
		this.valor = valor;
	}
	
	
	public String getTerritoio() {
		return territoio;
	}
	public void setTerritoio(String territoio) {
		this.territoio = territoio;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
