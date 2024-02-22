package unidad8Ejercicios.universidad;

import java.util.Scanner;

public class Empleado extends Persona {
	static Scanner sc = new Scanner(System.in);
	private String nSS=" ";
	private double salarioAnual = 0;
	private String departamento = " ";
	
	@Override
	public void generarDatos() {
		super.generarDatos();
		System.out.println("Introduzca el nSS");
		nSS = sc.next();
		System.out.println("Introduzca el salario anual");
		String recogido = sc.next();
		salarioAnual=Double.parseDouble(recogido);
		System.out.println("Introduzca el departamento");
		nSS = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString()+" su número de la seguridad social es " + nSS + " su salario anual "+ salarioAnual + " y su departamento " + departamento;
	}
	
	public String getnSS() {
		return nSS;
	}

	public double getSalarioAnual() {
		return salarioAnual;
	}

	public String getDepartamento() {
		return departamento;
	}

	
	
	
	
}
