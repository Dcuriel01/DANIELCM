package unidad9.ejercicios.ganaderia;

public class Animal {

	private int camada;
	private String nombreMadre;
	private String mesNacimiento;
	private String nombre;
	private Sexo sexo;
	
	public Animal(int camada, String nombreMadre, String mesNacimiento, String nombre, Sexo sexo) {
		super();
		this.camada = camada;
		this.nombreMadre = nombreMadre;
		this.mesNacimiento = mesNacimiento;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Pertenece a la camada del año " + camada + " el nombre de la madre es " + nombreMadre + 
				" nacio en " + mesNacimiento + " se llama " + nombre + " y es " + sexo;
	}
	
	
	
	
	
	
}
