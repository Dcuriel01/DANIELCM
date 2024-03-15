package pruebas.evaluacion2.prueba1.ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import pruebas.evaluacion2.prueba1.ejercicio3.enumeradores.Empresas;
import pruebas.evaluacion2.prueba1.ejercicio3.enumeradores.TipoUrgencia;
import pruebas.evaluacion2.prueba1.ejercicio3.enumeradores.Zonas;
import unidad9.ejemplos.comparaciones.comparator.ComparatorRankig;

public class ProgramasPaquetes {

	public static List<Local> paquetesLocales = new ArrayList<Local>();
	public static List<Externo> paquetesExternos = new ArrayList<Externo>();

	public static void main(String[] args) {

		String[] paquetesID = declararID();
		Double[] paquetesPeso = delclaraPeso();
		LocalDate[] paquetesFecha = delcararFecha();

		paquetesID = renovarId(paquetesID);

		for (int i = 0; i < paquetesID.length; i++) {
			String[] paquetesPartido = new String[2];
			paquetesPartido = paquetesID[i].split("-");
			if (paquetesPartido[1].equals("NAV")) {
				paquetesLocales.add(new Local(paquetesID[i], paquetesPeso[i], paquetesFecha[i]));
			} else {
				paquetesExternos.add(new Externo(paquetesID[i], paquetesPeso[i], paquetesFecha[i]));
			}
		}

		/*mostrarPaquetesPorZona();
		System.out.println(" ");
		mostrarPaquetesPorEmpresa();
		System.out.println(" ");*/
		mostrarPaquetesExternosEnOrden();
		/*System.out.println(" ");
		mostrarCantidadUrgentes();
		System.out.println(" ");
		mostrarCantidadNoUrgentes();
		System.out.println(" ");
		mostrarPaquetesConCostes();*/

	}

	private static void mostrarPaquetesConCostes() {
		System.out.println("PAQUETES CON COSTES");
		Iterator iteradorPaquetesE = paquetesExternos.iterator();
		while (iteradorPaquetesE.hasNext()) {
			Externo paquete = (Externo) iteradorPaquetesE.next();
			paquete.mostrarPaquetesConCostes();
		}
		Iterator iteradorPaquetesL = paquetesLocales.iterator();
		while (iteradorPaquetesL.hasNext()) {
			Local paquete = (Local) iteradorPaquetesL.next();
			paquete.mostrarPaquetesConCostes();
		}
	}

	private static void mostrarCantidadNoUrgentes() {
		int contadorNoUrgente=0;
		Iterator iteradorPaquetesE = paquetesExternos.iterator();
		while (iteradorPaquetesE.hasNext()) {
			Externo paquete = (Externo) iteradorPaquetesE.next();
			if (paquete.getUrgencia()==TipoUrgencia.NO_URGENTE) {
				contadorNoUrgente++;
			}
		}
		Iterator iteradorPaquetesL = paquetesLocales.iterator();
		while (iteradorPaquetesL.hasNext()) {
			Local paquete = (Local) iteradorPaquetesL.next();
			if (paquete.getUrgencia()==TipoUrgencia.NO_URGENTE) {
				contadorNoUrgente++;
			}
		}
		System.out.println("CANTIDAD DE PEDIDOS NO URGENTES : " + contadorNoUrgente);
	}

	private static void mostrarCantidadUrgentes() {
		int contadorUrgente=0;
		Iterator iteradorPaquetesE = paquetesExternos.iterator();
		while (iteradorPaquetesE.hasNext()) {
			Externo paquete = (Externo) iteradorPaquetesE.next();
			if (paquete.getUrgencia()==TipoUrgencia.URGENTE) {
				contadorUrgente++;
			}
		}
		Iterator iteradorPaquetesL = paquetesLocales.iterator();
		while (iteradorPaquetesL.hasNext()) {
			Local paquete = (Local) iteradorPaquetesL.next();
			if (paquete.getUrgencia()==TipoUrgencia.URGENTE) {
				contadorUrgente++;
			}
		}
		System.out.println("CANTIDAD DE PEDIDOS URGENTES : " + contadorUrgente);
		
	}

