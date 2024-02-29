package unidad4.ejercicios;

public class Secuencia {

	public static void main(String[] args) {

		mostrarSecuencia();
	}

	public static void mostrarSecuencia() {
		int i = 0;
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		System.out.println(n1);
		System.out.println(n2);
		while (i != 8) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			i++;
		}
	}
}
