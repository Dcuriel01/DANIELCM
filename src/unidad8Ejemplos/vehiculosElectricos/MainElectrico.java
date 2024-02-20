package unidad8Ejemplos.vehiculosElectricos;

public class MainElectrico {

	public static void main(String[] args) {
		
		IVehiculosElectricos c1 = new CocheElectrico();
		IVehiculosElectricos b1 = new BicicletaElectrica();
		IVehiculosElectricos m1 = new MotoElectrica();
		IVehiculosElectricos f1 = new FurgonetaElectrica();
		IVehiculosElectricos p1 = new PatineteElectrico();
		
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
