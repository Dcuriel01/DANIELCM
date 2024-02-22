package unidad8Ejercicios.tarea2;

import java.util.Scanner;

public class CuentaCorriente3 implements IResponsable {

	static Scanner sc = new Scanner(System.in);
	private String nombre;
	protected double cantidad;
	private final double SALDOMIN = 100;

	public CuentaCorriente3(String nombre, double cantidad) {
		setNombre(nombre);
		setCantidad(cantidad);
	}

	@Override
	public boolean esValidoDeposito(double deposito) {
		boolean valido = false;
		if (deposito > 0) {
			valido = true;
		} else {
			System.out.println("No se puede depositar cantidades negativas");
		}

		return valido;
	}

	@Override
	public void depositar(double deposito) {
		boolean valido = esValidoDeposito(deposito);
		if (valido) {
			cantidad += deposito;
		} else {
			System.out.println("El deposito no se ha realizado");
		}
	}

	@Override
	public boolean esValidoRetirar(double retiro) {
		boolean valido = false;
		if (retiro > 0) {
			if (retiro < cantidad) {
				if (cantidad - retiro >= SALDOMIN) {
					valido = true;
				} else {
					System.out.println("Error no cumple el saldo mínimo no se ha realizado el retiro");
				}
			} else {
				System.out.println("No se puede retirar mas de lo que tienes en la cuenta");
			}
		} else {
			System.out.println("No se puede retirar cantidades negativas");
		}
		return valido;
	}

	@Override
	public void retirar(double retiro) {
		boolean valido = esValidoRetirar(retiro);
		if (valido) {
			cantidad -= retiro;
		} else {
			System.out.println("El retiro no se ha realizado");
		}
	}

	@Override
	public String toString() {
		return "La cuenta pertenece a " + nombre + " y tiene " + cantidad + " euros guardados";
	}

	private void setCantidad(double cantidad) {
		final int MIN = 100;
		if (cantidad > MIN) {
			this.cantidad = cantidad;
		} else {
			System.out.println("Error en la cantidad de cuenta, catidad designada a 0");
			this.cantidad = 0;

		}
	}

	public void setNombre(String nombre) {
		String expresionRegular = "{2,20}([A-Z]+[a-z]+)";
		Boolean resultado = nombre.matches(expresionRegular);
		if (resultado) {
			this.nombre = nombre;
		} else {
			this.nombre = " ";
		}

	}

}
