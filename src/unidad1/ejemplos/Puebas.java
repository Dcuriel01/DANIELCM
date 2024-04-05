package unidad1.ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Puebas{
	public static PrintWriter escritor = null;
	public static void main(String[]args) {
		String fecha = "01/12/2003";
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaCaducidad = LocalDate.parse(fecha,formatoFecha);
		fechaCaducidad.format(formatoFecha);
		System.out.println(fechaCaducidad);
	}
}