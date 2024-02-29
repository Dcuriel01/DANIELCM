package unidad5.ejemplos;

public class VentasAnuales {

	public static final int NUM_ANIOS = 5;
	public static final int NUM_TRIMESTRES = 4;
	
	public static void main(String[] args) {
		int [][] ventas = new int [NUM_ANIOS][NUM_TRIMESTRES];
		ventas[0][0]=100;
		ventas[0][1]=1500;
		ventas[0][2]=1800;
		ventas[1][0]=100;
		ventas[2][0]=1400;
		ventas[3][3]=2000;
		
		
		for (int fila = 0; fila < NUM_ANIOS; fila++) {
			for (int columna = 0; columna < NUM_TRIMESTRES; columna++) {
				System.out.print(ventas[fila][columna]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
