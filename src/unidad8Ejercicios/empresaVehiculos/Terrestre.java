package unidad8Ejercicios.empresaVehiculos;

import java.util.regex.Pattern;

public class Terrestre extends Vehiculo {

	protected int nRuedas;
	
	public Terrestre(String modelo,int nRuedas, String matricula) {
		super();
		this.modelo=modelo;
		this.nRuedas = nRuedas;
		setMatricula(matricula);
	}

	@Override
	protected void setMatricula(String matricula) {
		if (matricula.matches("[0-9]{4}\\s[A-Z]{3}")) {
			this.matricula=matricula;
		}else {
			System.out.println("Error en la matrícula");
			this.matricula="0";
		}
		
	}

}
