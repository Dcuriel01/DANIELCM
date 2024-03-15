package pruebas.evaluacion2.prueba1.ejercicio3.enumeradores;

public enum Zonas {

	CAC("Caceres"),COR("Coria"),NAV("Navalmoral de la Mata"),PLA("Plasencia"),MER("Merida")
	,BAD("Badajoz"),DBN("Don Benito"),ZAF("Zafra"),VACIO("zona no reconocida");
	
	private final String zona;
	
	Zonas(String zona) {
		this.zona = zona;
		
	}

	public String getZona() {
		return zona;
	}
}
