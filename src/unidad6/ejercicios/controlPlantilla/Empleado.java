package unidad6.ejercicios.controlPlantilla;

public class Empleado {

	private String nombre;
	private String apellidos;
	private int horasTrabajadas;
	private Cargos cargo;
	private ModoEmpleo tipoEmpleo;
	private double pagoPorHora;
	private double bonificacion;
	private double sueldo;
	private static int contadorOperarios;
	private static int contadorJefes;
	private static int contadorRango1200;
	private static int contadorRango12002500;
	private static int contadorRango2500;
	
	public Empleado(String nombre, String apellidos, int horasTrabajadas, Cargos cargo, ModoEmpleo tipoEmpleo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.horasTrabajadas = horasTrabajadas;
		this.cargo = cargo;
		this.tipoEmpleo = tipoEmpleo;
		pagoPorHora=calcularPagoHora(cargo);
		sueldo=pagoPorHora*horasTrabajadas;
		bonificacion=calcularBonificacion(sueldo,tipoEmpleo);
		calcularRangoSueldo();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}

	public ModoEmpleo getTipoEmpleo() {
		return tipoEmpleo;
	}

	public void setTipoEmpleo(ModoEmpleo tipoEmpleo) {
		this.tipoEmpleo = tipoEmpleo;
	}

	public double getPagoPorHora() {
		return pagoPorHora;
	}

	public void setPagoPorHora(double pagoPorHora) {
		this.pagoPorHora = pagoPorHora;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public static int getContadorOperarios() {
		return contadorOperarios;
	}

	public static void setContadorOperarios(int contadorOperarios) {
		Empleado.contadorOperarios = contadorOperarios;
	}

	public static int getContadorJefes() {
		return contadorJefes;
	}

	public static void setContadorJefes(int contadorJefes) {
		Empleado.contadorJefes = contadorJefes;
	}

	public static int getContadorRango1200() {
		return contadorRango1200;
	}

	public static void setContadorRango1200(int contadorRango1200) {
		Empleado.contadorRango1200 = contadorRango1200;
	}

	public static int getContadorRango12002500() {
		return contadorRango12002500;
	}

	public static void setContadorRango12002500(int contadorRango12002500) {
		Empleado.contadorRango12002500 = contadorRango12002500;
	}

	public static int getContadorRango2500() {
		return contadorRango2500;
	}

	public static void setContadorRango2500(int contadorRango2500) {
		Empleado.contadorRango2500 = contadorRango2500;
	}

	private void calcularRangoSueldo() {
		if (sueldo<1200) {
			contadorRango1200++;
		}else if (sueldo>=1200&sueldo<=2500) {
			contadorRango12002500++;
		}else if (sueldo>2500) {
			contadorRango2500++;
		}
		
	}
	private double calcularPagoHora(Cargos cargo) {
		double sueldo=0;
		if (cargo==Cargos.GERENTE) {
			sueldo=20;
		}else if (cargo==Cargos.ADMINISTRATIVO) {
			sueldo=10;
		}else if (cargo==Cargos.JEFE) {
			sueldo=8;
			contadorJefes++;
		}else if (cargo==Cargos.OPERARIO) {
			sueldo=3.5;
			contadorOperarios++;
		}
		return sueldo;
	}
	private String cargoString(Cargos cargo) {
		String cargoString=null;
		if (cargo==Cargos.GERENTE) {
			cargoString="Gerente";
		}else if (cargo==Cargos.ADMINISTRATIVO) {
			cargoString="Administrativo";
		}else if (cargo==Cargos.JEFE) {
			cargoString="Jefe";
		}else if (cargo==Cargos.OPERARIO) {
			cargoString="Operario";
		}
		return cargoString;
	}
	private double calcularBonificacion(double sueldo,ModoEmpleo tipoEmpleo) {
		double bonificacion=0;
		if (tipoEmpleo==ModoEmpleo.TIEMPO_PARCIAL) {
			bonificacion=0.1;
		}else if (tipoEmpleo==ModoEmpleo.TIEMPO_COMPLETO) {
			bonificacion=0.1;
		}
		bonificacion = sueldo + (sueldo*bonificacion);
	return bonificacion;
	}
	public void informacionEmpelado() {
		System.out.println("Nombre: "+nombre + " apellidos: " + apellidos);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Horas trabajadas: " + horasTrabajadas + ", cargo: " + cargoString(cargo) + ", pago a la hora: " + pagoPorHora + ", sueldo total: " +sueldo + ", sueldo con bonificación: " + bonificacion);	
	}
	public void mostrarSueldo() {
		System.out.println("Nombre: "+nombre + " apellidos: " + apellidos);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Sueldo con bonifcación: " + bonificacion);
	}
	public static void nOperarios() {
		System.out.println("El número de operarios es: " + contadorOperarios);
	}
	public static void nJefes() {
		System.out.println("El número de jefes es: " + contadorJefes);
	}
	public static void rangosSalarios() {
		System.out.println("Entre el rango de sueldo de 0 a 1200 hay " + contadorRango1200 + " trabajadores");
		System.out.println("Entre el rango de sueldo de 1200 a 2500 hay " + contadorRango12002500 + " trabajadores");
		System.out.println("Entre el rango de sueldo de mas 2500 hay " + contadorRango2500 + " trabajadores");
	}
	
}
