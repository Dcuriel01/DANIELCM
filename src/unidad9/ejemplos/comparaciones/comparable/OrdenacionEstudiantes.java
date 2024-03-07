package unidad9.ejemplos.comparaciones.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacionEstudiantes {

	public static void main(String[] args) {

		Estudiantes e1 = new Estudiantes("Juan", 20, 19);
		Estudiantes e2 = new Estudiantes("Paco", 16, 25);
		Estudiantes e3 = new Estudiantes("Patricia", 21, 18);
		ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		imprimirDatos(estudiantes);
		Collections.sort(estudiantes);
		System.out.println("Ordenados por matrícula");
		imprimirDatos(estudiantes);
	}

	private static void imprimirDatos(ArrayList<Estudiantes> estudiantes) {
		
		for (Estudiantes e : estudiantes) {
			System.out.println(e);
		}
		
	}

}
