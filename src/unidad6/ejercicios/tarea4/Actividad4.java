package unidad6.ejercicios.tarea4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Actividad4 {

	
	
	public static void main(String[] args) throws InterruptedException {
		DecimalFormat formato = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		int LlamadasAGenerar;
		Centralita centralita =new Centralita();
		System.out.println("Cuantas llamadas va a generar");
		LlamadasAGenerar = sc.nextInt();
		centralita.registrarLlamada(LlamadasAGenerar);
		System.out.println("Datos centralita");
		System.out.println("Número llamadas total: " + centralita.getnLlamadas());
		System.out.println("Dinero recaudado total: " + formato.format(centralita.getSaldoTotal()));
		

	}

}
