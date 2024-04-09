package unidad11.ejemplos.binarios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOEjemplo {

	public static void main(String[] args) {

		try(ObjectOutputStream oos = 
				new ObjectOutputStream (new FileOutputStream
						(new File("ficheros/personas.dat")))){
			
			Persona persona1 = new Persona("Pegaso", 38);
			Persona persona2 = new Persona("Andromeda", 25);
			
			oos.writeObject(persona1);
			oos.writeObject(persona2);
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		leerObjetosFichero();
		/*try(ObjectInputStream ois = 
				new ObjectInputStream (new FileInputStream
						(new File("ficheros/personas.dat")))){
			try {
				Persona persona1 = (Persona)ois.readObject();
				Persona persona2 = (Persona)ois.readObject();
				System.out.println(persona1);
				System.out.println(persona2);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	*/
	}
	
	private static void leerObjetosFichero(){
		try(ObjectInputStream ois = 
				new ObjectInputStream (new FileInputStream
						(new File("ficheros/personas.dat")))){
			while(true) {
				try {
					Persona persona = (Persona)ois.readObject();
					System.out.println(persona);
				} catch (EOFException e) {
					break;
				}
			}
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	} 
	

}
