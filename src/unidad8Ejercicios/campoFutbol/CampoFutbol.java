package unidad8Ejercicios.campoFutbol;

import java.util.Scanner;

public class CampoFutbol {

	public static Scanner sc = new Scanner(System.in);
	public static TiposAsientos[][] sectorA = new TiposAsientos[ConstantesFutbol.N_ASIENTOS_VERT_LATERAL][ConstantesFutbol.N_ASIENTOS_HORZ_LATERAL];
	public static TiposAsientos[][] sectorB = new TiposAsientos[ConstantesFutbol.N_ASIENTOS_VERT_LATERAL][ConstantesFutbol.N_ASIENTOS_HORZ_LATERAL];
	public static TiposAsientos[][] sectorC = new TiposAsientos[ConstantesFutbol.N_ASIENTOS_VERT_TRASERAS][ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS];
	public static TiposAsientos[][] sectorD = new TiposAsientos[ConstantesFutbol.N_ASIENTOS_VERT_TRASERAS][ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS];
	public static String[][] relleno = new String[ConstantesFutbol.N_ASIENTOS_VERT_LATERAL][ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS];
	
	public static void main(String[] args) {

		int opcion=0;
		boolean salir = false;
		vaciarEstadioLateral(sectorA);
		vaciarEstadioLateral(sectorB);
		vaciarEstadioTrasero(sectorC);
		vaciarEstadioTrasero(sectorD);
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				mostrarCampo();
				break;

			default:
				break;
			}
		} while (!salir);
		
		
		
	}
	private static void mostrarCampo() {
		mostrarLateral(sectorA);
		mostarTraseras();
		mostrarLateral(sectorB);
		System.out.println(" ");
	}
	private static void mostarTraseras() {
		for (int i = 0; i < ConstantesFutbol.N_ASIENTOS_VERT_TRASERAS; i++) {
			for (int j = 0; j < ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS+2; j++) {
					if (j==ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS) {
						for (int j2 = 0; j2 < ConstantesFutbol.N_ASIENTOS_HORZ_LATERAL; j2++) {
							System.out.print(" ");
						}
					}else if (j==ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS+1) {
						for (int j2 = 0; j2 <ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS; j2++) {
							if (j2==ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS-1) {
								if (sectorC[i][j2]==TiposAsientos.LIBRE) {
									System.out.println("o");
								}else if (sectorC[i][j2]==TiposAsientos.RESERVADO) {
									System.out.println("r");
								}else {
									System.out.println("x");
							}
							}else {
								if (sectorC[i][j2]==TiposAsientos.LIBRE) {
									System.out.print("o");
								}else if (sectorC[i][j2]==TiposAsientos.RESERVADO) {
									System.out.print("r");
								}else {
									System.out.print("x");
								}
							}
						}
						j=ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS+2;
					}else {
						if (sectorD[i][j]==TiposAsientos.LIBRE) {
							System.out.print("o");
						}else if (sectorD[i][j]==TiposAsientos.RESERVADO) {
							System.out.print("r");
						}else {
							System.out.print("x");
						}
					}
				}		
			}
	}
	private static void mostrarLateral(TiposAsientos[][] sector) {
		for (int i = 0; i < ConstantesFutbol.N_ASIENTOS_VERT_LATERAL; i++) {
			for (int j = 0; j < ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS+2; j++) {
					if (j==ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS) {
						for (int j2 = 0; j2 < ConstantesFutbol.N_ASIENTOS_HORZ_LATERAL; j2++) {
				
							if (sector[i][j2]==TiposAsientos.LIBRE) {
									System.out.print("o");
							}else if (sector[i][j2]==TiposAsientos.RESERVADO) {
									System.out.print("r");
							}else {
									System.out.print("x");
							}
					
						
						}
					}else if (j==ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS+1) {
						for (int j2 = 0; j2 < ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS; j2++) {
							if (j2==ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS-1) {
								System.out.println(" ");
							}else {
								System.out.print(" ");
							}
						}
					}else {
						System.out.print(" ");
					}
			}
		}
		
	}

	private static void vaciarEstadioLateral(TiposAsientos[][] sector) {
		for (int i = 0; i < ConstantesFutbol.N_ASIENTOS_VERT_LATERAL; i++) {
			for (int j = 0; j < ConstantesFutbol.N_ASIENTOS_HORZ_LATERAL; j++) {
				sector[i][j]=TiposAsientos.LIBRE;
			}
		}
		
	}

	private static void vaciarEstadioTrasero(TiposAsientos[][] sector) {
		for (int i = 0; i < ConstantesFutbol.N_ASIENTOS_VERT_TRASERAS; i++) {
			for (int j = 0; j < ConstantesFutbol.N_ASIENTOS_HORZ_TRASERAS; j++) {
				sector[i][j]=TiposAsientos.LIBRE;
			}
		}		
	}




	private static int menu() {
		int opcion=0;
		System.out.println("1. Mostrar campo");
		System.out.println("2. Seleccionar asiento");
		System.out.println("3. Salir");
		opcion = sc.nextInt();
		return opcion;
	}

}
