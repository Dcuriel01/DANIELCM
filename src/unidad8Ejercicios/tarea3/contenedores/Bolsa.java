package unidad8Ejercicios.tarea3.contenedores;

public class Bolsa extends Contenedores{

	private double resistenciaMaxima; 
	
	public Bolsa(String referencia, int alto, int ancho) {
		super(referencia, alto, ancho);
	
	}

	public double getResistenciaMaxima() {
		return resistenciaMaxima;
	}

	public void setResistenciaMaxima(double resistenciaMaxima) {
		this.resistenciaMaxima = resistenciaMaxima;
	}
	
	public TipoCont getTipo() {
		return TipoCont.BOLSA;
	}
	@Override
	public int getSuperficie() {
		int radio = getDiametro()/2;
		return (int) (Math.PI*radio*radio);
	}
	private int getDiametro() {
		
		return (int) ((2*ancho)/Math.PI);
	}
	

}
