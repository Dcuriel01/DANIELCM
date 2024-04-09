package unidad11.ejercicios.tareaII;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vendedor {
	private String cif;
	private String nif;
	private ArrayList<String> productos = new ArrayList<String>();
	private ArrayList<LocalDate> fechas = new ArrayList<LocalDate>();
	private double cantidadGanada;
	private int totalProductosVendidos;
	public Vendedor(String cif, String nif,String producto, LocalDate fecha, double cantidadGanada) {
		this.cif = cif;
		this.nif = nif;
		productos.add(producto);
		fechas.add(fecha);
		this.cantidadGanada = cantidadGanada;
		totalProductosVendidos++;
	}
	
	public void sumarCantidadGanada(double cantidadGanada) {
		this.cantidadGanada=this.cantidadGanada+cantidadGanada;
		totalProductosVendidos++;
	}
	
	public void sumarProducto(String producto) {
		productos.add(producto);
	}
	public void sumarFecha(LocalDate fecha) {
		fechas.add(fecha);
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public double getCantidadGanada() {
		return cantidadGanada;
	}
	public void setCantidadGanada(double cantidadGanada) {
		this.cantidadGanada = cantidadGanada;
	}

	public int getTotalProductosVendidos() {
		return totalProductosVendidos;
	}

	public void setTotalProductosVendidos(int totalProductosVendidos) {
		this.totalProductosVendidos = totalProductosVendidos;
	}
	
	
	
	
	
	
	
}
