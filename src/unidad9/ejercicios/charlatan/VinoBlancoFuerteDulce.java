package unidad9.ejercicios.charlatan;

import java.util.ArrayList;

public class VinoBlancoFuerteDulce extends Vino {

	public VinoBlancoFuerteDulce(int volMl,int calorias) {
		setVolMl(volMl);
		setCalorias(calorias);
		caloriasAzucar=70;
		setEjemplos();
	}
	
	
	@Override
	protected void setVolMl(int volMl) {
		if (volMl>=9&volMl<=12) {
			this.volMl=volMl;
		}else {
			System.out.println("Error en el valor del volumen de alcohol");
			this.volMl=0;
		}			
	}

	@Override
	protected void setCalorias(int calorias) {
		if (calorias>=177&calorias<=213) {
			this.calorias=calorias;
		}else {
			System.out.println("Error en el valor de las calorías");
			this.calorias=0;
		}			
	}
	@Override
	public String toString() {
		return "El vino creado es de tipo blanco dulce fuerte con " + volMl + "% de alcohol por cada 177ml\n"
				+ calorias + " calorias y " + caloriasAzucar + " calorias de azucar";
	}
}
