package pruebas.evaluacion2.prueba1.ejercicio3.enumeradores;

public enum TipoUrgencia {

	URGENTE("urgente"),NO_URGENTE("no urgente"),NORMAL("casi o en fecha");
	
	private final String urgencia;
	
	TipoUrgencia(String urgencia) {
		this.urgencia = urgencia;
		
	}

	public String getUrgencia() {
		return urgencia;
	}
}
	
