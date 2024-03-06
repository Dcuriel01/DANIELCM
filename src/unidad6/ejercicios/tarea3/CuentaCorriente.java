package unidad6.ejercicios.tarea3;

public class CuentaCorriente {

	private Titular titular;
	private String nCuenta;
	private double saldo;

	public CuentaCorriente(Titular titular, String nCuenta, double saldo) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		this.saldo = saldo;
	}

	public CuentaCorriente(Titular titular, String nCuenta) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		saldo = 15.3;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public void ingresar(double ingreso) {
		saldo = saldo + ingreso;
	}

	public void reintegro(double reintegro) {
		saldo = saldo - reintegro;
	}

	public void imprimirCuenta() {
		System.out.println("Número de cuenta: " + nCuenta);
		System.out.println("Saldo en la cuenta: " + saldo);
	}
	
	public void compararCuentas(CuentaCorriente CC1) {
		if (nCuenta.equals(CC1.getnCuenta())) {
			System.out.println("Estas cuentas son iguales");
		}else {
			System.out.println("Estas cuentas no son iguales");
		}
	}

}
