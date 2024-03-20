package unidad10.ejemplos;



public class DemoDivision {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		double resultado = 0;
		try {
			resultado = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Se ha producido un error");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Gracias por participar");
		}
	
	}

}
