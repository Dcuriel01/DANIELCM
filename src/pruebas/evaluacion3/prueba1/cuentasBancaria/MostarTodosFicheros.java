package pruebas.evaluacion3.prueba1.cuentasBancaria;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.google.gson.Gson;



public class MostarTodosFicheros {

	public static void mostrarFicheros() {
		File ficheroDE = new File("datosBancarios/DE/cuentas.txt");
		File ficheroES = new File("datosBancarios/ES/cuentas.txt");
		File ficheroFR = new File("datosBancarios/FR/cuentas.txt");
		File ficheroSinPais = new File("datosBancarios/SinPais/cuentas.txt");
		File ficheroEnDescubierto = new File("datosBancarios/enDescubierto.txt");
		File ficheroCuentasPlus = new File("datosBancarios/cuentasPlus.json");
		File ficheroBinarioDE = new File("datosBancarios/DE/cuentas.dat");
		File ficheroBinarioES = new File("datosBancarios/ES/cuentas.dat");
		File ficheroBinarioFR = new File("datosBancarios/FR/cuentas.dat");
		File ficheroBinarioSinPais = new File("datosBancarios/SinPais/cuentas.dat");
		File ficheroBinarioEnDescubierto = new File("datosBancarios/enDescubierto.dat");
		ficherostxt(ficheroDE, "DE");
		ficherostxt(ficheroES, "ES");
		ficherostxt(ficheroFR, "FR");
		ficherostxt(ficheroSinPais, "Sin Pais");
		ficherostxt(ficheroEnDescubierto, "En descubierto");
		ficheroJson(ficheroCuentasPlus,"Cuentas Plus");
		ficheroBinario(ficheroBinarioDE,"DE binario");
		ficheroBinario(ficheroBinarioES,"ES binario");
		ficheroBinario(ficheroBinarioFR,"FR binario");
		ficheroBinario(ficheroBinarioSinPais,"Sin Pais binario");
		ficheroBinario(ficheroBinarioEnDescubierto,"En Descubierto binario");
	}
	
	
	private static void ficheroBinario(File fichero, String nombreFichero) {
		try(ObjectInputStream ois = 
				new ObjectInputStream (new FileInputStream(
						fichero))){
			System.out.println("Fichero:" + nombreFichero);
			while(true) {
				try {
					Cuenta cuenta = (Cuenta)ois.readObject();
					System.out.println(cuenta);
				} catch (EOFException e) {
					break;
				}
			}
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void ficheroJson(File fichero, String nombreFichero) {
		try {
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			StringBuilder contenido = new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			
			lector.close();
			Gson gson = new Gson();
			Cuenta[] cuentas = gson.fromJson(contenido.toString(), Cuenta[].class);
			System.out.println("Fichero: " + nombreFichero);
			for (Cuenta cuenta : cuentas) {
				System.out.println(cuenta);
			}
			
		} catch (IOException e) {
			
		}
		
	}

	private static void ficherostxt(File fichero,String nombreFichero){
		try {
			File ficheroLectura = new File("Fichero");
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
				String cadena;
				System.out.println("Fichero: " + nombreFichero);
				cadena = lector.readLine();
				while (cadena != null) {
					cadena = lector.readLine();
					if(cadena!=null) {
					System.out.println(cadena);
					}
				}	
				
				lector.close();
				
		}catch (IOException e) {
			e.printStackTrace();
	}
	}

}
