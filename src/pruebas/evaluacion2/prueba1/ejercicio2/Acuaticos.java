package pruebas.evaluacion2.prueba1.ejercicio2;

public class Acuaticos extends Vehiculo {

	protected int eslora;
	
	
	public Acuaticos(String modelo,int eslora,String matricula) {
		super();
		this.modelo=modelo;
		setMatricula(matricula);
		this.eslora=eslora;
	}

	@Override
	protected void setMatricula(String matricula) {
		if (matricula.matches("[A-Z]{3,10}")) {
			this.matricula=matricula;
		}else {
			System.out.println("Error en la matrícula");
			this.matricula="0";
		}
		
	}

	public int getEslora() {
		return eslora;
	}
	
	
	
}
