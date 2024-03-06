package unidad6.ejercicios.serigrafia;

import java.util.Scanner;

import unidad6.ejercicios.lector.Lector;

public class ProgramaCamisetas {
	public static int nCamisetas;
	public static void main(String[] args) {
		System.out.println("¿Cuantas camisetas va a registrar?");
		nCamisetas=Lector.leerInt();
		Camisetas [] camisetas = new Camisetas[nCamisetas];
		introducirCamisetas(camisetas);
		mostrarDatosCamiseta(camisetas);

	}

	private static void introducirCamisetas(Camisetas[] camisetas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nCamisetas; i++) {
			int id;
			String descrip;
			Materiales material=null;
			String materialUser;
			String color;
			double precio;
			int stock;
			System.out.print("ID:");
			id = Lector.leerInt();
			System.out.print("Descripción:");
			descrip = Lector.leerLinea();
			System.out.print("Material:");
			materialUser = Lector.leerLinea();
			if (materialUser=="tela") {
				material = Materiales.TELA;
			}else if (materialUser=="algodon") {
				material = Materiales.ALGODON;
			}else if (materialUser=="poliester") {
				material = Materiales.POLIESTER;
			}else if (materialUser=="plastico") {
				material = Materiales.PLASTICO;
			}
			System.out.print("Color:");
			color = Lector.leerLinea();
			System.out.print("Precio:");
			precio = sc.nextDouble();
			System.out.print("Stock:");
			stock = Lector.leerInt();
			declararCamiseta(id,descrip,material,color,precio,stock,camisetas,i);
		}
		
	}

	private static void declararCamiseta(int id,String descrip, Materiales material, String color, double precio, int stock,
			Camisetas[] camisetas , int i) {
		camisetas[i]=new Camisetas(id, descrip, material, color, precio, stock);
		
	}

	private static void mostrarDatosCamiseta(Camisetas[] camisetas) {
		for (int i = 0; i < nCamisetas; i++) {
			if (camisetas!=null) {
				System.out.println((i+1) + "º Camiseta");
				camisetas[i].imprimirDatos();
			}
		}
		
	}

}
