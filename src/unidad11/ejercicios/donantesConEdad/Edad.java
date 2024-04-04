package unidad11.ejercicios.donantesConEdad;

import java.util.HashMap;

public class Edad {

	HashMap<TiposSangreConEdad, Integer> sangres = null;

	public Edad() {
		sangres = new HashMap<TiposSangreConEdad, Integer>();
	}
	
	public void añadirTipo(TiposSangreConEdad tipo) {
		sangres.put(tipo, sangres.getOrDefault(tipo, 0)+1);
	}
	public String mostrarMapa() {
		String cadena="";
	for (TiposSangreConEdad tipos : sangres.keySet()) {
		cadena=cadena + "tipo:"+tipos.getSangre()+ " cantidad:" + sangres.get(tipos) + "\n";
		}
	return cadena;
	}
	
}
