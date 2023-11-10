package unidad2Ejercicios ;

public class Ejercicio16 {

	public static void main(String[] args) {
		int A = 4,B = 3,C = 2,D = 1,temp=B ;
		
		System.out.println("Valores iniciales: ");
		System.out.println("A vale = " + A);
		System.out.println("B vale = " + B);
		System.out.println("C vale = " + C);
		System.out.println("D vale = " + D);
		
		System.out.println("Nuevos Valores: ");
		B = C; 
		System.out.println("B toma el valor de C. B = " + B);
		C = A;
		System.out.println("C toma el valor de A. C = " + C);
		A = D;
		System.out.println("A toma el valor de D. A = " + A);
		D = temp;
		System.out.println("D toma el valor de B. D = " + D);
		
		
		
	}

}
