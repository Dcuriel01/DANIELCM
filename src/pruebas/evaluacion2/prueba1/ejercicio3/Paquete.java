package pruebas.evaluacion2.prueba1.ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import pruebas.evaluacion2.prueba1.ejercicio3.enumeradores.TipoUrgencia;
import pruebas.evaluacion2.prueba1.ejercicio3.enumeradores.Zonas;

public class Paquete {

	protected String id;
	protected double peso;
	protected LocalDate fechaEntrega;
	protected Zonas zona;
	protected double precioEnvio;
	protected TipoUrgencia urgencia;
	
	public Paquete(String id, double peso, LocalDate fechaEntrega) {
		super();
		setId(id);
		setPeso(peso);
		this.fechaEntrega = fechaEntrega;
		setUrgencia(fechaEntrega);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		String []cadenaPartida = new String[2];
		boolean zonaExistente=false;
		cadenaPartida=id.split("-");
		zonaExistente = comprobarExistenciaZona(cadenaPartida[1]);
		this.id=id;
		

	}

	private boolean comprobarExistenciaZona(String zona) {
		boolean existenciaZona=false;
		switch (zona) {
		case "CAC":
			existenciaZona=true;
			setZona(Zonas.CAC);
			break;
		case "COR":
			existenciaZona=true;
			setZona(Zonas.COR);
			break;
		case "NAV":
			existenciaZona=true;
			setZona(Zonas.NAV);
			break;
		case "PLA":
			existenciaZona=true;
			setZona(Zonas.PLA);
			break;
		case "MER":
			existenciaZona=true;
			setZona(Zonas.MER);
			break;
		case "BAD":
			existenciaZona=true;
			setZona(Zonas.BAD);
			break;
		case "DBN":
			existenciaZona=true;
			setZona(Zonas.DBN);
			break;
		case "ZAF":
			existenciaZona=true;
			setZona(Zonas.ZAF);
			break;
		}
		return existenciaZona;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso>0) {
			this.peso = peso;
		}else {
			this.peso=-1;
		}
		
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Zonas getZona() {
		return zona;
	}

	public void setZona(Zonas zona) {
		this.zona = zona;
	}

	public double getPrecioEnvio() {
		return precioEnvio;
	}

	public TipoUrgencia getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(LocalDate fechaEntrega) {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaLocal = LocalDate.parse("15/03/2024", formatoFecha);
		long diasPasados=ChronoUnit.DAYS.between(fechaEntrega, fechaLocal);
		if (diasPasados>5) {
			urgencia=TipoUrgencia.URGENTE;
		}else if (diasPasados>3) {
			urgencia=TipoUrgencia.NO_URGENTE;
		}else {
			urgencia=TipoUrgencia.NORMAL;
		}
	}
	@Override
	public String toString() {
		return "Id: " + id +" peso:" + peso + " urgencia: " + urgencia.getUrgencia();
	}
	
	public void mostrarPaquetesConCostes() {
		System.out.println(toString()+" coste: " + precioEnvio);
	}
	
}
