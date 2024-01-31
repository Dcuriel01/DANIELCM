package unidad7Ejercicios;

public class CalcularPrediccion {

	public static String calcularLluvia(String presion,String humedad) {
		String probabilidad;
		if (presion=="Baja"&humedad=="Alta") {
			probabilidad = "Muy alta";
		}else if (presion=="Baja"&humedad=="Media") {
			probabilidad = "Alta";
		}else if (presion=="Baja"&humedad=="Baja") {
			probabilidad = "Media";
		}else if (presion=="Media"&humedad=="Media") {
			probabilidad = "Media";
		}else {
			probabilidad = "Baja";
		}
		
		return probabilidad;
		
		}

	public static String calcularSol(String presion,String humedad) {
		String probabilidad;
		if (presion=="Baja"&humedad=="Alta") {
			probabilidad = "Baja";
		}else if (presion=="Baja"&humedad=="Media") {
			probabilidad = "Media";
		}else if (presion=="Baja"&humedad=="Baja") {
			probabilidad = "Media";
		}else if (presion=="Media"&humedad=="Media") {
			probabilidad = "Media";
		}else {
			probabilidad = "Alta";
		}
		
		return probabilidad;
		
		}
	public static String calcularFrio(String presion,String humedad) {
		String probabilidad;
		if (presion=="Baja"&humedad=="Alta") {
			probabilidad = "Alta";
		}else if (presion=="Baja"&humedad=="Media") {
			probabilidad = "Media";
		}else if (presion=="Baja"&humedad=="Baja") {
			probabilidad = "Media";
		}else if (presion=="Media"&humedad=="Media") {
			probabilidad = "Media";
		}else {
			probabilidad = "Alta";
		}
		
		return probabilidad;
		
	}
}
