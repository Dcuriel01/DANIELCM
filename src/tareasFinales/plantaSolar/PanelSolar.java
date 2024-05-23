package tareasFinales.plantaSolar;

public class PanelSolar {

	private String id;
	private boolean alineado;
	private double acimut;
	private double elevacion;
	private double potencia;
	private boolean averiado;
	
	
	public PanelSolar(String id, boolean alineado, double acimut, double elevacion, double potencia, boolean averiado) {
		super();
		this.id = id;
		this.alineado = alineado;
		this.acimut = acimut;
		this.elevacion = elevacion;
		this.potencia = potencia;
		this.averiado = averiado;
	}
	
	public String obtenerId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean panelAlineado() {
		return alineado;
	}
	public void setAlineado(boolean alineado) {
		this.alineado = alineado;
	}
	public double acimut() {
		if (averiado) {
			System.out.println("Averiado");
			return 0;
		}
		return acimut;
	}
	public void setAcimut(double acimut) {
		this.acimut = acimut;
	}
	public double elevacion() {
		if (averiado) {
			System.out.println("Averiado");
			return 0;
		}
		return elevacion;
	}
	public void setElevacion(double elevacion) {
		this.elevacion = elevacion;
	}
	public double potencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean isAveriado() {
		return averiado;
	}

	public void setAveriado(boolean averiado) {
		this.averiado = averiado;
	}
	
	
	
}
