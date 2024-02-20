package unidad8Ejemplos.vehiculosElectricos;

public class MotoElectrica implements IVehiculosElectricos {

	private int nivelBateria;
	
	public MotoElectrica() {
		super();
		this.nivelBateria = 40;
	}
	
	@Override
	public void cagar() {
		System.out.println("Cargando la moto electrica.....");
		nivelBateria=100;
		System.out.println("Carga completa, nivel de bateria: " + nivelBateria);
	}

	@Override
	public void descagar() {
		System.out.println("Descargando la bici electrica.....");
		nivelBateria-=8;
		if (nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de cargar: " + nivelBateria);
	}
	
}
