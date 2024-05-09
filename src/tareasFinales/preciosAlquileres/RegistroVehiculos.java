package tareasFinales.preciosAlquileres;

import java.util.ArrayList;


public class RegistroVehiculos {

	private ArrayList<VehiculoAlquiler> listaEmpresa = null;

	public RegistroVehiculos() {
		super();
		listaEmpresa =new ArrayList<VehiculoAlquiler>();
	}
	
	public boolean registrarVehiculo(VehiculoAlquiler vehiculo) {
		boolean encontrado = false;
		boolean registrado = false;
		for (VehiculoAlquiler v : listaEmpresa) {
			if (v.getMatricula().equals(vehiculo.getMatricula())) {
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("Error");
		}else {
			listaEmpresa.add(vehiculo);
			registrado = true;
		}
		return registrado;
	}
	
	public VehiculoAlquiler buscarVehiculo(String matricula) {
		boolean encontrado = false;
		VehiculoAlquiler v = null;
		for (VehiculoAlquiler vehiculo : listaEmpresa) {
			if (vehiculo.getMatricula().equals(matricula)) {
				encontrado = true;
				v=vehiculo;
				break;
			}
		}
		return v;
	}
	
	public void mostrarTodosPrecios(int dias) {
		StringBuilder cadena = new StringBuilder();
		if (listaEmpresa.isEmpty()) {
			System.out.println("No hay vehiculos");
		}else {
			System.out.println("Todos los precios");
			for (VehiculoAlquiler vehiculo : listaEmpresa) {
				double precio = vehiculo.precioAlquiler(dias);
				System.out.println(vehiculo.getMatricula() + " precio:" + precio);
			}
		}
		
	}
	
	public void ObtenerPrecio(String matricula,int dias) {
		VehiculoAlquiler vehiculo =  buscarVehiculo(matricula);
		double precio = vehiculo.precioAlquiler(dias);
		System.out.println("El precio del vehiculo es: " + precio);
	}


}
