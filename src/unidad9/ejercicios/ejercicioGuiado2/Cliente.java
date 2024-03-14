package unidad9.ejercicios.ejercicioGuiado2;

public class Cliente {

	private String nombre;
	private String localidad;
	public Cliente(String nombre, String localidad) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if (nombre.matches("[A-Z][a-z]*")) {
			this.nombre = nombre;
		}else {
			this.nombre = "Sin nombre";
			System.out.println("Error en el nombre");
		}
		
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Datos cliente:\n"+
				"nombre: " + nombre + " localidad: " + localidad;
	}
	
	
}
