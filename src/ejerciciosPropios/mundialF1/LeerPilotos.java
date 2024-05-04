package ejerciciosPropios.mundialF1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class LeerPilotos {
	
	public static void main(String[] args) {
		Pilotos_f1 pilotos = recuperarPilotos();
		ArrayList<Piloto> p = (ArrayList<Piloto>) pilotos.getPilotos_f1();
		for (Piloto piloto : p) {
			System.out.println(piloto.getNombre()+","+piloto.getAbreviatura());
			
		}
		
	}

	public static Pilotos_f1 recuperarPilotos() {
		Pilotos_f1 pilotos = null;
		try {
			Gson gson = new Gson();
			File fichero = new File("ficheros/mundialF1/pilotos.json");
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			pilotos = gson.fromJson(lector, Pilotos_f1.class);
			lector.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pilotos;
	}
}
