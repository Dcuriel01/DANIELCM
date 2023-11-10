package unidad2Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		float numero1;
		float numero2;
		float suma;
		float resta;
		float multiplicacion;
		float division; 
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un número por favor:");
		numero1 = entrada.nextInt();
		System.out.print("Dame otro por favor:"); 
		numero2 = entrada.nextInt();
		suma = numero1+numero2;
		resta = numero1-numero2;
		multiplicacion = numero1*numero2;
		division = numero1/numero2;
		System.out.println("Su suma es:" + suma);
		System.out.println("su resta es:" + resta);
		System.out.println("Su multiplicación es:" + multiplicacion);
		System.out.println("Su cociente es:" + division);
		
		entrada.close() ;
		
	}

}
