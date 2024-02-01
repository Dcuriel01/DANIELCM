package unidad6Ejemplos;

public class ProgramaEmpresa {

	public static void main(String[] args) {

		EmpleadoClase e1 = new EmpleadoClase(1,"Tomás","Ventas");
		EmpleadoClase e2 = new EmpleadoClase(2,"Susana","Administración");
		EmpleadoClase e3 = new EmpleadoClase(3,"Pedro","Operaciones");
		EmpleadoClase e4 = new EmpleadoClase(4,"Juana","RRHH");
		System.out.println("Nº de empleados creados: " +EmpleadoClase.getContador());
		System.out.println("Nº de empleados creados: " +e1.getContador());
	}

}
