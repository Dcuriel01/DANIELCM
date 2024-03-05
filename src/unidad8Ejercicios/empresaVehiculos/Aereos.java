package unidad8Ejercicios.empresaVehiculos;

public class Aereos extends Vehiculo {

	protected int nAsientos;
	
	
	public Aereos(String modelo,int nAsientos,String matricula) {
		super();
		this.modelo=modelo;
		setMatricula(matricula);
		this.nAsientos=nAsientos;
	}

	@Override
	protected void setMatricula(String matricula) {
		if (matricula.matches("[A-Z]{4}\\s[0-9]{6}")) {
			this.matricula=matricula;
		}else {
			System.out.println("Error en la matrícula");
			this.matricula="0";
		}
		
	}
	
}
