package pruebas.evaluacion2.prueba1.ejercicio2;

public class Submarino extends Acuaticos {

	private int profundidadMax;
	
	public Submarino(String matricula,int profundidadMax, String modelo) {
		super(modelo,2, matricula);
		 this.profundidadMax=profundidadMax;
		
	}

	@Override
	public String toString() {
		return "El vehículo es un submarino " + modelo + " de matrícula " + matricula + " con " + eslora + " esloras y profundidad máxima " + profundidadMax;
	}

	public int getProfundidadMax() {
		return profundidadMax;
	}

	public void setProfundidadMax(int profundidadMax) {
		this.profundidadMax = profundidadMax;
	}
	
	
}
