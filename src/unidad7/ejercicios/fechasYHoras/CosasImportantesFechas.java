package unidad7.ejercicios.fechasYHoras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CosasImportantesFechas {

	public static void main(String[] args) {
		// Dar formatos a fechas
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//Asi se sabe cuanto tiempo ha pasado entre una fecha y otra primero la antigua
		System.out.println(ChronoUnit.DAYS.between(LocalDate.of(2022, 2, 2),LocalDate.now())); 
	}
	
}
