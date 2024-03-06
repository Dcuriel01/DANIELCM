package unidad8.ejercicios.empresaVehiculos;

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
		if (matricula.matches("[0-9]{3,10}")) {
			this.matricula=matricula;
		}else {
			System.out.println("Error en la matrícula");
			this.matricula="0";
		}
		
	}
	
	
	
}
