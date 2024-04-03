package unidad1.ejemplos;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Pruebas2 {
	static File ficheroEscritura = new File("ficheros//ficheroUser");
	public static void main(String[] args) {

		try {
			Desktop.getDesktop().open(ficheroEscritura);
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}	

}
