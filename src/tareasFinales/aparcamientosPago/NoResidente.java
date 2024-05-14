package tareasFinales.aparcamientosPago;

import java.time.Duration;
import java.time.LocalTime;

public class NoResidente extends Vehiculo {
	
	static final double PRECIO_MIN=0.02;
	

	public NoResidente(String matricula) {
		super(matricula);
	}
	
	public double calcularPago() {
		double pagoTotal = 0;
		LocalTime horaSalida = LocalTime.now();
		Duration duracion = Duration.between(horaEntrada, horaSalida);
		double min = duracion.getSeconds()/60;
		pagoTotal=min*PRECIO_MIN;
		return pagoTotal;
	}
	
}
