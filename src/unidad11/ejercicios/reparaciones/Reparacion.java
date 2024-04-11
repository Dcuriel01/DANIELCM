package unidad11.ejercicios.reparaciones;

import java.util.List;

public class Reparacion {

	private TipoVehiculo tipo;
	private String matricula;
	private String anioCompra;
	private List<String> añosReparacion;
	
	public Reparacion(TipoVehiculo tipo, String matricula, String anioCompra, List<String> añosReparacion) {
		super();
		this.tipo = tipo;
		this.matricula = matricula;
		this.anioCompra = anioCompra;
		this.añosReparacion = añosReparacion;
	}
	public TipoVehiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getAnioCompra() {
		return anioCompra;
	}
	public void setAnioCompra(String anioCompra) {
		this.anioCompra = anioCompra;
	}
	public List<String> getAñosReparacion() {
		return añosReparacion;
	}
	public void setAñosReparacion(List<String> añosReparacion) {
		this.añosReparacion = añosReparacion;
	}
	@Override
	public String toString() {
		return "Reparacion: tipo=" + tipo + ", matricula=" + matricula + ", anioCompra=" + anioCompra
				+ ", añosReparacion=" + añosReparacion;
	}
	
	
	
}
