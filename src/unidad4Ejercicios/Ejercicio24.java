package unidad4Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		int numPlantas=0;
		double numHabPlanta=0;
		double numHabPlantaOcup=0;
		double numTotalHabPlantas=0;
		double numTotalHabPlantasOcup=0;
		double tasaOcup=0;
		int i=0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("¿Cuantos pisos tiene el hotel?");
			numPlantas=entrada.nextInt();
		
			if (numPlantas>=1) {
				do {
					i++;
					System.out.println("En la planta " + i);
					System.out.println("¿Cuantas habitaciones hay?");
					numHabPlanta=entrada.nextInt();
					System.out.println("¿Y cuantas estan ocupadas?");
					numHabPlantaOcup=entrada.nextInt();
					numTotalHabPlantas=numTotalHabPlantas+numHabPlanta;
					numTotalHabPlantasOcup=numTotalHabPlantasOcup+numHabPlantaOcup;
				} while (i!=numPlantas);
			tasaOcup = numTotalHabPlantasOcup/numTotalHabPlantas ;
			System.out.println("Hay un total de " + numPlantas + " plantas, " + numTotalHabPlantas + " habitaciones y " + numTotalHabPlantasOcup + " de habitaciones ocupadas. La tasa de ocupación es de: " + tasaOcup );
				
				
				
			}else {
				System.out.println("Numero incorrecto");
			}
			
		} while (numPlantas<1);
		
	}

}
