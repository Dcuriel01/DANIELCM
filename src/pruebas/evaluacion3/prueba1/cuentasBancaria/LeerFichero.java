package pruebas.evaluacion3.prueba1.cuentasBancaria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class LeerFichero {
	static HashMap<String, ArrayList<Cuenta>> cuentasPorPaises = new HashMap<String, ArrayList<Cuenta>>();
	public static HashMap<String, ArrayList<Cuenta>> leer() {
		try {
			File ficheroLectura = new File("ficheros/pruebas/balances.csv");
			
			BufferedReader lector = new BufferedReader(new FileReader(ficheroLectura));
				String cadena;
				cadena = lector.readLine();
				cadena = lector.readLine();
				while (cadena != null) {
					String[]datos = cadena.split(",");
					Cuenta cuenta = crearCuenta(datos);
					if (!cuenta.getIdCliente().equals("0")) {
						ordernarCuentasMapa(cuenta);
					}
					cadena = lector.readLine();
				}	
				
				lector.close();
				
		}catch (IOException e) {
			e.printStackTrace();
	}
		return cuentasPorPaises;
	}
	
	
	
	private static void ordernarCuentasMapa(Cuenta cuenta) {
		String pais = cuenta.getIban().substring(0, 2);
		if (pais.matches("\\d{2}")) {
			pais="SinPais";
		}
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		if (cuentasPorPaises.containsKey(pais)) {
			cuentasPorPaises.get(pais).add(cuenta);
		}else {
			cuentas.add(cuenta);
			cuentasPorPaises.put(pais, cuentas);
		}
		
	}

	private static Cuenta crearCuenta(String[] datos) {
		Cuenta cuenta = null ;
		if (datos.length==2) {
			cuenta = new Cuenta("0", "0", 0);
		}else {
			cuenta = new Cuenta(datos[0], datos[1], Double.parseDouble(datos[2]));
		}
		
		return cuenta;
	}

}
