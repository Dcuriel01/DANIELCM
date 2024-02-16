package unidad8Ejemplos.herenciaObjects.interfacesAnimales;

public class Perro extends Animal implements Mascota{

	private String codigo;

	public Perro(Sexo sexo, String codigo) {
		super(sexo);
		this.codigo = codigo;
	}
	

	public Perro(String codigo) {
		super();
		this.codigo = codigo;
	}


	@Override
	public String getCodigo() {
		
		return codigo;
	}

	@Override
	public void hacerRuido() {
		this.ladra();
		
	}

	private void ladra() {
		System.out.println("Guau guau");
		
	}


	@Override
	public void come(String comida) {
		if ("carne".equals(comida)) {
			System.out.println("Ummmmmm, gracias");
		}else {
			System.out.println("Lo siento, yo solo como carne");
		}
		
	}
	
	@Override
	public void peleaCon(Animal contrincante) {
		if (contrincante.getClass().getSimpleName().equals("Perro")) {
			System.out.println("Ven aquí que te vas a enterar");
		}else {
			System.out.println("No me gusta pelear");
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	


	
	
	
}
