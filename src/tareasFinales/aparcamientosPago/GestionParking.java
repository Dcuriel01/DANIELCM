package tareasFinales.aparcamientosPago;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestionParking {

	ArrayList<Residente> residentes = null;
	ArrayList<NoResidente> noResidentes = null;
	ArrayList<Oficial> oficiales = null;
	ArrayList<Residente> residentesFuera = null;

	public GestionParking() {
		super();
		residentes = new ArrayList<Residente>();
		noResidentes = new ArrayList<NoResidente>();
		oficiales = new ArrayList<Oficial>();
		residentesFuera = new ArrayList<Residente>();
	}

	public void darDeAlta(String matricula, int tipo) {
		if (validadarMatricula(matricula)) {
			Vehiculo vehiculo = null;
			if (!comprobarExistencia(matricula, tipo)) {
				crearVehiculo(matricula, tipo);
			}else {
				System.out.println("Vehiculo ya existente");
			}
		}else {
			System.out.println("Error en la matricula");
		}
	}
	
	public void salida(String matricula) {
		boolean encontrado = false ;
		String tipo = "" ;
		Vehiculo v = null;
		for (Oficial oficial : oficiales) {
			if (matricula.equals(oficial.getMatricula())) {
				encontrado = true;
				v = oficial;
				tipo = "oficial";
				break;
			}
		}
		if (!encontrado) {
			for (NoResidente noResidente : noResidentes) {
				if (matricula.equals(noResidente.getMatricula())) {
					encontrado = true;
					v = noResidente;
					tipo = "no residente";
					break;
				}
			}
		}if (!encontrado) {
			for (Residente residente : residentes) {
				if (matricula.equals(residente.getMatricula())) {
					encontrado = true;
					v = residente;
					tipo = "residente";
					break;
				}
			}
		}
		if (!encontrado) {
			System.out.println("El coche no esta en el parking");
		}else {
			System.out.println("Coche tipo: " +  tipo + " matricula " + v.getMatricula() + " saliendo del parking");
		
		switch (tipo) {
		case "oficial":
			oficiales.remove(v);
			break;
		case "no residente":
			NoResidente vNoResi = (NoResidente)v;
			double precio =vNoResi.calcularPago();
			noResidentes.remove(vNoResi);
			System.out.println("Precio a pagar= " + precio);
			break;
		case "residente":
			Residente vResi = (Residente)v;
			vResi.calcularPago();
			residentes.remove(vResi);
			residentesFuera.add(vResi);
			break;
		}
		}
	}
	
	public void comenzarMes() {
		oficiales.clear();
		for (Residente residente : residentes) {
			residente.setPrecioAcumulado(0);
			residente.setTiempoMin(0);
		}
		for (Residente residenteF : residentesFuera) {
			residenteF.setPrecioAcumulado(0);
			residenteF.setTiempoMin(0);
		}
	}
	
	public void pagoResidentes(String nombreFichero) {
		FicherosParking.escribirFichero(nombreFichero, residentes, residentesFuera);
	}

	private boolean comprobarExistencia(String matricula, int tipo) {
		boolean encontrado = false;
		switch (tipo) {
		case 1:
			for (Oficial oficial : oficiales) {
				if (matricula.equals(oficial.getMatricula())) {
					encontrado = true;
					break;
				}
				
			}
			break;
		case 2:
			for (NoResidente noResidente : noResidentes) {
				if (matricula.equals(noResidente.getMatricula())) {
					encontrado = true;
					break;
				}
				
			}
			break;
		case 3:
			for (Residente residente : residentes) {
				if (matricula.equals(residente.getMatricula())) {
					encontrado = true;
					break;
				}
				
			}
			break;
		}
		return encontrado;
	}

	private void crearVehiculo(String matricula, int tipo) {
		Vehiculo vehiculo = null;
		switch (tipo) {
		case 1:
			vehiculo = new Oficial(matricula);
			oficiales.add((Oficial) vehiculo);
			break;
		case 2:
			vehiculo = new NoResidente(matricula);
			noResidentes.add((NoResidente) vehiculo);
			break;
		case 3:
			boolean encontrado = false;
			for (Residente residenteF : residentesFuera) {
				encontrado = true;
				vehiculo=residenteF;
				break;
			}
			if (encontrado) {
				residentesFuera.remove(vehiculo);
				LocalTime horaActual = LocalTime.now();
				vehiculo.setHoraEntrada(horaActual);
				residentes.add((Residente) vehiculo);
			}else {
				vehiculo = new Residente(matricula);
				residentes.add((Residente) vehiculo);
			}
			break;
		}

	}

	private static boolean validadarMatricula(String matricula) {
		boolean valido = false;
		Pattern patternMatricula = Pattern.compile("\\d{4}[A-Z]{3}");
		Matcher matcherMatricula = patternMatricula.matcher(matricula);
		valido = matcherMatricula.matches();
		return valido;
	}

}
