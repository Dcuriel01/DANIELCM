package unidad7Ejemplos.almazara;

public class AlmazaraRun {

	public static void main(String[] args) {
		
		Almazara a1 = new Almazara(1, "Coria");
		Almazara a2 = new Almazara(2, "Navalmoral de la Mata",4);
		
		ProcesoAlmazara p1 = new ProcesoAlmazara();
		Cliente ci = new Cliente("2637267S", "Raúl", true);
		
		p1.setCliente(ci);
		
		a1.mostrarDatos();
		a2.mostrarDatos();
		System.out.println("============================");
		a1.addProceso(p1);
		a1.mostrarDatos();
		
	}

}
