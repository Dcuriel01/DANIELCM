package tareasFinales.aparcamientosPago;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FicherosParking {

	public static void escribirFichero(String nombre,ArrayList<Residente>residentes,ArrayList<Residente>residentesF) {
		File ficheroEscritura = new File("ficheros/parking/"+nombre);
		try(PrintWriter escritor = new PrintWriter(ficheroEscritura)) {
			escritor.print("Matricula       ");
			escritor.print("Tiempo(min)       ");
			escritor.println("Precio");
			for (Residente residenteF : residentesF) {
				escritor.print(residenteF.getMatricula()+"          ");
				escritor.print(residenteF.getTiempoMin()+"                  ");
				escritor.println(residenteF.getPrecioAcumulado());
			}
			for (Residente residente : residentes) {
				escritor.print(residente.getMatricula()+"       ");
				escritor.print(residente.getTiempoMin()+"       ");
				escritor.println(residente.getPrecioAcumulado()+"       ");
			}
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	}
	
	
}
