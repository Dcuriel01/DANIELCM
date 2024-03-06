package unidad6.ejercicios.tarea5;

public class CocheJugueteElo {

	private int recorrido; // Se mide en metros
	private int bateria; // Se mide en porcentaje
	
	public CocheJugueteElo() {
		recorrido=0;
		bateria=100;
	}

	public static CocheJugueteElo comprarCoche() {
		
		CocheJugueteElo coche1 = new CocheJugueteElo();
		return coche1;
	}
	
	public void mostrarDistancia(){
		System.out.println("El coche a recorrido " + recorrido + " metros");
	}
	
	public void mostrarbateria(){
		System.out.println("El coche tiene un " + bateria + "% de bateria");
	}
	
	public void conducir() {
		if (bateria==0) {
		
		}else {
			recorrido = recorrido+20;
			bateria--;
		}
		
	}
	
	
}
