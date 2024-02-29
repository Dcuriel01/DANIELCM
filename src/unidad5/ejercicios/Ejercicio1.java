package unidad5.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		double []matriz = {5, 8, 1, 9, 10, 35};
		double promedio;
		promedio = calcularPromedio(matriz);
		imprimir(promedio);

	}

	private static double calcularPromedio(double[] matriz) {
		double resultado = 0;
		double promedio;
		
		for (int i = 0; i < matriz.length; i++) {
			resultado = matriz[i] + resultado;
		}
		promedio = resultado/6;
		return promedio;
	}

	private static void imprimir(double promedio) {
		System.out.println("El promedio es " + promedio);
		
	}
	

}
