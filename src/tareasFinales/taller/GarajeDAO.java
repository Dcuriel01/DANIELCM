package tareasFinales.taller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class GarajeDAO {
	
	private String url;
	private String usuario;
	private String password;
	private Connection con;
	
	public GarajeDAO(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}
	
	private void crearTabla() {
		try {
			conectar();
		String sql = "CREATE TABLE IF NOT EXISTS garaje("
				+ "matricula varchar(9) PRIMARY KEY,"
				+ "direccion varchar(255),"
				+ "nReparaciones int(4)"
				+ ");";
		PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
		sentenciaPreparada.executeUpdate();
		desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean aniadirCoche(Coche coche) {
		crearTabla();
		boolean filaInsertada =false;
		String sql = "INSERT INTO garaje(matricula,direccion,nReparaciones)"
				+ "VALUES (?,?,?)";
		conectar();
		try {
			
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, coche.getMatricula());
			sentenciaPreparada.setString(2, coche.getDireccion());
			sentenciaPreparada.setInt(3, coche.nReparaciones());
			
			filaInsertada = sentenciaPreparada.executeUpdate()>0;
			
			sentenciaPreparada.close();
			desconectar();
		}catch (SQLIntegrityConstraintViolationException e) {
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return filaInsertada;
	}
	
	public void actualizarReparacion(Coche coche) {
		String sql = "update garaje set nReparaciones = ? where matricula = ?";
		conectar();
		try {
			
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setInt(1, coche.nReparaciones());
			sentenciaPreparada.setString(2, coche.getMatricula());
			sentenciaPreparada.executeUpdate();
			
			sentenciaPreparada.close();
			desconectar();
		}catch (SQLIntegrityConstraintViolationException e) {
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
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

	public String[][] listarTodosLosCoches(){
		String sql = "SELECT * FROM garaje";
		String[][] reparaciones = null;
		conectar();
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			int i = 0;
			while (resultado.next()) {
				reparaciones[i][0] = resultado.getString("matricula");
				reparaciones[i][1] = resultado.getString("direccion");
				reparaciones[i][2] = String.valueOf(resultado.getInt("nReparaciones"));
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
