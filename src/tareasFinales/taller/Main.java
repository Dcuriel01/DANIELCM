package tareasFinales.taller;

import unidad12.ConexionBD;

public class Main {

	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	
	public static void main(String[] args) {
		Garaje garaje = new Garaje();
		Coche c1 = null;
		Coche c2 = null;
		GarajeDAO gD = new GarajeDAO(url, usuario, password);
		ReparacionDAO rD = new ReparacionDAO(url, usuario, password);
		if (garaje.validadMatricula("B-6575-WE")) {
			c1 = new Coche("B-6575-WE", "Avenida Walid");
			gD.aniadirCoche(c1);
		}
		if (garaje.validadMatricula("WLD-1030")) {
			c2 = new Coche("WLD-1030", "Avenida Meziane");
			gD.aniadirCoche(c2);
		}
		
		Reparacion repar1 = new Reparacion("Problema de motor", 10000.0);
		Reparacion repar2 = new Reparacion("Problemas de motor", 20000.0);
		Reparacion repar3 = new Reparacion("Problema de caja de cambios", 1000.0);
		Reparacion repar4 = new Reparacion("Problema de aceite", 10000.0);
		c1.aniadirReparacion(repar1);
		rD.aniadirReparacion(repar1, c1);
		c1.aniadirReparacion(repar2);
		rD.aniadirReparacion(repar2, c1);
		gD.actualizarReparacion(c1);
		
		c2.aniadirReparacion(repar3);
		rD.aniadirReparacion(repar3, c2);
		c2.aniadirReparacion(repar4);
		rD.aniadirReparacion(repar4, c2);
		gD.actualizarReparacion(c2);
		
		c1.filtrarPalabraClave("Motor");
		
		System.out.println(c2.obtenerUltimaReparacion());
	}

}
