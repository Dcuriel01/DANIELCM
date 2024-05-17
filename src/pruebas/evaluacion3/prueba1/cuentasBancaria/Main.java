package pruebas.evaluacion3.prueba1.cuentasBancaria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class Main {

	static HashMap<String, ArrayList<Cuenta>> cuentasPorPaises;
	static int limiteSuperior;
	static int limiteInferior;
	public static void main(String[] args) {
		Properties propiedades = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("ficheros/properties/limitesCuentas.properties");
			propiedades.load(fis);
			limiteSuperior=Integer.parseInt(propiedades.getProperty("limiteSuperior")); 
			limiteInferior=Integer.parseInt(propiedades.getProperty("limiteInferior")); 
			cuentasPorPaises=LeerFichero.leer();
			PorPais.dividirEnFicherosPorPais(cuentasPorPaises);
			escribirCuentasEnDescubierto();
			escribirCuentasSuperior();
			escribirBinario();
			CuentasDescubiertoBinario();
			MostarTodosFicheros.mostrarFicheros();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	private static void CuentasDescubiertoBinario() {
		ArrayList<Cuenta> enDescubierto = seleccionarCuentasEnDescubierto();
		File fichero = crearFicheroDescubiertoBinario();
		EscribirEnFicheroBinario(fichero, enDescubierto);
	}




	private static void escribirBinario() {
		for (String pais : cuentasPorPaises.keySet()) {
			File fichero = crearFicheroBinario(pais);
			EscribirEnFicheroBinario(fichero,cuentasPorPaises.get(pais));
		}
	}




	private static void EscribirEnFicheroBinario(File fichero, ArrayList<Cuenta> cuentas) {

		try(ObjectOutputStream oos = 
				new ObjectOutputStream (new FileOutputStream
						(fichero))){
			for (Cuenta cuenta : cuentas) {
				oos.writeObject(cuenta);
			}
			
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}




	private static File crearFicheroBinario(String pais) {
		File fichero = new File("datosBancarios/"+pais+"/cuentas.dat");
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return fichero;
	}




	private static void escribirCuentasSuperior() {
		ArrayList<Cuenta> cuentasLimiteSuperior=seleccionarCuentasLimiteSuperior();
		File fichero =crearFicheroLimiteSuperior();
		escribirJson(cuentasLimiteSuperior,fichero);
	}




	private static void escribirJson(ArrayList<Cuenta> cuentas, File fichero) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(cuentas);
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero))) {
			escritor.write(json);
			System.out.println("Datos escritos correctamente");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	private static File crearFicheroLimiteSuperior() {
		File fichero = new File("datosBancarios/cuentasPlus.json");
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return fichero;
	}




	private static ArrayList<Cuenta> seleccionarCuentasLimiteSuperior() {
		ArrayList<Cuenta> cuentasLimiteSuperior= new ArrayList<Cuenta>();
		for (String pais : cuentasPorPaises.keySet()) {
			for (Cuenta cuenta : cuentasPorPaises.get(pais)) {
				if (cuenta.getBalance()>limiteSuperior) {
					cuentasLimiteSuperior.add(cuenta);
				}
			}
		}
		return cuentasLimiteSuperior;
	}




	private static void escribirCuentasEnDescubierto() {
		ArrayList<Cuenta> enDescubierto = seleccionarCuentasEnDescubierto();
		File fichero = crearFicheroDescubierto();
		EscribirEnFichero(fichero, enDescubierto);
		
		
		
		
	}




	private static File crearFicheroDescubierto() {
		File enDescubierto = new File("datosBancarios/enDescubierto.txt");
		if (!enDescubierto.exists()) {
			try {
				enDescubierto.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return enDescubierto;
	}
	
	private static File crearFicheroDescubiertoBinario() {
		File enDescubierto = new File("datosBancarios/enDescubierto.dat");
		if (!enDescubierto.exists()) {
			try {
				enDescubierto.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return enDescubierto;
	}




	private static ArrayList<Cuenta> seleccionarCuentasEnDescubierto() {
		ArrayList<Cuenta> enDescubierto =new ArrayList<Cuenta>();
		for (String pais : cuentasPorPaises.keySet()) {
			for (Cuenta cuenta : cuentasPorPaises.get(pais)) {
				if (cuenta.getBalance()<limiteInferior) {
					enDescubierto.add(cuenta);
				}
			}
		}
		return enDescubierto;
	}




	public static void dividirEnFicherosPorPais() {
		for (String pais : cuentasPorPaises.keySet()) {
			crearDirectorio(pais);
			File fichero = crearFichero(pais);
			EscribirEnFichero(fichero,cuentasPorPaises.get(pais));
		}
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

}
