package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		long dni;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique su dni sin la letra");
		
		dni=entrada.nextLong();
		
		encontrarLetra(dni);
		entrada.close();
		
	}

	private static void encontrarLetra(long dni) {
		long resultado;
		resultado = dni%23;
		if (resultado==0) {
			System.out.println("T");
		}else if (resultado==1) {
			System.out.println("R");
		}else if (resultado==2) {
			System.out.println("W");
		}else if (resultado==3) {
			System.out.println("A");
		}else if (resultado==4) {
			System.out.println("G");
		}else if (resultado==5) {
			System.out.println("M");
		}else if (resultado==6) {
			System.out.println("Y");
		}else if (resultado==7) {
			System.out.println("F");
		}else if (resultado==8) {
			System.out.println("P");
		}else if (resultado==9) {
			System.out.println("D");
		}else if (resultado==10) {
			System.out.println("X");
		}else if (resultado==11) {
			System.out.println("B");
		}else if (resultado==12) {
			System.out.println("N");
		}else if (resultado==13) {
			System.out.println("J");
		}else if (resultado==14) {
			System.out.println("Z");
		}else if (resultado==15) {
			System.out.println("S");
		}else if (resultado==16) {
			System.out.println("Q");
		}else if (resultado==17) {
			System.out.println("V");
		}else if (resultado==18) {
			System.out.println("H");
		}else if (resultado==19) {
			System.out.println("L");
		}else if (resultado==20) {
			System.out.println("C");
		}else if (resultado==21) {
			System.out.println("K");
		}else if (resultado==22) {
			System.out.println("E");
		}
		
	}
	

}	