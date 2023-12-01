package unidad1.ejemplos;

import java.util.Scanner;

public class Puebas {

	public static void main(String[] args) {

		int barra = 6000;
		int x = 0;
		int nvi = 0;
		int nHojas;
		char mVent;
		int medVert;
		int medHorz;
		int marcTotal;
		int bSM = 0;
		int bSJ = 0;
		int junqVert;
		int junqHorz;
		int junqTotal;
		float precioPagarM = 0;
		float precioPagarJ = 0;
		final float PRECIO_MARCO = 20.34f;
		final float PRECIO_JUNQUILLO = 30.35f;
		final int COTA_JUNQ_VERTICAL = 120;
		final int COTA_JUNQ_HORIZONTAL = 120;
		float nb;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Cuantas hojas tiene la ventana ");
			nHojas = sc.nextInt();

			switch (nHojas) {
			case 1:
				System.out.print("Numero vetanas iguales ");
				nvi = sc.nextInt();
				System.out.print("Medida de alto de la ventana ");
				medVert = sc.nextInt();
				System.out.print("Medida de ancho de la ventana ");
				medHorz = sc.nextInt();

				marcTotal = nvi * ((medVert * 2) + (medHorz * 2));
				nb = (float) marcTotal / barra;

				if (bSM >= marcTotal) {
					bSM = bSM - marcTotal;
					System.out.println("No necesaria barra de marco y sobrara " + bSM);
				} else if (nb <= 1) {
					bSM = barra - marcTotal + bSM;
					System.out.println("Necesitaras 1 barra de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 2) {
					bSM = (2 * barra) - marcTotal + bSM;
					precioPagarM = PRECIO_MARCO * 2;
					System.out.println("Necesitaras 2 barras de marco y sobraran " + bSM);
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 3) {
					bSM = (3 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 3 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 3;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 4) {
					bSM = (4 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 4 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 4;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 5) {
					bSM = (5 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 5 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 5;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 6) {
					bSM = (6 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 6 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 6;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 7) {
					bSM = (7 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 7 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 7;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 8) {
					bSM = (8 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 8 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 8;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 9) {
					bSM = (9 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 9 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 9;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 10) {
					bSM = (10 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 10 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 10;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				}

				junqVert = ((medVert - COTA_JUNQ_VERTICAL) * 2);
				junqHorz = ((medHorz - COTA_JUNQ_HORIZONTAL) * 2);
				junqTotal = nvi * (junqVert + junqHorz);
				nb = (float) junqTotal / barra;

				if (junqVert <= 0) {
					System.out.println("ERROR MEDIDA JUNQUILLO");
				} else if (junqHorz <= 0) {
					System.out.println("ERROR MEDIDA JUNQUILLO");
				} else if (bSJ >= junqTotal) {
					bSJ = bSJ - junqTotal;
					System.out.println("No necesaria barra de junquillo y sobrara " + bSJ);
				} else if (nb <= 1) {
					bSJ = barra - junqTotal + bSJ;
					System.out.println("Necesitaras 1 barra de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 2) {
					bSJ = (2 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 2 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 2;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 3) {
					bSJ = (3 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 3 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 3;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 4) {
					bSJ = (4 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 4 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 4;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 5) {
					bSJ = (5 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 5 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 5;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 6) {
					bSJ = (6 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 6 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 6;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 7) {
					bSJ = (7 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 7 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 7;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 8) {
					bSJ = (8 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 8 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 8;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 9) {
					bSJ = (9 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 9 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 9;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 10) {
					bSJ = (10 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 10 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 10;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				}
				System.out.println("Precio total a pagar " + (precioPagarM + precioPagarJ) + " euros");
				System.out.print("Quiere presupusestar mas ventanas (S/N) ");
				mVent = sc.next().charAt(0);
				switch (mVent) {
				case 'S':
					System.out.println("Ok, volvamos al principio");
					break;
				case 'N':
					System.out.println("Ok, Saliendo del programa");
					x = 1;
					break;

				default:
					System.out.println("No reconocido");
					break;
				}
				break;
			case 2:

				System.out.print("Numero vetanas iguales ");
				nvi = sc.nextInt();
				System.out.print("Medida de alto de la ventana ");
				medVert = sc.nextInt();
				System.out.print("Medida de ancho de la ventana ");
				medHorz = sc.nextInt();

				marcTotal = nvi * ((medVert * 2) + (medHorz * 2));
				nb = (float) marcTotal / barra;

				if (bSM >= marcTotal) {
					bSM = bSM - marcTotal;
					System.out.println("No necesaria barra de marco y sobrara " + bSM);
				} else if (nb <= 1) {
					bSM = barra - marcTotal + bSM;
					System.out.println("Necesitaras 1 barra de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 2) {
					bSM = (2 * barra) - marcTotal + bSM;
					precioPagarM = PRECIO_MARCO * 2;
					System.out.println("Necesitaras 2 barras de marco y sobraran " + bSM);
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 3) {
					bSM = (3 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 3 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 3;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 4) {
					bSM = (4 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 4 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 4;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 5) {
					bSM = (5 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 5 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 5;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 6) {
					bSM = (6 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 6 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 6;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 7) {
					bSM = (7 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 7 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 7;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 8) {
					bSM = (8 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 8 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 8;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 9) {
					bSM = (9 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 9 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 9;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				} else if (nb <= 10) {
					bSM = (10 * barra) - marcTotal + bSM;
					System.out.println("Necesitaras 10 barras de marco y sobraran " + bSM);
					precioPagarM = PRECIO_MARCO * 10;
					System.out.println("Te va a costar " + precioPagarM + " euros");
				}

				junqVert = ((medVert - COTA_JUNQ_VERTICAL) * 4);
				junqHorz = ((medHorz - COTA_JUNQ_HORIZONTAL) * 4);
				junqTotal = (junqVert + junqHorz);
				nb = (float) junqTotal / barra;

				if (junqVert <= 0) {
					System.out.println("ERROR MEDIDA JUNQUILLO");
				} else if (junqHorz <= 0) {
					System.out.println("ERROR MEDIDA JUNQUILLO");
				} else if (bSJ >= junqTotal) {
					bSJ = bSJ - junqTotal;
					System.out.println("No necesaria barra de junquillo y sobrara " + bSJ);
				} else if (nb <= 1) {
					bSJ = barra - junqTotal + bSJ;
					System.out.println("Necesitaras 1 barra de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 2) {
					bSJ = (2 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 2 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 2;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 3) {
					bSJ = (3 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 3 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 3;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 4) {
					bSJ = (4 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 4 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 4;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 5) {
					bSJ = (5 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 5 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 5;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 6) {
					bSJ = (6 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 6 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 6;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 7) {
					bSJ = (7 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 7 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 7;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 8) {
					bSJ = (8 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 8 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 8;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 9) {
					bSJ = (9 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 9 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 9;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				} else if (nb <= 10) {
					bSJ = (10 * barra) - junqTotal + bSJ;
					System.out.println("Necesitaras 10 barras de junquillo y sobraran " + bSJ);
					precioPagarJ = PRECIO_JUNQUILLO * 10;
					System.out.println("Te va a costar " + precioPagarJ + " euros");
				}

				System.out.println("Precio total a pagar " + (precioPagarM + precioPagarJ) + " euros");
				System.out.print("Quiere presupusestar mas ventanas (S/N) ");
				mVent = sc.next().charAt(0);
				switch (mVent) {
				case 'S':
					System.out.println("Ok, volvamos al principio");
					break;
				case 'N':
					System.out.println("Ok, Saliendo del programa");
					x = 1;
					break;

				default:
					System.out.println("No reconocido");
					break;
				}
				break;

			default:
				System.out.print("Número no reconocido");
				System.out.println("");
				break;
			}

		} while (x != 1);
		sc.close();
	}

}
