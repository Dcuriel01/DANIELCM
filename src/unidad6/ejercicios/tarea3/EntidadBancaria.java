package unidad6.ejercicios.tarea3;

import java.util.Scanner;

public class EntidadBancaria {
	public static Scanner sc = new Scanner(System.in);
	
	public static Titular t1 = new Titular ("Daniel", "Curiel Mora", 18);
	public static Titular t2 = new Titular ("Sergio", "Sánchez Pérez", 38);
	public static Titular t3 = new Titular ("Calos", "Domingo Yuste", 65);
	
	public static CuentaCorriente CC1 = new CuentaCorriente(t1,"1234-7459-2348-4234-2344" , 200);
	public static CuentaCorriente CC2 = new CuentaCorriente(t2,"3123-1231-5356-7341-1231" , 500);
	public static CuentaAhorro CA1 = new CuentaAhorro(t3, "7564-2467-2341-3276-0452", 500, 4.3);
	
	public static void main(String[] args) {
		double nIntro;
		int opcion;
		opcion=menu();
		switch (opcion) {
		case 1:
			opcion = mostrarCuentas();
			System.out.println("Cuanto desea ingresar");
			nIntro=sc.nextDouble();
			switch (opcion) {
			case 1:
				CC1.ingresar(nIntro);
				System.out.println("Saldo en cuenta = " + CC1.getSaldo());
				break;
			case 2:
				CC2.ingresar(nIntro);
				System.out.println("Saldo en cuenta = " + CC2.getSaldo());
				break;
			case 3:
				CA1.ingresar(nIntro);
				System.out.println("Saldo en cuenta = " + CA1.getSaldo());
				break;

			default:
				System.out.println("No reconocido");
				break;
			}
			break;

		case 2:
			opcion = mostrarCuentas();
			System.out.println("Cuanto desea retirar");
			nIntro=sc.nextDouble();
			switch (opcion) {
			case 1:
				CC1.reintegro(nIntro);
				System.out.println("Saldo en cuenta = " + CC1.getSaldo());
				break;
			case 2:
				CC2.reintegro(nIntro);
				System.out.println("Saldo en cuenta = " + CC2.getSaldo());
				break;
			case 3:
				CA1.reintegro(nIntro);
				System.out.println("Saldo en cuenta = " + CA1.getSaldo());
				break;

			default:
				System.out.println("No reconocido");
				break;
			}
			break;
			
		case 4:
			opcion = mostrarCuentas();
			switch (opcion) {
			case 1:
				CC1.getTitular().imprimirTitular();
				System.out.println(" ");
				CC1.imprimirCuenta();
				break;
			case 2:
				CC2.getTitular().imprimirTitular();
				System.out.println(" ");
				CC2.imprimirCuenta();
				break;
			case 3:
				CA1.getTitular().imprimirTitular();
				System.out.println(" ");
				CA1.imprimirCuenta();
				break;

			default:
				System.out.println("No reconocido");
				break;
			}
			break;
			
		case 5:
			System.out.println("Ok saliendo");
			break;

		default:
			System.out.println("No reconocido");
			break;
		}
		
		
		
	}

	private static int mostrarCuentas() {
		int opcion;
		System.out.println("Cuenta 1: " + CC1.getnCuenta());
		System.out.println("Cuenta 2: " + CC2.getnCuenta());
		System.out.println("Cuenta 3: " + CA1.getnCuenta());
		opcion=sc.nextInt();
		return opcion;
	}

	private static int menu() {
		int opcion;
		System.out.println("1. Introducir dinero en cuenta");
		System.out.println("2. Sacar dinero en cuenta");
		System.out.println("3. Comparar cuentas");
		System.out.println("4. Información cuentas");
		System.out.println("5. Salir");
		opcion=sc.nextInt();
		return opcion;
		
	}

}
