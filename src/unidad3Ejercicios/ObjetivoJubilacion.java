package unidad3Ejercicios;

import java.util.Scanner;

public class ObjetivoJubilacion {

	public static void main(String[] args) {
		int anyosUser;
		int ahorroAnual;
		int dineroJubilacion;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("¿Cuántos años te quedan para jubilarte? ");
			anyosUser = entrada.nextInt();
			if (anyosUser<=0) {
				System.out.println("Error pruebe de nuevo");
			}
			} while (anyosUser <= 0);
			System.out.println("¿Cuál es tu ahorro anual?");
			ahorroAnual = entrada.nextInt();
			dineroJubilacion = anyosUser * ahorroAnual;
			System.out.println("El dinero que tendras ahorrado cuando te jubiles sera: " + dineroJubilacion);
		
		entrada.close();
	}

}
