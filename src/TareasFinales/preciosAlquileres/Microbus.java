package TareasFinales.preciosAlquileres;

public class Microbus extends VehiculoPasajeros {
	
	public static final int PRECIO_POR_PLAZA = 2;
	
	public Microbus(String matricula, int plazas) {
		super(matricula, plazas);
	}
	
	@Override
	public double precioAlquiler(int dias) {
		double precio=0;
		if (dias<=0) {
			System.out.println("No puedo añadir esos dias");
		}else {
			precio = PRECIO_POR_PLAZA*getPlazas();
		}
		return super.precioAlquiler(dias)+precio;
	}
	
	
	
}
