package unidad7Ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FechasHoras {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		System.out.println(fecha);
		
		//Fechas con LocalDate
		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual);
		
		Month mes = fechaActual.getMonth();
		System.out.println("Mes:" + mes.getValue());
		System.out.println("Mes:" + fechaActual.getMonthValue());
		System.out.println("Dia:" + fechaActual.getDayOfMonth());
		
		LocalDate fechaPasada = LocalDate.of(2024, 1, 1);
		System.out.println(fechaPasada);
		LocalDate fechaFuturo = fechaPasada.plusDays(10);
		System.out.println(fechaFuturo);
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaFormateada = fechaFuturo.format(formatoFecha);
		System.out.println(fechaFormateada);
		
		DateTimeFormatter formatoFecha2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaLocal = LocalDate.parse("25-12-2023", formatoFecha2);
		System.out.println(fechaLocal.format(formatoFecha));
		
		// HORAS
		
		LocalTime tiempo = LocalTime.now();
		System.out.println(tiempo);
		System.out.println("Hora:" + tiempo.getHour());
		System.out.println("Minutos:" + tiempo.getMinute());
		System.out.println("Hora despues de 3 horas: " + tiempo.plusHours(3).plusMinutes(12));
		
		// Fecha y hora
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		System.out.println(fechaHoraActual);
		
		LocalDateTime fechaHoraClase = LocalDateTime.of(2024, 1, 10, 10, 20, 45);
		System.out.println("Final de la clase: " + fechaHoraClase);
		
		DateTimeFormatter formatoFechaHora2 = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
		System.out.println("Final de la clase: " + fechaHoraClase.format(formatoFechaHora));
		System.out.println("Final de la clase: " + fechaHoraClase.format(formatoFechaHora2));

		LocalDateTime inicio = LocalDateTime.now();
		LocalDateTime fin = LocalDateTime.now().plusHours(2).plusMinutes(30);
		Duration duracion = Duration.between(inicio, fin);
		System.out.println(duracion.getSeconds());
		
		
		
		
		
	}

}
