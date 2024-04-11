package unidad11.ejercicios.reparaciones;

public enum TipoVehiculo {

	COCHE("Coche"),MOTO("Moto"),CAMION("Camión");

	private final String nombre;
	
	private TipoVehiculo(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}
	

}
