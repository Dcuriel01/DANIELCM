package unidad8.ejemplos.abstractas;

import java.util.Scanner;

public class Velero extends Vehiculo{

	private int longitud;
	public static Scanner sc = new Scanner(System.in);

	public Velero() {
		super("viento", 0);
		setLongitud();
		setPrecio();
		
	}

	@Override
	public void setPrecio() {
		final int MAX = 10000;
		System.out.println("introduzca un precio para el velero");
		precio = sc.nextInt();
		if (precio>MAX) {
			precio=MAX;
		}
		if (precio<0) {
			precio=0;
		}
	}
	
	public int getLongitud() {
		return longitud;
	}


	public void setLongitud() {
		System.out.println("Introduzca la longitud del velero");
		longitud = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "Longitud " + longitud + " metros \n" +
				"El velero tiene como fuente de alimentacion " + getFuenteAlimentacion()+"\n"+
				"Tiene " +getRueda() + " ruedas \n"+
				"Coste de " + precio + " euros";
	}


	@Override
	public double calcEficicenciaCarburante() {
		return 0;
	}

	@Override
	public double calcDistanciaViaje() {
		return 0;
	}

}
