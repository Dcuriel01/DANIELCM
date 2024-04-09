package unidad11.ejercicios.tareaII;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

import unidad11.ejercicios.tareaI.Cliente;

public class VentasOnlinePrograma {

	public static ArrayList<Vendedor>vendedores=new ArrayList<Vendedor>();
	public static void main(String[] args) {
		File ficheroLectura = new File("ficheros/ventas.csv");
		File ficheroEscritura = new File("ficheros/ventas.txt");
		leerFichero(ficheroLectura);
		System.out.println("Cantidad total por nif");
		mostrarCantidadPorNif();
		System.out.println("Mas de 10 productos vendidos o mas de 2000 euros vendidos");
		vendedoresMasDe10VentasO2000Euros();
		System.out.println("Que cumple cada nif");
		queCumpleCadaNif();
		ficheroNif(ficheroEscritura);

	}

	private static void ficheroNif(File ficheroEscritura) {
		try(PrintWriter escritor = new PrintWriter(ficheroEscritura)) {
			Iterator it = vendedores.iterator();
			while (it.hasNext()) {
				Vendedor v = (Vendedor)it.next();
				if (v.getCantidadGanada()>2000) {
					escritor.println("Nif: " + v.getNif()+ " cantidad vendida: " + v.getCantidadGanada());
				}
			}
			System.out.println("Datos escritos con exito");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
		
	}

	private static void queCumpleCadaNif() {
		System.out.println("Cumplen ambas");
		Iterator it = vendedores.iterator();
		while (it.hasNext()) {
			Vendedor v = (Vendedor)it.next();
			if (v.getCantidadGanada()>2000|v.getTotalProductosVendidos()>10) {
				System.out.println("Nif: " + v.getNif());
			}
		}
		System.out.println("Cumplen numero de ventas");
		while (it.hasNext()) {
			Vendedor v = (Vendedor)it.next();
			if (v.getTotalProductosVendidos()>10) {
				System.out.println("Nif: " + v.getNif());
			}
		}
		System.out.println("Cumple dinero total");
		while (it.hasNext()) {
			Vendedor v = (Vendedor)it.next();
			if (v.getCantidadGanada()>2000) {
				System.out.println("Nif: " + v.getNif());
			}
		}
	}

	private static void vendedoresMasDe10VentasO2000Euros() {
		Iterator it = vendedores.iterator();
		while (it.hasNext()) {
			Vendedor v = (Vendedor)it.next();
			if (v.getCantidadGanada()>2000|v.getTotalProductosVendidos()>10) {
				System.out.println("Nif: " + v.getNif()+" cantidad vendida: " + v.getCantidadGanada()+" productos vendidos: " + v.getTotalProductosVendidos());
			}else if (v.getCantidadGanada()>2000) {
				System.out.println("Nif: " + v.getNif()+" cantidad vendida: " + v.getCantidadGanada());
			}else if (v.getTotalProductosVendidos()>10) {
				System.out.println("Nif: " + v.getNif()+" productos vendidos: " + v.getTotalProductosVendidos());
			}
		}
		
	}

	private static void mostrarCantidadPorNif() {
		Iterator it = vendedores.iterator();
		while (it.hasNext()) {
			Vendedor v = (Vendedor)it.next();
			System.out.println("Nif: " + v.getNif()+" cantidad vendida: " + v.getCantidadGanada());
		}
	}

	private static void leerFichero(File ficheroLectura) {
		String[] datos = new String[5];
		String cif;
		String nif;
		String producto;
		LocalDate fecha;	
		double cantidadGanada;
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try (BufferedReader lector = new BufferedReader(new FileReader(ficheroLectura))){
			String cadena;
			int linea = 0;
			cadena = lector.readLine();
			while (cadena != null) {
				boolean parar=false;
				if (linea>0) {
				datos= cadena.split(",");
				cif = datos[0].substring(3);
				nif = datos[1].substring(3);
				producto = datos[2];
				fecha = LocalDate.parse(datos[3],formatoFecha);
				cantidadGanada=Double.parseDouble(datos[4]);
				if (linea!=1) {
				Iterator it = vendedores.iterator();
				while (it.hasNext()) {
					Vendedor v = (Vendedor)it.next();
					if (v.getCif().equals(cif)) {
						v.sumarCantidadGanada(cantidadGanada);
						v.sumarProducto(producto);
						v.sumarFecha(fecha);
						break;
					}
				}
				}
				if (!parar) {
					Vendedor v = new Vendedor(cif, nif, producto, fecha, cantidadGanada);
					vendedores.add(v);
				}
				}
				cadena = lector.readLine();
				linea++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
