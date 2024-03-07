package unidad9.ejemplos.comparaciones.comparable;

import java.util.Arrays;

public class OrdenacionEmpleados {

	public static void main(String[] args) {
		
		Empleado [] departamento = new Empleado[3];
		departamento [0] =new Empleado("Paco",30000);
		departamento [1] =new Empleado("Elena",50000);
		departamento [2] =new Empleado("Tamara",8000);
		
		mostrarEmpleados(departamento);
		Arrays.sort(departamento);
		System.out.println("------------------");
		mostrarEmpleados(departamento);
		
		
	}

	private static void mostrarEmpleados(Empleado[] departamento) {
		for (Empleado empleado : departamento) {
			System.out.println(empleado);
		}
		
	}

}
