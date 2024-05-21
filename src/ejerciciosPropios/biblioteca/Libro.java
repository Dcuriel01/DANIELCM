package ejerciciosPropios.biblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private int anio;
	private double precio;
	
	public Libro(String titulo, String autor, int año, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anio = año;
		this.precio = precio;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnioo(int anio) {
		this.anio = anio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
