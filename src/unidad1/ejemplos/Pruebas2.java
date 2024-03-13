package unidad1.ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Pruebas2 {

	public static void main(String[] args) {

		System.out.println(ChronoUnit.DAYS.between(LocalDate.of(2024, 3, 12), LocalDate.now()));
		
	}	

}
