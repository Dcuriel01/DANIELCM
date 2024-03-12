package unidad9.ejercicios.tarea2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Crianza extends Animal {

	Map<String, Integer> crias;
	
	public Crianza(int id, String camada, String nombre, Sexo sexo, String raza, LocalDate fecha, Tipo tipo) {
		super(id, camada, nombre, sexo, raza, fecha, tipo);
		crias = new HashMap<String, Integer>();
	}
	
	public void añadirCrianza(String año, int nCrias) {
		crias.put(año, nCrias);
	}
	public void mostrarCrianza() {
		System.out.println("Crianzas de " + nombre);
		for (String año : crias.keySet()) {
			System.out.println("Año: " + año + " número de crias: " + crias.get(año));
		}
	}
	
	
}
