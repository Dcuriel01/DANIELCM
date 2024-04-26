package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObtenerConexion {

	public static void main(String[] args) {

		String url = "jdbc:mysql://192.168.0.102:3306/CurielMora";
		String usuario = "CurielMora"; 
		String password = "Curi"; 
		
		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			System.out.println(con);
			
			
			
		} catch (SQLException e) {
			
		
		}
		
		
		
	}

}
