package unidad8.ejemplos.herencia;

public class Motor {
	
	
	private String tipoCombustible;
	private double potencia;
	private double cc;
	
	public Motor() {
		
	}
	public Motor(String tipoCombustible, double potencia, double cc) {
		super();
		this.tipoCombustible = tipoCombustible;
		this.potencia = potencia;
		this.cc = cc;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}
	
}
