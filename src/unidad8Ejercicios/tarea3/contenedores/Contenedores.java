package unidad8Ejercicios.tarea3.contenedores;

import unidad8Ejercicios.tarea3.productos.Productos;

public class Contenedores implements IContenedores{

	protected String referencia;
	protected int alto;
	protected int resistencia;
	protected int ancho;
	
	private Productos [] productos;

	public Contenedores(String referencia, int alto , int ancho) {
		super();
		this.referencia = referencia;
		this.alto = alto;
		this.ancho=ancho;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public Productos[] getProductos() {
		return productos;
	}

	public void setProductos(Productos[] productos) {
		this.productos = productos;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int VolumenDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TipoCont getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean meter(Productos producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resiste(Productos producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSuperficie() {
		return 0;
	}


	
	
	
	
	
}
