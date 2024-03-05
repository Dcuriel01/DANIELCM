package unidad9.ejercicios.charlatan;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AplicacionVinos {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String vinoUsuario;
		int tipoVino;
		System.out.println("Introduca el vino del que desea dar información");
		vinoUsuario=sc.nextLine();
		tipoVino = buscarVino(vinoUsuario);
		Vino v1 = CrearVino(tipoVino);
		System.out.println(v1);

	}

	private static Vino CrearVino(int tipoVino) {
		
		Vino v1 = null;
		int volMl;
		int calorias;
		double caloriasAzucar;
		switch (tipoVino) {
		case 1:
			System.out.println("El tipo es vino blanco fuerte dulce");
			System.out.println("Indique vol por ml");
			volMl=sc.nextInt();
			System.out.println("Indique calorias");
			calorias=sc.nextInt();
			v1 = new VinoBlancoFuerteDulce(volMl,calorias);
			break;
		case 2:
			System.out.println("El tipo es vino blanco fuerte seco");
			System.out.println("Indique vol por ml");
			volMl=sc.nextInt();
			System.out.println("Indique calorias");
			calorias=sc.nextInt();
			v1 = new VinoBlancoFuerteSeco(volMl,calorias);
			break;
		case 3:
			System.out.println("El tipo es vino blanco ligero dulce");
			System.out.println("Indique vol por ml");
			volMl=sc.nextInt();
			System.out.println("Indique calorias");
			calorias=sc.nextInt();
			v1 = new VinoBlancoLigeroDulce(volMl,calorias);
			break;
		case 4:
			System.out.println("El tipo es vino blanco ligero seco");
			System.out.println("Indique vol por ml");
			volMl=sc.nextInt();
			System.out.println("Indique calorias");
			calorias=sc.nextInt();
			v1 = new VinoBlancoLigeroSeco(volMl,calorias);
			break;
		case 5:
			System.out.println("El tipo es vino dulce");
			System.out.println("Indique vol por ml");
			volMl=sc.nextInt();
			System.out.println("Indique calorias");
			calorias=sc.nextInt();
			System.out.println("Indique calorias de azucar");
			caloriasAzucar=sc.nextInt();
			v1 = new VinoDulce(volMl,calorias,caloriasAzucar);
			break;
		case 6:
			System.out.println("El tipo es vino espumoso");
			v1 = new VinoEspumoso();
			break;
		case 7:
			System.out.println("El tipo es vino tinto fuerte");
			System.out.println("Indique vol por ml");
			volMl=sc.nextInt();
			System.out.println("Indique calorias");
			calorias=sc.nextInt();
			v1 = new VinoTintoFuerte(volMl,calorias);
			break;
		case 8:
			System.out.println("El tipo es vino tinto ligero");
			System.out.println("Indique vol por ml");
			volMl=sc.nextInt();
			System.out.println("Indique calorias");
			calorias=sc.nextInt();
			v1 = new VinoTintoLigero(volMl,calorias);
			break;
		}
		
		
		
		return v1;
	}

	private static int buscarVino(String vinoUsuario) {
		boolean parar=false;
		int tipoVino=0;
		
		
		parar=comprobarEjemplos(vinoUsuario,EjemplosVinos.blancoFuerteDulce(),parar);
		if (parar) {
			tipoVino=1;
		}else {
			parar=comprobarEjemplos(vinoUsuario,EjemplosVinos.blancoFuerteSeco(),parar);
		}if (parar) {
			tipoVino=2;
		}else {
			parar=comprobarEjemplos(vinoUsuario,EjemplosVinos.blancoLigeroDulce(),parar);
			if (parar) {
				tipoVino=3;
			}else {
				parar=comprobarEjemplos(vinoUsuario,EjemplosVinos.blancoLigeroSeco(),parar);
				if (parar) {
					tipoVino=4;
				}else {
					parar=comprobarEjemplos(vinoUsuario,EjemplosVinos.dulce(),parar);
					if (parar) {
						tipoVino=5;
					}else {
						parar=comprobarEjemplos(vinoUsuario,EjemplosVinos.espumoso(),parar);
						if (parar) {
							tipoVino=6;
						}else {
							parar=comprobarEjemplos(vinoUsuario,EjemplosVinos.tintoFuerte(),parar);
							if (parar) {
								System.out.println("El vino es fuerte (S/N)");
								char temp = sc.next().charAt(0);
								if (temp == 'S') {
									tipoVino=7;
								}else {
									tipoVino=8;
								}
							}
						}
					}
				}
			}
		}
		
		
		
		return tipoVino;
		
		
	}

	private static boolean comprobarEjemplos(String vinoUsuario, ArrayList<String> ejemplos, boolean parar) {
		Iterator iteradorVino = ejemplos.iterator();
		while (iteradorVino.hasNext()) {
			String vino = (String)iteradorVino.next();
			if (vinoUsuario.equals(vino)) {
				parar=true;
			}
		}
		return parar;
	}

}
