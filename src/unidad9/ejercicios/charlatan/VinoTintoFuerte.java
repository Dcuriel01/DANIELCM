package unidad9.ejercicios.charlatan;

import java.util.ArrayList;

public class VinoTintoFuerte extends Vino {

	public VinoTintoFuerte(int volMl,int calorias) {
		setVolMl(volMl);
		setCalorias(calorias);
		caloriasAzucar=0.40;
	}
	
	
	@Override
	protected void setVolMl(int volMl) {
		if (volMl>=13&volMl<=16) {
			this.volMl=volMl;
		}else {
			System.out.println("Error en el valor del volumen de alcohol");
			this.volMl=0;
		}			
	}

	@Override
	protected void setCalorias(int calorias) {
		if (calorias>=165&calorias<=195) {
			this.calorias=calorias;
		}else {
			System.out.println("Error en el valor de las calorías");
			this.calorias=0;
		}			
	}
	@Override
	public String toString() {
		return "El vino creado es de tipo tinto fuerte con " + volMl + "% de alcohol por cada 177ml\n"
				+ calorias + " calorias y " + caloriasAzucar + " calorias de azucar";
	}


}
