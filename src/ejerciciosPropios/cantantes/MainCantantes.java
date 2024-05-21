package ejerciciosPropios.cantantes;

import java.util.ArrayList;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;


public class MainCantantes {

	public static void main(String[] args) {
		ODB odb = ODBFactory.open("cantantes.db");

		//añadirCantantes(odb);
		leerCantantes(odb);
		eliminarPersona(odb, "Karol");
		modificarCancionFamosa(odb,"Anuel","Bandolera");
		leerCantantes(odb);
		odb.close();
	}

	private static void modificarCancionFamosa(ODB odb, String nombre, String cancion) {
		CriteriaQuery query = new CriteriaQuery(Cantante.class, Where.equal("nombre", nombre));
		Objects<Cantante> cantantes = odb.getObjects(query);

		// Se comprueba que existe la persona y se elimina
		if (cantantes.hasNext()) {
			Cantante cantante = cantantes.next();
			cantante.setCancion_mas_famosa(cancion);
            odb.store(cantante);
            System.out.println("La canción fue cambia a " + cancion);
		} else {
			System.out.println("No se encontró la persona con nombre: " + nombre);
		}
		
	}

	private static void eliminarPersona(ODB odb, String nombre) {

		CriteriaQuery query = new CriteriaQuery(Cantante.class, Where.equal("nombre", nombre));
		Objects<Cantante> cantantes = odb.getObjects(query);

		// Se comprueba que existe la persona y se elimina
		if (cantantes.hasNext()) {
			Cantante cantante = cantantes.next();
			odb.delete(cantante);
			System.out.println("Cantante eliminado: " + cantante.getNombre());
		} else {
			System.out.println("No se encontró la persona con nombre: " + nombre);
		}

	}

	private static void leerCantantes(ODB odb) {
		Objects<Cantante> cantantes = odb.getObjects(Cantante.class);
		System.out.println("Listado de Personas:");
		while (cantantes.hasNext()) {
			Cantante cantante = cantantes.next();
			System.out.println(cantante);
		}
	}

	private static void añadirCantantes(ODB odb) {
		ArrayList<Cantante> cantantes = LeerFichero.recuperarLista();
		for (Cantante cantante : cantantes) {
			odb.store(cantante);
		}
	}

}
