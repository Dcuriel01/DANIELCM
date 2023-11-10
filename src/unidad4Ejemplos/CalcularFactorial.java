package unidad4Ejemplos;

public class CalcularFactorial {

	public static void main(String[] args) {

		int numero = 5;
		int resultado = calcularFactorial(numero);
		System.out.println("El factorial de " + numero + " es " + resultado);
	}

	private static int calcularFactorial(int numero) {
		int resultado;
		if (numero == 0 || numero == 1) {
			resultado = 1;
		}else {
			resultado = numero*calcularFactorial(numero-1);
		}
		return resultado;
	}

}
