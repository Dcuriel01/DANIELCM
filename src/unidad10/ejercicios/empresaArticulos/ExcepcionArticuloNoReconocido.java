package unidad10.ejercicios.empresaArticulos;

public class ExcepcionArticuloNoReconocido extends Exception {

	public ExcepcionArticuloNoReconocido(String mensaje) {
		super(mensaje);
	}

	public ExcepcionArticuloNoReconocido(String mensaje,Throwable causa) {
		super(mensaje,causa);
	}
}
