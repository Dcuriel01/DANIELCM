package unidad8.ejercicios.universidad;

import java.util.Scanner;

public class Facultad extends Empleado{

	static Scanner sc = new Scanner(System.in);
	
	private boolean titular = false;

	@Override
	public void generarDatos() {
		super.generarDatos();
		char respuesta;
		System.out.println("Si el empleado es miembro de la facultad pulse S de lo contrario pulse cualquier otra letra");
		respuesta = sc.next().charAt(0);
		if (respuesta=='S') {
			titular = true;
		}else {
			titular = false;
		}
	}
	
	@Override
	public String toString() {
		String salida;
		if (titular) {
			salida = ", el empleado pertenece a la facultad";
		}else {
			salida = ", el empleado no pertenece a la facultad";
		}
		
		
		
		return super.toString() + salida;
	}
	
	
	public boolean isTitular() {
		return titular;
	}

	
	
	
}
