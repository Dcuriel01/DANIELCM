package unidad8.ejercicios.ejercicioCaballos;

public class ActividadCaballos {

	public static void main(String[] args) {

		Caballo caballo1 = new CarrerasCaballos("Perdigón", "Blanco", 2019, 5);
		Caballo caballo2 = new Caballo("Spirit", "Marrón", 2018);
		
		System.out.println(caballo1.toString());
		System.out.println(caballo2.toString());		
		
	}

}
