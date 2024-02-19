package unidad8Ejercicios.velas;

public class ProgramaVelas {

	public static void main(String[] args) {

		Vela vela1= new Vela();
		VelaAromatica vela2 = new VelaAromatica();
		vela1.setColor("Amarillo");
		vela1.setAltura(4);
		vela2.setColor("Verde");
		vela2.setAltura(4);
		vela2.setAroma("Lima");
		System.out.println("Precio vela aromatica "+vela2.getPrecio()); 
		System.out.println("Precio vela normal "+vela1.getPrecio()); 
		
	}

}
