package pruebas.evaluacion3.pruebaFinal;

import java.util.ArrayList;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;



public class BDOPagos {

	public static void registrarPago(Pago pago) {
		ODB odb = ODBFactory.open("pagos.db");
		odb.store(pago);
		odb.close();
	}
	
	public static ArrayList<Pago> extraerPagos(){
		ODB odb = ODBFactory.open("pagos.db");
		Objects<Pago> pagosO = odb.getObjects(Pago.class);
		ArrayList<Pago> pagos = new ArrayList<Pago>();
		while (pagosO.hasNext()) {
			Pago pago = pagosO.next();
			pagos.add(pago);
		}
		odb.close();
		return pagos;
	}
	

}
