package unidad8Ejemplos.herenciaObjects.interfacesAnimales;

public class Animal {

	private Sexo sexo;

	
	public Animal(Sexo sexo) {
		super();
		this.sexo = sexo;
	}

	public Animal() {
		super();
		sexo = Sexo.HEMBRA;
	}
	

	public Sexo getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		
		return "Sexo:" + this.sexo+"\n";
	}

	public static void duerme() {
		
		System.out.println("ZZZZZZZZzzZZZZZ");
		
	}
	
}
