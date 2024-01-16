package Unidad6Ejercicios;

public class Barrica {

	private String tipoVino = null;
	private String nombreVino = null;
	private String fechaInicio = null;
	private double precioPorLitro = 0;
	private double cantidadVino = 0;

	public Barrica(String tipoVino, String nombreVino, String fechaInicio, double precioPorLitro, double cantidadVino) {
		this.tipoVino = tipoVino;
		this.nombreVino = nombreVino;
		this.fechaInicio = fechaInicio;
		this.precioPorLitro = precioPorLitro;
		this.cantidadVino = cantidadVino;

	}

	public String getTipoVino() {
		return tipoVino;
	}

	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}

	public String getNombreVino() {
		return nombreVino;
	}

	public void setNombreVino(String nombreVino) {
		this.nombreVino = nombreVino;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public double getPrecioPorLitro() {
		return precioPorLitro;
	}

	public void setPrecioPorLitro(double precioPorLitro) {
		this.precioPorLitro = precioPorLitro;
	}

	public double getCantidadVino() {
		return cantidadVino;
	}

	public void setCantidadVino(double cantidadVino) {
		this.cantidadVino = cantidadVino;
	}

	public String imprimirDatos() {
		return "Datos Barrica\n" + "El vino es " + tipoVino + ", su nombre es " + nombreVino
				+ ", se empezó a fermentar el " + fechaInicio + ", cuesta " + precioPorLitro
				+ " por litro y tenemos almacenados " + cantidadVino + " litros";
	}

}
