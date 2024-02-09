package unidad8Ejemplos;

public class Moto extends Vehiculo{

	private boolean limitacion;
	private String tipo;
	
	public Moto(String matricula, String nBastidor, String marca, String modelo, Motor motor) {
		super(matricula, nBastidor, marca, modelo, motor);
		// TODO Auto-generated constructor stub
	}
	
	public Moto(String matricula, String nBastidor, String marca, String modelo, Motor motor, boolean limitacion,
			String tipo) {
		super(matricula, nBastidor, marca, modelo, motor);
		this.limitacion = limitacion;
		this.tipo = tipo;
	}

	public boolean isLimitacion() {
		return limitacion;
	}

	public void setLimitacion(boolean limitacion) {
		this.limitacion = limitacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void mostrarDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Motor: " + motor.getTipoCombustible());
		System.out.println("limitacion: " + limitacion);
		System.out.println("Tipo: " + tipo);
	}

	
	
	
	
}
