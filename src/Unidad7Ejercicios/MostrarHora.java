package Unidad7Ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MostrarHora {

	public static void main(String[] args) {
		LocalDateTime HoraActual = LocalDateTime.now();
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("La hora actual es: " + HoraActual.format(formatoHora));

	}

}
