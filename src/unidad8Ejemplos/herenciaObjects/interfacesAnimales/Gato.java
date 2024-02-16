package unidad8Ejemplos.herenciaObjects.interfacesAnimales;

public class Gato extends Animal implements Mascota{

	private String codigo;
	private String raza;
	
	public Gato(Sexo sexo, String codigo, String raza) {
		super(sexo);
		this.codigo = codigo;
		this.raza = raza;
	}
	
	public Gato(Sexo sexo, String codigo) {
		super(sexo);
		this.codigo = codigo;
		this.raza = "siamés";
	}
	public Gato(String codigo) {
		super();
		this.codigo = codigo;
		this.raza = "siamés";
	}
	
	
	@Override
	public String getCodigo() {
		return codigo;
	}
	@Override
	public void hacerRuido() {
		this.maulla();
		this.ronrronea();
	}
	private void ronrronea() {
		System.out.println("mrrrrrrrr");
		
	}

	private void maulla() {
		System.out.println("Miau");
		
	}

	@Override
	public void come(String comida) {
		
		if ("pescado".equals(comida)) {
			System.out.println("Ummmmmm, gracias");
			this.ronrronea();
		}else {
			System.out.println("Lo siento, yo solo como pescado");
			this.maulla();
		}
	}
	@Override
	public void peleaCon(Animal contrincante) {
		
		if (this.getSexo()==Sexo.HEMBRA) {
			System.out.println("No me gusta pelear");
		}else if (contrincante.getSexo()==Sexo.HEMBRA) {
			System.out.println("No peleo contra gatas");
		}else {
			System.out.println("Ven aquí que te vas a enterar");
		}
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Raza:" + this.raza + "\n *********";
	}
	
	
	
}
