package unidad10.ejemplos;

public class LanzamientoDemo {

	public static void main(String[] args){
		try {
			lanzarExcep();
		} catch (Exception e) {
			System.err.println("Error");
			System.out.println(e.getMessage());
		}
		
	}

	private static void lanzarExcep() throws IllegalAccessException {
		
		System.out.println("Lanzamos excepcion");
		throw new IllegalAccessException("Error producido en el método main");
		
		
	}

}
