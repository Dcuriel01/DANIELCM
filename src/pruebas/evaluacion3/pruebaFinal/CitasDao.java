package pruebas.evaluacion3.pruebaFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CitasDao {

	private String url;
	private String usuario;
	private String password;
	private Connection con;
	
	public CitasDao(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}
	
	
	public void aniadirCita(Cita cita) {
		String sql = "INSERT INTO reservas (documento, fecha, hora, cita, estado_pago, tramite, telefono, email) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			conectar();
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, cita.getDocumento());
			sentenciaPreparada.setString(2, cita.getFecha());
			sentenciaPreparada.setString(3, cita.getHora());
			sentenciaPreparada.setString(4, cita.getCita());
			sentenciaPreparada.setString(5, cita.getEstadoPago());
			sentenciaPreparada.setString(6, cita.getTramite());
			sentenciaPreparada.setString(7, cita.getTelefono());
			sentenciaPreparada.setString(8, cita.getEmail());
			sentenciaPreparada.executeUpdate();
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
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
	
	public void actualizarPago(Cita cita) {
		String sql = "UPDATE reservas set estado_pago = 'Pagado' where cita = ?";
		try {
			conectar();
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, cita.getCita());
			sentenciaPreparada.executeUpdate();
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}


	public ArrayList<Cita> extraerLista() {
		String sql = "SELECT * FROM reservas";
		ArrayList<Cita> citas = new ArrayList<Cita>();
		conectar();
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			while (resultado.next()) {
				Cita cita = new Cita(resultado.getString("documento"), resultado.getString("fecha")
						,resultado.getString("hora"),resultado.getString("cita"),resultado.getString("estado_pago")
						,resultado.getString("tramite"),resultado.getString("telefono"),resultado.getString("email"));
			citas.add(cita);
			}
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		
		return citas;
	}

}
