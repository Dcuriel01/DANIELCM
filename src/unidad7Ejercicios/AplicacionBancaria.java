package unidad7Ejercicios;

import java.security.SecureRandom;
import java.util.Scanner;

public class AplicacionBancaria {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String dni;
		String fechaNac;
		boolean noErrorDni;
		boolean noErrorFecha;
		boolean error;
		int n1;
		int n2;
		int n3;
		String [] numeroSecreto = {"1","2","3","4","5","6"};
		String [] numeroSecretoCambiar = {"0","0","0","0","0","0"};
		do {
		System.out.println("Introduzca su dni");
		dni = sc.nextLine();
		System.out.println("Introduzca su fecha de nacimiento");
		fechaNac = sc.nextLine();
		noErrorDni = validarDni(dni);
		noErrorFecha = validarFecha(fechaNac);
		if (!noErrorDni|!noErrorFecha) {
			System.out.println("pruebe de nuevo");
		}
		} while (!noErrorDni|!noErrorFecha);
		n1=generarNumeroRandom();
		n2=generarNumeroRandom();
		while (n1==n2) {
			if (n1==n2) {
				n2=generarNumeroRandom();
			}
		}
		n3=generarNumeroRandom();
		while (n1==n3|n2==n3) {
			n3=generarNumeroRandom();
		}
		do {
		error = codigoSecreto(n1,n2,n3,numeroSecretoCambiar,numeroSecreto);
		if (error) {
			System.out.println("pruebe de nuevo");
		}
		} while (error);
		System.out.println("Ha accedido a su cuenta");
		SolicitudBancaria cuenta1 = new SolicitudBancaria(dni, fechaNac, "1,2,3,4,5,6");
		
		
	}

	private static boolean codigoSecreto(int n1, int n2, int n3, String[] numeroSecreto, String[] numeroBuscado) {
		String numUsuario;
		String [] numUsuarioSplit = new String [3];
		boolean error = true;
		int contador = 0;
		int [] huecos = new int [3];
		numeroSecreto[n1]="*";
		numeroSecreto[n2]="*";
		numeroSecreto[n3]="*";
		for (String x : numeroSecreto) {
			System.out.print(x);
		}
		System.out.println(" ");
		System.out.println("Introduca los numeros que faltan con formato 0 0 0");
		numUsuario = sc.nextLine();
		numUsuarioSplit=numUsuario.split(" ");
		for (int i = 0; i < numeroSecreto.length; i++) {
			 if (!numeroSecreto[i].equals("*")) {
				huecos[contador]=i;
				contador++;
			}
			
		}
		if (numeroBuscado[huecos[0]].equals(numUsuarioSplit[0])) {
			if (numeroBuscado[huecos[1]].equals(numUsuarioSplit[1])) {
				if (numeroBuscado[huecos[2]].equals(numUsuarioSplit[2])) {
					error=false;
				}else {
					System.out.println("Error en el numero secreto");
				}
			}else {
				System.out.println("Error en el numero secreto");
			}
		}else {
			System.out.println("Error en el numero secreto");
		}
		return error;
	}

	private static int generarNumeroRandom() {
		SecureRandom random = new SecureRandom();
		int numAleatorio = random.nextInt(6);
		return numAleatorio;
	}

	private static boolean validarFecha(String fechaNac) {
		boolean noError;
		noError = ValidadorBancario.validarFecha(fechaNac);
		return noError;
	}

	private static boolean validarDni(String dni) {
		boolean noError;
		noError = ValidadorBancario.validarDni(dni);
		return noError;
	}

}
