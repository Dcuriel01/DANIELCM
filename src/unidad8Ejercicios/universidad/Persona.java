package unidad8Ejercicios.universidad;

import java.util.Scanner;

public class Persona {

	static Scanner sc = new Scanner(System.in);
	
	private String nombre = " ";
	private String apellidos = " ";
	private String direccion = " ";
	private int cP = 0;
	private String tlf = " ";

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getcP() {
		return cP;
	}

	public String getTlf() {
		return tlf;
	}

	
	public void generarDatos(){
		System.out.println("Introduzca el nombre");
		nombre=sc.nextLine();
		System.out.println("Introduzca los apellidos");
		apellidos=sc.nextLine();
		System.out.println("Introduzca la dirección");
		direccion=sc.nextLine();
		System.out.println("Introduzca el código postal");
		String recogido = sc.next();
		cP=Integer.parseInt(recogido);
		System.out.println("Introduzca el número de telefono");
		tlf=sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "La persona se llama " + nombre + " y se apellida " + apellidos + " su dirección es " + direccion + " su CP " + cP + " y su teléfono " + tlf;
	}
	
	
	
	
	
}
