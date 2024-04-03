package unidad11.ejemplos.escribirFichero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirEnFichero4 {

	public static void main(String[] args) {

		File fichero = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fichero=new File("ficheros//coches.txt");
			fw = new FileWriter(fichero);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println("Audi");
			pw.println("Bmw");
			pw.println("Toyota");
			pw.flush();
			System.out.println("Todo escrito correctamente");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (pw!=null) {
					pw.close();
				}
				if (bw!=null) {
					bw.close();
				}
				if (fw!=null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
