package unidad8.ejercicios.empresaVehiculos;

public class Helicoptero extends Aereos{

	private int nHelices;
	
	public Helicoptero(String matricula, int nHelices, String modelo) {
		super(modelo,88, matricula);
		this.nHelices=nHelices;
	}
	
	@Override
	public String toString() {
		return "El vehículo es un helicoptero " + modelo + " de matrícula " + matricula + " con " + nAsientos + " asientos y con "+ nHelices + " helices";
	}
	
}
