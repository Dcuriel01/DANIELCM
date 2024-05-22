package pruebas.evaluacion3.prueba2;

public class Certificado {

	private String idCertificado;
	private String propietario;
	private String direccion;
	private String tipoDePropiedad;
	private char clasificacionEnergetica;
	private String fechaExpedicion;
	private String empresaCertificadora;
	private String codigoTecnico;
	
	public Certificado(String idCertificado, String propietario, String direccion, String tipoDePropiedad,
			char clasificacionEnergetica, String fechaExpedicion, String empresaCertificadora, String codigoTecnico) {
		super();
		this.idCertificado = idCertificado;
		this.propietario = propietario;
		this.direccion = direccion;
		this.tipoDePropiedad = tipoDePropiedad;
		this.clasificacionEnergetica = clasificacionEnergetica;
		this.fechaExpedicion = fechaExpedicion;
		this.empresaCertificadora = empresaCertificadora;
		this.codigoTecnico = codigoTecnico;
	}
	
	public String getIdCertificado() {
		return idCertificado;
	}
	public void setIdCertificado(String idCertificado) {
		this.idCertificado = idCertificado;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTipoDePropiedad() {
		return tipoDePropiedad;
	}
	public void setTipoDePropiedad(String tipoDePropiedad) {
		this.tipoDePropiedad = tipoDePropiedad;
	}
	public char getClasificacionEnergetica() {
		return clasificacionEnergetica;
	}
	public void setClasificacionEnergetica(char clasificacionEnergetica) {
		this.clasificacionEnergetica = clasificacionEnergetica;
	}
	public String getFechaExpedicion() {
		return fechaExpedicion;
	}
	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	public String getEmpresaCertificadora() {
		return empresaCertificadora;
	}
	public void setEmpresaCertificadora(String empresaCertificadora) {
		this.empresaCertificadora = empresaCertificadora;
	}
	public String getCodigoTecnico() {
		return codigoTecnico;
	}
	public void setCodigoTecnico(String codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}

	@Override
	public String toString() {
		return "Certificado [idCertificado=" + idCertificado + ", propietario=" + propietario + ", direccion="
				+ direccion + ", tipoDePropiedad=" + tipoDePropiedad + ", clasificacionEnergetica="
				+ clasificacionEnergetica + ", fechaExpedicion=" + fechaExpedicion + ", empresaCertificadora="
				+ empresaCertificadora + ", codigoTecnico=" + codigoTecnico + "]";
	}
	
	
	
	
}
