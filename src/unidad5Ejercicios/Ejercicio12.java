package unidad5Ejercicios;

public class Ejercicio12 {

	public static int [] matriz = {1,4,6,8,10,23,15,38};
	public static final int LIMITANTE = 10;
	
	public static void main(String[] args) {
		
		System.out.println("Matriz inicial");
		mostrarMatriz();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Matriz inversa");
		mostrarMatrizInversa();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Suma de valores de la matriz");
		mostrarSuma();
		System.out.println(" ");
		System.out.println("Valores menores de " + LIMITANTE +  ":");
		mostarValoresMenoresLimitante();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Valores más altos que la media");
		mostrarValoresMayoresMedia();

	}

	private static void mostrarMatriz() {
		for (int i : matriz) {
			System.out.print(i + " ");
		}
		
	}

	private static void mostrarMatrizInversa() {
			int [] matriz1 = matriz ;
			int i = 0;
			for (int j = matriz1.length - i - 1; j > i; j--) {
				int temp = matriz1[j];
				matriz1[j] = matriz1[i];
				matriz1[i] = temp;
				i++;
			}
			for (int x : matriz1) {
				System.out.print(x + " ");
			}
		
	}

	private static void mostrarSuma() {
		int resultado = 0;
		for (int i = 0; i < matriz.length; i++) {
			resultado = matriz[i]+resultado;
		}
		System.out.println("El resultado de la suma es : " + resultado);
		
	}

	private static void mostarValoresMenoresLimitante() {
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i]<LIMITANTE) {
				System.out.print(matriz[i] + " ");
			}

		}
		
	}

	private static void mostrarValoresMayoresMedia() {
		double media = 0;
		int resultado = 0;
		for (int i = 0; i < matriz.length; i++) {
			resultado = matriz[i]+resultado;
		}
		media = resultado/matriz.length;
		System.out.println("La media es " + media);
		System.out.println("Y los números mayores que esta son: ");
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i]>media) {
				System.out.print(matriz[i] + " ");
			}

		}
		
		
	}

}
