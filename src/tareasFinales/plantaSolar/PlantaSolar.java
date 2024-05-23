package tareasFinales.plantaSolar;

import java.util.ArrayList;

public class PlantaSolar {

	ArrayList<PanelSolar> plantaSolar ;

	public PlantaSolar() {
		super();
		this.plantaSolar = new ArrayList<PanelSolar>();
	}
	
	public void agregarPlanta(ArrayList<PanelSolar> planta) {
		plantaSolar=planta;
		
	}
	
	public void agregarPanel(PanelSolar panel) {
		if (yaExiste(panel)) {
			System.out.println("El panel ya existe");
		}else {
			plantaSolar.add(panel);
			System.out.println("Panel añadido");
		}
		
	}

	private boolean yaExiste(PanelSolar panel) {
		boolean existe = false;
		for (PanelSolar panelSolar : plantaSolar) {
			if (panelSolar.obtenerId().equals(panel.obtenerId())) {
				existe = true;
			}
		}
		return existe;
	}
	
	public void alinearPlantaSolar() {
		for (PanelSolar panelSolar : plantaSolar) {
			panelSolar.setAlineado(true);
		}
		System.out.println("Planta alineada");
	}
	
	public void medias() {
		double acimut = 0;
		double elevacion = 0;
		for (PanelSolar panelSolar : plantaSolar) {
			acimut = panelSolar.acimut() + acimut;
			elevacion = panelSolar.elevacion()+elevacion;
		}
		acimut = acimut/plantaSolar.size();
		elevacion = elevacion/plantaSolar.size();
		System.out.println("Media acimut: " + acimut + " Media de elevación:" + elevacion);
	}

	public void panelAnomalo() {
		PanelSolar panel = null;
		for (PanelSolar panelSolar : plantaSolar) {
			if (panelSolar.isAveriado()) {
				panel= panelSolar;
				break;
			}
		}
		if (panel==null) {
			System.out.println("Ninguno averiado");
		}else {
			System.out.println("El panel " + panel.obtenerId() + " es el primer panel anomalo");
		}
	}
	
	
}
