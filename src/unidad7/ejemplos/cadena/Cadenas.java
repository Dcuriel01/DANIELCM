package unidad7.ejemplos.cadena;

public class Cadenas {

	public static void main(String[] args) {
		
		String cadena = new String("Esto es una linea de texto que se almacena como cadena");
		
		// Mide la longitud de la cadena
		System.out.println("Longintud:"+cadena.length());
		int longitudCadena = cadena.length();
		String otraCadena = ", y ahora ampliamos la cadena";
		String cadenaFinal = cadena + otraCadena;
		System.out.println(cadenaFinal);
		// Tanto esta como la de arriba concatenan cadenas
		String otraCadenaFinal = cadena.concat(otraCadena);
		System.out.println(cadenaFinal);
		// Borra espacios en blanco al principio y al final de la cadena
		System.out.println(cadena.trim());
		// Muestra caracter de la posición indicada
		System.out.println(cadena.charAt(5));
		char letraEnPosicion5 = cadena.charAt(5);
		// Este metodo pone todas las letras a mayuscula
		String matricula = "5555 mhl";
		System.out.println(matricula.toUpperCase());
		// Este metodo te devuelve la 1º posición de la letra o palabra que introduzcas
		System.out.println(cadena.indexOf("linea"));
		System.out.println(cadena.replace(" ", "a"));
		// Con este metodo si la palabra esta muestra true y si no false
		System.out.println(cadena.contains("linea"));
		// Con este metodo almacenamos las cosas en una cadena separada con lo que indiquemos en un array
		String nombres = "DAW DAM ASIR SMR";
		String [] ciclos = nombres.split(" ");
		for (String a : ciclos) {
			System.out.println(a);
		} 
		String numero = "1,5,7,4,2";
		String [] numeros = numero.split(",");
		// Integer.parseInt transforma los String a int pudiendo asi sumarlos
		int suma = Integer.parseInt(numeros[0])+Integer.parseInt(numeros[1]);
		System.out.println(suma);
		
	}
}
