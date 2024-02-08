package unidad1.ejemplos;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class Pruebas2 {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();	
		
		int parte1 =random.nextInt(3)+1;
		System.out.println(parte1);
		
	}	

}
