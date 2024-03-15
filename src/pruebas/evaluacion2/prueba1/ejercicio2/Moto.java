package pruebas.evaluacion2.prueba1.ejercicio2;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
