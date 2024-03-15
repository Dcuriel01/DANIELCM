package pruebas.evaluacion2.prueba1.ejercicio1;

public enum Marcas {
	
	Dell("Dell"),CISCO("Cisco"),HP("HP");
	
private final String marca;
	
	Marcas(String marca) {
		this.marca = marca;
		
	}

	public String getUrgencia() {
		return marca;
	}

}
