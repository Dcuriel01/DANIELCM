package unidad11.ejercicios.tareaI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioCliente {

	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public static File fichero = new File("ficheros/Clientes.txt");
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		boolean salir = false;
		int opcion;
		do {
		opcion = menu();
		switch (opcion) {
		case 1:
			Cliente cliente= crearCliente();
			clientes.add(cliente);
			break;
		case 2:
			Cliente cliSelec = null;
			String cif;
			double saldo;
			System.out.println("Introduzca CIF del cliente");
			cif=sc.next();
			Iterator it = clientes.iterator();
			while (it.hasNext()) {
				Cliente c = (Cliente)it.next();
				if (c.getCif().equals(cif)) {
					cliSelec=c;
				}
			}
			if (cliSelec==null) {
				System.out.println("Cliente no encontrado");
			}else {
				System.out.println("Introduzca el saldo a añadir");
				saldo = sc.nextDouble();
				if (saldo<0) {
					System.out.println("Error en el saldo");
				}else {
					cliSelec.sumarSaldo(saldo);
					cliSelec= null;
				}
			}
			break;
		case 3:
			System.out.println("Informe:");
			Iterator it2 = clientes.iterator();
			while (it2.hasNext()) {
				Cliente c = (Cliente)it2.next();
				System.out.println(c);
			}	
			break;
		case 4:
			try(PrintWriter escritor = new PrintWriter(fichero)) {
				Iterator it3 = clientes.iterator();
				escritor.println("Clientes");
				while (it3.hasNext()) {
					Cliente c = (Cliente)it3.next();
					escritor.println(c);
					escritor.println();
				}	
				System.out.println("Datos escritos con exito");
			} catch (FileNotFoundException e) {

				e.printStackTrace();

			}
			break;
		case 5:
			try (BufferedReader lector = new BufferedReader(new FileReader(fichero))){
				String cadena;
				cadena = lector.readLine();
				while (cadena != null) {
					System.out.println(cadena);
					cadena = lector.readLine();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 6:
			System.out.println("Ok saliendo del programa");
			salir=true;
			break;

		default:
			System.out.println("Error");
			break;
			
		}
		} while (!salir);
		
		
	}
	private static Cliente crearCliente() {
		String cif;
		String nombre;
		int temp;
		TipoCliente tipoCliente;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Introduzca CIF del cliente");
		cif=sc.next();
		System.out.println("Introduzca el nombre del cliente");
		nombre=sc.next();
		System.out.println("Introduzca el tipo de cliente normal(1),preferente(2)");
		sc.nextLine();
		temp=sc.nextInt();
		if (temp==1) {
			tipoCliente=TipoCliente.NORMAL;
		}else {
			tipoCliente=TipoCliente.PREFERENTE;
		}
		Cliente cliente = new Cliente(cif, nombre, tipoCliente);
		System.out.println("Cliente añadido");
		return cliente;
	}

	private static int menu() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		System.out.println("1. Añadir Cliente");
		System.out.println("2. Añadir cantidad facturada por el cliente");
		System.out.println("3. Generar informe");
		System.out.println("4. Grabar en fichero de texto");
		System.out.println("5. Leer fichero");
		System.out.println("6. Salir");
		opcion = sc.nextInt();
		return opcion;
	}

}
