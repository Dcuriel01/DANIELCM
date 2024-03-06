package unidad8.ejercicios.poemas;

public class Haiku extends Poema {

	private String titulo;

	public Haiku(String nombre, String titulo) {
		super(nombre, 3);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " su titulo es " + titulo + " y es un haiku";
	}
	
	
	
}
