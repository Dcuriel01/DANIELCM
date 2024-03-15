package pruebas.evaluacion2.prueba1.ejercicio2;

public class Avion extends Aereos {

	private int hMaxVuelo;
	
	public Avion(String matricula, int hMaxVuelo,String modelo) {
		super(modelo,100, matricula);
		this.hMaxVuelo=hMaxVuelo;
	}
	
	@Override
	public String toString() {
		return "El vehículo es un avión " + modelo + "de matrícula " + matricula + " con " + nAsientos + " asientos y de "+ hMaxVuelo + " horas máxima de vuelo";
	}

	public int gethMaxVuelo() {
		return hMaxVuelo;
	}

	public void sethMaxVuelo(int hMaxVuelo) {
		this.hMaxVuelo = hMaxVuelo;
	}
	
	
}
