package unidad6.ejercicios.tarea3;

public class CuentaAhorro {

	private Titular titular;
	private String nCuenta;
	private double saldo;
	private double interes;

	public CuentaAhorro(Titular titular, String nCuenta, double saldo, double interes) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		this.saldo = saldo;
		this.interes = interes;
	}

	public CuentaAhorro(Titular titular, String nCuenta, double interes) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		this.interes = interes;
		saldo = 15.3;
	}
	public CuentaAhorro(Titular titular, String nCuenta) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		interes = 2.5;
		saldo = 15.3;
	}

	public double getInteres() {
		return interes;
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
		System.out.println("El interes es de: " + interes);
	}
	
	public void compararCuentas(CuentaAhorro CA1) {
		if (nCuenta.equals(CA1.getnCuenta())) {
			System.out.println("Estas cuentas son iguales");
		}else {
			System.out.println("Estas cuentas no son iguales");
		}
	}
	
	public void calcularInteres() {
		saldo = (saldo*interes)+saldo;
	}

}
