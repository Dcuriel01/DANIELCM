package Unidad7Ejercicios;

public class TarjetaBancaria {

	private String numero;
	private String marca;
	private String entidad;
	private String fecha;
	private int cvv;
	
	public TarjetaBancaria(String numero, String marca, String entidad, String fecha, int cvv) {
		this.numero = numero;
		this.marca = marca;
		this.entidad = entidad;
		this.fecha = fecha;
		this.cvv = cvv;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public String imprimirDatos() {
	String texto = "El número de su tarjeta es " + numero + ", su marca es " + marca + ", su entidad bancaria " + entidad +
			", su caducidad es el "+ fecha + " y su cvv es el " + cvv;
	return texto;
	}
}
