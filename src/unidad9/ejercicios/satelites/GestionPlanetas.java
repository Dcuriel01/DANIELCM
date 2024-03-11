package unidad9.ejercicios.satelites;

public class GestionPlanetas {

	public static void main(String[] args) {
		
		Planetas tierra = new Planetas(3.2, 27.98, 100.45, 27, 9.8, 140000, true, "La tierra");
		Satelites Luna = new Satelites(3, 5, 2, 45, 23, 12, tierra, "Luna");
		Satelites Luna2 = new Satelites(3, 5, 2, 45, 23, 12, tierra, "Luna 2");
		
		
		System.out.println(tierra);
		tierra.agregarSatelite(Luna);
		tierra.agregarSatelite(Luna2);
		tierra.mostrarInformacionPlanetas();
	}

}
