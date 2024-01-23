package unidad7Ejercicios;

import java.util.Scanner;

public class AplicacionSolicitud {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean fechaValida = false;
		boolean horaValida = false;
		boolean nombreValido = false;
		boolean dniValido = false;
		boolean telefonoValido = false;
		boolean asignaturaValida = false;
		boolean diasPropiosValido = false;
		boolean diaValido = false;
		boolean mesValido = false;
		boolean anioValido = false;
		boolean noSalir = true;
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
		do {
			System.out.print("Fecha: ");
			fecha = sc.nextLine();
			System.out.print("Hora: ");
			hora = sc.nextLine();
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			System.out.print("DNI: ");
			dni = sc.nextLine();
			System.out.print("Teléfono: ");
			telefono = sc.nextLine();
			System.out.print("Asignatura: ");
			asignatura = sc.nextLine();
			System.out.print("Días: ");
			diasPropios = sc.nextLine();
			System.out.println("Marcar días con + y con - si no; si pone otro caracter sera entendido como no marcado");
			System.out.print("Dia Lectivo 1: ");
			temp = sc.next().charAt(0);
			diaLectivo1 = Validador.comprobarMarcas(temp);
			System.out.print("Dia Lectivo 2: ");
			temp = sc.next().charAt(0);
			diaLectivo2 = Validador.comprobarMarcas(temp);
			System.out.print("Dia Lectivo 3: ");
			temp = sc.next().charAt(0);
			diaLectivo3 = Validador.comprobarMarcas(temp);
			System.out.print("Dia No Lectivo: ");
			temp = sc.next().charAt(0);
			diaNoLectivo = Validador.comprobarMarcas(temp);
			System.out.print("Dia: ");
			sc.nextLine();
			dia = sc.nextLine();
			System.out.print("Mes: ");
			mes = sc.nextLine();
			System.out.print("Ultimo dígito año: ");
			ultimoNAnio = sc.nextLine();
			System.out.println("Firme con un + : ");
			sc.next();
			firma = true;
			sc.nextLine();
			
			fechaValida = Validador.validarFecha(fecha);
			horaValida = Validador.validarHora(hora);
			nombreValido = Validador.validarNombre(nombre);
			dniValido = Validador.validarDni(dni);
			telefonoValido = Validador.validarTelefono(telefono);
			asignaturaValida = Validador.validarAsignatura(asignatura);
			diasPropiosValido = Validador.validarDias(diasPropios);
			diaValido = Validador.validarDia(dia);
			mesValido = Validador.validarMes(mes);
			anioValido = Validador.validarAnio(ultimoNAnio);
	
			noSalir = comprobarValidez(fechaValida, "fecha",noSalir);
			noSalir = comprobarValidez(horaValida, "hora",noSalir);
			noSalir = comprobarValidez(nombreValido, "nombre",noSalir);
			noSalir = comprobarValidez(dniValido, "dni",noSalir);
			noSalir = comprobarValidez(telefonoValido, "teléfono",noSalir);
			noSalir = comprobarValidez(asignaturaValida, "asignatura",noSalir);
			noSalir = comprobarValidez(diasPropiosValido, "días propios",noSalir);
			noSalir = comprobarValidez(diaValido, "dia",noSalir);
			noSalir = comprobarValidez(mesValido, "mes",noSalir);
			noSalir = comprobarValidez(anioValido, "año",noSalir);
			concesion = true;
			if (!noSalir) {
				System.out.println("Error pruebe de nuevo");
			}
		} while (!noSalir);
			
		SolicitudDePermisos persona1 = new SolicitudDePermisos(fecha, hora, nombre, dni, telefono, asignatura, diasPropios, diaLectivo1, diaLectivo2,
				diaLectivo3, diaNoLectivo, dia, mes, ultimoNAnio, firma, concesion);
		imprimirDatos(persona1);
		
		

	}

	private static void imprimirDatos(SolicitudDePermisos persona) {
		System.out.println("Solicitud días própios");
		System.out.println("Fecha: "+ persona.getFecha() + "  Hora: " +persona.getHora());
		System.out.println("Nombre: " + persona.getNombre() + " Dni:  " + persona.getDni());
		System.out.println("Teléfono: " + persona.getTlf() + "  Asignatura: " + persona.getAsignatura());
		System.out.println("Días seleccionados: " + persona.getDiasPropios());
		if (persona.isDiaLectivo1()) {
			System.out.println("Dia lectivo: marcado");
		}else {
			System.out.println("Dia lectivo: desmarcado");
		}
		if (persona.isDiaLectivo2()) {
			System.out.println("Dia lectivo: marcado");
		}else {
			System.out.println("Dia lectivo: desmarcado");
		}
		if (persona.isDiaLectivo3()) {
			System.out.println("Dia lectivo: marcado");
		}else {
			System.out.println("Dia lectivo: desmarcado");
		}
		if (persona.isDiaNoLectivo()) {
			System.out.println("Dia no lectivo: marcado");
		}else {
			System.out.println("Dia no lectivo: desmarcado");
		}
		System.out.println("Fecha: "+persona.getDia()+ "-"+persona.getMes()+"-202"+persona.getUltimoNAnio());
		System.out.println("Estado: firmado");
		if (persona.isConcesion()) {
			System.out.println("Concedida");
		}else {
			System.out.println("Denegada");
		}
		
		
	}

	private static boolean comprobarValidez(boolean validacion, String campo, boolean noSalir) {
		if (validacion) {
				
		}else {
				System.out.println("Ha habido un fallo en el campo: " + campo);
				noSalir=false;
		}
		return noSalir;
	}

}
