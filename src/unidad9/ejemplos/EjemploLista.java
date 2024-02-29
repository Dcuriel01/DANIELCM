package unidad9.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploLista {
	public static void main(String[] args) {
	ArrayList al1 = new ArrayList();
	List al2 = new ArrayList();
	List al3 = new ArrayList(10); //no importa mucho ya que crece según se introducen cosas
	List al4 = new ArrayList(al1); // copia los datos del primer list
	ArrayList<String> al5 = new ArrayList<String>(); // String para avisar del tipo de datos que se van a introducir
	ArrayList<String> al6 = new ArrayList<String>(Arrays.asList("A","B","C")); //
	
	Usuario us1 = new Usuario(1, "Ana");
	Usuario us2 = new Usuario(2, "Luis");
	Usuario us3 = new Usuario(3, "Pepe");
	Usuario us4 = new Usuario(4, "Laura");
	Usuario us5 = new Usuario(5, "Sergio");
	Usuario us6 = new Usuario(6, "Antonio");
	Usuario us7 = new Usuario(7, "Amor");
	Usuario us8 = new Usuario(8, "Serapio");
	
	List<Usuario> usuarios = new ArrayList<Usuario>();
	usuarios.add(us1);
	usuarios.add(us2);
	usuarios.add(us3);
	
	System.out.println("Usuarios----");
	System.out.println(usuarios);
	
	List<Usuario> listUsuarios = new ArrayList<Usuario>();	
	listUsuarios.add(us1);
	listUsuarios.add(us2);
	listUsuarios.add(us3);
	System.out.println("list Usuarios----");
	System.out.println(listUsuarios);
	
	List<Usuario> listEmpleados = new ArrayList<Usuario>(10);	
	listEmpleados.add(us4);
	listEmpleados.add(us5);
	listEmpleados.add(us6);
	System.out.println("list Empleados----");
	System.out.println(listEmpleados);
	listEmpleados.addAll(1, listUsuarios);
	System.out.println(listEmpleados);
	listEmpleados.add(2, us7);
	System.out.println(listEmpleados);
	listEmpleados.remove(us5);
	System.out.println(listEmpleados);
	listEmpleados.remove(3);
	System.out.println(listEmpleados);
	listEmpleados.set(2, us5);
	System.out.println(listEmpleados);

	listEmpleados.clear();
	System.out.println(listEmpleados);
	
	}
}
