package unidad8Ejemplos;

public class Coche extends Vehiculo {
	
	private int numPuertas;
	private int numPlazas;
	private int capacidadMaletero;
	private String tipo;
	
	
	
	
	public Coche(String matricula, String nBastidor, String marca, String modelo, Motor motor) {
		super(matricula, nBastidor, marca, modelo, motor);
		
	}

	
	
	public Coche(String matricula, String nBastidor, String marca, String modelo, Motor motor, int numPuertas,
			int numPlazas, int capacidadMaletero, String tipo) {
		super(matricula, nBastidor, marca, modelo, motor);
		this.numPuertas = numPuertas;
		this.numPlazas = numPlazas;
		this.capacidadMaletero = capacidadMaletero;
		this.tipo = tipo;
	}


	
	
	
	public int getNumPuertas() {
		return numPuertas;
	}



	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}



	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}



	public void setCapacidadMaletero(int capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}



	public int getNumPlazas() {
		return numPlazas;
	}




	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void mostrarDatos(){
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Motor: " + motor.getTipoCombustible());
		System.out.println("Plazas: " + numPlazas);
	}
	
	
	

	
	
	
	
}
