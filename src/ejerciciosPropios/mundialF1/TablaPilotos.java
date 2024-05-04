package ejerciciosPropios.mundialF1;

import java.util.ArrayList;
import java.util.Collections;

import unidad12.salidaEntrada.Tabla;

public class TablaPilotos {
	static ArrayList<Piloto> listaPilotos = null;
	
	public static void crearTabla() {
		String [] cabecera = new String[]{"Nombre","Apellido","Abreviatura","Equipo","Pais Nacimiento","Puntos"};
		String[][] pilotos = new String[20][6];
		pilotos=añadirPilotos(pilotos);
		new Tabla(pilotos,cabecera,"clasificacion").setVisible(true);
		
	}
	
	public static void inicializarTabla() {
		listaPilotos = recuperarPilotos();
	}
	
	public static String[][] añadirPilotos(String[][] pilotos) {
		int i=0;
		OrdenarMundial ordenarMundial = new OrdenarMundial();
		Collections.sort(listaPilotos,ordenarMundial);
		for (Piloto piloto : listaPilotos) {
			pilotos[i][0] = piloto.getNombre();
			pilotos[i][1] = piloto.getApellidos();
			pilotos[i][2] = piloto.getAbreviatura();
			pilotos[i][3] = piloto.getEquipo();
			pilotos[i][4] = piloto.getPais_nacimiento();
			pilotos[i][5] = String.valueOf(piloto.getPts());
			i++;
		}
		return pilotos;
	}
	
	public static ArrayList<Piloto> recuperarPilotos() {
		Pilotos_f1 p = LeerPilotos.recuperarPilotos();
		ArrayList<Piloto> listaPilotos = (ArrayList<Piloto>) p.getPilotos_f1();
		return listaPilotos;
	}

	public static void setListaPilotos(ArrayList<Piloto> listaPilotos) {
		TablaPilotos.listaPilotos = listaPilotos;
	}

	public static ArrayList<Piloto> getListaPilotos() {
		return listaPilotos;
	}
	
	

}
