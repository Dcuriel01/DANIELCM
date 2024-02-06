package unidad6Ejercicios.tarea2;

public class Garaje {

	private Coche c1;
	private String averia;
	private static int cochesAtendidos;
	private static boolean hueco=true;
	
	
	public Garaje() {
	}
	
	public boolean aceptarCoche(Coche c1, String averia) {
			this.c1=c1;
			this.averia=averia;
			cochesAtendidos++;
			cobrarAveria(c1,averia);
			hueco=false;
		return hueco;
	}
	private void cobrarAveria(Coche c1, String averia) {
		c1.acumularAveria(Math.random()*1000);
		if (averia.equals("aceite")) {
			c1.getMotor().setlAceite(10);
		}
		
	}

	public void devolverCoche(){
		c1 = null;
		averia = null;
		hueco=true;
	}

	public static boolean isHueco() {
		return hueco;
	}

	public static int getCochesAtendidos() {
		return cochesAtendidos;
	}
	
	
	
}
