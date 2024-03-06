package unidad8.ejemplos.abstractas;

public abstract class Vehiculo {
	
	private String fuenteAlimentacion;
	private int rueda;
	protected int precio;
	
	public Vehiculo(String fuenteAlimentacion, int rueda) {
		super();
		setFuenteAlimentacion(fuenteAlimentacion);
		setRueda(rueda);
	}
	
	
	public String getFuenteAlimentacion() {
		return fuenteAlimentacion;
	}


	public void setFuenteAlimentacion(String fuenteAlimentacion) {
		this.fuenteAlimentacion = fuenteAlimentacion;
	}


	public int getRueda() {
		return rueda;
	}


	public void setRueda(int rueda) {
		this.rueda = rueda;
	}


	public int getPrecio() {
		return precio;
	}


	public abstract void setPrecio();


	public void saludo(){
		System.out.println("Aplicación vehículos");
	}
	
	public abstract double calcEficicenciaCarburante();
	public abstract double calcDistanciaViaje();


	
	
	
}
