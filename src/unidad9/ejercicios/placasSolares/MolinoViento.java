package unidad9.ejercicios.placasSolares;

import java.time.LocalDate;
import java.util.Random;

public class MolinoViento extends ProductorEnergia {
	public static final double CANTIDAD_MAX = 3;
	public static final double CANTIDAD_MIN = 2;
	private VelocidadViento velocidadViento;
	
	public MolinoViento(String id, LocalDate ultimaRevision,VelocidadViento velocidadViento) {
		super(id, ultimaRevision);
		this.velocidadViento = velocidadViento;
	}
	private void calcularEficiencia() {
		if (velocidadViento==velocidadViento.MUY_ALTA) {
			eficicencia=0.90;
		}else if (velocidadViento==velocidadViento.ALTA) {
			eficicencia=0.80;
		}else if (velocidadViento==velocidadViento.MEDIA) {
			eficicencia=0.70;
		}else if (velocidadViento==velocidadViento.BAJA) {
			eficicencia=0.60;
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
		return super.toString() + "velocidad del tiempo: " + velocidadViento;
	}

}
