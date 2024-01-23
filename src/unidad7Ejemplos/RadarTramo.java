package unidad7Ejemplos;

import java.util.Scanner;

public class RadarTramo {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double distancia = sc.nextDouble();//Metros
		double vmp = sc.nextDouble();//Km/h velocidad máxima permitida 
		double tiempo = sc.nextDouble();//S
		double vmu; //Velocidad media del usuario
		double vm; //Velocidad de la multa
		
		if (distancia<0 | vmp<0 | tiempo<=0) {
			System.out.println("Error");
		}else {
			vmp = vmp/3.6; //Pasamos a m/s
			vmu = distancia/tiempo; //Calculo la velocidad media
			vm = (vmp*0.2)+vmp; //Calculo velociadad a la cuál pasa a ser puntos
			if (vmu<=vmp) {
				System.out.println("Ok");
			}else {
				if (vmu>=vm) {
					System.out.println("Puntos");
				}else {
					System.out.println("Multa");
				}
			}
			
		}
		
	}

}
