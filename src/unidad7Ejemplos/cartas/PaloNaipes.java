package unidad7Ejemplos.cartas;

public enum PaloNaipes {

	PALO_PICAS("picas"), PALO_CORAZONES("corazones"), PALO_TREBOLES("treboles"), PALO_DIAMANTES("diamantes");
	
	private final String nombre;
	
	private PaloNaipes(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}
	

}
