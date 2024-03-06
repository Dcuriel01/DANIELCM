package unidad6.ejercicios.covid;

public class DatosCovid {
	private Covid tipoTest;
	private boolean infeccionActiva;
	private String resultado;
	private TipoPrueba tipoPrueba;
	private String lugarProceso;
	private Paciente paciente;
	public DatosCovid(Covid tipoTest, boolean infeccionActiva, String resultado, TipoPrueba tipoPrueba,
			String lugarProceso) {
		this.tipoTest = tipoTest;
		this.infeccionActiva = infeccionActiva;
		this.resultado = resultado;
		this.tipoPrueba = tipoPrueba;
		this.lugarProceso = lugarProceso;
	}
	public Covid getTipoTest() {
		return tipoTest;
	}
	public void setTipoTest(Covid tipoTest) {
		this.tipoTest = tipoTest;
	}
	public boolean isInfeccionActiva() {
		return infeccionActiva;
	}
	public void setInfeccionActiva(boolean infeccionActiva) {
		this.infeccionActiva = infeccionActiva;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public TipoPrueba getTipoPrueba() {
		return tipoPrueba;
	}
	public void setTipoPrueba(TipoPrueba tipoPrueba) {
		this.tipoPrueba = tipoPrueba;
	}
	public String getLugarProceso() {
		return lugarProceso;
	}
	public void setLugarProceso(String lugarProceso) {
		this.lugarProceso = lugarProceso;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public void imprimirDatos() {
		System.out.println("Tipo de prueba: " + tipoTest);
		System.out.println("Infeccion: " + infeccionActiva);
		System.out.println("Resultado: " + resultado);
		System.out.println("Infeccion: " + infeccionActiva);
		if (paciente!=null) {
			System.out.println("Datos Paciente------------");
			paciente.mostrarDatos();
		}
		
	}
}
