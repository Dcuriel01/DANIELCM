package unidad7.ejercicios.solicitudPermisos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	
	public static boolean comprobarMarcas(char temp) {
		boolean respuesta = false;
		if (temp=='+') {
			respuesta=true;
		}
		return respuesta;
	}
	public static boolean validarFecha(String fecha){
		boolean coincide = false;
		Pattern patternFecha = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		Matcher matcherFecha = patternFecha.matcher(fecha);
		coincide = matcherFecha.matches();
		return coincide;
	}
	public static boolean validarHora(String hora){
		boolean coincide = false;
		Pattern patternHora = Pattern.compile("\\d{2}:\\d{2}");
		Matcher matcherHora = patternHora.matcher(hora);
		coincide = matcherHora.matches();
		return coincide;
	}
	public static boolean validarNombre(String nombre){
		boolean coincide = false;
		Pattern patternNombre = Pattern.compile("[A-Z]{1}[a-z]{1,10}\\s[A-Z]{1}[a-z]{1,10}\\s[A-Z]{1}[a-z]{1,10}");
		Matcher matcherNombre = patternNombre.matcher(nombre);
		coincide = matcherNombre.matches();
		return coincide;
	}
	public static boolean validarDni(String dni){
		boolean coincide = false;
		Pattern patternDni = Pattern.compile("[1-9]{8}[A-Z]{1}");
		Matcher matcherDni = patternDni.matcher(dni);
		coincide = matcherDni.matches();
		return coincide;
	}
	
	public static boolean validarTelefono(String telefono){
		boolean coincide = false;
		Pattern patternTelefono = Pattern.compile("[1-9]{9}");
		Matcher matcherTelefono = patternTelefono.matcher(telefono);
		coincide = matcherTelefono.matches();
		return coincide;
	}
	public static boolean validarAsignatura(String asignatura){
		boolean coincide = false;
		Pattern patternAsigantura = Pattern.compile("[A-Z]{1}[a-z]{1,11}");
		Matcher matcherAsignatura = patternAsigantura.matcher(asignatura);
		coincide = matcherAsignatura.matches();
		return coincide;
	}
	public static boolean validarDias(String diasPropios){
		boolean coincide = false;
		Pattern patternDias = Pattern.compile("(\\d{2}-\\d{2}-\\d{4}\\s){1,4}");
		Matcher matcherDias = patternDias.matcher(diasPropios);
		coincide = matcherDias.matches();
		return coincide;
	}
	public static boolean validarDia(String dia){
		boolean coincide = false;
		Pattern patternDia = Pattern.compile("\\d{1,2}");
		Matcher matcherDia = patternDia.matcher(dia);
		coincide = matcherDia.matches();
		return coincide;
	}
	public static boolean validarMes(String mes){
		boolean coincide = false;
		Pattern patternMes = Pattern.compile("\\d{1,2}");
		Matcher matcherMes = patternMes.matcher(mes);
		coincide = matcherMes.matches();
		return coincide;
	}
	public static boolean validarAnio(String ultimoNAnio){
		boolean coincide = false;
		Pattern patternAnio = Pattern.compile("\\d{1}");
		Matcher matcherAnio = patternAnio.matcher(ultimoNAnio);
		coincide = matcherAnio.matches();
		return coincide;
	}
	

}

