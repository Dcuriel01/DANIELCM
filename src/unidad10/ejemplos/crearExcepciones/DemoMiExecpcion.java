package unidad10.ejemplos.crearExcepciones;

public class DemoMiExecpcion {

	public static void main(String[] args) {
		DemoMiExecpcion demo = new DemoMiExecpcion();
		try {
			demo.metodoQuePuedeLanzarExcepcion();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Causa de la excepción: " + e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public void metodoQuePuedeLanzarExcepcion() throws MiExecepcion {
		boolean condicion = true;
		if (condicion) {
			throw new MiExecepcion("Se ha producido un error",new IllegalAccessError());
		}
		
	}

}
