package unidad12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConexionBD {
	public static final String urlFicheroBD = "ficheros/properties/bd/conexion.properties";
	static Properties propiedades = new Properties();
	
	public static String obtenerURLClase(){
		cargarConfiguracion();
		return propiedades.getProperty("url_clase");

	}
	public static String obtenerURLCasa(){
		cargarConfiguracion();
		return propiedades.getProperty("url_casa");

	}
	public static String obtenerUsuario(){
		cargarConfiguracion();
		return propiedades.getProperty("usuario");

	}
	public static String obtenerContraseña(){
		cargarConfiguracion();
		return propiedades.getProperty("password");

	}

	public static void cargarConfiguracion(){
		FileInputStream fis;
		try {
			fis = new FileInputStream(urlFicheroBD);
			propiedades.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Conexion con DriveManager
	/*
	 	String url = ConexionBD.obtenerURLClase();
		String usuario = ConexionBD.obtenerUsuario();
		String password = ConexionBD.obtenerContraseña();
		try(Connection con = DriverManager.getConnection(url,usuario,password)){
			String sql = "";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setInt();
			ResultSet resultado = sentenciaPreparada.executeQuery();
			while (resultado.next()) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	*/
	
	//Conexion con RowSet
	/*
	 	String url = ConexionBD.obtenerURLClase();
		String usuario = ConexionBD.obtenerUsuario();
		String password = ConexionBD.obtenerContraseña();
		try{
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			
			rowSet.setCommand("");
			rowSet.execute();
			
			while (rowSet.next()) {
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 */
	
}
