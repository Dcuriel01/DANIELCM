package unidad9.ejercicios.ganaderia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ganaderia {

	public static void main(String[] args) {
		int opcion;
		Animal a1 = new Animal(2015, "Nacha", "Enero", "Paco", Sexo.MACHO);
		Animal a2 = new Animal(2015, "Pepa", "Marzo", "Antonia", Sexo.HEMBRA);
		Animal a3 = new Animal(2015, "Nacha", "Octubre", "Pedro", Sexo.MACHO);
		Animal a4 = new Animal(2018, "Lorena", "Agosto", "Raúl", Sexo.MACHO);
		
		ArrayList<Animal> lista2015 = new ArrayList<Animal>();
		lista2015.add(a1);
		lista2015.add(a2);
		lista2015.add(a3);
		ArrayList<Animal> lista2018 = new ArrayList<Animal>();
		lista2015.add(a4);
		
		Map<Integer, ArrayList<Animal>> camadas = new HashMap<Integer, ArrayList<Animal>>();
		camadas.put(2015, lista2015);
		camadas.put(2018, lista2018);

		opcion = menu();
		if (opcion==1) {
			for (Integer camada : camadas.keySet()) {
				if (camada==2015) {
					System.out.println(camadas.get(camada));
				}
			}
		}else {
			for (Integer camada : camadas.keySet()) {
				if (camada==2018) {
					System.out.println(camadas.get(camada));
				}
			}
		}
		
		
		
	}

	private static int menu() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
		System.out.println("MENU-----CAMADAS");
		System.out.println("Camadas disponibles:");
		System.out.println("1. 2015");
		System.out.println("2. 2018");
		opcion=sc.nextInt();
		if (opcion!=1&opcion!=2)
			System.out.println("Error en el número introducido");
		} while (opcion!=1&opcion!=2);
		return opcion;
	}

}
