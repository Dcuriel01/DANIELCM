package unidad9.ejercicios.ejerciciosCuenta;

import java.util.ArrayList;

public class ProgramaCuentas {

	public static void main(String[] args) {
		ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
		CuentaAhorro c1 = new CuentaAhorro("ES00 1221", 15);
		CuentaCorriente c2 = new CuentaCorriente("ES00 7432", 1000);
		CuentaAhorro c3 = new CuentaAhorro("ES00 9436", 15000);
		cuentas.add(c1);
		cuentas.add(c2);
		cuentas.add(c3);
		System.out.println(c1);
		c2.ingresarDinero(188);
		c3.traspaso(c1, 2000);
		c1.retirarDinero(2015);
		System.out.println("Información cuentas");
		for (CuentaBancaria cuentaBancaria : cuentas) {
			System.out.println(cuentaBancaria);
		}
		
	}

}
