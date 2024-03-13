package unidad9.ejercicios.ejerciciosCuenta;

public class CuentaAhorro extends CuentaBancaria {

	public final double CANTIDAD_MIN = 150;
	public CuentaAhorro(String iban, double saldo) {
		super(iban, saldo);
		calcularInteres();
	}

	@Override
	public void calcularInteres() {
		if (saldo<CANTIDAD_MIN) {
			saldo = saldo+(saldo*(INTERES_ANUAL_BASICO/2));
		}else {
			saldo = saldo+(saldo*(INTERES_ANUAL_BASICO*2));
		}
	}

}
