package unidad8.ejercicios.tarea1Part2;

public class CuentaCorriente2 extends CuentaA{

	private int nPropietarios=0;
	
	public CuentaCorriente2(String nombre, double cantidad, int nPropietarios) {
		super(nombre, cantidad);
		this.nPropietarios=nPropietarios;
	}

	public int getnPropietarios() {
		return nPropietarios;
	}

	public void setnPropietarios(int nPropietarios) {
		this.nPropietarios = nPropietarios;
	}
	
	@Override
	public void retirar(double retiro) {
		final int SALDOMIN=10;
		if (retiro>0) {
			if (retiro<cantidad) {
				if (cantidad-retiro>=SALDOMIN) {
					cantidad -= retiro;
				}else {
					System.out.println("Error no cumple el saldo mínimo no se ha realizado el retiro");
				}
			}else {
				System.out.println("No puede retirar más del dinero que tiene en la cuenta");
			}
		}else {
			System.out.println("No se puede retirar cantidad negativa");
		}

	}
	@Override
	public String toString() {
		return super.toString() + " y es una cuenta corriente y tiene " + nPropietarios + " propietarios";
	}
	
	
}
