package unidad8.ejercicios.tarea2;

/**

* Una interface para definir el comportamieno del Responsable

*/

public interface IResponsable {

/**

* Retorna rue si la cadena que recibe es una cantidad válida para depositar

* @param deposito: la cantidad para ser depositada

*/

	boolean esValidoDeposito(double deposito); 

	void depositar(double deposito); 

	boolean esValidoRetirar(double retiro); 

	void retirar(double retiro); 
	
	
}
