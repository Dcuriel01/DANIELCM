package unidad6Ejercicios.covid;

public class programaEmpleado {

	/*private Covid tipoTest;
	private boolean infeccionActiva;
	private String resultado;
	private TipoPrueba tipoPrueba;
	private String lugarProceso;*/
	public static void main(String[] args) {
	
		DatosCovid covid1 =new DatosCovid(Covid.PCR,false,"no hay covid",TipoPrueba.NASAL,"Navalmoral de la Mata");
		Paciente p1 = new Paciente("Antonio", 43, "895 09 34 18", "Calle Victoria nº 7");
		covid1.setPaciente(p1);
		System.out.println("Datos Covid----------------");
		covid1.imprimirDatos();
	}
}
