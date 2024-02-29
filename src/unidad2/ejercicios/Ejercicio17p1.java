package unidad2.ejercicios;

import java.util.Scanner;

public class Ejercicio17p1 {
	
	public static void main(String[] args) {
		
		double gradoF;
		double gradoC;
		
		System.out.print("Indique los grados ºF que quiere pasar a ºC:");
		Scanner entrada= new Scanner(System.in);
		gradoF=entrada.nextDouble();	
		gradoC=(gradoF-32)*5/9;
		System.out.println("Los grados que has introducido en ºC son:" + gradoC);
		
		entrada.close() ;
		
		
	}
}
