package unidad11.ejemplos.json.Gson.tarjetas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.google.gson.Gson;

public class LeerTarjetas {

	public static void main(String[] args) {
		try {
			Gson gson = new Gson();
			File fichero = new File("ficheros/json/tarjetas.json");
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			Tarjetas tarjetas = gson.fromJson(lector, Tarjetas.class);
			lector.close();
			for (Tarjeta tarjeta : tarjetas.getTarjetas()) {
				System.out.println(tarjeta);
				System.out.println("----------------------");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
