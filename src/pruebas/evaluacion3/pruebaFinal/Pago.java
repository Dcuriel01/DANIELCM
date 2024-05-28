package pruebas.evaluacion3.pruebaFinal;

import java.io.Serializable;

public class Pago implements Serializable{

	private static final long serialVersionUID = 1L;
	private String numeroReserva;
	private String metodoPago;
	private String datosPago;
	public Pago(String numeroReserva, String metodoPago, String datosPago) {
		super();
		this.numeroReserva = numeroReserva;
		this.metodoPago = metodoPago;
		this.datosPago = datosPago;
	}
	public String getNumeroReserva() {
		return numeroReserva;
	}
	public void setNumeroReserva(String numeroReserva) {
		this.numeroReserva = numeroReserva;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public String getDatosPago() {
		return datosPago;
	}
	public void setDatosPago(String datosPago) {
		this.datosPago = datosPago;
	}
	
	
	
	
}
