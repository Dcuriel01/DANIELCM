package unidad6.ejercicios.tarea1;

import java.security.SecureRandom;

public class Profesor {

	public void ponerNotas(Alumno a1){
		SecureRandom random = new SecureRandom();
		double n1 = random.nextDouble(10);	
		double n2 = random.nextDouble(10);	
		double n3 = random.nextDouble(10);	
		a1.getAsig1().setCalificacion(n1);
		a1.getAsig2().setCalificacion(n2);
		a1.getAsig3().setCalificacion(n3);
	}
	
	public double calcularMedia(Alumno a1) {
		double media=0;
		double nota1 = a1.getAsig1().getCalificacion();
		double nota2 = a1.getAsig2().getCalificacion();
		double nota3 = a1.getAsig3().getCalificacion();
		media = (nota1 + nota2 + nota3)/3;
		return media;
	}
	
}
