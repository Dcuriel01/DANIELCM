package unidad7Ejemplos.coche;

public class AplicacionCoches {
	public static void main(String[] args) {
		Coche coche1 = new Coche("Fiat","500","5673BHT",10000,3.2,1.4,5,5,23,"Suv",1000,150);
		Coche coche2 = new Coche("Audi","a4","7810BPK",120000,3.7,1.54,5,5,54,"Deportivo",2500,200);
		System.out.println(coche1.toString());
		System.out.println(coche2.toString()); 

	}

}
