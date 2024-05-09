package tareasFinales.bancaDigital;

public class Cuenta {

	private String idCuenta;
	private double balance;
	
	public Cuenta(String idCuenta, double balance) {
		super();
		this.idCuenta = idCuenta;
		this.balance = balance;
	}
	
	public void depositar(double cantidad) {
		if (cantidad<0) {
			System.out.println("No se puede depositar esa cantidad");
		}else {
			balance = balance + cantidad;
			System.out.println("Cantidad depositada correctamente");
		}
	}
	
	public void retirar(double cantidad) {
		if (cantidad<0) {
			System.out.println("No se puede retirar esa cantidad");
		}else {
			balance = balance - cantidad;
			System.out.println("Cantidad retirada correctamente");
		}
	}

	public String getIdCuenta() {
		return idCuenta;
	}

	public double getBalance() {
		return balance;
	}
	
	
}
