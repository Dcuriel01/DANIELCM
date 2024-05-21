package unidad12.ejemplos.ferreteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

	private String url;
	private String usuario;
	private String password;
	private Connection con;
	
	public ProductoDAO(String url, String usuario, String password) {
		this.url = url;
		this.usuario = usuario;
		this.password = password;
		
	}
	
	public boolean insertarProducto(Producto producto) {
		boolean filaInsertada =false;
		String sql = "INSERT INTO productos(codigo,nombre,descripcion,precio)"
				+ "VALUES (?,?,?,?)";
		conectar();
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, producto.getCodigo());
			sentenciaPreparada.setString(2, producto.getNombre());
			sentenciaPreparada.setString(3, producto.getDescripcion());
			sentenciaPreparada.setDouble(4, producto.getPrecio());
			
			filaInsertada = sentenciaPreparada.executeUpdate()>0;
			
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
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
	
	public List<Producto> listarTodosLosProductos(){
		String sql = "SELECT * FROM productos";
		List<Producto> productos = new ArrayList<Producto>();
		conectar();
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			while (resultado.next()) {
				Producto producto = new Producto(resultado.getString("codigo"), resultado.getString("nombre")
						, resultado.getString("descripcion"),resultado.getDouble("precio"));
				productos.add(producto);
			}
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		
		return productos;
	}
		
	
	public boolean eliminarProducto(Producto producto) {
		String sql = "DELETE FROM productos WHERE codigo = ?";
		boolean Modificacion =false;
		conectar();
		
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, producto.getCodigo());
			Modificacion=sentenciaPreparada.executeUpdate()>0;
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		
		return Modificacion ;
		
	}
	
	public boolean actualizarProducto(Producto producto) {
		String sql = "UPDATE productos SET nombre = ?, descripcion = ?, precio = ? WHERE codigo = ?";
		boolean Modificacion =false;
		conectar();
		
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, producto.getNombre());
			sentenciaPreparada.setString(2, producto.getDescripcion());
			sentenciaPreparada.setDouble(3, producto.getPrecio());
			sentenciaPreparada.setString(4, producto.getCodigo());
			Modificacion=sentenciaPreparada.executeUpdate()>0;
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		
		return Modificacion ;
	}
	
	public Producto obtenerProducto(String codigo) {
		String sql = "SELECT * FROM productos WHERE codigo = ?";
		Producto producto = null;
		conectar();
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, codigo);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			while (resultado.next()) {
				 producto = new Producto(resultado.getString("codigo"), resultado.getString("nombre")
						, resultado.getString("descripcion"),resultado.getDouble("precio"));
			}
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		
		return producto ;
		
		
	}
	
	
	
}
