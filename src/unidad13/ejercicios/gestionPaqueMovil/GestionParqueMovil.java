package unidad13.ejercicios.gestionPaqueMovil;

import java.util.ArrayList;

public class GestionParqueMovil {
	
	private ArrayList<Vehiculo>listaVehiculos = null;
	

	public GestionParqueMovil() {
		listaVehiculos = new ArrayList<Vehiculo>();
	}
	public  void darAltaVehiculo(Vehiculo vehiculo) {
		boolean encontrado = false;
		for (Vehiculo v : listaVehiculos) {
			if (v.getMatricula().equals(vehiculo.getMatricula())) {
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("Esa matrícula ya esta almacenada");
		}else {
			listaVehiculos.add(vehiculo);
			BaseDatos.añadirVehiculo(vehiculo);
			System.out.println("Vehiculo añadido correctamente");
		}
	}
	public  void darBajaVehiculo(String matricula) {
		boolean encontrado = false;
		Vehiculo v = null;
		for (Vehiculo i : listaVehiculos) {
			if (i.getMatricula().equals(matricula)) {
				encontrado = true;
				v=i;
				break;
			}
		}
		if (encontrado) {
			listaVehiculos.remove(v);
			BaseDatos.eliminarElemento(matricula);
			System.out.println("Vehiculo dado de baja correctamente");
		}else {
			System.out.println("Ese vehiculo no esta registrado");
		}
		
	}
	
	public  void actualizarKilometraje(String matricula,int kilometraje) {
		boolean encontrado = false;
		Vehiculo v = null;
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getMatricula().equals(matricula)) {
				encontrado = true;
				v=vehiculo;
				break;
			}
		}
		if (encontrado) {
			if (kilometraje<v.getKilometraje()) {
				System.out.println("El kilometraje no puede pasar a ser menor");
			}else {
				v.setKilometraje(kilometraje);
				BaseDatos.actualizarKilometraje(matricula, kilometraje);
			}
		}else {
			System.out.println("Coche no encontrado");
		}
	}
	
	public  void mostrarDatos(String matricula) {
		boolean encontrado = false;
		Vehiculo v = null;
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getMatricula().equals(matricula)) {
				encontrado = true;
				v=vehiculo;
				break;
			}
		}
		if (encontrado) {
			System.out.println(v);
		}else {
			System.out.println("Coche no encontrado");
		}
	}
	
	public  void mostrarListadoVehiculos() {
		if (!listaVehiculos.isEmpty()) {
			System.out.println("Listado de vehiculos");
			for (Vehiculo vehiculo : listaVehiculos) {
				System.out.println(vehiculo);
			}
		}else {
			System.out.println("La lista esta vacia");
		}
		
	}
	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}
	
	
}
