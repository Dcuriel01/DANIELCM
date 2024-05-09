package tareasFinales.bancaDigital;

import java.util.ArrayList;

public class Banco {

	private String nombre;
	private String localizacion;
	ArrayList<Cliente> clientes = null;
	
	public Banco(String nombre, String localizacion) {
		super();
		this.nombre = nombre;
		this.localizacion = localizacion;
		clientes =new ArrayList<Cliente>();
	}
	

	public void registrar(Cliente cliente) {
		boolean existe = false;
		for (Cliente clientes : clientes) {
			if (clientes.getIdCliente().equals(cliente.getIdCliente())) {
				existe = true;
				break;
			}
		}
		if (existe) {
			System.out.println("Ese cliente ya ha sido registrado");
		}else {
			clientes.add(cliente);
			System.out.println("Cliente registrado con exito");
		}
	}


	public String getNombre() {
		return nombre;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	
	
}
