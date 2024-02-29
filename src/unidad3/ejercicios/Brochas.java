package unidad3.ejercicios;

import java.util.Scanner;

public class Brochas {

	public static void main(String[] args) {
		int brochas;
		int rodillos;
		int sellador;
		float gastadoBrochas;
		float gastadoRodillos;
		float gastadoSellador;
		int opcionPago;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("¿Cuantas brochas va a comprar? ");
		brochas = entrada.nextInt();
		System.out.print("¿Cuantos rodillos? ");
		rodillos = entrada.nextInt();
		System.out.print("¿Y cuantos selladores? ");
		sellador = entrada.nextInt();
		
		gastadoBrochas = (brochas * 20) - ((brochas * 20) * 0.2f);
		gastadoRodillos = (rodillos * 45) - ((rodillos * 45) * 0.15f);
		gastadoSellador = (sellador * 10) - ((sellador * 10) * 0.05f);
		
		System.out.print("¿Va a pagar en contado (pulse 1) con tarjeta (pulse 2)? ");
		opcionPago= entrada.nextInt();
		
		if (opcionPago==1) {
			System.out.println("Has gastado "+ gastadoRodillos + " euros en rodillos, " + gastadoBrochas + " euros en brochas y " + gastadoSellador + " euros en selladores. Un total de " + (gastadoBrochas+gastadoRodillos+gastadoSellador) + " euros");	
		} else if (opcionPago==2) {
			System.out.println("Has gastado "+ gastadoRodillos + " euros en rodillos, " + gastadoBrochas + " euros en brochas y " + gastadoSellador + " euros en selladores. Un total de " + ((gastadoBrochas+gastadoRodillos+gastadoSellador)-(gastadoBrochas+gastadoRodillos+gastadoSellador)*0.07f) + " euros gracias al 7% de descuento por pagar con tarjeta");
		} else {
			System.out.println("opción no reconocida");
		}
		
		

	}

}
