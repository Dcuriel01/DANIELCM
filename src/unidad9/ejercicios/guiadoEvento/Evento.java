package unidad9.ejercicios.guiadoEvento;

import java.util.ArrayList;
import java.util.List;

public class Evento implements Asistible {

	protected String nombre;
	protected String fecha;
	protected int duracion;
	protected List<String> asistentes;
	
	public Evento(String nombre, String fecha, int duracion) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.duracion = duracion;
		List<String> asistentes=new ArrayList<String>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	@Override
	public void registrarAsistente(String nombre) {
		if (esNombreValido(nombre)) {
			if (!esAsistenteRegistrado(nombre)) {
				asistentes.add(nombre);
				System.out.println(nombre + " confirmado como asistente");
			}else {
				System.out.println(nombre + " ya esta registrado como asistente en " + this.nombre);
			}
			
		}else {
			System.err.println("Nombre incorrecto");
		}
		
		
	}
	private boolean esNombreValido(String nombre) {
		String patronValido="[A-Z][a-z]*";
		return nombre.matches(patronValido);
	}

	@Override
	public void cancelarRegistroAsistente(String nombre) {
		if (esAsistenteRegistrado(nombre)) {
			asistentes.remove(nombre);
			System.out.println(nombre + " borrado de la lista de " + this.nombre);
		}else {
			System.out.println(nombre + " no esta en la lista");
		}
		
	}
	@Override
	public boolean esAsistenteRegistrado(String nombre) {
		
		return asistentes.contains(nombre);
	}
	@Override
	public List<String> obtenerListaAsistentes() {
		
		return new ArrayList<String>(asistentes);
	}
	@Override
	public void limpiarListaAsistente() {
		asistentes.clear();
		System.out.println("La lista asistente de " + this.nombre + " ha sido borrada");
	}
	
	
	
	
}
