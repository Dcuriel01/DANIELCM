package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeerDatos {

	public static void main(String[] args) {

		String url = "jdbc:mysql://192.168.0.101:3306/CurielMora";
		String usuario = "CurielMora"; 
		String password = "Curi"; 
		
		String ciudad = "Madrid";//Esto lo recibimos por consola o algo parecido
		
		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			Statement sentencia = con.createStatement();
			ResultSet resultado = sentencia.executeQuery("SELECT * FROM personas WHERE ciudad='"+ ciudad +"'");
			System.out.println("Nombre  Ciudad");
			while (resultado.next()) {
				System.out.print(resultado.getString("nombre")+" ");
				System.out.println(resultado.getString("ciudad"));
			}
			
			
			
			
			
		} catch (SQLException e) {
			
		
		}
		
		
		
	}

}
