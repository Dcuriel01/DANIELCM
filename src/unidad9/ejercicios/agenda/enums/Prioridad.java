package unidad9.ejercicios.agenda.enums;

public enum Prioridad {
	
	MUY_URGENTE("muy urgente"),UGENTE("urgente"),NO_URGENTE("no urgente");

	private final String prioridad;
	
	Prioridad(String prioridad) {
		this.prioridad = prioridad;
		
	}

	public String getPrioridad() {
		return prioridad;
	}
	
	
}
