package pruebas.evaluacion3.pruebaFinal;

import java.util.ArrayList;
import java.util.List;

import unidad12.ConexionBD;
import unidad13.ejemplos.menu.Tabla;

public class TablaCitas {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	
	public static void tablaBaseRelacional() {
		CitasDao cD = new CitasDao(url, usuario, password);
		ArrayList<Cita> citas = cD.extraerLista();
		String [] cabecera = new String[]{"Documento","Fecha","Hora","Nº Cita"
				,"Estado pago","Tramite","Telefono","Email"};
		String[][] citasArray = new String[citas.size()][cabecera.length];
		citasArray=añadirCitas(citas,citasArray);
		new Tabla(citasArray,cabecera,"Citas").setVisible(true);
	}
	
	public static String[][] añadirCitas(List<Cita> citas, String[][] citasArray) {
		int i=0;
		for (Cita cita : citas) {
			citasArray[i][0] = cita.getDocumento();
			citasArray[i][1] = cita.getFecha();
			citasArray[i][2] = cita.getHora();
			citasArray[i][3] = cita.getCita();
			citasArray[i][4] = cita.getEstadoPago();
			citasArray[i][5] = cita.getTramite();
			citasArray[i][6] = cita.getTelefono();
			citasArray[i][7] = cita.getEmail();
			i++;
		}
		return citasArray;
	}
}
