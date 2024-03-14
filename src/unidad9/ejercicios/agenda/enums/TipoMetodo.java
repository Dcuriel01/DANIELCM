package unidad9.ejercicios.agenda.enums;

public enum TipoMetodo {

	CORREO("Correo electronico"),MENSAJE("Mensaje de texto"),NOTIFICACION("Notificacion");

	private final String tipo;
	
	TipoMetodo(String tipo) {
		this.tipo = tipo;
		
	}

	public String getTipo() {
		return tipo;
	}
}
