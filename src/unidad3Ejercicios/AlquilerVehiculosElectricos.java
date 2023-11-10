package unidad3Ejercicios;

import java.util.Scanner;

public class AlquilerVehiculosElectricos {

	public static void main(String[] args) {
		int opcion=0;
		final float PRECIO_BICICLETA=4; // he declarado estos datos como constantes ya que dentro del programa no cambian
		final float PRECIO_PATINETE=3;
		final float PRECIO_MOTO=9;
		final float PRECIO_BICICLETA_BONO=2;
		final float PRECIO_PATINETE_BONO=1.5F;
		final float PRECIO_MOTO_BONO=5;
		int horas;
		float pago;
		Scanner entrada=new Scanner(System.in);		
	
		do {
			System.out.println("RESERVA DE VEHíCULOS ELÉCTRICOS");
			System.out.println("1. Reservar bicicleta");
			System.out.println("2. Reservar patinete");
			System.out.println("3. Reservar moto");
			System.out.println("4. Salir");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				 System.out.println("Va reservar una bicicleta ");
				 System.out.print("¿Cuantas horas la desea reservar? ");
				 horas = entrada.nextInt();
				 System.out.print("¿tiene bono?(1=si/2=no) ");
				 opcion = entrada.nextInt();
				 if (opcion==1) {
					 pago = horas*PRECIO_BICICLETA_BONO;
					 System.out.println("Debe pagar " + pago + " euros");
					 System.out.println("La reserva a sido confirmada");
				} else if (opcion==2) {
					pago = horas*PRECIO_BICICLETA;
					System.out.println("Debe pagar " + pago + " euros");
					System.out.println("La reserva a sido confirmada");
				} 
				break;
			case 2:
				 System.out.println("Va reservar un patinete ");
				 System.out.print("¿Cuantas horas lo desea reservar? ");
				 horas = entrada.nextInt();
				 System.out.print("¿tiene bono?(1=si/2=no) ");
				 opcion = entrada.nextInt();
				 if (opcion==1) {
					 pago = horas*PRECIO_PATINETE_BONO;
					 System.out.println("Debe pagar " + pago + " euros");
					 System.out.println("La reserva a sido confirmada");
				} else if (opcion==2) {
					pago = horas*PRECIO_PATINETE;
					System.out.println("Debe pagar " + pago + " euros");
					System.out.println("La reserva a sido confirmada");
				}
				break;
			case 3:
				 System.out.println("Va reservar una moto ");
				 System.out.print("¿Cuantas horas la desea reservar? ");
				 horas = entrada.nextInt();
				 System.out.print("¿tiene bono?(1=si/2=no) ");
				 opcion = entrada.nextInt();
				 if (opcion==1) {
					 pago = horas*PRECIO_MOTO_BONO;
					 System.out.println("Debe pagar " + pago + " euros");
					 System.out.println("La reserva a sido confirmada");
				} else if (opcion==2) {
					pago = horas*PRECIO_MOTO;
					System.out.println("Debe pagar " + pago + " euros");
					System.out.println("La reserva a sido confirmada");
				}
				break;
			case 4:
				 System.out.println("Ok cerrando el progama... ");
				 entrada.close();
				break;
			default:
				System.out.println("Valor no reconocido");
				break;
			}
			
		} while (opcion!=4);
		System.out.println("Gracias por usar el programa");
	}

}
