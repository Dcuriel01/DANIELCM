package unidad8Ejemplos.herencia;

public class Concesionario {

	public static void main(String[] args) {
		Motor motorCoche = new Motor("Diesel",2000,150);
		Motor motorMoto = new Motor("Gasolina",1500,80);
		
		
		Coche coche = new Coche("8456-PLS", "949723784627", "Lancia", "Stratos", motorCoche, 2, 2, 100, "Rally");
		Moto moto = new Moto("2132-MNS", "47237858231", "Yamaha", "Virago", motorMoto, false, "Custom");
		
		coche.mostrarDatos();
		System.out.println();
		moto.mostrarDatos();
		
	}

}
