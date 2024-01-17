package Unidad7Ejercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarCoincidencias {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ejemplo con metacaracteres
		Pattern pattern = Pattern.compile("a.*b");
		Matcher matcher = pattern.matcher("aXYZb");
		boolean coincide = matcher.matches(); // true
		if(coincide) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		Pattern pattern2 = Pattern.compile("[aeiou]");
		Matcher matcher2 = pattern2.matcher("Ciclo");
		boolean encontrado = matcher2.find(); // true (coincide con la 'i' y 'o' en Ciclo)
		if(encontrado) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		Pattern pattern3 = Pattern.compile("[^io]");
		Matcher matcher3 = pattern3.matcher("ioooooo");
		boolean encontrado2 = matcher3.find(); // true (coincide con la 'i' y 'o' en Ciclo)
		if(encontrado2) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		// Ejemplo con cuantificadores
		Pattern pattern4 = Pattern.compile("a{2,4}");
		Matcher matcher4 = pattern4.matcher("aa"); 
		boolean encontrado3 = matcher4.find(); // true 
		if(encontrado3) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		// GRUPOS Y CAPTURAS
		// Ejemplo con grupos y capturas
		Pattern pattern5 = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
		Matcher matcher5 = pattern5.matcher("01-01-2024");

		if (matcher5.matches()) {
		    String day = matcher5.group(1);
		    String month = matcher5.group(2);
		    String year = matcher5.group(3);
		    System.out.println("Día: " + day + ", Mes: " + month + ", Año: " + year);
		}
		
		//Dirección 
		// \\s espacio en blanco
		// \\d dígito
		// \\w palabra
		 String expresion = "\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+ \\d+)";
	     String entrada = "Calle Sal si puedes 123";

	     Pattern patron = Pattern.compile(expresion);
	     Matcher buscador = patron.matcher(entrada);
	     
        if (buscador.find()) {
            System.out.println("La cadena cumple con el patrón.");
        } else {
            System.out.println("La cadena no cumple con el patrón.");
        }
        
        
        //Coincidir con una palabra que tiene al menos un espacio en blanco
        String expresion2 = "\\w+\\s+\\w+";
        String entrada2 = "Hola clase";

	     Pattern patron2 = Pattern.compile(expresion2);
	     Matcher buscador2 = patron2.matcher(entrada2);

       if (buscador2.find()) {
           System.out.println("La cadena cumple con el patrón.");
       } else {
           System.out.println("La cadena no cumple con el patrón.");
       }

	}

}
	