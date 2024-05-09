package tareasFinales.preciosAlquileres;

public class VehiculoPasajeros extends VehiculoAlquiler {

	protected static final double PRECIO_POR_DIA_Y_PLAZA = 1.5;
	private int plazas;
	
	public VehiculoPasajeros(String matricula, int plazas) {
		super(matricula);
		this.plazas = plazas;
	}
	
	@Override
	public double precioAlquiler(int dias) {
		double precio=0;
		if (dias<=0) {
			System.out.println("No puedo añadir esos dias");
		}else {
			precio = (PRECIO_POR_DIA_Y_PLAZA*plazas)*dias;
		}
		return super.precioAlquiler(dias)+precio;
	}

	public int getPlazas() {
		return plazas;
	}
	
	
	
}
