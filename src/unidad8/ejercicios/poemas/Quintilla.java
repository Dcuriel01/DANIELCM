package unidad8.ejercicios.poemas;

public class Quintilla extends Poema {

	private String titulo;

	public Quintilla(String nombre, String titulo) {
		super(nombre, 5);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " su titulo es " + titulo + " y es una quintilla";
	}
	
	
	
}
