package unidad1.ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Puebas{
	public static PrintWriter escritor = null;
	public static void main(String[]args) {

		for (int i = 0; i < 5; i++) {
			try {
				escribirFichero("ficheros/perso.txt","Holaa" + i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				escritor.close();
			}
		}
				
		}
	
	private static void escribirFichero(String string, String string2) throws IOException {
		escritor = new PrintWriter(new FileWriter(string,true));
		escritor.println(string2);
	}
}