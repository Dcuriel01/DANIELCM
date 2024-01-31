package unidad7Ejercicios;

public class Dias {

	private String presion = null;
	private String humedad = null;
	private String lluvia = null;
	private String sol = null;
	private String frio = null;
	private boolean validacionPresion;
	private boolean validacionHumedad;

	public Dias(String presion, String humedad, int i) {
		this.presion = presion;
		this.humedad = humedad;
		validacionPresion = ValidadorTiempo.validarIntro(presion);
		validacionHumedad = ValidadorTiempo.validarIntro(humedad);
		if (validacionPresion&validacionHumedad) {
			lluvia = CalcularPrediccion.calcularLluvia(presion, humedad); 
			sol = CalcularPrediccion.calcularSol(presion, humedad);
			frio = CalcularPrediccion.calcularFrio(presion, humedad);
		}else {
			this.presion=null;
			this.humedad=null;
			System.out.println("Error en el dia: " + (i+1));
		}
		
	}

	public String getPresion() {
		return presion;
	}

	public void setPresion(String presion) {
		this.presion = presion;
	}

	public String getHumedad() {
		return humedad;
	}

	public void setHumedad(String humedad) {
		this.humedad = humedad;
	}

	public String getLluvia() {
		return lluvia;
	}

	public void setLluvia(String lluvia) {
		this.lluvia = lluvia;
	}

	public String getSol() {
		return sol;
	}

	public void setSol(String sol) {
		this.sol = sol;
	}

	public String getFrio() {
		return frio;
	}

	public void setFrio(String frio) {
		this.frio = frio;
	}

	public boolean isValidacionPresion() {
		return validacionPresion;
	}

	public void setValidacionPresion(boolean validacionPresion) {
		this.validacionPresion = validacionPresion;
	}

	public boolean isValidacionHumedad() {
		return validacionHumedad;
	}

	public void setValidacionHumedad(boolean validacionHumedad) {
		this.validacionHumedad = validacionHumedad;
	}
	
	public void mostrarDatos() {
		if (validacionHumedad&validacionPresion) {
			System.out.println("Con la presión " + presion + " y la humedad " + humedad );
			System.out.println("La probabilidad de lluvia es " + lluvia + ", la de sol es " + sol + " y la de frio "
					+ frio);
		}else {
			System.out.println("Día mal introducido");
		}
		
	}

	
	
}