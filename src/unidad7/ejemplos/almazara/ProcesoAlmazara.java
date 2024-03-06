package unidad7.ejemplos.almazara;

import java.text.DecimalFormat;

public class ProcesoAlmazara {

	private double pesoAceitunas;
	private double pesoLimpio;
	private double pesoMolturado;
	private double aceiteExtraido;
	private double aceiteFiltrado;
	private Cliente cliente;
	
	public ProcesoAlmazara() {
		pesoAceitunas = SimuladorAlmazara.generarCantidadAleatoria(Cantidades.CANTIDADES_MIN_ACEITUNAS, Cantidades.CANTIDADES_MAX_ACEITUNAS);
		
		double porcetajeLimpieza = SimuladorAlmazara.generarPorcentajeAleatorio(Cantidades.CANTIDADES_MIN_LIMPIEZA, Cantidades.CANTIDADES_MAX_LIMPIEZA);
		pesoLimpio = SimuladorAlmazara.aplicarPorcentaje(pesoAceitunas, porcetajeLimpieza);
		
		double porcetajeMolturacion = SimuladorAlmazara.generarPorcentajeAleatorio(Cantidades.CANTIDADES_MIN_MOLTURACION, Cantidades.CANTIDADES_MAX_MOLTURACION);
		pesoMolturado = SimuladorAlmazara.aplicarPorcentaje(pesoLimpio, porcetajeMolturacion);
		
		double porcetajeExtraccion = SimuladorAlmazara.generarPorcentajeAleatorio(Cantidades.CANTIDADES_MIN_EXTRACCION, Cantidades.CANTIDADES_MAX_EXTRACCION);
		aceiteExtraido = SimuladorAlmazara.aplicarPorcentaje(pesoMolturado, porcetajeExtraccion);
		
		double porcetajeFiltracion = SimuladorAlmazara.generarPorcentajeAleatorio(Cantidades.CANTIDADES_MIN_FILTRACION, Cantidades.CANTIDADES_MAX_FILTRACION);
		aceiteFiltrado = SimuladorAlmazara.aplicarPorcentaje(aceiteExtraido, porcetajeFiltracion);
		
		
		
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getPesoAceitunas() {
		return pesoAceitunas;
	}
	public void setPesoAceitunas(double pesoAceituna) {
		this.pesoAceitunas = pesoAceituna;
	}
	public double getPesoLimpio() {
		return pesoLimpio;
	}
	public void setPesoLimpio(double pesoLimpio) {
		this.pesoLimpio = pesoLimpio;
	}
	public double getPesoMolturado() {
		return pesoMolturado;
	}
	public void setPesoMolturado(double pesoMolturado) {
		this.pesoMolturado = pesoMolturado;
	}
	public double getAceiteExtraido() {
		return aceiteExtraido;
	}
	public void setAceiteExtraido(double aceiteExtraido) {
		this.aceiteExtraido = aceiteExtraido;
	}
	public double getAceiteFiltrado() {
		return aceiteFiltrado;
	}
	public void setAceiteFiltrado(double aceiteFiltrado) {
		this.aceiteFiltrado = aceiteFiltrado;
	}
	public void mostrarDatos() {
		DecimalFormat formato = new DecimalFormat("0.00");
		System.out.println("Peso inicial de aceitunas: " +   formato.format(pesoAceitunas)  + " kg");
        System.out.println("Peso después de la limpieza: " + formato.format(pesoLimpio) + " kg");
        System.out.println("Peso después de la molturación: " + formato.format(pesoMolturado) + " kg");
        System.out.println("Aceite extraído: " + formato.format(aceiteExtraido) + " litros");
        System.out.println("Aceite después de la filtración: " + formato.format(aceiteFiltrado) + " litros");
        if (cliente!=null) {
        	System.out.println("CLIENTE ______");
			cliente.mostrarDatos();
		}
        System.out.println();
	}
	
	
}
