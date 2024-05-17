package pruebas.evaluacion3.prueba1.cuentasBancaria;

import java.io.Serializable;

public class Cuenta implements Serializable{

	private static final long serialVersionUID = 1L;
	private String idCliente;
	private String iban;
	private double balance;
	
	public Cuenta(String idCliente, String iban, double balance) {
		super();
		this.idCliente = idCliente;
		this.iban = iban;
		this.balance = balance;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return idCliente + "," + iban + "," + balance;
	}
	
	
	
	
}
