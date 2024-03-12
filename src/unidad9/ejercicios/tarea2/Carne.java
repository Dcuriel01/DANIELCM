package unidad9.ejercicios.tarea2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Carne extends Animal{

	private Double kgMensuales;
	Map<TiposComida, Double> comidas;
	
	public Carne(int id, String camada, String nombre, Sexo sexo, String raza, LocalDate fecha, Tipo tipo,double kgPienso,double kgPasto,
			double kgHeno,double kgBellotas) {
		super(id, camada, nombre, sexo, raza, fecha, tipo);
		this.kgMensuales=kgPienso+kgPasto+kgHeno+kgBellotas;
		comidas = new HashMap<TiposComida, Double>();
		comidas.put(TiposComida.PIENSO, kgPienso);
		comidas.put(TiposComida.PASTO, kgPasto);
		comidas.put(TiposComida.HENO, kgHeno);
		comidas.put(TiposComida.BELLOTAS, kgBellotas);
	}
	
	public void mostrarTiposComida() {
		System.out.println("Comidas de " + nombre);
		System.out.println("Kg totales = " + kgMensuales);
		for (TiposComida tipo : comidas.keySet()) {
			System.out.println("Tipo: " + tipo + " Kg: " + comidas.get(tipo));
		}
	}
}
