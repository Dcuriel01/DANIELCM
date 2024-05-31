package tareasFinales.certificadosEnergias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


	public class EdificioDao {

		private String url;
		private String usuario;
		private String password;
		private Connection con;
		
		public EdificioDao(String url, String usuario, String password) {
			this.url = url;
			this.usuario = usuario;
			this.password = password;
			
		}
		
		public boolean insertarProducto(Edificio e) {
			crearTabla();
			boolean filaInsertada =false;
			String sql = "INSERT INTO edificios(nombre,direccion,municipio,cPostal,"
					+ "provincia,comunidadAutonoma,zonaClimatica,año,normativa,referencias)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
			
			conectar();
			try {
				
				PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
				sentenciaPreparada.setString(1, e.getNombreEdificio());
				sentenciaPreparada.setString(2, e.getDireccion());
				sentenciaPreparada.setString(3, e.getMunicipio());
				sentenciaPreparada.setString(4, e.getcPostal());
				sentenciaPreparada.setString(5, e.getProvincia());
				sentenciaPreparada.setString(6, e.getComunidadAutonoma());
				sentenciaPreparada.setString(7, e.getZonaClimatica());
				sentenciaPreparada.setString(8, e.getAnioConstruccion());
				sentenciaPreparada.setString(9, e.getNormativa());
				sentenciaPreparada.setString(10, e.getReferencias());
				
				filaInsertada = sentenciaPreparada.executeUpdate()>0;
				
				sentenciaPreparada.close();
				desconectar();
			}catch (SQLIntegrityConstraintViolationException e1) {
				System.err.println("Ese libro ya existe");
			}catch (SQLException e1) {
				e1.printStackTrace();
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
		
		private void crearTabla() {
			try {
				conectar();
			String sql = "CREATE TABLE IF NOT EXISTS edificios("
					+ "ID int PRIMARY KEY AUTO_INCREMENT,"
					+ "nombre varchar(255) UNIQUE,"
					+ "direccion varchar(255),"
					+ "municipio varchar(255),"
					+ "cPostal varchar(255),"
					+ "provincia varchar(255),"
					+ "comunidadAutonoma varchar(255),"
					+ "zonaClimatica varchar(255),"
					+ "año varchar(255),"
					+ "normativa varchar(255),"
					+ "referencias varchar(255)"
					+ ");";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.executeUpdate();
			desconectar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
