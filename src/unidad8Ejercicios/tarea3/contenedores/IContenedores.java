package unidad8Ejercicios.tarea3.contenedores;

import unidad8Ejercicios.tarea3.productos.Productos;

public interface IContenedores {

	String getReferencia();
	int getVolumen();
	int VolumenDisponible();
	int getResistencia();
	Productos[] getProductos();
	TipoCont getTipo();
	boolean meter(Productos producto);
	boolean resiste(Productos producto);
	int getSuperficie();
	
	
	
}
