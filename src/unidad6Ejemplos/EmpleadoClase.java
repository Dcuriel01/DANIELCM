package unidad6Ejemplos;

public class EmpleadoClase {
	private String nombre;
	private int idNum;
	private String departamento;
	private static int contador;
	// Al ser estatico es el mismo para todos los objetos creados he incluso la propia clase cuenta con esta variable
	public EmpleadoClase(int idNum, String nombre , String departamento) {
		this.nombre = nombre;
		this.idNum = idNum;
		this.departamento = departamento;
		contador++;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		EmpleadoClase.contador = contador;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void mostrarDatos(){
		System.out.println(nombre + "   "+ idNum + "    " + departamento);
	}
	
	
	
}
