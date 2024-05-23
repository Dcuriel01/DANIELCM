package tareasFinales.plantaSolar;

import java.util.ArrayList;

public class MainPlantaSolar {

	public static void main(String[] args) {
		
		//primeraParte();
		parteFichero();

	}

	private static void parteFichero() {
		ArrayList<PanelSolar> paneles = LeerFicheroPlantaSolar.leerFichero();
		PlantaSolar planta = new PlantaSolar();
		planta.agregarPlanta(paneles);
		planta.alinearPlantaSolar();
		planta.medias();
		planta.panelAnomalo();
	}

	private static void primeraParte() {
		PanelSolar p1 = new PanelSolar("p1", true, 85, 45.6, 100, false);
		PanelSolar p2 = new PanelSolar("p2", true, 60, 75.9, 60, false);
		PanelSolar p3 = new PanelSolar("p3", false, 90, 15.8, 200, true);
		PanelSolar p4 = new PanelSolar("p4", true, 30, 67.1, 1100, false);
		
		PlantaSolar planta = new PlantaSolar();
		planta.agregarPanel(p1);
		planta.agregarPanel(p2);
		planta.agregarPanel(p3);
		planta.agregarPanel(p4);
		planta.alinearPlantaSolar();
		planta.medias();
		planta.panelAnomalo();
		
	}
	
}
