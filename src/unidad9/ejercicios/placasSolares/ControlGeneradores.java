package unidad9.ejercicios.placasSolares;

import java.time.LocalDate;
import java.util.Scanner;

public class ControlGeneradores {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int opcion;
		boolean salir = false;
		do {
			
		
		opcion = menu();
		switch (opcion) {
		case 1:
			opcion=menuPlaca();
			switch (opcion) {
			case 1:
				String id;
				TipoPlacas tipo;
				Orientaciones orientacion;
				double inclinacion;
				id = pedirId();
				tipo = pedirTipo();
				orientacion = pedirOrientacion();
				System.out.println("Indique la inclinacion");
				inclinacion=sc.nextDouble();
				PlacaSolar placa1 = new PlacaSolar(id, LocalDate.of(2024, 5, 13), tipo, orientacion, inclinacion);
				break;

			default:
				break;
			}
			break;
		case 2:
			opcion=menuMolino();
			switch (opcion) {
			case 1:
				String id;
				VelocidadViento velocidadViento;
				id = pedirId();
				velocidadViento=pedirVelocidad();
				System.out.println("Indique la inclinacion");
				MolinoViento molino1 = new MolinoViento(id, LocalDate.of(2024, 5, 13),velocidadViento);
				break;

			}
			break;
		case 3:
			
			break;
		case 4:
			salir = true;
			System.out.println("gracias por usar el programa");
			break;

		default:
			System.out.println("No reconocido");
			break;
		}
		} while (!salir);
		
	}
	private static VelocidadViento pedirVelocidad() {
		String velocidad;
		VelocidadViento velocidadViento=null;
		System.out.println("Indique el tipo:");
		velocidad =sc.next();
		if (velocidad.equals("muy alta")) {
			velocidadViento=VelocidadViento.MUY_ALTA;
		}else if (velocidad.equals("alta")) {
			velocidadViento=VelocidadViento.ALTA;
		}else if (velocidad.equals("media")) {
			velocidadViento=VelocidadViento.MEDIA;
		}else if (velocidad.equals("baja")) {
			velocidadViento=VelocidadViento.BAJA;
		}else {
			velocidadViento=VelocidadViento.MEDIA;
		}
		return velocidadViento;
	}
	private static int menuMolino() {
		int opcion=0;
		System.out.println("1. registrar molino");
		opcion=sc.nextInt();
		return opcion;
	}

	private static Orientaciones pedirOrientacion() {
		String orientacionString;
		Orientaciones orientacion=null;
		System.out.println("Indique la orientación:");
		orientacionString =sc.next();
		if (orientacionString.equals("sur")) {
			orientacion=Orientaciones.SUR;
		}else if (orientacionString.equals("este")) {
			orientacion=Orientaciones.ESTE;
		}else if (orientacionString.equals("oeste")) {
			orientacion=Orientaciones.OESTE;
		}else if (orientacionString.equals("norte")) {
			orientacion=Orientaciones.NORTE;
		}else {
			orientacion=Orientaciones.NORTE;
		}
		return orientacion;
	}

	private static TipoPlacas pedirTipo() {
		String tipo;
		TipoPlacas tipoPlacas=null;
		System.out.println("Indique el tipo:");
		tipo =sc.next();
		if (tipo.equals("fotovoltaica")) {
			tipoPlacas=TipoPlacas.FOTOVOLTAICOS;
		}else if (tipo.equals("hibrida")) {
			tipoPlacas=TipoPlacas.HIBRIDOS;
		}else if (tipo.equals("termica")) {
			tipoPlacas=TipoPlacas.TERMICOS;
		}else {
			tipoPlacas=TipoPlacas.TERMICOS;
		}
		return tipoPlacas;
	}

	private static String pedirId() {
		boolean salir = false;
		String id;
		do {
		System.out.println("Indique el id:");
		sc.nextLine();
		id=sc.next();
		if (id.matches("[0-9]{5}-[A-Z]{3}")) {
			salir = true;
		}else {
			System.out.println("Error en el id");
		}
		} while (!salir);
		return null;
	}

	private static int menuPlaca() {
		int opcion=0;
		System.out.println("1. registrar placa");
		opcion=sc.nextInt();
		return opcion;
	}

	private static int menu() {
		int opcion=0;
		System.out.println("1. trabajar con Placa");
		System.out.println("2. trabajar con Molino");
		System.out.println("3. Trabajar con plantas");
		System.out.println("4. Salir");
		opcion = sc.nextInt();
		return opcion;
	}

}
