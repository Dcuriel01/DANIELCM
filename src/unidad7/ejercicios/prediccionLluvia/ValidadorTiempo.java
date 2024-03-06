package unidad7.ejercicios.prediccionLluvia;

public class ValidadorTiempo {

	public static boolean validarIntro(String sentencia) {
		boolean validacion = false;
		if (sentencia.equals("Baja")|sentencia.equals("Media")|sentencia.equals("Alta")) {
			validacion=true;
		}
		
		return validacion;
	}
	
	
}