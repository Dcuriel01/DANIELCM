package pruebas.evaluacion3.pruebaFinal;

import java.security.SecureRandom;

public class Cita {

	private String documento;
	private String fecha;
	private String hora;
	private String cita;
	private String estadoPago;
	private String tramite;
	private String telefono;
	private String email;
	
	public Cita(String documento, String fecha, String hora, String estadoPago, String tramite,
			String telefono, String email) {
		super();
		this.documento = documento;
		this.fecha = fecha;
		this.hora = hora;
		cita = generarCita();
		this.estadoPago = estadoPago;
		this.tramite = tramite;
		this.telefono = telefono;
		this.email = email;
	}
	

	public Cita(String documento, String fecha, String hora, String cita, String estadoPago, String tramite,
			String telefono, String email) {
		super();
		this.documento = documento;
		this.fecha = fecha;
		this.hora = hora;
		this.cita = cita;
		this.estadoPago = estadoPago;
		this.tramite = tramite;
		this.telefono = telefono;
		this.email = email;
	}


	private String generarCita() {
		SecureRandom random = new SecureRandom();
		int cita = random.nextInt(999999);
		
		return String.valueOf(cita);
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCita() {
		return cita;
	}

	public void setCita(String cita) {
		this.cita = cita;
	}

	public String getEstadoPago() {
		return estadoPago;
	}

	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}

	public String getTramite() {
		return tramite;
	}

	public void setTramite(String tramite) {
		this.tramite = tramite;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Datos cita: fecha:" + fecha + " hora:" + hora + ", Nº cita:" + cita
				+" tramite :" + tramite;
	}
	
	
	
}
