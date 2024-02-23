package unidad8Ejercicios.tarea3;

import unidad8Ejercicios.tarea3.contenedores.Contenedores;

public class Pedido {
	private static final int MIN_CONTENEDORES=4;
	private String referencia;
	private Contenedores[] contenedores;
	
	public Pedido(String referencia) {
		super();
		this.referencia = referencia;
		contenedores = new Contenedores[MIN_CONTENEDORES];
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Contenedores[] getContenedores() {
		return contenedores;
	}

	public void setContenedores(Contenedores[] contenedores) {
		this.contenedores = contenedores;
	}
	
	
	
	
}
