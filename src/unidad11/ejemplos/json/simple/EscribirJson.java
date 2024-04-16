package unidad11.ejemplos.json.simple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class EscribirJson {

	public static void main(String[] args) {

		JSONParser parser = new JSONParser();
		try {
			FileReader lector = new FileReader("ficheros/json/Menu.json");
			Object objeto;
			objeto = parser.parse(lector);
			
			JSONObject pJsonObject = (JSONObject)objeto;
			JSONArray array = (JSONArray)pJsonObject.get("PlatoFuerte");
			
			JSONObject nuevoPlato = new JSONObject();
			nuevoPlato.put("nombre", "Arroz caldoso");
			nuevoPlato.put("precio", "12");
			nuevoPlato.put("duracion", "30 minutos");
			nuevoPlato.put("tamaño", "mediano");
			array.add(nuevoPlato);
			
			try (FileWriter escritor = new FileWriter("ficheros/json/MenuModificado.json")){
				escritor.write(pJsonObject.toJSONString());
				escritor.flush();
				System.out.println("Objeto modificado con JSon");
				
			} catch (Exception e) {
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
