package unidad11.ejercicios.reparaciones;

public enum TipoVehiculo {

	COCHE("coche"),MOTO("moto"),CAMION("camión");

	private final String nombre;
	
	private TipoVehiculo(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}
	

}
