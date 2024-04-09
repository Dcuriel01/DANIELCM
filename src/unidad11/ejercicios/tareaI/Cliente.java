package unidad11.ejercicios.tareaI;

public class Cliente {

	private String cif;
	private String nombre;
	private TipoEmpresa tipoEmpresa;
	private TipoCliente tipoCliente;
	private double saldoAPagar;
	private double cantidadAPagar;
	
	public Cliente(String cif, String nombre, TipoCliente tipoCliente) {
		this.cif = cif;
		this.nombre = nombre;
		generarTipo();
		this.tipoCliente = tipoCliente;
		saldoAPagar=0;
		cantidadAPagar=0;
	}
	
	@Override
	public String toString() {
		cantidadAPagar();
		return "Nombre: " + nombre + " cif: " + cif + " tipo empresa: " + tipoEmpresa.getEmpresa() 
		+ " tipo cliente: "+ tipoCliente +" saldo a pagar: " + cantidadAPagar;
	}
	
	private void generarTipo() {
		if (cif.length()==9) {
			switch (cif.charAt(0)) {
			case 'A':
				tipoEmpresa=TipoEmpresa.ANONIMA;
				break;
			case 'B':
				tipoEmpresa=TipoEmpresa.LIMITADA;
				break;
			case 'J':
				tipoEmpresa=TipoEmpresa.COLECTIVA;
				break;
			case 'H':
				tipoEmpresa=TipoEmpresa.COMANDITARIAS;
				break;
			case 'F':
				tipoEmpresa=TipoEmpresa.COOPERATIVAS;
				break;
			case 'G':
				tipoEmpresa=TipoEmpresa.ASOCIACIONES;
				break;
			default:
				System.out.println("Error");
				break;
			}
		
		}else {
			System.out.println("Error en el Cif");
		}
	}
	
	public void cantidadAPagar() {
		if (tipoCliente==TipoCliente.NORMAL) {
			cantidadAPagar = saldoAPagar;
		}else {
			cantidadAPagar = saldoAPagar - saldoAPagar*0.1;
		}
	}
	
	public void sumarSaldo(double saldo){
		saldoAPagar=saldoAPagar+saldo;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldoAPagar() {
		return saldoAPagar;
	}

	public void setSaldoAPagar(double saldoAPagar) {
		this.saldoAPagar = saldoAPagar;
	}

	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
	
	
}
