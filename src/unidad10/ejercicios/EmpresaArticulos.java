package unidad10.ejercicios;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class EmpresaArticulos {

	public static int NUMERO_DE_ARTICULOS = 4;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Double> articulos = new HashMap<Integer, Double>();
		int nArticulo;
		int cantidad;
		boolean salir = false;
		articulos.put(111, 0.89);
		articulos.put(222, 1.47);
		articulos.put(333, 2.43);
		articulos.put(444, 5.99);
		
		
		System.out.print("Introduzca el numero del artículo:");
		do {
			
		try {
			nArticulo = sc.nextInt();
			if (nArticulo<1) {
				excepcionMenor1();
				salir = true;
			}
			if (nArticulo>9999) {
				excepcionMayor9999();
				salir = true;
			}
			boolean salirMapa = false;
			int contador=0;
			for (Integer articulo : articulos.keySet()) {
				if (nArticulo!=articulo) {
					contador++;
				}
				if (contador==NUMERO_DE_ARTICULOS) {
					salirMapa=true;
				}else {
					salir = true;
				}
			if (salirMapa) {
				excepcionArticuloNoReconocido();
			}
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.err.println("Error tipo de variable incorrecto");
			salir = false;
			sc.nextLine();
		} catch (ExcepcionMenorQue1 e) {
			System.out.println(e.getMessage());
		} catch (ExcepcionMayor9999 e) {
			System.out.println(e.getMessage());
		} catch (ExcepcionArticuloNoReconocido e) {
			System.out.println(e.getMessage());
		}
		} while (salir);
		
		System.out.print("Introduzca cantidad del artículo:");
		do {
		try {
			cantidad = sc.nextInt();
			if (cantidad<1) {
				excepcionMenor1();
				salir = true;
			}
			if (cantidad>12) {
				excepcionMayor12();
				salir = true;
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.err.println("Error tipo de variable incorrecto");
			sc.nextLine();
		} catch (ExcepcionMenorQue1 e) {
			System.out.println(e.getMessage());
		} catch (ExcepcionMayor12 e) {
			System.out.println(e.getMessage());
		}
		} while (salir);
		
	}
		public static void excepcionMenor1() throws ExcepcionMenorQue1 {

				throw new ExcepcionMenorQue1("No puede introducir un numero menor que 1",new IllegalAccessError());
			
		
	}
		public static void excepcionMayor9999() throws ExcepcionMayor9999 {

			throw new ExcepcionMayor9999("No puede introducir un numero mayor que 9999",new IllegalAccessError());
		
	
}
		public static void excepcionMayor12() throws ExcepcionMayor12 {

			throw new ExcepcionMayor12("No puede introducir una cantidad mayor que 12",new IllegalAccessError());
		
	
}
		public static void excepcionArticuloNoReconocido() throws ExcepcionArticuloNoReconocido {

			throw new ExcepcionArticuloNoReconocido("Número de artículo no reconocido",new IllegalAccessError());
		
	
}

}
