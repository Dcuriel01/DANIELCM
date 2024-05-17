package pruebas.evaluacion3.prueba1.cuentasBancaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class PorPais {
	static HashMap<String, ArrayList<Cuenta>> cuentasPorPaises;
	public static void dividirEnFicherosPorPais(HashMap<String, ArrayList<Cuenta>> cuentas) {
		cuentasPorPaises=cuentas;
		for (String pais : cuentasPorPaises.keySet()) {
			crearDirectorio(pais);
			File fichero = crearFichero(pais);
			EscribirEnFichero(fichero,cuentasPorPaises.get(pais));
		}
		
	}
	private static void crearDirectorio(String pais) {
		File  datosBancarios = new File("datosBancarios");
		File directorioPais = new File("datosBancarios/"+pais);
		if (!datosBancarios.exists()) {
			datosBancarios.mkdir();
		}
		if (!directorioPais.exists()) {
			directorioPais.mkdir();
		}
		
	}
	private static File crearFichero(String pais) {
		File cuentas = new File("datosBancarios/"+pais+"/cuentas.txt");
		if (!cuentas.exists()) {
			try {
				cuentas.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return cuentas;
	}
	private static void EscribirEnFichero(File fichero, ArrayList<Cuenta> cuentas) {
		
		try(PrintWriter escritor = new PrintWriter(fichero)) {
			for (Cuenta cuenta : cuentas) {
				escritor.println(cuenta);
			}
			
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
		
	}
}
