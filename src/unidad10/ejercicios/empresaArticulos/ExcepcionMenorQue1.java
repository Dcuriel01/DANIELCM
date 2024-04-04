package unidad10.ejercicios.empresaArticulos;

public class ExcepcionMenorQue1 extends Exception {
	
	public ExcepcionMenorQue1(String mensaje) {
		super(mensaje);
	}

	public ExcepcionMenorQue1(String mensaje,Throwable causa) {
		super(mensaje,causa);
	}

}
