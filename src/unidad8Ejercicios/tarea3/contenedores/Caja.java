package unidad8Ejercicios.tarea3.contenedores;

public class Caja extends Contenedores{

	public Caja(String referencia, int alto, int ancho) {
		super(referencia, alto, ancho);
	
	}
	
	public TipoCont getTipo() {
		return TipoCont.CAJA;
	}

	@Override
	public int getSuperficie() {
		// TODO Auto-generated method stub
		return ancho*alto;
	}
	
}
