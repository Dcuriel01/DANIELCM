package Unidad7Ejercicios;

public class SolicitudDePermisos {
	
	private String fecha = null;
	private String hora = null;
	private String nombre = null;
	private String dni = null;
	private String tlf = null;
	private String asignatura = null;
	private String diasPropios = null;
	private boolean diaLectivo1 = false;
	private boolean diaLectivo2 = false;
	private boolean diaLectivo3 = false;
	private boolean diaNoLectivo = false;
	private String dia = null;
	private String mes = null;
	private String ultimoNAnio = null;
	private boolean firma = false;
	private boolean concesion = false;
	
	public SolicitudDePermisos(String fecha, String hora, String nombre, String dni, String tlf, String asignatura,
			String diasPropios, boolean diaLectivo1, boolean diaLectivo2, boolean diaLectivo3, boolean diaNoLectivo,
			String dia, String mes, String ultimoNAnio, boolean firma, boolean concesion) {
		this.fecha = fecha;
		this.hora = hora;
		this.nombre = nombre;
		this.dni = dni;
		this.tlf = tlf;
		this.asignatura = asignatura;
		this.diasPropios = diasPropios;
		this.diaLectivo1 = diaLectivo1;
		this.diaLectivo2 = diaLectivo2;
		this.diaLectivo3 = diaLectivo3;
		this.diaNoLectivo = diaNoLectivo;
		this.dia = dia;
		this.mes = mes;
		this.ultimoNAnio = ultimoNAnio;
		this.firma = firma;
		this.concesion = concesion;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getDiasPropios() {
		return diasPropios;
	}

	public void setDiasPropios(String diasPropios) {
		this.diasPropios = diasPropios;
	}

	public boolean isDiaLectivo1() {
		return diaLectivo1;
	}

	public void setDiaLectivo1(boolean diaLectivo1) {
		this.diaLectivo1 = diaLectivo1;
	}

	public boolean isDiaLectivo2() {
		return diaLectivo2;
	}

	public void setDiaLectivo2(boolean diaLectivo2) {
		this.diaLectivo2 = diaLectivo2;
	}

	public boolean isDiaLectivo3() {
		return diaLectivo3;
	}

	public void setDiaLectivo3(boolean diaLectivo3) {
		this.diaLectivo3 = diaLectivo3;
	}

	public boolean isDiaNoLectivo() {
		return diaNoLectivo;
	}

	public void setDiaNoLectivo(boolean diaNoLectivo) {
		this.diaNoLectivo = diaNoLectivo;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getUltimoNAnio() {
		return ultimoNAnio;
	}

	public void setUltimoNAnio(String ultimoNAnio) {
		this.ultimoNAnio = ultimoNAnio;
	}

	public boolean isFirma() {
		return firma;
	}

	public void setFirma(boolean firma) {
		this.firma = firma;
	}

	public boolean isConcesion() {
		return concesion;
	}

	public void setConcesion(boolean concesion) {
		this.concesion = concesion;
	}
	
	
	
	
}
