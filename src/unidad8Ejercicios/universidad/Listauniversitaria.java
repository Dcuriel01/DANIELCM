package unidad8Ejercicios.universidad;

import java.util.Iterator;
import java.util.Scanner;

public class Listauniversitaria {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		boolean salir = false;
		boolean eRealizado = false;
		boolean fRealizado = false;
		boolean aRealizado = false;
		char opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 'E':
				if (eRealizado) {
					System.out.println("Ya han sido declarados");
				}else {
					Empleado [] empleados = new Empleado[4];
					for (int i = 0; i < empleados.length; i++) {
						empleados[i]=new Empleado();
						empleados[i].generarDatos();
					}
					for (int i = 0; i < empleados.length; i++) {
						System.out.println(empleados[i]);
					}
					eRealizado=true;
				}
				
				break;
			case 'f':
				if (fRealizado) {
					System.out.println("Ya han sido declarados");

				}else {
					Facultad [] facultados = new Facultad[3];
					for (int i = 0; i < facultados.length; i++) {
						facultados[i]=new Facultad();
						facultados[i].generarDatos();
					}
					for (int i = 0; i < facultados.length; i++) {
						System.out.println(facultados[i]);
					}
					fRealizado=true;
				}
				
				break;
			case 'A':
				if (aRealizado) {
					System.out.println("Ya han sido declarados");
				}else {
					Estudiante [] estudiantes = new Estudiante[7];
					for (int i = 0; i < estudiantes.length; i++) {
						estudiantes[i]=new Estudiante();
						estudiantes[i].generarDatos();
					}
					for (int i = 0; i < estudiantes.length; i++) {
						System.out.println(estudiantes[i]);
					}
					aRealizado=true;
				}
				
				break;
			case 'S':
				System.out.println("Ok saliendo");
				salir = true;
				break;


			default:
				break;
			}
			
			
		} while (!salir);
		
		
		
		
	}

	private static char menu() {
		char opcion;
		System.out.println("Si quiere declarar 4 empleados pulse E");
		System.out.println("Si quiere declarar 3 docentes pulse F");
		System.out.println("Si quiere declarar 7 empleados pulse A");
		System.out.println("Si quiere salir pulse S");
		opcion = sc.next().charAt(0);
		return opcion;
	}

}
