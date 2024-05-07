package unidad13.ejemplos.menu;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import unidad12.ConexionBD;


public class CrearTabla {
	static String[] cabecera = new String[]{"Id","Nombre","Apellido","Ciudad"};
	public static void main(String[] args) {

		String[][] datos = recuperarListadoPersonas();
		       
		String titulo = "Empleados";
		new Tabla(datos,cabecera,titulo).setVisible(true);
		
		
	}

	public static String[][] recuperarListadoPersonas() {
		String url = ConexionBD.obtenerURLCasa();
		String usuario = ConexionBD.obtenerUsuario();
		String password = ConexionBD.obtenerContraseña();
		String[][] datos = null;
		try{
			
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			
			rowSet.setCommand("SELECT * FROM personas");
			rowSet.execute();
			int numFilas = 0;
			if (rowSet.last()) {
				numFilas = rowSet.getRow();
				rowSet.beforeFirst();//Devuelve el rowset al principio
			}
			datos=new String[numFilas][cabecera.length];
			int i =0;
			while (rowSet.next()) {
				datos[i][0]= String.valueOf(rowSet.getInt("id")); 
				datos[i][1]=rowSet.getString("nombre");
				datos[i][2]=rowSet.getString("apellido");
				datos[i][3]=rowSet.getString("ciudad");
				i++;
				/*System.out.println("PERSONA");
				System.out.println(rowSet.getInt("id"));
				System.out.println(rowSet.getString("nombre"));
				System.out.println(rowSet.getString("apellido"));
				System.out.println(rowSet.getString("ciudad"));
				System.out.println("________________");*/
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return datos;
		
	}
}
