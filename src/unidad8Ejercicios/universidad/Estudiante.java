package unidad8Ejercicios.universidad;

import java.util.Scanner;

public class Estudiante extends Persona{

	static Scanner sc =new Scanner(System.in);
	private String estudio = " ";
	private double promedioNotas = 0;
	
	public String getEstudio() {
		return estudio;
	}
	public double getPromedioNotas() {
		return promedioNotas;
	}
	
	@Override
	public void generarDatos() {
		super.generarDatos();
		String recogido;
		System.out.println("Introduzca el campo de estudio");
		estudio=sc.nextLine();
		System.out.println("Introduzca la nota media del estudiante");
		recogido = sc.next();
		promedioNotas=Double.parseDouble(recogido);
	}
	
	
	
	
}
