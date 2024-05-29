package tareasFinales.taller;

import java.util.ArrayList;

public class Coche {

	private String matricula;
	private String direccion;
	private ArrayList<Reparacion> historial;
	
	
	public Coche(String matricula, String direccion) {
		super();
		this.matricula = matricula;
		this.direccion = direccion;
		this.historial = new ArrayList<Reparacion>() ;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Reparacion> getHistorial() {
		return historial;
	}
	public void setHistorial(ArrayList<Reparacion> historial) {
		this.historial = historial;
	}
	
	public void aniadirReparacion(Reparacion reparacion){
		if (historial.isEmpty()) {
			historial.add(reparacion);
		}else {
			Reparacion ultimaReparacion = historial.get(historial.size()-1);
			
			if (ultimaReparacion.getKm()>reparacion.getKm()) {
				System.out.println("El coche no puede tener " + reparacion.getKm() + " ya "
						+ "que en la ultima reparación tenía " + ultimaReparacion.getKm());
			}else {
				historial.add(reparacion);
			}
		}
	}
	
	public Reparacion obtenerUltimaReparacion() {
		if (historial.isEmpty()) {
			System.out.println("No hay ultima reparacion");
			return null;
		}else {
			return historial.get(historial.size()-1);
		}
		
	}
	
	public void filtrarPalabraClave(String clave) {
		boolean encontrado = false;
		if (historial.isEmpty()) {
			System.out.println("No hay reparaciones");
		}else {
			for (Reparacion reparacion : historial) {
				if(reparacion.getInformacion().contains(clave)) {
					System.out.println(reparacion);
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("No hay reparaciones con esa palabra clave");
			}
		}
		
	}
	
	public int nReparaciones() {
		return historial.size();
	}
	

	@Override
	public String toString() {
		return "Coche matricula:" + matricula + " direccion: " + direccion + " historial: " + historial;
	}
	
	
	
	
}
