package unidad13.ejercicios.listadosPersonas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import unidad12.ConexionBD;

public class PersonasDAO {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();

	public static void insertarPersonas(Persona p) {
		try(Connection con = DriverManager.getConnection(url,usuario,password)){
			String sql = "INSERT INTO personas(nombre,apellido,ciudad) VALUES(?,?,?)";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1,p.getNombre());
			sentenciaPreparada.setString(2,p.getApellido());
			sentenciaPreparada.setString(3,p.getCiudad());
			sentenciaPreparada.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}	
	
	public static ArrayList<Persona >devolverTablaCompleta() {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		try{
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			
			rowSet.setCommand("SELECT * FROM personas");
			rowSet.execute();
			
			while (rowSet.next()) {
				Persona p = new Persona(rowSet.getInt("id"), rowSet.getString("nombre")
						, rowSet.getString("apellido"), rowSet.getString("ciudad"));
				personas.add(p);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personas;
	}

}