	private static void mostrarPaquetesExternosEnOrden() {
		System.out.println("PAQUETES EXTERNOS EN ORDEN DE NUMERO DE SEGUIMIENTO");
		ComparatorNSeguimiento comparador = new ComparatorNSeguimiento();
		Collections.sort(paquetesExternos,comparador);
		Iterator iteradorPaquetes = paquetesExternos.iterator();
		while (iteradorPaquetes.hasNext()) {
			Externo paquete = (Externo) iteradorPaquetes.next();
			System.out.print(paquete.getNumSeguimiento()+ " ");
			System.out.println(paquete);
		}
	}

	private static void mostrarPaquetesPorEmpresa() {
		System.out.println("PAQUETES POR EMPRESAS");
		mostrarPaqueteEmpresas(Empresas.NAVALEXPRESS);
		mostrarPaqueteEmpresas(Empresas.NAVALSEAR);
		mostrarPaqueteEmpresas(Empresas.NAVALMAZON);
	}

	private static void mostrarPaqueteEmpresas(Empresas empresa) {
		System.out.println("Paquetes de la empresa " + empresa);
		Iterator iteradorPaquetes = paquetesLocales.iterator();
		while (iteradorPaquetes.hasNext()) {
			Local paquete = (Local) iteradorPaquetes.next();
			if (paquete.getEmpresa() == empresa) {
				System.out.println(paquete);
			}

		}
	}

	private static void mostrarPaquetesPorZona() {
		System.out.println("PAQUETES POR ZONAS");
		//Este metodo recorre el array list de paquetes locales y los imprime
		mostrarLocales();
		//Este metodo recorre el array list de paquetes externos comparando si pertenecen a la zona indicada y los imprime
		mostrarExternos("Caceres", Zonas.CAC);
		mostrarExternos("Coria", Zonas.COR);
		mostrarExternos("Plasecia", Zonas.PLA);
		mostrarExternos("Merida", Zonas.MER);
		mostrarExternos("Badajoz", Zonas.BAD);
		mostrarExternos("Don Benito", Zonas.DBN);
		mostrarExternos("ZAFRA", Zonas.ZAF);
	}

	private static void mostrarExternos(String nombreZona, Zonas zona) {
		System.out.println("Paquetes de " + nombreZona);
		Iterator iteradorPaquetes = paquetesExternos.iterator();
		while (iteradorPaquetes.hasNext()) {
			Externo paquete = (Externo) iteradorPaquetes.next();
			if (paquete.zona == zona) {
				System.out.println(paquete);
			}
		}
	}

	private static void mostrarLocales() {
		System.out.println("Paquetes de Navalmoral de la Mata");
		Iterator iteradorPaquetes = paquetesLocales.iterator();
		while (iteradorPaquetes.hasNext()) {
			Local paquete = (Local) iteradorPaquetes.next();
			System.out.println(paquete);
		}
	}

	private static LocalDate[] delcararFecha() {
		String[] paqueteString = new String[] { "05/03/2024", "17/03/2024", "03/03/2024", "12/03/2024", "14/03/2024",
				"18/03/2024", "18/03/2024", "09/03/2024", "07/03/2024", "06/03/2024", "07/03/2024", "18/03/2024",
				"15/03/2024", "06/03/2024", "06/03/2024", "08/03/2024", "20/03/2024", "16/03/2024", "17/03/2024",
				"05/03/2024", "09/03/2024", "16/03/2024", "01/03/2024", "19/03/2024", "16/03/2024", "09/03/2024",
				"15/03/2024", "03/03/2024", "17/03/2024", "16/03/2024", "18/03/2024", "16/03/2024", "09/03/2024",
				"06/03/2024", "08/03/2024", "05/03/2024", "01/03/2024", "19/03/2024", "01/03/2024", "20/03/2024",
				"17/03/2024", "10/03/2024", "01/03/2024", "07/03/2024", "11/03/2024", "14/03/2024", "12/03/2024",
				"19/03/2024", "10/03/2024", "19/03/2024", "15/03/2024", "01/03/2024", "13/03/2024", "05/03/2024",
				"12/03/2024", "11/03/2024", "20/03/2024", "04/03/2024", "18/03/2024", "03/03/2024", "24/03/2024" };
		LocalDate[] paqueteFecha = new LocalDate[paqueteString.length];
		DateTimeFormatter formatoFecha2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for (int i = 0; i < paqueteString.length; i++) {
			paqueteFecha[i] = LocalDate.parse(paqueteString[i], formatoFecha2);
		}
		return paqueteFecha;
	}

