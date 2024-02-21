package unidad8Ejercicios.tarea1Part2;

public class GestorCuenta2 {

	public static void main(String[] args) {

		CuentaAhorro2 Primeracuenta = new CuentaAhorro2("Daniel", 10);
		CuentaCorriente2 SegundaCuenta = new CuentaCorriente2("Mario", 40, 2);
		
		System.out.println(Primeracuenta);
		System.out.println(SegundaCuenta);
		
		SegundaCuenta.retirar(35);
		Primeracuenta.depositar(15);
		
		System.out.println(Primeracuenta);
		System.out.println(SegundaCuenta);
		
		SegundaCuenta.retirar(25);
		Primeracuenta.retirar(35);
		
		System.out.println(Primeracuenta);
		System.out.println(SegundaCuenta);
		
		
	}
	
	

}
