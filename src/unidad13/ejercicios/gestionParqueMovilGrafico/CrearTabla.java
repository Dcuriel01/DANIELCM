package unidad13.ejercicios.gestionParqueMovilGrafico;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import unidad12.ConexionBD;


public class CrearTabla {
	static String[] cabecera = new String[]{"Matricula","Fecha","Marca","Modelo","Kilometraje"};
	public static void main(String[] args) {

		String[][] datos = recuperarListadoCoches();
		       
		String titulo = "Coches";
		new Tabla(datos,cabecera,titulo).setVisible(true);
		
		
	}

	public static String[][] recuperarListadoCoches() {
		ArrayList<Vehiculo>listaVehiculos = BaseDatos.recuperarLista();
		String[][] datos = new String[listaVehiculos.size()][cabecera.length];
		int i = 0;
		for (Vehiculo vehiculo : listaVehiculos) {
			datos[i][0]=vehiculo.getMatricula();
			datos[i][1]=String.valueOf(vehiculo.getFechaMatriculacion());
			datos[i][2]=vehiculo.getMarca();
			datos[i][3]=vehiculo.getModelo();
			datos[i][4]=String.valueOf(vehiculo.getKilometraje());
		}
		return datos;
		
	}
}
