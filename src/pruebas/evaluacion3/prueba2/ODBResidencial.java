package pruebas.evaluacion3.prueba2;

import java.util.ArrayList;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

public class ODBResidencial {
	static ODB odb = ODBFactory.open("Residenciales.db");
	public static void crearBDOJ(ArrayList<Certificado> residenciales) {
		for (Certificado certificado : residenciales) {
			odb.store(certificado);
		}
		odb.close();
	}
	
	public static ArrayList<Certificado> extraerCertificados(){
		Objects<Certificado> certificados = odb.getObjects(Certificado.class);
		ArrayList<Certificado> residenciales = new ArrayList<Certificado>();
		while (certificados.hasNext()) {
			Certificado certificado = certificados.next();
			residenciales.add(certificado);
		}
		return residenciales;
	}

}
