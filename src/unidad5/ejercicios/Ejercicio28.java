package unidad5.ejercicios;

public class Ejercicio28 {
	public static int [] matriz1 = {9,6,8,2};
	public static int [] matriz2 = {7,5};
	public static int [] matriz3 = new int [matriz1.length+matriz2.length];
	
	public static void main(String[] args) {
		ordenarMatricesAscendente(matriz1);
		ordenarMatricesAscendente(matriz2);
		juntarMatrices(matriz1 , matriz2, matriz3);
		mostrarMatriz(matriz3);
	}

	private static void ordenarMatricesAscendente(int[] matriz1) {
		int tam = matriz1.length;
		for (int i = 0; i < tam-1; i++) {
			for (int j = 0; j < tam-i-1; j++) {
				if (matriz1[j]>matriz1[j+1]) {
					int tmp = matriz1[j];
					matriz1[j]=matriz1[j+1];
					matriz1[j+1]=tmp;
				}
			}
		}
	}

	private static void juntarMatrices(int[] matriz1, int[] matriz2, int[] matriz3) {
		int j = 0;
		int x = 0;
		for (int i = 0; i < matriz3.length; i++) {
			if (j==matriz1.length) {
				matriz3[i]=matriz2[x];
				x++;
			}else if (x==matriz2.length) {
				matriz3[i]=matriz1[j];
				j++;
			}else {
				if (matriz1[j]>matriz2[x]) {
				matriz3[i] = matriz2[x];
				x ++;
			}else {
				matriz3[i] = matriz1[j];
				j ++;
			}
			}
		}
		
	}

	private static void mostrarMatriz(int[] matriz3) {
		for (int i : matriz3) {
			System.out.print(i + " ");
		}
		
	}
}