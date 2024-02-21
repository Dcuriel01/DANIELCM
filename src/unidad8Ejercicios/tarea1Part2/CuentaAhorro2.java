package unidad8Ejercicios.tarea1Part2;

public class CuentaAhorro2 extends CuentaA{

	public final static int BONO = 10;
	
	public CuentaAhorro2(String nombre, double cantidad) {
		super(nombre, cantidad+BONO);
	}

	
	@Override
	public String toString() {
		return super.toString() + " se le han añadido "+ BONO + " euros por contratar una cuenta ahorro";
	}


	@Override
	public void retirar(double retiro) {
		
		if (retiro>0) {
			if (retiro<cantidad) {
				super.cantidad -=retiro;
			}else {
				System.out.println("No puede retirar más del dinero que tiene en la cuenta");
			}
		}else {
			System.out.println("No se puede retirar cantidad negativa");
		}
	}
	

	
	
	
}
