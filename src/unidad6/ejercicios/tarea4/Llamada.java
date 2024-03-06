package unidad6.ejercicios.tarea4;

public class Llamada {

	private String nOrigen;
	private String nDestino;
	private int duracion;
	private TipoLlamada tipo;
	private int franja;
	
	
	
	public Llamada(String nOrigen, String nDestino, int duracion) {
		this.nOrigen = nOrigen;
		this.nDestino = nDestino;
		this.duracion = duracion;
		boolean moneda = Generador.generarBoolean();
		if (moneda) {
			tipo=TipoLlamada.LOCAL;
			franja = 0;
		}else {
			tipo=TipoLlamada.PROVINCIAL;
			franja = Generador.generarFranja();
		}
	}

	public void imprimirDatos() {
		System.out.println("Número de origen: " + nOrigen);
		System.out.println("Número de destino: " + nDestino);
		System.out.println("Duración en segundos: " + duracion);
		if (tipo==TipoLlamada.LOCAL) {
			System.out.println("Tipo de llamada: Local" );
		}else {
			System.out.println("Tipo de llamada: Provincial" );
			System.out.println("Franja número: " + franja);
		}
		
	}

	public String getnOrigen() {
		return nOrigen;
	}



	public String getnDestino() {
		return nDestino;
	}



	public int getDuracion() {
		return duracion;
	}



	public TipoLlamada getTipo() {
		return tipo;
	}



	public int getFranja() {
		return franja;
	}
	
	
	
	
}
