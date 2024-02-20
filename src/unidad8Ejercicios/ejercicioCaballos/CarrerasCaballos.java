package unidad8Ejercicios.ejercicioCaballos;

public class CarrerasCaballos extends Caballo {

	private int numCarrerasComp;

	public CarrerasCaballos(String nombre, String color, int anioNac, int numCarrerasComp) {
		super(nombre, color, anioNac);
		this.numCarrerasComp = numCarrerasComp;
	}

	public int getNumCarrerasComp() {
		return numCarrerasComp;
	}

	public void setNumCarrerasComp(int numCarrerasComp) {
		this.numCarrerasComp = numCarrerasComp;
	}
	
	@Override
	public String toString() {
		return super.toString()+" y ha corrido un total de " + numCarrerasComp + " carreras";
	}
	
	
}
