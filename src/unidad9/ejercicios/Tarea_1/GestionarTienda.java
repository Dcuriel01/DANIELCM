package unidad9.ejercicios.Tarea_1;

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
				Articulo a1;
				String talla1;
				int cantidad1;
				a1 = pedirArticulo();
				talla1 = pedirTalla();
				cantidad1 = pedirCantidad();
				Pedido p1 = new Pedido(a1, talla1, cantidad1);
				break;
			case 2:
				Articulo a2 ;
				String talla2;
				int cantidad2;
				a2 = pedirArticulo();
				talla2 = pedirTalla();
				cantidad2 = pedirCantidad();
				Devolucion d1 = new Devolucion(a2, talla2, cantidad2);
				break;
			case 3:
				System.out.println("1. Stock todas las prendas");
				System.out.println("2. Stock prenda en particular");
				int opcionStock=sc.nextInt();
				if (opcionStock==1) {
					inv.mostrarStock();
				}else if (opcionStock==2) {
					int idStock;
					do {
					idStock=pedirArticuloInt();
					} while (idStock==-1);
					inv.mostrarStockParticular(idStock);
				}else {
					System.out.println("No reconocido");
				}
				
				break;
			case 4:
				System.out.println("1. Pedidos todas las prendas");
				System.out.println("2. Pedidos prenda en particular");
				int opcionPedidos=sc.nextInt();
				if (opcionPedidos==1) {
					inv.mostrarPedidos();
				}else if (opcionPedidos==2) {
					int idPedidos;
					do {
						idPedidos=pedirArticuloInt();
					} while (idPedidos==-1);
					inv.mostrarPedidosParticular(idPedidos);
				}else {
					System.out.println("No reconocido");
				}
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

	private static int pedirArticuloInt() {
		int id;
		System.out.println("Indique el id");
		id = sc.nextInt();
		if (id>=0&id<=9) {
			
		}else {
			System.out.println("Error en el id");
			id=-1;
		}
		return id;
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
		System.out.println("4. Ver pedidos realizados, pendientes y devueltos");
		System.out.println("5. Salir");
		opcion = sc.nextInt();
		return opcion;
	}

}
