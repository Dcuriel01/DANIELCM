package unidad6Ejercicios.miNumero;

public class MiNumero {

	private int numero;

	public MiNumero() {
		numero=0;
	}

	public MiNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void cambiaNumero(int numero) {
		this.numero = numero;
	}
	public void suma(int numeroSumar) {
		numero = numero+numeroSumar;
	}
	public void resta(int numeroRestar) {
		numero = numero-numeroRestar;
	}
	public int getValor() {
		return numero;
	}
	public int getDoble() {
		return (numero*2);
	}
	public int getTriple() {
		return (numero*3);
	}
	public int getCuadruple() {
		return (numero*4);
	}
	
	
}
