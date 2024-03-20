package pruebas.evaluacion2.prueba1.ejercicio3;

import java.security.SecureRandom;
import java.time.LocalDate;

public class Externo extends Paquete {
	
	private String numSeguimiento;

	public Externo(String id, double peso, LocalDate fechaEntrega) {
		super(id, peso, fechaEntrega);
		setPrecioEnvio();
		setNumSeguimiento();
		
	}

	public void setPrecioEnvio() {
		if (peso<2.000) {
			precioEnvio=peso*0.2;
		}else {
			precioEnvio=peso*0.4;
		}
		switch (zona) {
		case CAC:
			precioEnvio+=1;
			break;
		case COR:
			precioEnvio+=1.5;
			break;
		case PLA:
			precioEnvio+=1.25;
			break;
		case MER:
			precioEnvio+=2;
			break;
		case BAD:
			precioEnvio+=2.25;
			break;
		case DBN:
			precioEnvio+=2;
			break;
		case ZAF:
			precioEnvio+=2.5;
			break;
		}
		
	}

	public long getNumSeguimiento() {
		long numSeguimientoEntero=Long.parseLong(numSeguimiento);
		return numSeguimientoEntero;
	}

	public void setNumSeguimiento() {
		SecureRandom random = new SecureRandom();
		int numAleatorio1 = random.nextInt(9999);
		int numAleatorio2 = random.nextInt(9999);
		int numAleatorio3 = random.nextInt(9999);
		int numAleatorio4 = random.nextInt(9999);
		String numAleatorioCadena1= rellenarHuecosCon0(numAleatorio1);
		String numAleatorioCadena2= rellenarHuecosCon0(numAleatorio2);
		String numAleatorioCadena3= rellenarHuecosCon0(numAleatorio3);
		String numAleatorioCadena4= rellenarHuecosCon0(numAleatorio4);
		numSeguimiento=numAleatorio1+""+numAleatorio2+""+numAleatorio3+""+numAleatorio4;
		
	}

	private String rellenarHuecosCon0(int numAleatorio) {
		String numAleatorioCadena="";
		if (numAleatorio<1000) {
			numAleatorioCadena="0"+ numAleatorio;
		}else if (numAleatorio<100) {
			numAleatorioCadena="00"+ numAleatorio;
		}else if (numAleatorio<10) {
			numAleatorioCadena="000"+ numAleatorio;
		}else {
			numAleatorioCadena=""+ numAleatorio;
		}
		return numAleatorioCadena;
	}
	
}
