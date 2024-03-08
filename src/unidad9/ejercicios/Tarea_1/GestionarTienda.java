package unidad9.ejercicios.Tarea_1;

import java.util.Iterator;
import java.util.Scanner;

public class GestionarTienda {

	public static Inventario inv = new Inventario();
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		boolean salir=false;
		int opcion = 0;
		do {
			opcion=menu();
			switch (opcion) {
			case 1:
				Articulo a ;
				String talla;
				int cantidad;
				a = pedirArticulo();
				talla = pedirTalla();
				cantidad = pedirCantidad();
				Pedido p1 = new Pedido(a, talla, cantidad);
				break;
			case 3:
				inv.mostrarStock();
				break;
			case 4:
				inv.mostrarPedidos();
				break;
			case 5:
				System.out.println("Saliendo, gracias por usar el programa");
				salir = true;
				break;

			default:
				break;
			}
			
		} while (!salir);
		
		
	}

	private static int pedirCantidad() {
		int cantidad=0;
		System.out.println("cantidad del producto:");
		cantidad = sc.nextInt();
		return cantidad;
	}
	
	private static String pedirTalla() {
		String talla=" ";
		System.out.println("talla del producto:");
		talla = sc.next();
		return talla;
	}

	private static Articulo pedirArticulo() {
		int idProducto=0;
		System.out.println("Id del producto:");
		idProducto = sc.nextInt();
		if (idProducto>=0&idProducto<=9) {
			return inv.sacarArticulo(idProducto);
		}else {
			System.out.println("No reconocido");
			return null;
		}
	}

	private static int menu() {
		int opcion=0;
		System.out.println("Menu-----Zara");
		System.out.println("1. Hacer pedido");
		System.out.println("2. Hacer devolución");
		System.out.println("3. Ver stock");
		System.out.println("4. Ver pedidos realizados y pendientes");
		System.out.println("5. Salir");
		opcion = sc.nextInt();
		return opcion;
	}

}
