package unidad11.ejercicios.tareaI;

public enum TipoCliente {
	NORMAL("normal"),PREFERENTE("preferente");
	private final String cliente;
	
	TipoCliente(String cliente) {
		this.cliente = cliente;
		
	}

	public String getCliente() {
		return cliente;
	}
}
