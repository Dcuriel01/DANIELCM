package unidad8Ejemplos.vehiculosElectricos;

public class MainElectrico2 {

	public static void main(String[] args) {
		
		
		IVehiculosElectricos [] vehiculos = new IVehiculosElectricos[7];
		
		
		IVehiculosElectricos c1 = new CocheElectrico();
		IVehiculosElectricos b1 = new BicicletaElectrica();
		IVehiculosElectricos m1 = new MotoElectrica();
		IVehiculosElectricos f1 = new FurgonetaElectrica();
		IVehiculosElectricos p1 = new PatineteElectrico();
		
		
		vehiculos [0] = c1;
		vehiculos [1] = b1;
		vehiculos [2] = m1;
		vehiculos [3] = f1;
		vehiculos [4] = p1;
		
		
		
		c1.cagar();
		c1.descagar();
		b1.cagar();
		b1.descagar();
		m1.cagar();
		m1.descagar();
		f1.cagar();
		f1.descagar();
		p1.cagar();
		p1.descagar();
		
		
	}

}
