package unidad8Ejemplos;

public class Vehiculo {

	protected String matricula;
	protected String nBastidor;
	protected String marca;
	protected String modelo;
	protected Motor motor;
	
	public Vehiculo(String matricula, String nBastidor, String marca, String modelo, Motor motor) {
		this.matricula = matricula;
		this.nBastidor = nBastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getnBastidor() {
		return nBastidor;
	}

	public void setnBastidor(String nBastidor) {
		this.nBastidor = nBastidor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	
	
	
	
	
	
	
	
}
