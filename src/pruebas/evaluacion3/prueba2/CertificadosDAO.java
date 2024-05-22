package pruebas.evaluacion3.prueba2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import unidad12.ejemplos.ferreteria.Producto;

public class CertificadosDAO {
	private String url;
	private String usuario;
	private String password;
	private Connection con;
	
	public CertificadosDAO(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}
	
	public ArrayList<Certificado> extraerLista() {
		String sql = "SELECT * FROM certificados_energeticos";
		ArrayList<Certificado> certificados = new ArrayList<Certificado>();
		conectar();
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			ResultSet resultado = sentenciaPreparada.executeQuery();
			while (resultado.next()) {
				Certificado certificado = new Certificado(resultado.getString("id_certificado"), resultado.getString("propietario")
						,resultado.getString("direccion"),resultado.getString("tipo_de_propiedad"),resultado.getString("clasificacion_energetica").charAt(0)
						,String.valueOf(resultado.getDate("fecha_de_expedicion")),resultado.getString("empresa_certificadora"),resultado.getString("codigo_tecnico"));
			certificados.add(certificado);
			}
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		
		return certificados;

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

	public void borrar(Certificado certificado) {
		String sql = "DELETE FROM certificados_energeticos WHERE id_certificado = ?";
		conectar();
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, certificado.getIdCertificado());
			sentenciaPreparada.executeUpdate();
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Borrado con exito");
	}

	public void update(String idCertificado, String campoCambio, String nuevoValor ) {
		String sql = "UPDATE certificados_energeticos SET " + campoCambio + " = ? WHERE id_certificado = ?";
		conectar();
		
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, nuevoValor);
			sentenciaPreparada.setString(2, idCertificado);
			sentenciaPreparada.executeUpdate();
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		System.out.println("Campo actualizado correctamente");
	}

	public void crearCertificado(Certificado certificadoF) {
		String sql = "INSERT INTO certificados_energeticos (id_certificado, propietario, direccion, tipo_de_propiedad, clasificacion_energetica, fecha_de_expedicion, empresa_certificadora, codigo_tecnico) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			conectar();
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, certificadoF.getIdCertificado());
			sentenciaPreparada.setString(2, certificadoF.getPropietario());
			sentenciaPreparada.setString(3, certificadoF.getDireccion());
			sentenciaPreparada.setString(4, certificadoF.getTipoDePropiedad());
			sentenciaPreparada.setString(5, String.valueOf( certificadoF.getClasificacionEnergetica()));
			sentenciaPreparada.setDate(6, Date.valueOf(certificadoF.getFechaExpedicion()));
			sentenciaPreparada.setString(7, certificadoF.getEmpresaCertificadora());
			sentenciaPreparada.setString(8, certificadoF.getCodigoTecnico());
			sentenciaPreparada.executeUpdate();
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		System.out.println("Certificado creado correctamente");
		
	}

	public void updateF(String idCertificado, String campoCambio, Date fecha ) {
		String sql = "UPDATE certificados_energeticos SET " + campoCambio + " = ? WHERE id_certificado = ?";
		conectar();
		
		try {
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setDate(1, fecha);
			sentenciaPreparada.setString(2, idCertificado);
			sentenciaPreparada.executeUpdate();
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		System.out.println("Campo actualizado correctamente");
	}

	public void crearTablaEmpresas() {
		try {
			conectar();
		String sql = "CREATE TABLE IF NOT EXISTS empresasCertificadoras("
				+ "id int(2) PRIMARY KEY AUTO_INCREMENT,"
				+ "nombre varchar(150) UNIQUE"
				+ ");";
		PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
		sentenciaPreparada.executeUpdate();
		desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void aniadirATablaEmpresa(String empresa) {
		String sql = "INSERT INTO empresasCertificadoras(nombre)"
				+ "VALUES(?)";
		try {
			conectar();
			PreparedStatement sentenciaPreparada = con.prepareStatement(sql);
			sentenciaPreparada.setString(1, empresa);
			sentenciaPreparada.executeUpdate();
			sentenciaPreparada.close();
			desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		System.out.println("empresa añadida correctamente");
		
	}
}
