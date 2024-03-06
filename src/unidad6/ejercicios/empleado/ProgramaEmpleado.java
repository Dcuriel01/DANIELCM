package unidad6.ejercicios.empleado;

public class ProgramaEmpleado {

	public static void main(String[] args) {
		int nEmpleados = 3;
		Empleado [] empleados = new Empleado[nEmpleados];
		empleados[0] = new Empleado("Susana Pérez",83738,"Contabilidad","Vicedirectora");
		empleados[1]= new Empleado("Juan José Ramirez",23119);
		empleados[2]= new Empleado();
		
		empleados[1].setDepartamento("IT");
		empleados[1].setPuesto("Programador");
		
		empleados[2].setNombre("Ana María García");
		empleados[2].setIdNum(50218);
		empleados[2].setDepartamento("Fabricación");
		empleados[2].setPuesto("Ingeniero");
		imprimirDatos(empleados);
	}
	private static void imprimirDatos(Empleado[] empleados) {
		System.out.println("Nombre    Número ID    Departamento   Posición");
		for (int i = 0; i < empleados.length; i++) {
			empleados[i].mostrarDatos();
		}
	}

}
