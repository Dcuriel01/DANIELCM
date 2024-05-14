package tareasFinales.aparcamientosPago;

import java.time.Duration;
import java.time.LocalTime;

public class Residente extends Vehiculo{
	
	static final double PRECIO_MIN=0.002;
	private double precioAcumulado;
	private double tiempoMin;
	
	public Residente(String matricula) {
		super(matricula);
	}
	
	public void calcularPago() {
		double pagoTotal = 0;
		LocalTime horaSalida = LocalTime.now();
		Duration duracion = Duration.between(horaEntrada, horaSalida);
		double min = duracion.getSeconds()/60;
		pagoTotal=min*PRECIO_MIN;
		tiempoMin=tiempoMin+min;
		precioAcumulado = precioAcumulado+ pagoTotal;
	}

	public double getPrecioAcumulado() {
		return precioAcumulado;
	}

	public void setPrecioAcumulado(double precioAcumulado) {
		this.precioAcumulado = precioAcumulado;
	}

	public double getTiempoMin() {
		return tiempoMin;
	}

	public void setTiempoMin(double tiempoMin) {
		this.tiempoMin = tiempoMin;
	}
	
	
	
}
