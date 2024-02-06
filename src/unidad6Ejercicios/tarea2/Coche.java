package unidad6Ejercicios.tarea2;

public class Coche {

	private Motor motor;
	private String marca;
	private String modelo;
	private double precioAcumuladoAveria;
	public Coche(String marca, String modelo, int cv) {
		this.marca = marca;
		this.modelo = modelo;
		motor = new Motor(cv);
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
