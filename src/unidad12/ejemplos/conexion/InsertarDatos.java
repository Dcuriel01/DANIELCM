package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarDatos {

	public static void main(String[] args) {

		String url = "jdbc:mysql://192.168.0.101:3306/CurielMora";
		String usuario = "CurielMora"; 
		String password = "Curi"; 
		
		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			String sql = "INSERT INTO personas (nombre,apellido,ciudad)"
					+ "VALUES (?,?,?)";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			
			sentenciaPreparada.setString(1, "Walid");
			sentenciaPreparada.setString(2, "Meziane");
			sentenciaPreparada.setString(3, "Talayuela");
			
			int filasInsertadas = sentenciaPreparada.executeUpdate();
			System.out.println("Filas insertadas:" + filasInsertadas);
			
		} catch (SQLException e) {
			
		
		}
		
		
		
	}

}
