package unidad8Ejemplos.vehiculosElectricos;

public class FurgonetaElectrica implements IVehiculosElectricos {

	private int nivelBateria;
	
	public FurgonetaElectrica() {
		super();
		this.nivelBateria = 60;
	}

	@Override
	public void cagar() {
		System.out.println("Cargando la furgoneta electrica.....");
		nivelBateria=100;
		System.out.println("Carga completa, nivel de bateria: " + nivelBateria);
	}

	@Override
	public void descagar() {
		System.out.println("Descargando la furgoneta electrica.....");
		nivelBateria-=12;
		if (nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de cargar: " + nivelBateria);
	}

}
