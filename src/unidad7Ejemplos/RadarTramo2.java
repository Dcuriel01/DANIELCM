package unidad7Ejemplos;

import java.util.Scanner;

public class RadarTramo2 {
	
	public static Scanner sc = new Scanner(System.in);
	public static final int MAXIMO_VALORES = 6; //Aquí se declara el numero maximo de datos que queremos recoger
	public static String [] datos = new String[MAXIMO_VALORES];
	public static int rellenos=0; //Son los huecos que han sido rellenados con datos
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
			
		}
	}

	private static void comprobarResultado(String datos) {
		double[] datosNum = declararDatos(datos);
		double vmu; //Velocidad media del usuario
		double vm; //Velocidad de la multa
		if (datosNum[0]<0 | datosNum[1]<0 | datosNum[2]<=0) {
			System.out.println("Error");
		}else {
			datosNum[1] = datosNum[1]/3.6; //Pasamos a m/s
			vmu = datosNum[0]/datosNum[2]; //Calculo la velocidad media
			vm = (datosNum[1]*0.2)+datosNum[1]; //Calculo velociadad a la cuál pasa a ser puntos
			if (vmu<=datosNum[1]) { //Si la velocidad es menor no hay nigun problema
				System.out.println("Ok");
			}else {
				if (vmu>=vm) { // si es mayor a la vm(velocidad maxima de multa) ya pasa a ser puntos
					System.out.println("Puntos");
				}else { //al ser menor que la vm perono no que la vmp solo es multa
					System.out.println("Multa");
				}
			}
			
		}
	}

	private static double[] declararDatos(String datos) {
		String [] datosSplit = new String[3];
		double[] datosNum = new double[3];
		datosSplit = datos.split(" ");//Separamos los datos para trabajar con ellos en diferentes variables
		datosNum[0]= Double.parseDouble(datosSplit[0]);//distancia recorrida en el tramo en m
		datosNum[1] = Double.parseDouble(datosSplit[1]);//velocidad maxima permitida en ese tramo en km/h
		datosNum[2] = Double.parseDouble(datosSplit[2]);//tiempo tardado en segundos
		return datosNum;
		
	}

}
