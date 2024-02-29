package unidad3.ejercicios;

import java.util.Scanner;

public class Facturas {

	public static void main(String[] args) {

		int cantidad;
		float precio;
		float precioIva;
		float precioDescuento;
		float precioCompra;
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Cuántos productos ha comprado? ");
		cantidad = entrada.nextInt();
		System.out.print("¿Y cuál es el precio de la unidad? ");
		precio = entrada.nextInt();

		precioCompra = cantidad * precio;
		precioIva = precioCompra + (precioCompra * 0.21f);
		if (precioIva <= 30) {
			precioDescuento = precioIva * 0.1f;
			System.out.println("El precio a pagar con el aumento de IVA y su descuento del 10% es: " + (precioIva - precioDescuento));
		} else if (precioIva <= 70) {
			precioDescuento = precioIva * 0.25f;
			System.out.println("El precio a pagar con el aumento de IVA y su descuento del 25% es: " + (precioIva - precioDescuento));
		} else if (precioIva > 70) {
			precioDescuento = precioIva * 0.35f;
			System.out.println("El precio a pagar con el aumento de IVA y su descuento del 35% es: " + (precioIva - precioDescuento));
		} else {
			System.out.println("Debe pagar con el aumento de IVA un total de: " + precioIva);
		}
		entrada.close();

	}

}
