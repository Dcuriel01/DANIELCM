package unidad8Ejercicios.controlCiclos;

import java.security.SecureRandom;

public class Ejercicios extends Actividad {
	private NotasLetras nota;
	
	public Ejercicios(String nombre, String dificultad) {
		super(nombre, dificultad);
	}

	@Override
	public void calcularNota() {
		SecureRandom random = new SecureRandom();
		int nAleatorio = random.nextInt(4);
		switch (nAleatorio) {
		case 0:
			nota=NotasLetras.A;
			break;
		case 1:
			nota=NotasLetras.B;
			break;
		case 2:
			nota=NotasLetras.C;
			break;
		case 3:
			nota=NotasLetras.D;
			break;
		default:
			break;
		}
	}
	@Override
	public String toString() {
		return "La tarea se llama " + nombre + " la dificultad es " + dificultad + " y la nota ha sido " + nota;
	}

}
