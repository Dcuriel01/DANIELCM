package unidad12.ejemplos.conexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class LeerDatosPS {

	static Properties propiedades = new Properties();
	
	
	public static void main(String[] args) {

		cargarConfiguracion();
		String url = propiedades.getProperty("url_clase");
		String usuario = propiedades.getProperty("usuario");
		String password = propiedades.getProperty("password");
		
		try(Connection con = DriverManager.getConnection(url,usuario,password)) {
			
			String sql = "SELECT * FROM personas WHERE id=?";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setInt(1, 6);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			System.out.println("Nombre  Ciudad");
			while (resultado.next()) {
				System.out.print(resultado.getString("nombre")+" ");
				System.out.println(resultado.getString("ciudad"));
			}
			
			
			
			
			
		} catch (SQLException e) {
			
		
		}
			
	}
	
	public static void cargarConfiguracion(){
		FileInputStream fis;
		try {
			fis = new FileInputStream("ficheros/properties/bd/conexion.properties");
			propiedades.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
