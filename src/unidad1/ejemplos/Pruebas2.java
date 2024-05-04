package unidad1.ejemplos;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Pruebas2 {
	static File ficheroEscritura = new File("ficheros//ficheroUser");
	public static void main(String[] args) {
		int pts =0;
		SecureRandom random = new SecureRandom();
		pts = pts+ random.nextInt(10)+1;
		pts = pts+ random.nextInt(5)+1;
		pts = pts+ random.nextInt(2)+1;
		System.out.println(pts);
		
	}	

}
