package tareasFinales.certificadosEnergias;

import javax.swing.JTextField;

public class Edificio {

	private String nombreEdificio;
	private String direccion;
	private String municipio;
	private String cPostal;
	private String provincia;
	private String comunidadAutonoma;
	private String zonaClimatica;
	private String anioConstruccion;
	private String normativa;
	private String referencias;
	
	public Edificio(String nombreEdificio, String direccion, String municipio, String cPostal, String provincia,
			String comunidadAutonoma, String zonaClimatica, String anioConstruccion, String normativa,
			String referencias) {
		super();
		this.nombreEdificio = nombreEdificio;
		this.direccion = direccion;
		this.municipio = municipio;
		this.cPostal = cPostal;
		this.provincia = provincia;
		this.comunidadAutonoma = comunidadAutonoma;
		this.zonaClimatica = zonaClimatica;
		this.anioConstruccion = anioConstruccion;
		this.normativa = normativa;
		this.referencias = referencias;
		
		
	}

	public String getNombreEdificio() {
		return nombreEdificio;
	}

	public void setNombreEdificio(String nombreEdificio) {
		this.nombreEdificio = nombreEdificio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getcPostal() {
		return cPostal;
	}

	public void setcPostal(String cPostal) {
		this.cPostal = cPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}

	public void setComunidadAutonoma(String comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}

	public String getZonaClimatica() {
		return zonaClimatica;
	}

	public void setZonaClimatica(String zonaClimatica) {
		this.zonaClimatica = zonaClimatica;
	}

	public String getAnioConstruccion() {
		return anioConstruccion;
	}

	public void setAnioConstruccion(String anioConstruccion) {
		this.anioConstruccion = anioConstruccion;
	}

	public String getNormativa() {
		return normativa;
	}

	public void setNormativa(String normativa) {
		this.normativa = normativa;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	
	
	
}
