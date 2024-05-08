package unidad13.gestionVehiculos;

public class Camion extends VehiculoCarga {
	
	public static final int PRECIO_FIJO_CAM = 40;

	public Camion(String matricula, double pma) {
		super(matricula, pma);
	}
	
	@Override
	public double precioAlquiler(int dias) {
		double precio=0;
		if (dias<=0) {
			System.out.println("No puedo añadir esos dias");
		}else {
			precio = PRECIO_FIJO_CAM;
		}
		return super.precioAlquiler(dias)+precio;
	}
}
