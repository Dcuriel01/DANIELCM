package tareasFinales.formularioFutbolistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tareasFinales.gestionParqueMovil.grafico.BaseDatos;
import tareasFinales.gestionParqueMovil.grafico.Tabla;
import tareasFinales.gestionParqueMovil.grafico.Vehiculo;
import unidad12.ConexionBD;

public class BaseDatosFutbolista {
	
	static String url = ConexionBD.obtenerURLCasa();
	static String usuario = ConexionBD.obtenerUsuario();
	static String password = ConexionBD.obtenerContraseña();
	
	public static void crearTabla() {
		try(Connection con = DriverManager.getConnection(url,usuario,password)){
			String sql = "CREATE TABLE IF NOT EXISTS futbolistas("
					+ "    id int PRIMARY KEY AUTO_INCREMENT,"
					+ "    nombre varchar(255),"
					+ "    apellido varchar(200),"
					+ "    equipo varchar(200),"
					+ "    mayorEdad boolean,"
					+ "    jugadorFav varchar(200),"
					+ "    genero varchar(200),"
					+ "    pierna varchar(200),"
					+ "    posicion varchar(200)"
					+ ");";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void inscribirJugador(Futbolista futbolista) {
		crearTabla();
		try(Connection con = DriverManager.getConnection(url,usuario,password)){
			String sql = "INSERT INTO futbolistas(nombre,apellido,equipo,mayorEdad,jugadorFav,genero,pierna,posicion)"
					+ "VALUE(?,?,?,?,?,?,?,?)";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, futbolista.getNombre());
			sentenciaPreparada.setString(2, futbolista.getApellido());
			sentenciaPreparada.setString(3, futbolista.getEquipo());
			sentenciaPreparada.setBoolean(4, futbolista.isAnios18());
			sentenciaPreparada.setString(5, futbolista.getJugadorFav());
			sentenciaPreparada.setString(6, futbolista.getGenero());
			sentenciaPreparada.setString(7, futbolista.getPierna());
			sentenciaPreparada.setString(8, futbolista.getPosicion());
			sentenciaPreparada.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<Futbolista> extraerInformacion(){
		ArrayList<Futbolista>listaFutbolistas =new ArrayList<Futbolista>();
		try(Connection con = DriverManager.getConnection(url,usuario,password)){
			String sql = "SELECT * FROM futbolistas";
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			while (resultado.next()) {
				String nombre = resultado.getString("nombre");
				String apellido = resultado.getString("apellido");
				String equipo = resultado.getString("equipo");
				boolean anios18 = resultado.getBoolean("mayorEdad");
				String jugadorFav = resultado.getString("jugadorFav");
				String genero = resultado.getString("genero");
				String pierna = resultado.getString("pierna");
				String posicion = resultado.getString("posicion");
				Futbolista futbolista = new Futbolista(nombre, apellido, equipo, anios18, jugadorFav, genero, pierna, posicion);
				futbolista.setId(resultado.getInt("id"));
				listaFutbolistas.add(futbolista);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaFutbolistas;
	}
		
	public static void mostrarTabla() {
			String[] cabecera = new String[]{"Id","Nombre","Apellido","Equipo favorito","Mayor de edad",
					 "Jugador favorito","Genero","Pierna buena"};

			String[][] datos = recuperarListadoCoches(cabecera);
			       
			String titulo = "futbolista";
			new Tabla(datos,cabecera,titulo).setVisible(true);
			
			
		}

		public static String[][] recuperarListadoCoches(String[] cabecera) {
			ArrayList<Futbolista>listaFutbolistas = extraerInformacion();
			String[][] datos = new String[listaFutbolistas.size()][cabecera.length];
			int i = 0;
			for (Futbolista futbolista : listaFutbolistas) {
				datos[i][0]=String.valueOf(futbolista.getId());
				datos[i][1]=futbolista.getNombre();
				datos[i][2]=futbolista.getApellido();
				datos[i][3]=futbolista.getEquipo();
				datos[i][4]=String.valueOf(futbolista.isAnios18());
				datos[i][5]=futbolista.getJugadorFav();
				datos[i][6]=futbolista.getGenero();
				datos[i][7]=futbolista.getPierna();
				i++;
			}
			return datos;
			
		}
}

