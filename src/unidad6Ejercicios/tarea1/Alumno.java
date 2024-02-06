package unidad6Ejercicios.tarea1;

public class Alumno {

	private Asignatura asig1;
	private Asignatura asig2;
	private Asignatura asig3;
	
	public Alumno(Asignatura asig1, Asignatura asig2, Asignatura asig3) {
		this.asig1 = asig1;
		this.asig2 = asig2;
		this.asig3 = asig3;
	}
	

	public Alumno(int entero1, int entero2,int entero3) {
		asig1=new Asignatura(entero1);
		asig2=new Asignatura(entero2);
		asig3=new Asignatura(entero3);
	}


	public Asignatura getAsig1() {
		return asig1;
	}

	public void setAsig1(Asignatura asig1) {
		this.asig1 = asig1;
	}

	public Asignatura getAsig2() {
		return asig2;
	}

	public void setAsig2(Asignatura asig2) {
		this.asig2 = asig2;
	}

	public Asignatura getAsig3() {
		return asig3;
	}

	public void setAsig3(Asignatura asig3) {
		this.asig3 = asig3;
	}
	
	
	
	
}
