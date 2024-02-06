package unidad6Ejercicios.tarea2;

public class Garaje {

	private Coche c1;
	private String averia;
	private static int cochesAtendidos;
	private static boolean hueco;
	
	public boolean aceptarCoche(Coche c1, String averia) {
		if (hueco == true) {
			cochesAtendidos++;
			hueco=false;
		}else {
			
		}
		return hueco;
	}
	public void devolverCoche(){
		hueco=true;
	}
	
}
