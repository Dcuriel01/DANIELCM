package unidad11.ejemplos.json.Gson.tarjetas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirTarjetas {

	public static void main(String[] args) {

		List<Tarjeta>listaTarjetas = new ArrayList<Tarjeta>();
		
		Tarjeta t1 = new Tarjeta("Visa", "2341242362","78234678264", "Daniel Curiel", "01/29");
		Tarjeta t2 = new Tarjeta("American Express", "347283748712","12378948917", "Pedro Acosta", "10/26");
		Tarjeta t3 = new Tarjeta("MasterCard", "4782893478","38472462837", "Fernando Alonso", "07/28");
		
		listaTarjetas.add(t1);
		listaTarjetas.add(t2);
		listaTarjetas.add(t3);
		
		Tarjetas contenedor = new Tarjetas();
		contenedor.setTarjetas(listaTarjetas);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		File fichero = new File("ficheros/json/tarjetasNuevas.json");
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero));
			escritor.write(gson.toJson(contenedor));
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
