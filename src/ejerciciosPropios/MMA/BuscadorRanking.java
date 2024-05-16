package ejerciciosPropios.MMA;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BuscadorRanking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la posición del ranking que desea buscar");
		int posicionBuscada = sc.nextInt();
		ArrayList<Luchador> luchadores = LeerLuchadores.devolverLista();
		ArrayList<Luchador> luchadoresPos =new ArrayList<Luchador>();
		for (Luchador luchador : luchadores) {
			if (luchador.getPosicion_ranking()==posicionBuscada){
				luchadoresPos.add(luchador);
			}
		}
		if (luchadoresPos.size()>0) {
			System.out.println("Ese luchador sera escrito en un fichero");
			escribirFichero(luchadoresPos);
		}else {
			System.out.println("No contamos con ese numero de ranking");
		}
		
	}

	private static void escribirFichero(ArrayList<Luchador> luchadores) {
		try(PrintWriter escritor = new PrintWriter("ficheros/practicas/luchadorPosicion.txt")) {
			for (Luchador luchador : luchadores) {
				escritor.println(luchador);
			}
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	}

}
