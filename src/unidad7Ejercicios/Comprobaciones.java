package unidad7Ejercicios;

public class Comprobaciones {
		public static int comprobarCadenaLimite(String cadena, int limite) {
			int numero=-1;
			cadena.trim();
			if (cadena.matches("[1-9]")) {
				numero = Integer.parseInt(cadena);
				if (numero>0&numero<=limite) {
					
				}else {
					numero = -1;
				}
			}
			 
			
			return numero;
		}
		public static int comprobarCadenaSinLimite(String cadena) {
			int numero=-1;
			cadena.trim();
			if (cadena.matches("[1-9]")) {
				numero = Integer.parseInt(cadena);
				if (numero>0) {
					
				}else {
					numero = -1;
				}
			}
			 
			
			return numero;
		}
		

}