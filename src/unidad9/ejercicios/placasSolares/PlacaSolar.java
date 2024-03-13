package unidad9.ejercicios.placasSolares;

import java.time.LocalDate;
import java.util.Random;


	
public class PlacaSolar extends ProductorEnergia {
	public static final double CANTIDAD_MAX = 500;
	public static final double CANTIDAD_MIN = 150;
	private TipoPlacas tipo;
	private Orientaciones orientacion;
	private double inclinacion;
	
	public PlacaSolar(String id, LocalDate ultimaRevision, TipoPlacas tipo,
			Orientaciones orientacion,double inclinacion) {
		super(id, ultimaRevision);
		this.tipo = tipo;
		this.orientacion = orientacion;
		this.inclinacion=inclinacion;
		calcularEficiencia();
	}

	private void calcularEficiencia() {
		if (tipo==TipoPlacas.FOTOVOLTAICOS) {
			eficicencia=0.70;
		}else if (tipo==TipoPlacas.HIBRIDOS) {
			eficicencia=0.80;
		}else if (tipo==TipoPlacas.TERMICOS) {
			eficicencia=0.90;
		}
	}
	
	

	@Override
	public void obtenerSimulacionEnergia() {
		Random random = new Random();
	    cantidadGenerada= (CANTIDAD_MIN + (CANTIDAD_MAX - CANTIDAD_MIN) * random.nextDouble());
	    cantidadGenerada=cantidadGenerada + (cantidadGenerada*eficicencia);
	}
	 @Override
	public String toString() {
		return super.toString()+ " tipo: " + tipo + " orientacion: " + orientacion + " inclinación: " + inclinacion;
	}

}
