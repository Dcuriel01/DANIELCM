package pruebas.evaluacion2.prueba1.ejercicio3.enumeradores;

public enum Empresas {

	NAVALEXPRESS("NavalExpress"),NAVALSEAR("NavalSear"),NAVALMAZON("Navalmazon");
	private final String empresa;
	
	Empresas(String empresa) {
		this.empresa = empresa;
		
	}

	public String getEmpresa() {
		return empresa;
	}
}
