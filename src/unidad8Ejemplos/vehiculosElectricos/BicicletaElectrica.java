package unidad8Ejemplos.vehiculosElectricos;

public class BicicletaElectrica implements IVehiculosElectricos {

	private int nivelBateria;
	
	public BicicletaElectrica() {
		super();
		this.nivelBateria = 30;
	}
	
	@Override
	public void cagar() {
		System.out.println("Cargando la bici electrica.....");
		nivelBateria=100;
		System.out.println("Carga completa, nivel de bateria: " + nivelBateria);
	}

	@Override
	public void descagar() {
		System.out.println("Descargando la bici electrica.....");
		nivelBateria-=5;
		if (nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de cargar: " + nivelBateria);
	}
}
