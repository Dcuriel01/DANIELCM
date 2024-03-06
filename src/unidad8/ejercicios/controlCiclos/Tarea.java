package unidad8.ejercicios.controlCiclos;

import java.security.SecureRandom;

public class Tarea extends Actividad {
	
	private int nota;
	private boolean grupo;

	public Tarea(String nombre, String dificultad, boolean grupo) {
		super(nombre, dificultad);
		this.grupo=grupo;
	}

	@Override
	public void calcularNota() {
		SecureRandom random = new SecureRandom();
		nota = random.nextInt(10)+1;
	}
	
	@Override
	public String toString() {
		if (grupo) {
			return "La tarea se llama " + nombre + " la dificultad es " + dificultad + " es en grupo y la nota ha sido " + nota;
			}else {
				return "La tarea se llama " + nombre + " la dificultad es " + dificultad + " no es en grupo y la nota ha sido " + nota;
			}
		}
		

}
