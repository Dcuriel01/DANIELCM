package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import unidad12.ConexionBD;

public class ObtenerConexion {

	public static void main(String[] args) {

		String url = ConexionBD.obtenerURLClase();
		String usuario = ConexionBD.obtenerUsuario();
		String password = ConexionBD.obtenerContraseña(); 
		
		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			System.out.println(con);
			
			
			
		} catch (SQLException e) {
			
		
		}
		
		
		
	}

}
