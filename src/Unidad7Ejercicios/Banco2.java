package Unidad7Ejercicios;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Banco2 {
	public static SecureRandom random = new SecureRandom();

	public static void main(String[] args) {

		String marca = null;
		String entidad = null;
		String numero = null;
		String fecha = null;
		String cvv = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De que marca es su tarjeta?");
		marca = sc.next();
		System.out.println("¿De que entidad es su tarjeta?");
		entidad = sc.next();
		System.out.println("El resto de datos serán generados automáticamente");
		numero = generarNumero();
		fecha = generarFecha();
		cvv = generarCvv();
		
		TarjetaCredito tarjeta1 = generarTarjeta(marca,entidad,numero,fecha,cvv);
		imprimirDatos(tarjeta1);
		sc.close();

	}

	private static String generarFecha() {
		int x = random.nextInt(11);
		DateTimeFormatter formatoFecha1 = DateTimeFormatter.ofPattern("MM/yy");
		LocalDate fechaLocal = LocalDate.now();
		LocalDate fechaCaducidad = fechaLocal.plusYears(x);
		String fechaCaducidadCadena = fechaCaducidad.format(formatoFecha1);
		return fechaCaducidadCadena;
	}

	private static TarjetaCredito generarTarjeta(String marca, String entidad, String numero,String fecha,
			String cvv) {
		TarjetaCredito tarjeta1 = new TarjetaCredito(numero,marca,entidad,fecha,cvv);
		return tarjeta1;
	}

	private static void imprimirDatos(TarjetaCredito tarjeta1) {
		System.out.println(tarjeta1.imprimirDatos());;
		
	}

	private static String generarCvv() {
		int nRandom;
		String cvv=null;
		nRandom = random.nextInt(999);
		if (nRandom%10==nRandom) {
			cvv=0+""+0+""+nRandom;
		}else {
			if (nRandom%100==nRandom) {
				cvv=0+""+nRandom;
			}else {
				cvv=nRandom+"";
			}
		}
		return cvv;
	}

	private static String generarNumero() {
		String numero;
		long numero1;
		long numero2;
		String numeroCadena1;
		String numeroCadena2;
		numero1 = random.nextLong(9999999);
		numero2 = random.nextLong(9999999);
		numeroCadena1=añadir0(numero1);
		numeroCadena2=añadir0(numero2);
		numero = numeroCadena1 + "" + numeroCadena2;
		return numero;
	}

	private static String añadir0(long numeroX) {
		String numero=null;
		if (numeroX%10==numeroX) {
			numero=0+""+0+""+0+""+0+""+0+""+0+""+numeroX;
		}else {
			if (numeroX%100==numeroX) {
				numero=0+""+0+""+0+""+0+""+0+""+numeroX;
			}else {
				if (numeroX%1000==numeroX) {
					numero=0+""+0+""+0+""+0+""+numeroX;
				}else {
					if (numeroX%10000==numeroX) {
						numero=0+""+0+""+0+""+numeroX;
					}else {
						if (numeroX%100000==numeroX) {
							numero=0+""+0+""+numeroX;
						}else {
							if (numeroX%1000000==numeroX) {
								numero=0+""+numeroX;
							}else {
								numero=""+numeroX;
							}
						}
					}
				}
			}
		}
		
		return numero;
	}

}
