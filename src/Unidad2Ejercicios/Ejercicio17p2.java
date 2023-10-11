package Unidad2Ejercicios;

import java.util.Scanner;

public class Ejercicio17p2 {
	
	public static void main(String[] args) {
		
		double gradoC;
		double gradoF;
		
		System.out.print("Indique los grados ºC que quiere pasar a ºF:");
		Scanner entrada= new Scanner(System.in);
		gradoC=entrada.nextDouble();	
		gradoF=(gradoC*9/5)+32;
		System.out.println("Los grados que has introducido en ºF son:" + gradoF);
		
		entrada.close() ;
		
		
	}
}