package interfacesGraficas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorBancario {

	public static boolean validarFecha(String fecha){
		boolean coincide = false;
		Pattern patternFecha = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		Matcher matcherFecha = patternFecha.matcher(fecha);
		if (matcherFecha.matches()) {
			if (fecha.equals("27-10-2005")) {
				coincide = true;
			}else {
				System.out.println("Error en la fecha");
			}
			
		}else {
			
		}
		
		return coincide;
	
	}
	public static boolean validarDni(String dni){
		boolean coincide = false;
		Pattern patternDni = Pattern.compile("[1-9]{8}[A-Z]{1}");
		Matcher matcherDni = patternDni.matcher(dni);
		if (matcherDni.matches()) {
			if (dni.equals("12345678Z")) {
				coincide = true;
			}else {
				
			}
			
		}else {
			System.out.println("Error en el formato del dni");
		}
		return coincide;
	}
	public static boolean validarCodSecreto(String codSecreto){
		boolean coincide = false;
		Pattern patternCodSecreto = Pattern.compile("[1-9]{6}");
		Matcher matcherCodSecreto = patternCodSecreto.matcher(codSecreto);
		if (matcherCodSecreto.matches()) {
			if (codSecreto.equals("123456")) {
				coincide = true;
			}else {
				System.out.println("Error en el codigo secreto");
			}
			
		}else {
			System.out.println("Error en el formato del codigo secreto");
		}
		return coincide;
	}
	
	
	
}
