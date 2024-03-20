package unidad10.ejemplos;

public class DemoArray {

	public static void main(String[] args) {
		int[] numeros = {1,2,3};
		
		try {
			System.out.println(numeros[20]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		}
	}
	
}
