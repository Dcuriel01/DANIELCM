package unidad6Ejercicios.serigrafia;

import unidad6Ejercicios.lector.Lector;

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
		int id;
		String descrip;
		Materiales material;
		String materialUser;
		String color;
		double precio;
		int stock;
		for (int i = 0; i < nCamisetas; i++) {
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
			precio = Lector.leerDouble();
			System.out.print("Stock:");
			stock = Lector.leerInt();
			
		}
		
	}

	private static void mostrarDatosCamiseta(Camisetas[] camisetas) {
		for (int i = 0; i < nCamisetas; i++) {
			System.out.println(i + "º Camiseta");
			camisetas[i].imprimirDatos();
		}
		
	}

}
