package unidad8.ejemplos.vehiculosElectricos;

public class PatineteElectrico implements IVehiculosElectricos {
	private int nivelBateria;
	
	public PatineteElectrico() {
		super();
		this.nivelBateria = 20;
	}

	@Override
	public void cagar() {
		System.out.println("Cargando el patinete electrico.....");
		nivelBateria=100;
		System.out.println("Carga completa, nivel de bateria: " + nivelBateria);
	}

	@Override
	public void descagar() {
		System.out.println("Descargando el patinete electrico.....");
		nivelBateria-=4;
		if (nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de cargar: " + nivelBateria);
	}
}
