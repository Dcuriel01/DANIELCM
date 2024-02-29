package unidad3.ejercicios;

public class PoblacionBovina {

	public static void main(String[] args) {
		int bovinaCaceres = 354000;
		int bovinaBadajoz = 410000;
		int x = 1;

		do {
			bovinaCaceres = (int) (bovinaCaceres + (bovinaCaceres * 0.0101f));
			System.out.println("Población bovina de Caceres año " + x + " =" + bovinaCaceres);
			bovinaBadajoz = (int) (bovinaBadajoz + (bovinaBadajoz * 0.0015f));
			System.out.println("Población bovina de Badajoz año " + x + " =" + bovinaBadajoz);
			x++;
		} while (bovinaCaceres < bovinaBadajoz);
			
		System.out.println("En el año " + (x-1) + " la poblacion bovina de Caceres superara a la de Badajoz");

	}
}
