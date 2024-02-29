package unidad2.ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		 float kmTotales;
		 float precioGasolina;
		 float litroXKm;
		 float tarifaEstacionar;
		 float costePeaje;
		 float costeTotal;

		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("¿Cuantos Km has hecho hoy? ");
		 kmTotales = entrada.nextFloat();
		 System.out.print("¿Cuanto cuesta la gasolina hoy? ");
		 precioGasolina = entrada.nextFloat();
		 System.out.print("¿Cuantos litros de gasolina gasta tu coche por cada 100 Km? ");
		 litroXKm = entrada.nextFloat();
		 System.out.print("¿Cuanto has gastado en estacionar? ");
		 tarifaEstacionar = entrada.nextFloat();
		 System.out.print("¿Cuanto has gastado en peajes? ");
		 costePeaje = entrada.nextFloat();
		 
		 costeTotal=((kmTotales*(litroXKm/100))*precioGasolina)+tarifaEstacionar+costePeaje;
		 
		 System.out.println("Has gastado un total de " + costeTotal + " euros");
		 
		 entrada.close();
		 
		 
		 
		 
	}

}
