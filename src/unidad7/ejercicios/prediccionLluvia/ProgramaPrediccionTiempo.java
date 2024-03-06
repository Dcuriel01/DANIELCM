package unidad7.ejercicios.prediccionLluvia;

import java.util.Scanner;

public class ProgramaPrediccionTiempo {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int nDiasDeclarados;
		
		System.out.println("¿Cuantos días va a declarar?");
		nDiasDeclarados = sc.nextInt();
		sc.nextLine();
		
		Dias[] DiasIntro = new Dias[nDiasDeclarados];
		
		for (int i = 0; i < DiasIntro.length; i++) {
			String presion=null;
			String humedad=null;
			System.out.println("Presión dia " + (i+1) + ":");
			presion = sc.nextLine();
			presion = presion.trim();
			System.out.println("Humedad dia " + (i+1) + ":");
			humedad = sc.nextLine();
			humedad = humedad.trim();
			DiasIntro [i]= new Dias(presion,humedad,i);
		}
		for (int i = 0; i < DiasIntro.length; i++) {
			System.out.println("Dia " + (i+1));
			DiasIntro[i].mostrarDatos();
		}
		
		
		

	}

}

