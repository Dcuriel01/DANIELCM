package unidad1.ejemplos;

import java.util.Scanner;

public class RepetidosArray {

	public static void main(String[] args) {
		//1123
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el array");
		String array1 = sc.nextLine();
		String [] arr1 = array1.split(" ");
		int [] arrayN1 = new int[arr1.length];
		int contador=0;
		for (int i = 0; i < arr1.length; i++) {
			arrayN1[i]=Integer.parseInt(arr1[i]);
		}
		for (int i = 0; i < arrayN1.length-1 ; i++) {
			for (int j = i+1; j < arrayN1.length; j++) {
				if (arrayN1[i]==arrayN1[j]) {
					contador++;
					if (contador==arrayN1.length) {
						j=100;
						i=100;
					}
				}
			}
		}
		System.out.println("Hay " + contador + " números iguales");
	}

}
