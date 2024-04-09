package unidad11.ejercicios.tareaI;

public enum TipoEmpresa {

	ANONIMA("Sociedad Anónima"),LIMITADA("Sociedad Limitada"),COLECTIVA("Sociedad Colectiva"),COMANDITARIAS("Sociedad Comanditaria")
	,COOPERATIVAS("Sociedad Coperativa"),ASOCIACIONES("Asociación");
	private final String empresa;
	
	TipoEmpresa(String empresa) {
		this.empresa = empresa;
		
	}

	public String getEmpresa() {
		return empresa;
	}
	
}
