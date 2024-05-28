package pruebas.evaluacion3.pruebaFinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Properties;




public class EscribirJustificante {
	static String directorioCitas;
	static String directorioPagos;
	
	public static void escribirFichero(Cita cita) {
		leerPropiedades();
		crearDirectorioCita();
		File fichero = crearFicheroCita(cita.getCita());
		try(PrintWriter escritor = new PrintWriter(fichero)) {
			escritor.println(cita);
		} catch (FileNotFoundException e) {


		}
	}
	
	private static void crearDirectorioCita() {
		File directorioDni= new File(directorioCitas);
		if (!directorioDni.exists()) {
			directorioDni.mkdirs();
		}
		
		
	}
	
	private static File crearFicheroCita(String cita) {
		File citaFichero = new File(directorioCitas + "/" + cita + ".txt");
		if (!citaFichero.exists()) {
			try {
				citaFichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return citaFichero;
	}

	public static void escribirPago(Pago pago) {
		leerPropiedades();
		crearDirectorioPago();
		File ficheroPago = crearFicheroPago(pago.getNumeroReserva());
		try(ObjectOutputStream oos = 
				new ObjectOutputStream (new FileOutputStream
						(ficheroPago))){
			oos.writeObject(pago);
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void crearDirectorioPago() {
		File directorioDni= new File(directorioPagos);
		if (!directorioDni.exists()) {
			directorioDni.mkdirs();
		}
		
		
	}
	
	private static File crearFicheroPago(String cita) {
		File citaFichero = new File(directorioPagos+"/" + cita + ".dat");
		if (!citaFichero.exists()) {
			try {
				citaFichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return citaFichero;
	}

	private static void leerPropiedades() {
		Properties propiedades = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("ficheros/properties/tareaFinal.properties");
			propiedades.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		directorioCitas=propiedades.getProperty("directorioCitas");
		directorioPagos=propiedades.getProperty("directorioPagos");
	}
	
}
