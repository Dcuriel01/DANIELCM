package unidad9.ejercicios.ejerciciosCuenta;

public class CuentaCorriente extends CuentaBancaria {

	public CuentaCorriente(String iban, double saldo) {
		super(iban, saldo);
		calcularInteres();
		
		
	}

	@Override
	public void calcularInteres() {
		saldo = saldo + (saldo*INTERES_ANUAL_BASICO);
	}

	
	
}
