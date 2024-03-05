package unidad8Ejercicios.empresaVehiculos;

public class Coche extends Terrestre {

	boolean aire;
	
	public Coche(String matricula, boolean aire,String modelo) {
		super(modelo,4, matricula);
		this.aire=aire;
	}
	@Override
	public String toString() {
		return "El vehículo es un coche " + modelo + " de matrícula " + matricula + " con " + nRuedas + " ruedas y el aire acondicionado es " + aire;
	}
	
	
}
