package unidad8.ejercicios.tarea2;

public class GestorCuenta3 {

	public static void main(String[] args) {

		CuentaAhorro3 Primeracuenta = new CuentaAhorro3("Daniel", 1000);
		CuentaCorriente3 SegundaCuenta = new CuentaCorriente3("Sergio", 4000);
		
		System.out.println(Primeracuenta);
		System.out.println(SegundaCuenta);
		System.out.println("------------------------------");
		SegundaCuenta.retirar(35);
		Primeracuenta.depositar(15);
		
		System.out.println(Primeracuenta);
		System.out.println(SegundaCuenta);
		
		SegundaCuenta.retirar(25);
		Primeracuenta.retirar(35);
		System.out.println("------------------------------");
		System.out.println(Primeracuenta);
		System.out.println(SegundaCuenta);
		
		
	}
	
	

}
