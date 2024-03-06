package unidad8.ejercicios.camisetas;

public class Personalizada extends Camiseta {

	private String eslogan;

	public String getEslogan() {
		return eslogan;
	}

	public void setEslogan(String eslogan) {
		this.eslogan = eslogan;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ". EL eslogan en la camíseta es " + eslogan;
	}
}
