package unidad9.ejercicios.tarea2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Animal {

	protected int id;
	protected String camada;
	protected String nombre;
	protected Sexo sexo;
	protected String raza;
	protected LocalDate fechaVacunacion;
	protected ArrayList<Revision> revisiones;
	protected Tipo tipo;	
	
	
	public Animal(int id, String camada, String nombre, Sexo sexo, String raza, LocalDate fecha, Tipo tipo) {
		super();
		this.id = id;
		this.camada = camada;
		this.nombre = nombre;
		this.sexo = sexo;
		this.raza = raza;
		this.fechaVacunacion = fecha;
		revisiones = new ArrayList<Revision>();
		this.tipo = tipo;
	}
	/*public void Vacunacion() {
		if (fechaVacunacion.compareTo(LocalDate.now())>300) {
			System.out.println("Han pasado mas de 300 días de la última vacunación");
		}
	}*/
	public void informacionRevision() {
		System.out.println("Revisiones de " + nombre);
		Iterator iteradorRevisiones = revisiones.iterator();
		while (iteradorRevisiones.hasNext()) {
			Revision revision = (Revision)iteradorRevisiones.next();
			System.out.println(revision);
		}
		
	}
	public void introducirRevision(Revision revision) {
		revisiones.add(revision);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCamada() {
		return camada;
	}
	public void setCamada(String camada) {
		this.camada = camada;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public LocalDate getFecha() {
		return fechaVacunacion;
	}
	public void setFecha(LocalDate fecha) {
		this.fechaVacunacion = fecha;
	}
	public ArrayList<Revision> getRevisiones() {
		return revisiones;
	}
	public void setRevisiones(ArrayList<Revision> revisiones) {
		this.revisiones = revisiones;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal \n"+
				"Id:" + id +" camada: "+ camada +" nombre " + nombre + " sexo " + sexo +"\n"+
				"raza " + raza + " ultima vacunación " + fechaVacunacion + " tipo " + tipo;
	}
	
}
