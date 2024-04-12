package unidad1.ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Puebas{
	public static PrintWriter escritor = null;
	public static void main(String[]args) {
		String cadena = "Abelenda García, Laura           |G.S. Desarrollo de Aplicaciones Multiplataforma |DAM";
		String[] datos = cadena.split(",");
		String[] datos2 = datos[1].split("|");
		System.out.println(datos[0]+" "+datos2[2]);
	}
}