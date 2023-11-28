package pruebas.evaluacion1.prueba1.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static int[] pila = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	public static int[] cola = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				añadirAPila();
				break;
			case 2:
				añadirACola();
				break;
			case 3:
				extraerDePila();
				break;
			case 4:
				extraerDeCola();
				break;
			case 5:
				mostrarPila();
				break;
			case 6:
				mostrarCola();
				break;
			case 7:
				calcularPares();
				break;
			case 8:
				calcularImparesMayores();
				break;
			case 9:
				ordenarCola();
				break;
			case 10:
				buscarSecuencia();
				break;
			case 11:
				System.out.println("Ok saliendo");
				break;

			default:
				System.out.println("Número no reconocido");
				break;
			}
		} while (opcion != 11);
		System.out.println("Ha salido del programa hasta pronto");

	}

	private static int menu() {
		int opcion;

		System.out.println("-----MENU----");
		System.out.println("1. Añadir a la pila");
		System.out.println("2. Añadir a la cola");
		System.out.println("3. Extraer de la pila");
		System.out.println("4. Extraer de la cola");
		System.out.println("5. Mostrar pila");
		System.out.println("6. Mostrar cola");
		System.out.println("7. Nº pares en la pila");
		System.out.println("8. Suma de mayores de 10 e impares en la cola");
		System.out.println("9. Ordenar decrecientemente la cola");
		System.out.println("10. Buscar secuencía en la pila");
		System.out.println("11. Salir");
		opcion = entrada.nextInt();

		return opcion;
	}

	private static void añadirAPila() {
		int elementoAñadir;
		System.out.println("¿Qúe elemento desea añadir a la pila?");
		elementoAñadir = entrada.nextInt();
		if (pila[pila.length-1]!=-1) {
			System.out.println("La pila esta llena");
		}
		for (int i = 0; i < pila.length; i++) {
			if (pila[i]!=-1) {
				
			}else {
				pila[i]=elementoAñadir;
				i = pila.length;
				System.out.println("Elemento añadido");
			}
		}
	}

	private static void añadirACola() {
		int elementoAñadir;
		System.out.println("¿Qúe elemento desea añadir a la cola?");
		elementoAñadir = entrada.nextInt();
		if (cola[cola.length-1]!=-1) {
			System.out.println("La cola esta llena");
		}
		for (int i = 0; i < pila.length; i++) {
			if (cola[i]!=-1) {
				
			}else {
				cola[i]=elementoAñadir;
				i = cola.length;
				System.out.println("Elemento añadido");
			}
		}
		
	}

	private static void extraerDePila() {
		if (pila[0]==-1) {
			System.out.println("La pila esta vacia");
		}else {
			for (int i = pila.length-1; i > -1; i--) {
				if (pila[i]!=-1) {
					System.out.println("El elemento que va a eliminar es el " + pila[i]);
					pila[i]=-1;
					i=-2;
				}	
			}
		}
	}
	private static void extraerDeCola() {
		if (cola[0]==-1) {
			System.out.println("La cola esta vacia");
		}else {
			System.out.println("El elemento que se va a eliminar es " + cola[0]);
			cola[0]=-1;
			for (int i = 0; i < cola.length-1; i++) {
				cola[i]=cola[i+1];
			}
			cola[cola.length-1]=-1;
		}
		
	}

	private static void mostrarPila() {
		if (pila[0]==-1) {
			System.out.println("La pila esta vacia");
		}else {
			for (int i = pila.length-1; i > -1; i--) {
				if (pila[i]==-1) {
					System.out.println("Vacio");
				}else {
					System.out.println(pila[i]);
				}
			}
		}
		
	}
	private static void mostrarCola() {
		if (cola[0]==-1) {
			System.out.println("La cola esta vacia");
		}else {
			for (int i = cola.length-1; i > -1; i--) {
				if (cola[i]==-1) {
					System.out.println("Vacio");
				}else {
					System.out.println(cola[i]);
				}
			}
		}
		
	}

	private static void calcularPares() {
		int nPares=0;
		for (int i = 0; i < pila.length; i++) {
			if (pila[i]%2==0) {
				nPares++;
			}
		}
		System.out.println("En la pila hay " + nPares + " números pares");
		
	}

	private static void calcularImparesMayores() {
		int sumaImpares=0;
		for (int i = 0; i < cola.length; i++) {
			if (cola[i]>10 & cola[i]%2!=0) {
				sumaImpares = cola[i]+sumaImpares;
			}
		}
		System.out.println("La suma de los impares mayores de 10 es :" + sumaImpares);
		
		
	}
	private static void ordenarCola() {
		int tam = cola.length;
		for (int i = 0; i < tam-1; i++) {
			for (int j = 0; j < tam-i-1; j++) {
				if (cola[j]<cola[j+1]) {
					int tmp = cola[j];
					cola[j]=cola[j+1];
					cola[j+1]=tmp;
				}
			}
		}
		
	}

	private static void buscarSecuencia() {
		int n1;
		int n2;
		int n3;
		boolean noExiste = true;
		System.out.println("Introduca la secuencía que desea buscar");
		System.out.println("1º número");
		n1 = entrada.nextInt();
		System.out.println("2º número");
		n2 = entrada.nextInt();
		System.out.println("3º número");
		n3 = entrada.nextInt();
		for (int i = 0; i < pila.length; i++) {
			if (pila[i]==n1) {
				for (int j = i; j < cola.length; j++) {
					if (pila[j]==n2) {
						for (int j2 = j; j2 < cola.length; j2++) {
							if (pila[j2]==n3) {
								System.out.println("Esa secuencia existe");
								noExiste = false;
							}
						}
					}
				}
			}
		}if (noExiste) {
			System.out.println("Esa secuencia no existe");
		}
		
	}

}
