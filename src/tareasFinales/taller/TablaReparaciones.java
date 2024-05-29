package tareasFinales.taller;

import unidad12.ConexionBD;
import unidad13.ejemplos.menu.Tabla;

public class TablaReparaciones {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	
	public static void tablaBaseRelacional() {
		ReparacionDAO rD = new ReparacionDAO(url, usuario, password);
		String[][] reparaciones = rD.listarTodosLasReparaciones();
		String [] cabecera = new String[]{"Matricula","Descripcion","Kilometraje"};
		new Tabla(reparaciones,cabecera,"Reparaciones").setVisible(true);
	}

}
