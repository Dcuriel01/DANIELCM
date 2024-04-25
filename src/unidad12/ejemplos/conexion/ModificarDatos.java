package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModificarDatos {

	public static void main(String[] args) {

		String url = "jdbc:mysql://192.168.0.101:3306/CurielMora";
		String usuario = "CurielMora"; 
		String password = "Curi"; 
		
		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			String sql = "UPDATE personas Set ciudad=? where id=?";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, "Navalmoral de la Mata");
			sentenciaPreparada.setInt(2, 11);
			int filasModificadas=sentenciaPreparada.executeUpdate();
			System.out.println("Filas modificadas = " + filasModificadas);
			
			
			
		} catch (SQLException e) {
			
		
		}
		
		
		
	}

}
