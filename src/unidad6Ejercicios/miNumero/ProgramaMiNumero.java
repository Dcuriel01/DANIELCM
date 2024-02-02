package unidad6Ejercicios.miNumero;

public class ProgramaMiNumero {

	public static void main(String[] args) {
		
		MiNumero n1 = new MiNumero();
		System.out.println(n1.getValor());
		MiNumero n2 = new MiNumero(3);
		System.out.println(n2.getValor());
		n2.suma(3);
		n2.resta(1);
		System.out.println(n2.getValor());
		System.out.println(n2.getDoble());
		System.out.println(n2.getTriple());
		System.out.println(n2.getCuadruple());
	}

}
