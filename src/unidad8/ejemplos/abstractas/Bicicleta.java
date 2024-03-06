package unidad8.ejemplos.abstractas;

import java.util.Scanner;

public class Bicicleta extends Vehiculo{
	
	static Scanner sc = new Scanner(System.in);
	
	public Bicicleta() {
		super("Una persona", 2);
		setPrecio();
		
	}
	@Override
	public void setPrecio() {
		final int MAX = 3000;
		System.out.println("introduzca un precio para la bicicleta");
		precio = sc.nextInt();
		if (precio>MAX) {
			precio=MAX;
		}
		if (precio<0) {
			precio=0;
		}
	}
	@Override
	public String toString() {
		return "La bicicleta tiene como fuente de alimentacion " + getFuenteAlimentacion()+"\n"+
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
