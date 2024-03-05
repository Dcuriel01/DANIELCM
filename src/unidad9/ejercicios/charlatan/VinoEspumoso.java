package unidad9.ejercicios.charlatan;

import java.util.ArrayList;

public class VinoEspumoso extends Vino {

	public VinoEspumoso() {
		volMl=158;
		calorias=158;
		caloriasAzucar=8.5;
	}
	
	
	@Override
	protected void setVolMl(int volMl) {		
	}

	@Override
	protected void setCalorias(int calorias) {
	}
	@Override
	public String toString() {
		return "El vino creado es de tipo espumoso con " + volMl + "% de alcohol por cada 177ml\n"
				+ calorias + " calorias y " + caloriasAzucar + " calorias de azucar";
	}

}
