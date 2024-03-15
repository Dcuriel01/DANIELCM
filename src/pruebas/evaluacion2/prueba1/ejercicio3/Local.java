package pruebas.evaluacion2.prueba1.ejercicio3;

import java.time.LocalDate;

import pruebas.evaluacion2.prueba1.ejercicio3.enumeradores.Empresas;

public class Local extends Paquete {
	
	private Empresas empresa;

	public Local(String id, double peso, LocalDate fechaEntrega) {
		super(id, peso, fechaEntrega);
		setEmpresa();
		setPrecioEnvio();
		
	}

	public Empresas getEmpresa() {
		return empresa;
	}

	public void setEmpresa() {
		if (peso<1.000) {
			empresa=Empresas.NAVALEXPRESS;
		}else if (peso<2.000) {
			empresa=Empresas.NAVALSEAR;
		}else {
			empresa=Empresas.NAVALMAZON;
		}
	}

	public void setPrecioEnvio() {
		if (peso<2.000) {
			precioEnvio=peso*0.2;
		}else {
			precioEnvio=peso*0.4;
		}
	}
	
	
}
