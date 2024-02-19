package unidad8Ejercicios.ejercicio2;

public class AlumnoFCT extends Alumno {

	private String centTrab;

	public AlumnoFCT() {
		super();
	}

	public AlumnoFCT(String dni, String codAlum, String centTrab) {
		super(dni, codAlum);
		this.centTrab = centTrab;
	}
}
