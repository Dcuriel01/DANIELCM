package unidad8.ejercicios.poemas;

public class Pareado extends Poema {

	private String titulo;

	public Pareado(String nombre, String titulo) {
		super(nombre, 2);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " su titulo es " + titulo + " y es un pareado";
	}
	
	
	
}
