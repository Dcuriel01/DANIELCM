package pruebas.evaluacion3.pruebaFinal;

import java.util.ArrayList;
import java.util.List;

import unidad12.ConexionBD;
import unidad13.ejemplos.menu.Tabla;

public class TablaPagos {
	
	public static void tablaBaseRelacional() {
		ArrayList<Pago> pagos = BDOPagos.extraerPagos();
		String [] cabecera = new String[]{"Nº Reserva","Metodo","Datos"};
		String[][] pagosArray = new String[pagos.size()][cabecera.length];
		pagosArray=añadirPagos(pagos,pagosArray);
		new Tabla(pagosArray,cabecera,"Pagos").setVisible(true);
	}
	
	public static String[][] añadirPagos(List<Pago> pagos, String[][] pagosArray) {
		int i=0;
		for (Pago pago : pagos) {
			pagosArray[i][0] = pago.getNumeroReserva();
			pagosArray[i][1] = pago.getMetodoPago();
			pagosArray[i][2] = pago.getDatosPago();
			i++;
		}
		return pagosArray;
	}
}
