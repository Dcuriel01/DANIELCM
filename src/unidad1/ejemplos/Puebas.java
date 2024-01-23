package unidad1.ejemplos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Puebas {

	public static boolean validarFecha(String fecha){
		boolean coincide = false;
		String [] fechas=new String[3];
		boolean dias31=false;
		boolean dias30=false;
		boolean dias29=false;
		boolean dias28=false;
		boolean error = false;
		int dia;
		int mes;
		int año;
		Pattern patternFecha = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		Matcher matcherFecha = patternFecha.matcher(fecha);
		fechas=fecha.split("-");
		dia = Integer.parseInt(fechas[0]);
		mes = Integer.parseInt(fechas[1]);
		año = Integer.parseInt(fechas[2]);
		if (fechas[2].equals("1")|fechas[2].equals("3")|fechas[2].equals("5")|fechas[2].equals("7")|fechas[2].equals("8")
				|fechas[2].equals("10")|fechas[2].equals("12")) {
			dias31=true;
		}else {
			if (fechas[2].equals("2")&año%4==0) {
				dias29=true;
			}else {
				dias28=true;
			}
			dias30=true;
		}
		if (matcherFecha.matches()) {
			if (dias31&(dia>31)|dia<0) {
				error = true;
			}else {
				coincide = true;
			}
			if (dias30&(dia>30)|dia<0) {
				error = true;
			}else {
				coincide = true;
			}
			if (dias28&(dia>28)|dia<0) {
				error = true;
			}else {
				coincide = true;
			}
			if (dias29&(dia>29)|dia<0) {
				error = true;
			}else {
				coincide = true;
			}
		}else {
			error=true;
		}
		if (error) {
			System.out.println("Error en la fecha de nacimiento");
		}
		return coincide;
	}
	public static boolean validarDni(String dni){
		boolean coincide = false;
		int dniNumero;
		char letra;
		Pattern patternDni = Pattern.compile("[1-9]{8}[A-Z]{1}");
		Matcher matcherDni = patternDni.matcher(dni);
		letra=dni.charAt(8);
		dniNumero=Integer.parseInt(dni);
		
		if (matcherDni.matches()) {
			
		}
		return coincide;
	}
	
	
	
	
}
