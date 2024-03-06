package unidad8.ejemplos.vehiculosElectricos;

public class CocheElectrico implements IVehiculosElectricos{

	private int nivelBateria;
	
	public CocheElectrico() {
		super();
		this.nivelBateria = 50;
	}

	@Override
	public void cagar() {
		System.out.println("Cargando el coche electrico.....");
		nivelBateria=100;
		System.out.println("Carga completa, nivel de bateria: " + nivelBateria);
	}

	@Override
	public void descagar() {
		System.out.println("Descargando el coche electrico.....");
		nivelBateria-=10;
		if (nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de cargar: " + nivelBateria);
	}
}
