package Unidad7Ejercicios;

public class TarjetaCredito {

	String numero;
	String marca;
	String entidad;
	String fecha;
	String cvv;
	
	public TarjetaCredito(String numero, String marca, String entidad, String fecha, String cvv) {
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
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	public String imprimirDatos() {
	String texto = "El número de su tarjeta es " + numero + ", su marca es " + marca + ", su entidad bancaria " + entidad +
			", su caducidad es el "+ fecha + " y su cvv es el " + cvv;
	return texto;
	}
}
