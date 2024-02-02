package unidad6Ejercicios.controlPlantilla;

import java.util.Iterator;

public class ControlDePlantilla {

	public static void main(String[] args) {
		Empleado [] empleados = new Empleado [10];
		empleados[0]= new Empleado("Daniel", "Curiel Mora", 40, Cargos.GERENTE, ModoEmpleo.TIEMPO_COMPLETO);
		empleados[1]= new Empleado("Sergio", "Orgaz Bravo", 40, Cargos.JEFE, ModoEmpleo.TIEMPO_COMPLETO);
		empleados[2]= new Empleado("Walid", "Meziane", 70, Cargos.GERENTE, ModoEmpleo.TIEMPO_PARCIAL);
		empleados[3]= new Empleado("Antonio", "Kroos", 40, Cargos.OPERARIO, ModoEmpleo.TIEMPO_COMPLETO);
		empleados[4]= new Empleado("Joselu", "Mato", 60, Cargos.OPERARIO, ModoEmpleo.TIEMPO_COMPLETO);
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i]!=null) {
				System.out.println("--------------------");
				empleados[i].informacionEmpelado();
				empleados[i].mostrarSueldo();
			}
			
		}
		System.out.println("--------------------");
		Empleado.nOperarios();
		Empleado.nJefes();
		Empleado.rangosSalarios();


	}

}
