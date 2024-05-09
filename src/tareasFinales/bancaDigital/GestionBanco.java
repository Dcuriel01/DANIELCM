package tareasFinales.bancaDigital;

public class GestionBanco {

	public static void main(String[] args) {

		Banco banco = new Banco("BBVA","Madrid");
		
		Cliente cliente1 = new Cliente("001", "Sergio", "Sergio@gmail.com");
		//Regitrarse
		banco.registrar(cliente1);
		//Abrir Cuentas
		Cuenta cuenta1 = cliente1.abrirCuenta("001");
		//Deposito
		cuenta1.depositar(100);
		System.out.println("Dinero en la cuenta 1 del cliente 1=" + cuenta1.getBalance());
		
		Cliente cliente2 = new Cliente("002", "Daniel", "Daniel@gmail.com");
		
		banco.registrar(cliente2);
		
		Cuenta cuenta2 = cliente2.abrirCuenta("001");
		
		cuenta2.depositar(50);
		cuenta2.retirar(40);//Retiro
		System.out.println("Dinero en la cuenta 2 del cliente 2 =" + cuenta2.getBalance());
		
		
		if (cliente1.login("Sergio","Sergio@gmail.com")) {
			System.out.println("Logeado correctamente");
		}else {
			System.out.println("Inicio de sesión erroneo");
		}
	}

}
