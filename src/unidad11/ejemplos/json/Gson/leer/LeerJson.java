package unidad11.ejemplos.json.Gson.leer;

import com.google.gson.Gson;

public class LeerJson {

	public static void main(String[] args) {

		String json ="{'nombre':'Paco','email':'Paco@educarex.es','curso':'DAW'}";
		Gson gson = new Gson();
		Usuario usuario=gson.fromJson(json, Usuario.class);
		
		System.out.println(usuario);
		
	}

}
