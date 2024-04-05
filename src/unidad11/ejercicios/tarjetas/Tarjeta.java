package unidad11.ejercicios.tarjetas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarjeta {

	private String numTarjetas;
	private String marcaTarjetas;
	private String numCuenta;
	private LocalDate fechaCaducidad;

	public Tarjeta(String numTarjetas, String marcaTarjetas, String numCuenta, LocalDate fechaCaducidad) {
		super();
		this.numTarjetas = numTarjetas;
		this.marcaTarjetas = marcaTarjetas;
		this.numCuenta = numCuenta;
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public String imprimirNumeroTarjeta() {
		return "Numero: " + numTarjetas;
	}

	public String getNumTarjetas() {
		return numTarjetas;
	}



	public void setNumTarjetas(String numTarjetas) {
		this.numTarjetas = numTarjetas;
	}



	public String getMarcaTarjetas() {
		return marcaTarjetas;
	}



	public void setMarcaTarjetas(String marcaTarjetas) {
		this.marcaTarjetas = marcaTarjetas;
	}



	public String getNumCuenta() {
		return numCuenta;
	}



	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}



	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}



	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}



	@Override
	public String toString() {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaCaducidad= this.fechaCaducidad.format(formatoFecha);
		return "numero: " + numTarjetas + "marca: " + marcaTarjetas + " numero cuenta: " + numCuenta
				+ "fechaCaducidad: "+ fechaCaducidad;
	}
	
}
