package unidad9.ejemplos.comparaciones.comparable;

public class Empleado implements Comparable<Empleado>{

	private String nombre;
	private double salario;
	
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nombre " +nombre + " salario: " +salario;
	}

	//Igual devuelve 0 
	//Mayor el de la clase en la que estamos un positivo
	//Menor el de la clase en la que estamos un negativo
	
	@Override
	public int compareTo(Empleado otro) {
		
		int comparacion =0;
		
		if (salario<otro.salario) {
			comparacion=1;
		}
		if (salario>otro.salario) {
			comparacion=-1;
		}
		
		
		return comparacion;
	}
	
	
}
