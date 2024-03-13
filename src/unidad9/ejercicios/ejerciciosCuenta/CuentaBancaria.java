package unidad9.ejercicios.ejerciciosCuenta;

public abstract class CuentaBancaria {

	protected String iban;
	protected double saldo;
	public final double INTERES_ANUAL_BASICO = 0.03;
	
	
	public CuentaBancaria(String iban, double saldo) {
		super();
		this.iban = iban;
		this.saldo = saldo;
	}

	public void consultarAtributos(){
		System.out.println("Iban: " + iban);
		System.out.println("Saldo: " + saldo);
	}

	public void ingresarDinero(double aniadido) {
		if (aniadido>0) {
			saldo += aniadido;
			System.out.println("Saldo añadido");
		}else {
			System.out.println("Cantidad invalida");
		}
	}
	
	public void retirarDinero(double retirado) {
		if (retirado>0) {
			if (retirado<=saldo) {
				saldo -= retirado;
				System.out.println("Saldo añadido");
			}else {
				System.out.println("No puede retirar tanto dinero");
			}
		}else {
			System.out.println("Cantidad invalida");
		}
	}
	
	public void traspaso(CuentaBancaria otraCuenta, double traspaso) {
		if (traspaso>0) {
			if (traspaso<=saldo) {
				saldo -= traspaso;
				otraCuenta.ingresarDinero(traspaso);
				System.out.println("Traspaso hecho");
			}else {
				System.out.println("No puede retirar tanto dinero");
			}
		}else {
			System.out.println("Cantidad invalida");
		}
	}
	
	public abstract void calcularInteres();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Iban de la cuenta: " + iban + " saldo: " + saldo;
	}
	
	
	
	
	
	
	

	}
