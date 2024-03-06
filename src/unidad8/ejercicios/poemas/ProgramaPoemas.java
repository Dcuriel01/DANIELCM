package unidad8.ejercicios.poemas;

public class ProgramaPoemas {

	public static void main(String[] args) {

		Poema p1 = new Poema("Olas del mar", 7);
		Poema p2 = new Pareado("La magia de ronaldo", "parte1");
		Poema p3 = new Haiku("Roberto Baggio", "El hombre que murio de pie");
		Poema p4 = new Quintilla("Eden Hazard", "La historia de una estrella fundida");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}

}
