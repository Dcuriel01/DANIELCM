package ejerciciosPropios.mundialF1;

import java.util.ArrayList;
import java.util.Collections;

import unidad13.ejemplos.menu.Tabla;

public class TablaPilotos {
	static ArrayList<Piloto> listaPilotos = null;
	
	public static void crearTabla() {
		String [] cabecera = new String[]{"Posición","Nombre","Apellido","Abreviatura","Equipo","Pais Nacimiento","Puntos"};
		String[][] pilotos = new String[20][cabecera.length];
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
			pilotos[i][0] =	String.valueOf(i+1);
			pilotos[i][1] = piloto.getNombre();
			pilotos[i][2] = piloto.getApellidos();
			pilotos[i][3] = piloto.getAbreviatura();
			pilotos[i][4] = piloto.getEquipo();
			pilotos[i][5] = piloto.getPais_nacimiento();
			pilotos[i][6] = String.valueOf(piloto.getPts());
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
