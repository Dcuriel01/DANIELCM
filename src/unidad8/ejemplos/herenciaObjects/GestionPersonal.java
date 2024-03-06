package unidad8.ejemplos.herenciaObjects;

public class GestionPersonal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Daniel");
		Persona p2 = new Persona("Daniel");
		p1.setLocalidad("Ankara");
		p2.setLocalidad("Ankara");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if (p1.equals(p2)) {
			System.out.println("Son la misma persona");
		}else {
			System.out.println("No son la misma persona");
		}
	

	}

}
