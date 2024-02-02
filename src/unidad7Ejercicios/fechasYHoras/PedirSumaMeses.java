package unidad7Ejercicios.fechasYHoras;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PedirSumaMeses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int mesesSumar = 0;
		String fechaActual;
		do {
			System.out.println("¿Cuántos meses desea añadir a la fecha actual?");
			mesesSumar = sc.nextInt();
			salir = comprobarNumero(mesesSumar);
		} while (!salir);
		fechaActual = generarFecha(mesesSumar);
		System.out.println("La fecha actual más " + mesesSumar + " meses es: " + fechaActual);

	}

	private static String generarFecha(int mesesSumar) {
		LocalDateTime fecha = LocalDateTime.now().plusMonths(mesesSumar);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaActual = fecha.format(formatoFecha);
		return fechaActual;
		
	}

	private static boolean comprobarNumero(int mesesSumar) {
		boolean salir = false;
		if (mesesSumar<0) {
			System.out.println("Error pruebe de nuevo");
		}else {
			salir = true;
		}
		return salir;
	}

}
