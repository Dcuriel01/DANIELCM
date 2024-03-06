package unidad7.ejercicios;

import java.util.Scanner;

public class Menu {

		public static void main(String[] args) {
			int opcion=0;
			String opcionCadena=null;
			boolean salir = false;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("Marque una opcion del 1 al 4");
				opcionCadena=sc.nextLine();
				salir = comprobarNumero(opcionCadena);
				if (!salir) {
					System.out.println("Error en el numero");
				}
				
				
			} while (!salir);
			System.out.println("Perfecto");

		}

		private static boolean comprobarNumero(String opcionCadena) {
			boolean salir = false;
			int numero;
			int limite= 4; 
			numero = Comprobaciones.comprobarCadenaLimite(opcionCadena,limite);
			if (numero!=-1) {
				salir = true;
			}
			
			
			
			return salir;
	}

}

