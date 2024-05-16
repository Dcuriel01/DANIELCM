package ejerciciosPropios.MMA;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BuscadorNacionalidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la nacionalidad que desea buscar");
		String nacionalidadBuscada = sc.next();
		ArrayList<Luchador> luchadores = LeerLuchadores.devolverLista();
		ArrayList<Luchador> luchadoresNac =new ArrayList<Luchador>();
		for (Luchador luchador : luchadores) {
			if (luchador.getNacionalidad().equals(nacionalidadBuscada)){
				luchadoresNac.add(luchador);
			}
		}
		if (luchadoresNac.size()>0) {
			System.out.println("Existen luchadores de esa nacionalidad y sera escritos en un fichero");
			escribirFichero(luchadoresNac);
		}else {
			System.out.println("No existen luchadores de esa nacionalidad");
		}
		
	}

	private static void escribirFichero(ArrayList<Luchador> luchadores) {
		try(PrintWriter escritor = new PrintWriter("ficheros/practicas/luchadoresNacionalidad.txt")) {
			for (Luchador luchador : luchadores) {
				escritor.println(luchador);
			}
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	}
	
	

}
