package unidad10.ejemplos;

public class Programa {

	public static void main(String[] args) {

		try {
			metodo1();
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void metodo1() throws IllegalAccessException {
		
		metodo2();
	}

	public static void metodo2() throws IllegalAccessException {
		
		lanzarExcepcion();
	}
	

	public static void lanzarExcepcion() throws IllegalAccessException {
		
		try {
			System.out.println("Lanzamos una excepcion");
			throw new IllegalAccessException("Error producidodo en el metodo lanzarExcepcion");
		} catch (IllegalAccessException e) {
			throw e;
		}
	}
	
	
	
}
