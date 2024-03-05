package unidad9.ejercicios.charlatan;

import java.util.ArrayList;

public class VinoDulce extends Vino {

	public VinoDulce(int volMl,int calorias,double caloriasAzucar) {
		setVolMl(volMl);
		setCalorias(calorias);
		setCaloriasAzucar(caloriasAzucar);
		setEjemplos();
	}
	
	
	@Override
	protected void setVolMl(int volMl) {
		if (volMl>=189&volMl<=275) {
			this.volMl=volMl;
		}else {
			System.out.println("Error en el valor del volumen de alcohol");
			this.volMl=0;
		}			
	}

	@Override
	protected void setCalorias(int calorias) {
		if (calorias>=189&calorias<=275) {
			this.calorias=calorias;
		}else {
			System.out.println("Error en el valor de las calorías");
			this.calorias=0;
		}			
	}

	protected void setCaloriasAzucar(double caloriasAzucar) {
		if (caloriasAzucar>=106&caloriasAzucar<=150) {
			this.caloriasAzucar=caloriasAzucar;
		}else {
			System.out.println("Error en el valor de las calorías de azucar");
			this.caloriasAzucar=0;
		}			
	}
	@Override
	public String toString() {
		return "El vino creado es de tipo dulce con " + volMl + "% de alcohol por cada 177ml\n"
				+ calorias + " calorias y " + caloriasAzucar + " calorias de azucar";
	}

}
