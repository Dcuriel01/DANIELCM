package unidad6.ejercicios.empleado;

public class Empleado {
	private String nombre;
	private int idNum;
	private String departamento;
	private String puesto;
	
	public Empleado(String nombre, int idNum, String departamento, String puesto) {
		this.nombre = nombre;
		this.idNum = idNum;
		this.departamento = departamento;
		this.puesto = puesto;
	}

	public Empleado(String nombre, int idNum) {
		super();
		this.nombre = nombre;
		this.idNum = idNum;
		this.departamento = " ";
		this.puesto = " ";
	}
	public Empleado() {
		this.nombre = " ";
		this.idNum = 0;
		this.departamento = " ";
		this.puesto = " ";
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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public void mostrarDatos(){
		System.out.println(nombre + "   "+ idNum + "    " + departamento + "   " + puesto);
	}
	
	
	
}
