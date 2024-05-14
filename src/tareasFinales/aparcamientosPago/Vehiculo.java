package tareasFinales.aparcamientosPago;

import java.time.LocalTime;

public class Vehiculo {

	private String matricula;
	protected LocalTime horaEntrada;

	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
		horaEntrada = LocalTime.now();
	}

	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}


	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	
	
	
	
}
