package ejerciciosPropios.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


public class LibroDAO {

	private String url;
	private String usuario;
	private String password;
	private Connection con;
	
	public LibroDAO(String url, String usuario, String password) {
		this.url = url;
		this.usuario = usuario;
		this.password = password;
		
	}
	
	public boolean insertarProducto(Libro libro) {
		crearTabla();
		boolean filaInsertada =false;
		String sql = "INSERT INTO libros(titulo,autor,anio,precio)"
				+ "VALUES (?,?,?,?)";
		conectar();
		try {
			
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, libro.getTitulo());
			sentenciaPreparada.setString(2, libro.getAutor());
			sentenciaPreparada.setInt(3, libro.getAnio());
			sentenciaPreparada.setDouble(4, libro.getPrecio());
			
			filaInsertada = sentenciaPreparada.executeUpdate()>0;
			
			sentenciaPreparada.close();
			desconectar();
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("Ese libro ya existe");
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
	
	private void crearTabla() {
		try {
			conectar();
		String sql = "CREATE TABLE IF NOT EXISTS libros("
				+ "ID int PRIMARY KEY AUTO_INCREMENT,"
				+ "titulo varchar(255) UNIQUE,"
				+ "autor varchar(255),"
				+ "anio int(4),"
				+ "precio DOUBLE(5,2)"
				+ ");";
		PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
		sentenciaPreparada.executeUpdate();
		desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
