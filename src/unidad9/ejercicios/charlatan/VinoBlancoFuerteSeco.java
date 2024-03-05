package unidad9.ejercicios.charlatan;

import java.util.ArrayList;

public class VinoBlancoFuerteSeco extends Vino {

	public VinoBlancoFuerteSeco(int volMl,int calorias) {
		setVolMl(volMl);
		setCalorias(calorias);
		caloriasAzucar=0.30;
		setEjemplos();
	}
	
	
	@Override
	protected void setVolMl(int volMl) {
		if (volMl>=12&volMl<=14) {
			this.volMl=volMl;
		}else {
			System.out.println("Error en el valor del volumen de alcohol");
			this.volMl=0;
		}			
	}

	@Override
	protected void setCalorias(int calorias) {
		if (calorias>=153&calorias<=173) {
			this.calorias=calorias;
		}else {
			System.out.println("Error en el valor de las calorías");
			this.calorias=0;
		}			
	}
	@Override
	public String toString() {
		return "El vino creado es de tipo blanco seco fuerte con " + volMl + "% de alcohol por cada 177ml\n"
				+ calorias + " calorias y " + caloriasAzucar + " calorias de azucar";
	}


}
