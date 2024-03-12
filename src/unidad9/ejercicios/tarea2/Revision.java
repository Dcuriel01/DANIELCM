package unidad9.ejercicios.tarea2;

import java.time.LocalDate;

public class Revision {

	private String veterinaria;
	private LocalDate fecha;
	private boolean cuidadoMedico;
	
	public Revision(String veterinaria, LocalDate fecha, boolean cuidadoMedico) {
		super();
		this.veterinaria = veterinaria;
		this.fecha = fecha;
		this.cuidadoMedico = cuidadoMedico;
	}
	
	public String getVeterinaria() {
		return veterinaria;
	}
	public void setVeterinaria(String veterinaria) {
		this.veterinaria = veterinaria;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public boolean isCuidadoMedico() {
		return cuidadoMedico;
	}
	public void setCuidadoMedico(boolean cuidadoMedico) {
		this.cuidadoMedico = cuidadoMedico;
	}
	
	@Override
	public String toString() {
		String mensaje;
		if (cuidadoMedico) {
			mensaje= "La revisión fue realizada por " + veterinaria + " el dia " + fecha + " y no recibio atención médica";
		}else {
			mensaje= "La revisión fue realizada por " + veterinaria + " el dia " + fecha + " y recibio atención médica";
		}
		return mensaje;
	}
	
	
}
