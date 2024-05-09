package tareasFinales.bancaDigital;

import java.util.ArrayList;

public class Cliente {

	public String idCliente;
	public String nombre;
	public String email;
	public ArrayList<Cuenta> cuentas = null;
	
	
	public Cliente(String idCliente, String nombre, String email) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.email = email;
		cuentas = new ArrayList<Cuenta>();
	}

	public boolean login(String nombre,String email) {
		boolean registrado = false;
		if (nombre.equals(this.nombre)&email.equals(this.email)) {
			registrado=true;
		}
		return registrado;
	}
	
	public Cuenta abrirCuenta(String idCuenta) {
		Cuenta cuenta = new Cuenta(idCuenta, 0);
		boolean existe = false;
		for (Cuenta cuentas : cuentas) {
			if (cuentas.getIdCuenta().equals(cuenta.getIdCuenta())) {
				existe = true;
				break;
			}
		}
		if (existe) {
			System.out.println("Cuenta ya existente");
			return null;
		}else {
			cuentas.add(cuenta);
			System.out.println("Cuenta creada correctamente");
			return cuenta;
		}
	}

	public String getIdCliente() {
		return idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	
}
