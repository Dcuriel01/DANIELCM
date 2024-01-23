package unidad7Ejercicios;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Banco {
	public static SecureRandom random = new SecureRandom();

	public static void main(String[] args) {

		String marca = null;
		String entidad = null;
		String numero = null;
		String fecha = null;
		int cvv = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De que marca es su tarjeta?");
		marca = sc.next();
		System.out.println("¿De que entidad es su tarjeta?");
		entidad = sc.next();
		System.out.println("El resto de datos serán generados automáticamente");
		numero = generarNumero();
		fecha = generarFecha();
		cvv = generarCvv();
		
		TarjetaBancaria tarjeta1 = generarTarjeta(marca,entidad,numero,fecha,cvv);
		imprimirDatos(tarjeta1);
		sc.close();

	}

	private static String generarFecha() {
		DateTimeFormatter formatoFecha1 = DateTimeFormatter.ofPattern("MM/yy");
		LocalDate fechaLocal = LocalDate.now();
		LocalDate fechaCaducidad = fechaLocal.plusYears(4);
		String fechaCaducidadCadena = fechaCaducidad.format(formatoFecha1);
		return fechaCaducidadCadena;
	}

	private static TarjetaBancaria generarTarjeta(String marca, String entidad, String numero,String fecha,
			int cvv) {
		TarjetaBancaria tarjeta1 = new TarjetaBancaria(numero,marca,entidad,fecha,cvv);
		return tarjeta1;
	}

	private static void imprimirDatos(TarjetaBancaria tarjeta1) {
		System.out.println(tarjeta1.imprimirDatos());;
		
	}

	private static int generarCvv() {
		int cvv;
		boolean salir = false;
		do {
			cvv = random.nextInt(999);
			if (cvv < 100 | cvv > 999) {

			} else {
				salir = true;
			}
		} while (!salir);
		
		return cvv;
	}

	private static String generarNumero() {
		String numero;
		long numero1;
		long numero2;
		boolean salir = false;
		do {
			numero1 = random.nextLong(9999999);
			numero2 = random.nextLong(9999999);
			if (numero1 < 1000000 | numero2 < 1000000) {

			} else {
				salir = true;
			}
		} while (!salir);

		numero = numero1 + "" + numero2;
		return numero;
	}

}
