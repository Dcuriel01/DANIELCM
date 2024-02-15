package unidad5Ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		String [] matriz1 = {"hola","probando","uno"};
		String [] matriz2 = {"probando","hola","dos"};
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				if (matriz1[i]==matriz2[j]) {
					System.out.println("La palabra - " + matriz1[i] + " - esta en ambas");
				}
			}
		}
	}

}
