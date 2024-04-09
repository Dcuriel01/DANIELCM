package unidad11.ejemplos.binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOEjemplo {

	public static void main(String[] args) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("ficheros/datos.bin"))){
			
			dos.writeInt(42);
			dos.writeDouble(3.14);
			dos.writeUTF("Mañana no vengo");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("ficheros/datos.bin"))){
			
			int entero = dis.readInt();
			double doble = dis.readDouble();
			String cadena = dis.readUTF();
			System.out.println(entero);
			System.out.println(doble);
			System.out.println(cadena);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
