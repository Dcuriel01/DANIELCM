package unidad9.ejercicios.tarea2;

import java.time.LocalDate;

public class Lechero extends Animal{

	private int litrosLeche;
	private int años;
	
	public Lechero(int id, String camada, String nombre, Sexo sexo, String raza, LocalDate fecha, Tipo tipo,
			int litrosLeche, int años) {
		super(id, camada, nombre, sexo, raza, fecha, tipo);
		this.litrosLeche = litrosLeche;
		this.años = años;
	}

	public int getLitrosLeche() {
		return litrosLeche;
	}

	public void setLitrosLeche(int litrosLeche) {
		this.litrosLeche = litrosLeche;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " tiene " + años + " años y da " +litrosLeche + " litros de leche";
	}
}
