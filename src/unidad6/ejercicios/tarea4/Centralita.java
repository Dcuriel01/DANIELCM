package unidad6.ejercicios.tarea4;

import java.text.DecimalFormat;

public class Centralita {

	private int nLlamadas;
	private double saldoTotal;
	
	DecimalFormat formato = new DecimalFormat("0.00");
	public void registrarLlamada(int LlamadasGeneradas) throws InterruptedException {
		Llamada [] llamadas = new Llamada [LlamadasGeneradas];
		for (int i = 0; i < LlamadasGeneradas; i++) {
			
			String nOrigen = Generador.gernerarNumeros();
			String nDestino = Generador.gernerarNumeros();
			int segundos = Generador.generarTiempo();
			llamadas[i] = new Llamada(nOrigen, nDestino, segundos);
			double precio = cobrarLLamada(segundos,llamadas[i]);
			nLlamadas++;
			saldoTotal = saldoTotal+precio;
			imprimirDatos(llamadas[i],precio);
			Thread.sleep(1*1000);
		}
	}



	private void imprimirDatos(Llamada llamada, double precio) {
		System.out.println("Llamada número " + nLlamadas);
		System.out.println("Datos:");
		llamada.imprimirDatos();
		System.out.println("Precio total: " + formato.format(precio));
		System.out.println();
		
		
		
	}



	private double cobrarLLamada(int segundos, Llamada llamada) {
		TipoLlamada tipo = llamada.getTipo();
		int franja = llamada.getFranja();
		double precio=0;
		if (tipo==TipoLlamada.LOCAL) {
			precio = 0.15*segundos;
		}else {
			switch (franja) {
			case 1:
				precio = 0.20*segundos;
				break;
			case 2:
				precio = 0.25*segundos;
				break;
			case 3:
				precio = 0.30*segundos;
				break;
			}
		}
		return precio;
	}



	public int getnLlamadas() {
		return nLlamadas;
	}



	public double getSaldoTotal() {
		return saldoTotal;
	}
	
	
}