	private static Double[] delclaraPeso() {
		Double[] paquetesPeso = new Double[] { 5.634, 4.665, 0.326, 1.068, 5.794, 3.633, 3.037, 5.636, 4.313, 1.364,
				2.138, 2.775, 4.812, 3.327, 2.514, 2.264, 5.142, 2.511, 2.701, 3.697, 5.26, 3.134, 3.736, 3.916, 1.422,
				4.397, 1.18, 0.543, 5.582, 2.128, 1.937, 2.844, 5.937, 4.757, 4.883, 5.874, 0.933, 3.867, 4.121, 3.34,
				5.509, 1.369, 5.176, 5.117, 2.792, 5.383, 3.513, 2.41, 2.044, 0.422, 1.1, 2.912, 4.987, 5.52, 3.784,
				2.662, 3.784, 2.662, 5.668, 1.27, 1.507 };
		return paquetesPeso;
	}

	private static String[] declararID() {
		String[] paquetesID = new String[] { "1234-PLASENCIA", "5678-ZAFRA", "9012-NAVALMORAL DE LA MATA",
				"3456-CACERES", "7890-BADAJOZ", "2345-MERIDA", "6789-CACERES", "0123-PLASENCIA",
				"4567-NAVALMORAL DE LA MATA", "8901-BADAJOZ", "2345-NAVALMORAL DE LA MATA", "6789-BADAJOZ",
				"0123-PLASENCIA", "4567-ZAFRA", "8901-ZAFRA", "2345-PLASENCIA", "6789-CACERES", "0123-ZAFRA",
				"4567-BADAJOZ", "8901-NAVALMORAL DE LA MATA", "2345-DON BENITO", "6789-CORIA", "0123-CACERES",
				"4567-CORIA", "8901-PLASENCIA", "6622-CACERES", "5541-BADAJOZ", "6551-ZAFRA", "4317-DON BENITO",
				"9544-BADAJOZ", "9691-CACERES", "5190-NAVALMORAL DE LA MATA", "1288-PLASENCIA", "3971-ZAFRA",
				"5378-DON BENITO", "4569-PLASENCIA", "5561-MERIDA", "4136-DON BENITO", "6186-PLASENCIA",
				"5682-NAVALMORAL DE LA MATA", "6149-MERIDA", "2240-CORIA", "2809-MERIDA", "5018-MERIDA", "1540-CORIA",
				"5721-MERIDA", "6212-MERIDA", "1826-CACERES", "1347-CORIA", "5665-ZAFRA", "8368-DON BENITO",
				"2014-DON BENITO", "5005-PLASENCIA", "8445-PLASENCIA", "3882-ZAFRA", "4054-DON BENITO",
				"5980-PLASENCIA", "3581-CORIA", "9819-DON BENITO", "7780-ZAFRA", "4649-CACERES" };
		return paquetesID;
	}

	private static String[] renovarId(String[] paquetesID) {
		for (int i = 0; i < paquetesID.length; i++) {
			String[] paquetesPartido = new String[2];
			paquetesPartido = paquetesID[i].split("-");

			switch (paquetesPartido[1]) {
			case "PLASENCIA":
				paquetesPartido[1] = "PLA";
				break;
			case "CACERES":
				paquetesPartido[1] = "CAC";
				break;
			case "NAVALMORAL DE LA MATA":
				paquetesPartido[1] = "NAV";
				break;
			case "MERIDA":
				paquetesPartido[1] = "MER";
				break;
			case "BADAJOZ":
				paquetesPartido[1] = "BAD";
				break;
			case "DON BENITO":
				paquetesPartido[1] = "DBN";
				break;
			case "ZAFRA":
				paquetesPartido[1] = "ZAF";
				break;
			case "CORIA":
				paquetesPartido[1] = "COR";
				break;
			}
			paquetesID[i] = paquetesPartido[0] + "-" + paquetesPartido[1];
		}
		return paquetesID;
	}

}
