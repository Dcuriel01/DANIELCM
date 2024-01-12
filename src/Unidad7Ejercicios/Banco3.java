package Unidad7Ejercicios;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Banco3 {
	public static SecureRandom random = new SecureRandom();

	public static void main(String[] args) {

		String marca = null;
		String entidad = null;
		String numero = null;
		String fecha = null;
		String cvv = null;
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		boolean salir=false;
		
		
		do {
			System.out.println("MENÚ");
			System.out.println("1. Calcular tarjeta de crédito random");
			System.out.println("2. Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Los datos serán generados automáticamente");
				marca = generarMarca();
				entidad = generarEntidad();
				numero = generarNumero();
				fecha = generarFecha();
				cvv = generarCvv();
				
				TarjetaCredito tarjeta1 = generarTarjeta(marca,entidad,numero,fecha,cvv);
				imprimirDatos(tarjeta1);
				break;
			case 2:
				salir=true;
				break;

			default:
				break;
			}
		} while (!salir);
		sc.close();

	}

	private static String generarEntidad() {
		String [] entidades = {"BBVA","Santander","Bankia","Sabadell","Unicaja","CaixaBank"};
		String entidad;
		int nRandom = random.nextInt(6);
		entidad = entidades[nRandom];
		return entidad;
	}

	private static String generarMarca() {
		String [] marcas = {"MasterCard","Visa","Maestro","Cirrus","American Express","Discover"};
		String marca;
		int nRandom = random.nextInt(6);
		marca = marcas[nRandom];
		return marca;
	}

	private static String generarFecha() {
		DateTimeFormatter formatoFecha1 = DateTimeFormatter.ofPattern("MM/yy");
		LocalDate fechaLocal = LocalDate.now();
		int nRandom = random.nextInt(9)+1;
		LocalDate fechaCaducidad = fechaLocal.plusYears(nRandom);
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
