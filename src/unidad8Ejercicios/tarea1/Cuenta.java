package unidad8Ejercicios.tarea1;

public class Cuenta {

	protected String nombre;
	protected double cantidad;
	
	public Cuenta(String nombre, double cantidad) {
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
	
	public void retirar(double retiro) {
		if (retiro>0) {
			if (retiro<cantidad) {
				cantidad -=retiro;
			}else {
				System.out.println("No puede retirar más del dinero que tiene en la cuenta");
			}
		}else {
			System.out.println("No se puede retirar cantidad negativa");
		}
	}
	public void depositar(double deposito) {
		if (deposito>0) {
			cantidad+=deposito;
		}else {
			System.out.println("No se puede depositar cantidad negativa");
		}
	}
	
	
	
	
	
}
