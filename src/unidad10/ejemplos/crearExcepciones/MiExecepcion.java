package unidad10.ejemplos.crearExcepciones;

public class MiExecepcion extends Exception{

	private static final long serialVersionUID = 1L;

	public MiExecepcion(String mensaje) {
		super(mensaje);
	}

	public MiExecepcion(String mensaje,Throwable causa) {
		super(mensaje,causa);
	}
	
	

	
	
	
	
}
