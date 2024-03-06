package unidad7.ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class PosteCercado {
	
	public static Scanner sc = new Scanner(System.in);
	public static final int MAXIMO_VALORES = 6; //Aquí se declara el numero maximo de datos que queremos recoger
	public static String [] datos = new String[MAXIMO_VALORES];
	public static int rellenos=0; //Son los huecos que han sido rellenados con datos
	public static int postes=0;

	public static void main(String[] args) {
		pedirDatos();
		comprobarDatos();

	}
	
	private static void pedirDatos() {
			
			for (int i = 0; i < datos.length; i++) {
				datos[i] = sc.nextLine();// recogemos datos 
				if (datos[i].equals("0 0 0")) {
					rellenos=i;
					i=100;//con esto paramos el bucle for
				}
			}
			
		}

		private static void comprobarDatos() {
			for (int j = 0; j < rellenos; j++) {
				comprobarResultado(datos[j]);//recorro este bucle com el metodo tantas veces como datos tenemos introducidos
				postes = 0;
			}
		}
		private static void comprobarResultado(String datos) {
			int[] datosNum = declararDatos(datos);
			if (datosNum[0]<=0 | datosNum[1]<=0 | datosNum[2]<=0) {
				System.out.println("Error");
			}else {
				calcularPostes(datosNum[0],datosNum[2]);
				calcularPostes(datosNum[1],datosNum[2]);
				System.out.println(postes);
			}
			
		}
		
		private static void calcularPostes(int longLado, int distPostes) {
			// 
			int contador = 0;
			int postesLado = 1;
			for (int i = 0; i < 10000; i++) {
				if (longLado-distPostes<=0) {
					contador++;
					i=10000;
				}else {
					longLado = longLado-distPostes;
					contador++;
				}
			}
			postesLado = contador*postesLado;
			postes = postes + (postesLado*2);
			
		}

		private static int[] declararDatos(String datos) {
			String [] datosSplit = new String[3];
			int[] datosNum = new int[3];
			datosSplit = datos.split(" ");//Separamos los datos para trabajar con ellos en diferentes variables
			datosNum[0]= Integer.parseInt(datosSplit[0]); //Lado Y
			datosNum[1] = Integer.parseInt(datosSplit[1]);//Lado X
			datosNum[2] = Integer.parseInt(datosSplit[2]);//Distancia minima entre postes
			return datosNum;
			
		}

}
