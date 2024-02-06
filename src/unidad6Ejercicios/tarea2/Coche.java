package unidad6Ejercicios.tarea2;

public class Coche {

	private Motor motor;
	private String marca;
	private String modelo;
	private double precioAcumuladoAveria;
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Motor getMotor() {
		return motor;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getPrecioAcumuladoAveria() {
		return precioAcumuladoAveria;
	}
	public void acumularAveria(double averia) {
		precioAcumuladoAveria = precioAcumuladoAveria+averia;
	}
	
	
	
}
