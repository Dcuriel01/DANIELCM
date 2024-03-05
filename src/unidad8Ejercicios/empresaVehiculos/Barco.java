package unidad8Ejercicios.empresaVehiculos;

public class Barco extends Acuaticos{

	boolean motor;
	
	public Barco(String matricula, boolean motor,String modelo) {
		super(modelo,1, matricula);
		this.motor=motor;
	}
	
	@Override
	public String toString() {
		return "El vehículo es un barco " + modelo+ " de matrícula " + matricula + " con " + eslora + " esloras y motor " + motor;
	}
	
}
