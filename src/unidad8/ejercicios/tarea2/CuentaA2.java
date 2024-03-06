package unidad8.ejercicios.tarea2;

public abstract class CuentaA2 {

	private String nombre;
	protected double cantidad;
	
	
	public CuentaA2(String nombre, double cantidad) {
		super();
		setNombre(nombre);
		setCantidad(cantidad);
	}
	
	@Override
	public String toString() {
		return "La cuenta pertenece a " + nombre + " y tiene " + cantidad + " euros guardados";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		String expresionRegular = "{2,20}([A-Z]+[a-z]+)";
		Boolean resultado =  nombre.matches(expresionRegular);
		if (resultado) {
			this.nombre = nombre;
		}else {
			this.nombre = " ";
		}
		
	}

	public double getCantidad() {
		return cantidad;
	}

	private void setCantidad(double cantidad) {
		final int MIN = 0;
		if (cantidad>MIN) {
			this.cantidad = cantidad;
		}else {
			System.out.println("Error en la cantidad de cuenta, catidad designada a 0");
			this.cantidad=0;
			
		}	
	}
	
	public abstract void retirar(double retiro);
	
	
	public void depositar(double deposito) {
		if (deposito>0) {
			cantidad+=deposito;
		}else {
			System.out.println("No se puede depositar cantidad negativa");
		}
	}
	
	
	
	
	
}
