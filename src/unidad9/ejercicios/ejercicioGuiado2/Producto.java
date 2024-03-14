package unidad9.ejercicios.ejercicioGuiado2;

public class Producto {

	private String id;
	private TiposProductos tipo;
	
	public Producto(String id, TiposProductos tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TiposProductos getTipo() {
		return tipo;
	}
	public void setTipo(TiposProductos tipo) {
		this.tipo = tipo;
	}

	
	
	
	
	
}
