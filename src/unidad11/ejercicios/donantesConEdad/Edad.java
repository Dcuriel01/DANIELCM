package unidad11.ejercicios.donantesConEdad;

import java.util.HashMap;

public class Edad {

	HashMap<TiposSangre, Integer> sangres = null;

	public Edad() {
		sangres = new HashMap<TiposSangre, Integer>();
	}
	
	public void añadirTipo(TiposSangre tipo) {
		sangres.put(tipo, sangres.getOrDefault(tipo, 0)+1);
	}
	public String mostrarMapa() {
		String cadena="";
	for (TiposSangre tipos : sangres.keySet()) {
		cadena=cadena + "tipo:"+tipos.getSangre()+ " cantidad:" + sangres.get(tipos) + "\n";
		}
	return cadena;
	}
	
}
