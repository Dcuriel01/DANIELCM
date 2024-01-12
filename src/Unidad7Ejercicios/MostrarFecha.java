package Unidad7Ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MostrarFecha {

	public static void main(String[] args) {
		LocalDateTime fechaActual = LocalDateTime.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("La fecha de hoy es: " + fechaActual.format(formatoFecha));

	}

}
