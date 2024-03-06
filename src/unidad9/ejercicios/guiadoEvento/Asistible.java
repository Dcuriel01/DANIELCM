package unidad9.ejercicios.guiadoEvento;

import java.util.List;

public interface Asistible {

	void registrarAsistente(String nombre);
	void cancelarRegistroAsistente(String nombre);
	boolean esAsistenteRegistrado(String nombre);
	List<String> obtenerListaAsistentes();
	void limpiarListaAsistente();
	
	
}
