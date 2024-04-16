package unidad11.ejemplos.json.simple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeerJson {

	public static void main(String[] args) {

		JSONParser parser = new JSONParser();
		try {
			FileReader lector = new FileReader("ficheros/json/Menu.json");
			Object objeto;
			objeto = parser.parse(lector);
			
			JSONObject pJsonObject = (JSONObject)objeto;
			JSONArray array = (JSONArray)pJsonObject.get("PlatoFuerte");
			//leer llos datos del arrayObjeto creado
			for (int i = 0; i < array.size(); i++) {
				JSONObject plato = (JSONObject)array.get(i);
				String nombre = (String) plato.get("nombre");
				String precio = (String) plato.get("precio");
				System.out.println(nombre);
				System.out.println(precio);
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
