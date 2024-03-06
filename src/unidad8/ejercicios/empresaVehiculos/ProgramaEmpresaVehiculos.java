package unidad8.ejercicios.empresaVehiculos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgramaEmpresaVehiculos {

	public static void main(String[] args) {
		List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		
		Coche c1 = new Coche("1234 BHG", true,"Audi A4");
		Moto m1 = new Moto("1674 KLO", "Verde","Yamaha");
		Avion a1 = new Avion("AFHD 675931", 100,"Boing 747");
		Helicoptero h1 =new Helicoptero("GSSK 754932", 3, "Apache");
		Submarino s1 = new Submarino("65749", 10100,"HAG8");
		Barco b1 = new Barco("476278",true,"JA7");
		
		listaVehiculos.add(c1);
		listaVehiculos.add(m1);
		listaVehiculos.add(a1);
		listaVehiculos.add(h1);
		listaVehiculos.add(s1);
		listaVehiculos.add(b1);
		
		Iterator iteradorVehiculos = listaVehiculos.iterator();
		while (iteradorVehiculos.hasNext()) {
			Vehiculo vehiculo = (Vehiculo)iteradorVehiculos.next();
			System.out.println(vehiculo);
		}
		
		

	}

}
