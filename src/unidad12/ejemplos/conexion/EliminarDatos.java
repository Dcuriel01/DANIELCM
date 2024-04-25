package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarDatos {

	public static void main(String[] args) {

		String url = "jdbc:mysql://192.168.0.101:3306/CurielMora";
		String usuario = "CurielMora"; 
		String password = "Curi"; 
		
		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			String sql = "DELETE FROM personas WHERE id=?";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setInt(1, 11);
			int filasEliminadas=sentenciaPreparada.executeUpdate();
			System.out.println("Filas eliminadas = " + filasEliminadas);
			
			
			
		} catch (SQLException e) {
			
		
		}
		
		
		
	}

}
