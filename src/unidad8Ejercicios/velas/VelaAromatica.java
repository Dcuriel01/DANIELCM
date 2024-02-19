package unidad8Ejercicios.velas;

public class VelaAromatica extends Vela{

	private String aroma;

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}
	
	@Override
	public void setAltura(int altura) {
		precio = altura*3;
		this.altura=altura;
	}
	
	
	
	
	
	
}
