package unidad6.ejercicios.tarea2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Activadad2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("0.0");
		Garaje garaje = new Garaje();
		Coche c1 = new Coche("Mini", "Couper", 120);
		Coche c2 = new Coche("Audi", "A6",230);
		boolean salir = false;
		int opcion;
		String averia;
		boolean hueco;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				if (!c1.isGaraje()) {
					System.out.println("¿Cuál es la avería?");
				sc.nextLine();
				averia=sc.nextLine();
				hueco = Garaje.isHueco();
				if (!hueco) {
					System.out.println("El garaje está lleno");
				}else {
					garaje.aceptarCoche(c1,averia);
					System.out.println("Coche en reparación");
				}
				}else {
					char respuesta;
					System.out.println("Ese coche esta ahora mismo en el garaje");
					System.out.println("Desea reparar alguna averia mas (S/N)");
					respuesta = sc.next().charAt(0);
					switch (respuesta) {
					case 'S':
						Garaje.setHueco(true);
						System.out.println("¿Cuál es la avería?");
						sc.nextLine();
						averia=sc.nextLine();
						garaje.aceptarCoche(c1,averia);
						System.out.println("Solucionado también esa avería");
						break;

					case 'N':
						System.out.println("ok");
						break;
					default:
						System.out.println("No reconocido");
						break;
					}
					
				}
				
				break;
			case 2:
				if (!c2.isGaraje()) {
					System.out.println("¿Cuál es la avería?");
				sc.nextLine();
				averia=sc.nextLine();
				hueco = Garaje.isHueco();
				if (!hueco) {
					System.out.println("El garaje está lleno");
				}else {
					garaje.aceptarCoche(c2,averia);
					System.out.println("Coche en reparación");
				}
				}else {
					char respuesta;
					System.out.println("Ese coche esta ahora mismo en el garaje");
					System.out.println("Desea reparar alguna averia mas (S/N)");
					respuesta = sc.next().charAt(0);
					switch (respuesta) {
					case 'S':
						Garaje.setHueco(true);
						System.out.println("¿Cuál es la avería?");
						sc.nextLine();
						averia=sc.nextLine();
						garaje.aceptarCoche(c2,averia);
						System.out.println("Solucionado también esa avería");
						break;

					case 'N':
						System.out.println("ok");
						break;
					default:
						System.out.println("No reconocido");
						break;
					}
					
				}
				
				break;
			case 3:
				hueco= Garaje.isHueco();
				if (hueco) {
					System.out.println("El garaje ya está vacio");
				}else {
					garaje.devolverCoche();
					System.out.println("Garaje vaciado");
				}
				
				break;
			case 4:
				System.out.println("El garaje ha atendido a " + Garaje.getCochesAtendidos()+ " coches");
				System.out.println("El coche 1 es un "+ c1.getMarca() + " " + c1.getModelo() + " con " + c1.getMotor().getCv() + " cv");
				System.out.println("y ha gastado en aveíras un total de " + formato.format(c1.getPrecioAcumuladoAveria()) 
				+ " euros y el motor un total de " + c1.getMotor().getlAceite() + " litro de aceite");
				System.out.println("El coche 2 es un "+ c2.getMarca() + " " + c2.getModelo() + " con " + c2.getMotor().getCv() + " cv");
				System.out.println("y ha gastado en aveíras un total de " + formato.format(c2.getPrecioAcumuladoAveria()) 
				+ " euros y el motor un total de " + c2.getMotor().getlAceite() + " litro de aceite");
				System.out.println();
				
				break;
			case 5:
				System.out.println("El garaje ha atendido a " + Garaje.getCochesAtendidos()+ " coches");
				System.out.println("El coche 1 es un "+ c1.getMarca() + " " + c1.getModelo() + " con " + c1.getMotor().getCv() + " cv");
				System.out.println("y ha gastado en aveíras un total de " + formato.format(c1.getPrecioAcumuladoAveria()) 
				+ " euros y el motor un total de " + c1.getMotor().getlAceite() + " litro de aceite");
				System.out.println("El coche 2 es un "+ c2.getMarca() + " " + c2.getModelo() + " con " + c2.getMotor().getCv() + " cv");
				System.out.println("y ha gastado en aveíras un total de " + formato.format(c2.getPrecioAcumuladoAveria()) 
				+ " euros y el motor un total de " + c2.getMotor().getlAceite() + " litro de aceite");
				System.out.println();
				System.out.println("Ok saliendo");
				salir = true;
				break;

			default:
				System.out.println("No reconocido");
				break;
			}
			
			
			
		} while (!salir);
		
		
		
	}
	private static int menu() {
		int opcion;
		System.out.println("1. Introducir coche 1 en el garaje");
		System.out.println("2. Introducir coche 2 en el garaje");
		System.out.println("3. Sacar coches del garaje");
		System.out.println("4. Mostrar datos de los coches");
		System.out.println("5. Salir");
		opcion = sc.nextInt();
		return opcion;
	}
	
}
