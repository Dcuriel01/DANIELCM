package unidad5.ejemplos;

public class EstacionMeteorologica {

	public static void main(String[] args) {

		int[] temperaturas = new int [12];
		int[] diasLluviosos = { 28, 6, 48, 89 };
		int[] humedad = { 10, 67, 24, 89, 76, 50 };

		
		System.out.println("-----Temperaturas medias-----");
		imprimirArray(temperaturas, "º");
		System.out.println("-----Diás lluviosos por estaciones-----");
		imprimirArray(diasLluviosos, " dias");
		System.out.println("-----Humedad cada 2 meses-----");
		imprimirArray(humedad, "%");
		
	}


	private static void imprimirArray(int[] datos, String unidad) {

		for (int i = 0; i < datos.length; i++) {
			System.out.println("Mes " + (i + 1) + ": " + datos[i] + unidad);
		}
	}

}
