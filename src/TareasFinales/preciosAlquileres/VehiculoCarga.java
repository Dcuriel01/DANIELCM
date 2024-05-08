package TareasFinales.preciosAlquileres;

public class VehiculoCarga extends VehiculoAlquiler {

	protected static final int PRECIO_POR_TONELADA = 20;
	private double pma;
	
	public VehiculoCarga(String matricula, double pma) {
		super(matricula);
		this.pma = pma;
	}
	
	@Override
	public double precioAlquiler(int dias) {
		double precio=0;
		if (dias<=0) {
			System.out.println("No puedo añadir esos dias");
		}else {
			precio = PRECIO_POR_TONELADA*pma;
		}
		return super.precioAlquiler(dias)+precio;
	}
	
}
