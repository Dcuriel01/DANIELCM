package unidad8.ejercicios.controlCiclos;

public class ProgramaActividades {

	public static void main(String[] args) {
		Ejercicios ej1 = new Ejercicios("3 en raya", "Facíl");
		Tarea t1 = new Tarea("Tarea sistemas", "Media", true);
		ej1.calcularNota();
		t1.calcularNota();
		System.out.println(ej1);
		System.out.println(t1);
		
	}
	
	

}
