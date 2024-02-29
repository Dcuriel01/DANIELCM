package unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
	
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int nHab;
		double precioPintura;
		double mTotal;
		double pagarPintura;
		double pagarTrabajo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuántas habitaciones desea pintar?");
		nHab = entrada.nextInt();
		System.out.println("¿A qué precio está la pintura?");
		precioPintura = entrada.nextDouble();
		mTotal = calcularMTotales(nHab);
		pagarPintura=kPintura(mTotal, precioPintura);
		pagarTrabajo=hTrabajo(mTotal);
		pagoTotal(pagarPintura,pagarTrabajo);
		



	}

	private static double calcularMTotales(int nHab) {
			double mPorPared1;
			double mPorPared2;
			double mPorPared3;
			double mPorPared4;
			double mTotal = 0;
			int i=0;
			if (nHab>=1) {
				do {
					System.out.println("¿Cuántos metros cuadrados tiene la primera pared de la habitación"+ (i+1) +"?");
					mPorPared1 = entrada.nextDouble();
					System.out.println("¿Cuántos metros cuadrados tiene la segunda pared de la habitación"+ (i+1) +"?");
					mPorPared2 = entrada.nextDouble();
					System.out.println("¿Cuántos metros cuadrados tiene la tercera pared de la habitación"+ (i+1) +"?");
					mPorPared3 = entrada.nextDouble();
					System.out.println("¿Cuántos metros cuadrados tiene la cuarta pared de la habitación"+ (i+1) +"?");
					mPorPared4 = entrada.nextDouble();
					mTotal = mPorPared1+mPorPared2+mPorPared3+mPorPared4;
					i++;
				} while (i!=nHab);
			}
			return mTotal;
	}

	private static double kPintura(double mTotal, double precioPintura) {
		double kNecesarios;
		double pagarPintura;
		kNecesarios = ((mTotal/35)*3.7);
		System.out.println("Por la pintura va a pagar " + kNecesarios + " euros");
		pagarPintura=precioPintura(kNecesarios,precioPintura);
		return pagarPintura;
		
	}
	
	private static double hTrabajo(double mTotal) {
		double horasTrabajar;
		double pagarTrabajo;
		horasTrabajar = (mTotal/35)*8;
		System.out.println("Necesitaran aproximadamente " + horasTrabajar + "horas");
		pagarTrabajo=precioHTrabajo(horasTrabajar);
		return pagarTrabajo;
		
	}

	private static double precioHTrabajo(double horasTrabajar) {
		double precioPagar;
		precioPagar = horasTrabajar*14;
		System.out.println("Por la mano de obra tendrá que pagar " + precioPagar + " euros");
		return precioPagar;
		
	}

	private static double precioPintura(double kNecesarios, double precioPintura) {
		double precioAPagar;
		precioAPagar=kNecesarios*precioPintura;
		System.out.println("Vas a gastar en pintura " + precioAPagar + " euros");
		return precioAPagar;
		
	}
	
	private static void pagoTotal(double pagarPintura, double pagarTrabajo) {
		double pagoTotal;
		pagoTotal = pagarPintura+pagarTrabajo;
		System.out.println("El total ha pagar es: " + pagoTotal + " euros");
		
	}
}
