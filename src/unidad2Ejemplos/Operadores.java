package unidad2Ejemplos;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		int primerNumero;
		int segundoNumero;
		int tercerNumero;
		int suma;
		int resta;
		int multiplicacion;
		double media;
		int modulo;
		int radio;
		final double PI; //Final indica que es una constante y el nombre en mayus tmb
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número ");
		primerNumero = entrada.nextInt();
		System.out.print("Introduzca el segundo número ");
		segundoNumero = entrada.nextInt();
		System.out.print("Introduzca el tercero número ");
		tercerNumero = entrada.nextInt();

		suma = primerNumero+segundoNumero+tercerNumero;
		resta = primerNumero-segundoNumero-tercerNumero;
		multiplicacion = primerNumero*segundoNumero*tercerNumero;
		
		media = suma/3;
		
		modulo = suma%2;
		
		System.out.println("La suma es = " + suma);
		System.out.println("La resta es = " + resta);
		System.out.println("El producto es = " + multiplicacion);
		System.out.println("La media es = " + media);
		System.out.println("El modulo es = " + modulo);
		
		suma++; // Esto es igual que suma = suma + 1
		resta--; // Esto es igual que resta = resta -1  
		
		System.out.println("Incrementamos en uno la suma = " + suma);
		System.out.println("Decrementamos en uno la resta = " + resta);
		
		suma+=3; // Es igual que suma = suma + 3
		resta-=4; // Es igual que resta = resta - 3
		
		System.out.println("Incrementamos en tres la suma = " + suma);
		System.out.println("Decrementamos en tres la resta = " + resta);
		
		PI = 3.1416;
		radio = 5;
		
		System.out.println("El área es:" + PI*radio*radio);
		System.out.printf("El área es:%.3f%n",PI*radio*radio);//Esto hace que solo me de 3 decimales 
		
		//%d sustituye entero y %f y el numero de delante dice número de decimales a mostrar
		
		System.out.printf("El numero 1 es %d, el numero 2 es %d%n",primerNumero,segundoNumero);//este y el de abajo son iguales !IMPORTANTE %N PARA SALTO DE LINEA¡
		System.out.println("El numero 1 es "+ primerNumero + ", el numero 2 es " + segundoNumero);
		
		entrada.close();
	}

}
