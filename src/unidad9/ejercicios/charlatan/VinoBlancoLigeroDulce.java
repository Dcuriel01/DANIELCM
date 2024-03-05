package unidad9.ejercicios.charlatan;

import java.util.ArrayList;

public class VinoBlancoLigeroDulce extends Vino {

	public VinoBlancoLigeroDulce(int volMl,int calorias) {
		setVolMl(volMl);
		setCalorias(calorias);
		caloriasAzucar=40;
		setEjemplos();
	}
	
	
	@Override
	protected void setVolMl(int volMl) {
		if (volMl>=6&volMl<=9) {
			this.volMl=volMl;
		}else {
			System.out.println("Error en el valor del volumen de alcohol");
			this.volMl=0;
		}			
	}

	@Override
	protected void setCalorias(int calorias) {
		if (calorias>=111&calorias<=147) {
			this.calorias=calorias;
		}else {
			System.out.println("Error en el valor de las calorías");
			this.calorias=0;
		}			
	}

	@Override
	public String toString() {
		return "El vino creado es de tipo blanco dulce ligero con " + volMl + "% de alcohol por cada 177ml\n"
				+ calorias + " calorias y " + caloriasAzucar + " calorias de azucar";
	}

}
