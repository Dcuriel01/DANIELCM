package unidad6.ejercicios.tarea2;

public class Coche {

	private Motor motor;
	private String marca;
	private String modelo;
	private double precioAcumuladoAveria;
	private boolean garaje = false;
	public Coche(String marca, String modelo, int cv) {
		this.marca = marca;
		this.modelo = modelo;
		motor = new Motor(cv);
	}
	
	
	
	public boolean isGaraje() {
		return garaje;
	}
	
	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
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
