package unidad13.ejercicios.tareaFinal1Grafico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import unidad12.ConexionBD;

public class BaseDatos {
	static String url = ConexionBD.obtenerURLClase();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	public static void crearTabla() {
		try(Connection con = DriverManager.getConnection(url,usuario,password)){
			String sql = "CREATE TABLE IF NOT EXISTS parqueMovil("
					+ "    matricula varchar(100) PRIMARY KEY,"
					+ "    fechaMatriculacion varchar(255),"
					+ "    marca varchar(200),"
					+ "    modelo varchar(200),"
					+ "    kilometraje int(20)"
					+ ");";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static ArrayList<Vehiculo> recuperarLista() {
		ArrayList<Vehiculo>listaVehiculos =new ArrayList<Vehiculo>();
		try(Connection con = DriverManager.getConnection(url,usuario,password)){
			String sql = "SELECT * FROM parqueMovil";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			while (resultado.next()) {
				String matricula = resultado.getString("matricula");
				String fecha = resultado.getString("fechaMatriculacion");
				String marca = resultado.getString("marca");
				String modelo = resultado.getString("modelo");
				int kilometraje = resultado.getInt("kilometraje");
				LocalDate fechaMat = parsearFecha(fecha);
				Vehiculo v = new Vehiculo(matricula, fechaMat, marca, modelo, kilometraje);
				listaVehiculos.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaVehiculos;
	}
	
	public static void renovarLista(ArrayList<Vehiculo>listaVehiculos) {
		borrarContenidoTabla();
		try(Connection con = DriverManager.getConnection(url,usuario,password)){
			String sql = "INSERT INTO parqueMovil(matricula,fechaMatriculacion,marca,modelo,kilometraje)"
					+ "VALUE(?,?,?,?,?)";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			
			for (Vehiculo vehiculo : listaVehiculos) {
				sentenciaPreparada.setString(1, vehiculo.getMatricula());
				sentenciaPreparada.setString(2, String.valueOf(vehiculo.getFechaMatriculacion()));
				sentenciaPreparada.setString(3, vehiculo.getMarca());
				sentenciaPreparada.setString(4, vehiculo.getModelo());
				sentenciaPreparada.setInt(5, vehiculo.getKilometraje());
				sentenciaPreparada.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static LocalDate parsearFecha(String fechaProv) {
		DateTimeFormatter formatoFecha2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fecha =null;
		fecha = LocalDate.parse(fechaProv, formatoFecha2);
		return fecha;
	}
	 private static void borrarContenidoTabla() {
			try(Connection con = DriverManager.getConnection(url,usuario,password)){
				String sql = "DELETE FROM parqueMovil";
				PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
				sentenciaPreparada.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	 }
}