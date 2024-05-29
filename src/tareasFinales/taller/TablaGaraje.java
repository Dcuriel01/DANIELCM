package tareasFinales.taller;

import unidad12.ConexionBD;
import unidad13.ejemplos.menu.Tabla;

public class TablaGaraje {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	
	public static void tablaBaseRelacional() {
		GarajeDAO gD = new GarajeDAO(url, usuario, password);
		String[][] coches = gD.listarTodosLosCoches();
		String [] cabecera = new String[]{"Matricula","Direccion","Nº Reparaciones"};
		new Tabla(coches,cabecera,"Coches").setVisible(true);
	}

}
