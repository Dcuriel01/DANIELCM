package unidad8Ejercicios.empresaVehiculos;

public class Moto extends Terrestre{

	private String color;
	
	public Moto(String matricula, String color, String modelo) {
		super(modelo,4, matricula);
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "El vehículo es una moto " + modelo + " de matrícula " + matricula + " con " + nRuedas + " ruedas y de color " + color;
	}
	
	
}
