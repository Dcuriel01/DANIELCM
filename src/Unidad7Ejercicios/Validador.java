package Unidad7Ejercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String fecha;
		String hora;
		String nombre;
		String dni;
		String telefono;
		String asignatura;
		String diasPropios;
		char temp;
		boolean diaLectivo1 = false;
		boolean diaLectivo2 = false;
		boolean diaLectivo3 = false;
		boolean diaNoLectivo = false;
		String dia = null;
		String mes = null;
		String ultimoNAnio = null;
		boolean firma = false;
		boolean concesion = false;
		
		System.out.println("Fecha:");
		fecha = sc.nextLine();
		System.out.println("Hora:");
		hora = sc.nextLine();
		System.out.println("Nombre:");
		nombre = sc.nextLine();
		System.out.println("DNI:");
		dni = sc.nextLine();
		System.out.println("Teléfono:");
		telefono = sc.nextLine();
		System.out.println("Asignatura:");
		asignatura = sc.nextLine();
		System.out.println("Días:");
		diasPropios = sc.nextLine();
		System.out.println("Marcar días con x y si no van a ser marcados con -");
		System.out.println("Dia Lectivo 1");
		temp=sc.next().charAt(0);
		diaLectivo1 = comprobarMarcas(temp);
		System.out.println("Dia Lectivo 2");
		temp=sc.next().charAt(0);
		diaLectivo2 = comprobarMarcas(temp);
		System.out.println("Dia Lectivo 3");
		temp=sc.next().charAt(0);
		diaLectivo3 = comprobarMarcas(temp);
		System.out.println("Dia No Lectivo");
		temp=sc.next().charAt(0);
		diaNoLectivo = comprobarMarcas(temp);
		System.out.println("Dia:");
		dia = sc.nextLine();
		System.out.println("Mes:");
		mes = sc.nextLine();
		System.out.println("Ultimo dígito año::");
		ultimoNAnio = sc.nextLine();
		System.out.println("Firme con un +");
		firma=true;
		
		Pattern patternHora = Pattern.compile("\\d{2}:\\d{2}");
		Matcher matcherHora = patternHora.matcher(hora);
		Pattern patternNombre = Pattern.compile("[A-Z]{1}[a-z]{10}\\s[A-Z]{1}[a-z]{10}\\s[A-Z]{1}[a-z]{10}");
		Matcher matcherNombre = patternNombre.matcher(nombre);
		Pattern patternDni = Pattern.compile("[1-9]{8}[A-Z]{1}");
		Matcher matcherDni = patternDni.matcher(dni);
		Pattern patternTelefono = Pattern.compile("[1-9]{3}\\s[1-9]{2}\\s[1-9]{2}\\s[1-9]{2}");
		Matcher matcherTelefono = patternTelefono.matcher(telefono);
		Pattern patternAsigantura = Pattern.compile("[A-Z]{1}[a-z]{11}");
		Matcher matcherAsignatura = patternAsigantura.matcher(asignatura);
		Pattern patternDias = Pattern.compile("(\\d{2}-\\d{2}-\\d{4}){1-4}");
		Matcher matcherDias = patternDias.matcher(diasPropios);
		Pattern patternDia = Pattern.compile("\\d{1-2}");
		Matcher matcherDia = patternDia.matcher(dia);
		Pattern patternMes = Pattern.compile("\\d{1-2}");
		Matcher matcherMes = patternMes.matcher(mes);
		Pattern patternAnio = Pattern.compile("\\d{1}");
		Matcher matcherAnio = patternAnio.matcher(ultimoNAnio);
		
	}
	private static boolean comprobarMarcas(char temp) {
		boolean respuesta = false;
		switch (temp) {
		case '+':
			respuesta = true;
			break;
		case '-':
			respuesta = false;
			break;

		default:
			
			break;
		}
		return respuesta;
	}
	public static boolean validarFecha(String fecha){
		boolean coincide = false;
		Pattern patternFecha = Pattern.compile("\\d{1-2}-\\d{1-2}-\\d{4}");
		Matcher matcherFecha = patternFecha.matcher(fecha);
		coincide = matcherFecha.matches();
		return coincide;
	}

}

