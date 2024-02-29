package unidad4.ejercicios;

public class Ejercicio22 {

	public static void main(String[] args) {
		double n1 = 6;
		double n2 = 9;
		double n3;
		double porcentaje;
		porcentaje = calcularPorcentaje(n1, n2);
		imprimir(porcentaje, n1, n2);
		n3 = n1;
		n1 = n2;
		n2 = n3;
		porcentaje = calcularPorcentaje(n1, n2);
		imprimir(porcentaje, n1, n2);
	}

	private static double calcularPorcentaje(double n1, double n2) {
		double porcentaje;
		porcentaje = n1 / n2 * 100;
		return porcentaje;

	}

	private static void imprimir(double porcentaje, double n1, double n2) {
		System.out.println(n1 + " es el " + porcentaje + " % de " + n2);

	}

}
