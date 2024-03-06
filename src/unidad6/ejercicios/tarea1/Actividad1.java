package unidad6.ejercicios.tarea1;

import java.text.DecimalFormat;

public class Actividad1 {

	public static void main(String[] args) {
		double media;
		Asignatura asig1 = new Asignatura(1);
		Asignatura asig2 = new Asignatura(2);
		Asignatura asig3 = new Asignatura(3);
		
		Alumno a1 = new Alumno(asig1, asig2, asig3);
		
		Profesor p1 = new Profesor();
		
		p1.ponerNotas(a1);
		media = p1.calcularMedia(a1);
		DecimalFormat formato = new DecimalFormat("0.0");
		System.out.println("La media del alumno es: " + formato.format(media));
	}

}
