package unidad2.ejemplos;

public class Literales {

	public static void main(String[] args) {
		// 0b le indica que es un número binario
		// 0x le indica que es un número hexadecimal
		// 0 le indoca que es un número octal
		// da igual como dividas el número con los guiones bajos
		int binario = 0b0000_0101_0011_1001_0111_1111_1011_0001;
		int hexadecimal = 0x5__3__9__7__F__B__1;
		int octal = 00100;

		System.out.println(binario);
		System.out.println(hexadecimal);
		System.out.println(octal);

	}

}
