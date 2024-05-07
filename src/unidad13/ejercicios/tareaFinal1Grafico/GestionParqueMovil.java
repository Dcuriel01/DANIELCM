package unidad13.ejercicios.tareaFinal1Grafico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
			JOptionPane.showMessageDialog(null, "Esa matrícula ya esta almacenada");
		}else {
			listaVehiculos.add(vehiculo);
			JOptionPane.showMessageDialog(null, "Vehiculo añadido correctamente");
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
			JOptionPane.showMessageDialog(null, "Vehiculo dado de baja correctamente");
		}else {
			JOptionPane.showMessageDialog(null, "Ese vehiculo no esta registrado");
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
				JOptionPane.showMessageDialog(null, "El kilometraje no puede pasar a ser menor");
			}else {
				v.setKilometraje(kilometraje);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Cocche no encontrado");
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
			JOptionPane.showMessageDialog(null, v);
		}else {
			JOptionPane.showMessageDialog(null, "Coche no encontrado");
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
