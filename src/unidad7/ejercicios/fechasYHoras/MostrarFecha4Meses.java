package unidad7.ejercicios.fechasYHoras;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MostrarFecha4Meses {

	public static void main(String[] args) {
		LocalDateTime fechaActual = LocalDateTime.now().plusMonths(4);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("La fecha de hoy es: " + fechaActual.format(formatoFecha));

	}

}
