package unidad1.ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Puebas{
	public static PrintWriter escritor = null;
	public static void main(String[]args) {
		LocalDateTime inicio = LocalDateTime.now();
		LocalDateTime fin = LocalDateTime.now().plusHours(2).plusMinutes(30);
		Duration duracion = Duration.between(inicio, fin);
		System.out.println(duracion.getSeconds()/60);
	}
}