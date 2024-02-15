package unidad5Ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
				int [] matriz1 = {1,4,6,89,90};
				int [] matriz2 = {2,4,1,56,89};
				
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz2.length; j++) {
						if (matriz1[i]==matriz2[j]) {
							System.out.println("El número - " + matriz1[i] + " - esta en ambas");
						}
					}
				}
	}

}
