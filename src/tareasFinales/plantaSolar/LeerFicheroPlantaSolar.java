package tareasFinales.plantaSolar;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import pruebas.evaluacion3.prueba2.Certificado;

public class LeerFicheroPlantaSolar {
	static ArrayList<String> panelesLineas = new ArrayList<String>();
	static ArrayList<PanelSolar> paneles = new ArrayList<PanelSolar>();
	
	public static ArrayList<PanelSolar> leerFichero(){
		try {
			panelesLineas = (ArrayList<String>) Files.readAllLines(
								Paths.get("ficheros/PlantaSolar/panelesSolares.txt")
									,StandardCharsets.UTF_8);
			boolean alineado = false;
			boolean averiado = false;
			int contador = 0;
			for (String lineaPanel : panelesLineas) {
				System.out.println(lineaPanel);
				if (contador > 0) {
					String[] datos = lineaPanel.split(",");
					char clasificacion = datos[4].charAt(0);
					if (datos[4]=="true") {
						alineado=true;
					}
					if (datos[5]=="true") {
						alineado=true;
					}
					PanelSolar panel = new PanelSolar(datos[0],alineado,Double.parseDouble(datos[1]),Double.parseDouble(datos[2]),Double.parseDouble(datos[3]),averiado);
					paneles.add(panel);
				}
				contador++;
			}
	} catch (IOException e) {
		e.printStackTrace();
	}
		return paneles;
}
}
