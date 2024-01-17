package Unidad7Ejercicios;

import java.util.Scanner;

public class AplicacionSolicitud {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean fechaValida =false;
		boolean horaValida =false;
		boolean nombreValido =false;
		boolean dniValido =false;
		boolean telefonoValido =false;
		boolean asignaturaValida =false;
		boolean diasPropiosValido =false;
		boolean diaValido =false;
		boolean mesValido =false;
		boolean anioValido =false;
		String fecha;
		String hora;
		String nombre;
		String dni;
		String telefono;
		String asignatura;
		String diasPropios;
		char temp;
		boolean diaLectivo1 = false;
		boolean diaLectivo2 = false;
		boolean diaLectivo3 = false;
		boolean diaNoLectivo = false;
		String dia = null;
		String mes = null;
		String ultimoNAnio = null;
		boolean firma = false;
		boolean concesion = false;
		System.out.println("Fecha:");
		fecha = sc.nextLine();
		System.out.println("Hora:");
		hora = sc.nextLine();
		System.out.println("Nombre:");
		nombre = sc.nextLine();
		System.out.println("DNI:");
		dni = sc.nextLine();
		System.out.println("Teléfono:");
		telefono = sc.nextLine();
		System.out.println("Asignatura:");
		asignatura = sc.nextLine();
		System.out.println("Días:");
		diasPropios = sc.nextLine();
		System.out.println("Marcar días con x y si pone otro caracter sera entendido como no marcado");
		System.out.println("Dia Lectivo 1");
		temp=sc.next().charAt(0);
		diaLectivo1 = Validador.comprobarMarcas(temp);
		System.out.println("Dia Lectivo 2");
		temp=sc.next().charAt(0);
		diaLectivo2 = Validador.comprobarMarcas(temp);
		System.out.println("Dia Lectivo 3");
		temp=sc.next().charAt(0);
		diaLectivo3 = Validador.comprobarMarcas(temp);
		System.out.println("Dia No Lectivo");
		temp=sc.next().charAt(0);
		diaNoLectivo = Validador.comprobarMarcas(temp);
		System.out.println("Dia:");
		dia = sc.nextLine();
		System.out.println("Mes:");
		mes = sc.nextLine();
		System.out.println("Ultimo dígito año::");
		ultimoNAnio = sc.nextLine();
		System.out.println("Firme con un +");
		firma=true;
		
		
		

	}

}
