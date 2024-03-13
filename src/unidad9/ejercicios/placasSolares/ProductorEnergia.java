package unidad9.ejercicios.placasSolares;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class ProductorEnergia {

	protected String id;
	protected LocalDate ultimaRevision;
	protected double cantidadGenerada;
	protected double eficicencia;
	
	
	public ProductorEnergia(String id, LocalDate ultimaRevision) {
		super();
		this.id = id;
		this.ultimaRevision = ultimaRevision;
	}

	public abstract void obtenerSimulacionEnergia();
	
	public void tiempoUltimaRevision() {
		System.out.println("Han pasado " + ChronoUnit.DAYS.between(ultimaRevision, LocalDate.now()) + " dias de la última revisión");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getUltimaRevision() {
		return ultimaRevision;
	}

	public void setUltimaRevision(LocalDate ultimaRevision) {
		this.ultimaRevision = ultimaRevision;
	}

	public double getCantidadGenerada() {
		return cantidadGenerada;
	}

	public void setCantidadGenerada(double cantidadGenerada) {
		this.cantidadGenerada = cantidadGenerada;
	}

	public double getEficicencia() {
		return eficicencia;
	}

	public void setEficicencia(double eficicencia) {
		this.eficicencia = eficicencia;
	}
	
	@Override
	public String toString() {
		return "Id generador " + id + " dia ultima revison: " + ultimaRevision + " cantidad generada: " + cantidadGenerada + 
				" eficiencia: " + eficicencia;
	}
}
