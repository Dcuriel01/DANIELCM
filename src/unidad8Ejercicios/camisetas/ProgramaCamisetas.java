package unidad8Ejercicios.camisetas;

public class ProgramaCamisetas {

	public static void main(String[] args) {

		Camiseta c1 = new Camiseta();
		Personalizada cp1 = new Personalizada();
		
		c1.setColor("amarillo");
		c1.setTalla(Tallaje.XXL);
		System.out.println(c1.toString());
		cp1.setColor("azul");
		cp1.setTalla(Tallaje.M);
		cp1.setEslogan("Hala Madrid");
		System.out.println(cp1.toString());
		
		
	}

}
