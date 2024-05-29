package tareasFinales.taller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class ReparacionDAO {

	private String url;
	private String usuario;
	private String password;
	private Connection con;
	
	public ReparacionDAO(String url, String usuario, String password) {
		this.url = url;
		this.usuario = usuario;
		this.password = password;
		
	}
	
	public void crearTabla() {
		try {
		conectar();
		String sql = "CREATE TABLE IF NOT EXISTS reparaciones("
				+ "ID int PRIMARY KEY AUTO_INCREMENT,"
				+ "matricula varchar(9),"
				+ "descripcion varchar(255),"
				+ "kilometraje double"
				+ ");";
		PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
		sentenciaPreparada.executeUpdate();
		desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean aniadirReparacion(Reparacion reparacion,Coche coche) {
		crearTabla();
		boolean filaInsertada =false;
		String sql = "INSERT INTO reparaciones(matricula,descripcion,kilometraje)"
				+ "VALUES (?,?,?)";
		conectar();
		try {
			
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, coche.getMatricula());
			sentenciaPreparada.setString(2, reparacion.getInformacion());
			sentenciaPreparada.setDouble(3, reparacion.getKm());
			
			filaInsertada = sentenciaPreparada.executeUpdate()>0;
			
			sentenciaPreparada.close();
			desconectar();
		}catch (SQLIntegrityConstraintViolationException e) {
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return filaInsertada;
	}

	private void desconectar() {
		try {
			if (con!=null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void conectar() {
		try {
			if (con==null || con.isClosed()) {
				con = DriverManager.getConnection(url,usuario,password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String[][] listarTodosLasReparaciones(){
		String sql = "SELECT * FROM reparaciones";
		String[][] reparaciones = null;
		conectar();
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			int i = 0;
			while (resultado.next()) {
				reparaciones[i][0] = resultado.getString("matricula");
				reparaciones[i][1] = resultado.getString("descripcion");
				reparaciones[i][2] = String.valueOf(resultado.getDouble("kilometraje"));
				i++;
			}
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		
		return reparaciones;
	}
	
}
