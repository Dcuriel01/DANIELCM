package unidad13.gestionVehiculos;

public class VehiculoAlquiler {

	protected static final int PRECIO_POR_DIA = 50;
	private String matricula;
	
	public VehiculoAlquiler(String matricula) {
		super();
		this.matricula = matricula;
	}
	
	public double precioAlquiler(int dias) {
		double precio=0;
		if (dias<=0) {
			System.out.println("No puedo añadir esos dias");
		}else {
			precio = PRECIO_POR_DIA*dias;
		}
		return precio;
	}

	public String getMatricula() {
		return matricula;
	}
	
	
	
	
}
