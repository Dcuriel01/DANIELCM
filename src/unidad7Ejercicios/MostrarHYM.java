package unidad7Ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MostrarHYM {

	public static void main(String[] args) {
		LocalDateTime horaActual = LocalDateTime.now();
		DateTimeFormatter formatoHoras = DateTimeFormatter.ofPattern("HH");
		DateTimeFormatter formatoMinutos = DateTimeFormatter.ofPattern("mm");
		System.out.println("Son las " + horaActual.format(formatoHoras) + " Horas y " + horaActual.format(formatoMinutos) + " minutos");
	}

}
